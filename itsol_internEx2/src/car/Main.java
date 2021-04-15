package car;

import car.Connect.database;
import car.model.Car;
import car.model.PackageType;

import java.sql.*;
import java.util.*;

public class Main {
    private static String[] brands = {"TOYOTA", "BMW", "HYUNDAI"};
    private static String[] packageTypes = {"A","B","C"};
    private static String[] styleCar = {"ModernCar", "MediumCar", "OldCar"};
    private List<Car> styleCars;
    private List<Car> carList;
    private List<PackageType> packageTypeList;


    car.Connect.database database = new database();


    public static void main(String[] args) throws SQLException {
        Main main = new Main();
        main.init();
        main.init2();
        System.out.println(main.getAllPackageType().get(1).getName());
        System.out.println(main.getAll().get(0).getBrand());
        System.out.println(main.getAll().get(0).getStyleCar());
        while(true)
        {
            main.menu();
        }
    }


    public void menu() throws SQLException {
        System.out.println("1 .Danh sách xe :");
        System.out.println("2 .Danh sách gói bảo hiểm : ");
        System.out.println("3 .Kiểm tra và mua bảo hiểm cho xe : ");
        System.out.println("4 .Phân loại xe và hiện ra màn hình : ");
        System.out.println("0 .Thoát ");

        System.out.println("Mời bạn lựa chọn chức năng : ");
        int choose = new Scanner(System.in).nextInt();
        switch (choose)
        {
            case 1:
                Kiemtradanhsachxe();
                break;
            case 2:
                Kiemtradanhsachbaohiem();
                break;
            case 3:
                Muabaohiem();
                break;

            case 0:

                System.err.println("Thank you");
                System.exit(0);
            default:
                System.out.println("Nhập sai");
        }
    }

    /*private  void phanloaixe() throws SQLException {
        System.out.println("Nhập id xe : ");
        int carId = new Scanner(System.in).nextInt();

        System.out.println("Nhap nam san xuat : ");
        int yearOfManufacture = new Scanner(System.in).nextInt();

        Car car = findById((long) carId);

        if ((car.getYearOfManufacture() <= 1995 && car.getStyleCar().equals("OldCar")) ||
                ((car.getYearOfManufacture() >= 1996 && car.getYearOfManufacture() <= 2004) && car.getStyleCar().equals("MediumCar")) ||
                (car.getYearOfManufacture() >= 2005 && car.getStyleCar().equals("ModernCar"))) {
            System.out.println(Arrays.toString(styleCar));
        }
    }*/
    private void Muabaohiem() throws SQLException {
        System.out.println("Mời bạn chọn gói bảo hiểm");
        System.out.println("Nhập id xe");
        int carId = new Scanner(System.in).nextInt();
        System.out.println("Nhập id bao hiem");
        int bhId = new Scanner(System.in).nextInt();
        Car car = findById((long) carId);
        PackageType packageType = findByIdPackageType((long) bhId);
        if (car == null && packageType == null){
            System.out.println("Invalid data");
        }else {
            assert car != null;
            if (car.getHaveInsurance()){
                System.out.println("Unavailable Buying");
            }else if ((car.getYearOfManufacture() <= 1995 && packageType.getPackagetype().equals("C")) ||
                    ((car.getYearOfManufacture() >= 1996 && car.getYearOfManufacture() <= 2004) && packageType.getPackagetype().equals("B")) ||
                    (car.getYearOfManufacture() >= 2005 && packageType.getPackagetype().equals("A"))){
                System.out.println("Success Buying");
                updateCarBH(true, (long) carId);
            }else {
                System.out.println("Invalid package");
            }
        }
    }

    private void Kiemtradanhsachbaohiem() throws SQLException {
        getAllPackageType().forEach(data -> {
            System.out.println(data.getId() + " - " + data.getName()+"-"+data.getPackagetype());
        });
    }

    private   void Kiemtradanhsachxe() throws SQLException {
        getAll().forEach(data -> {
            System.out.println(data.getId() + " - " + data.getName()+"-"+data.getBrand()+"-"+data.getYearOfManufacture());
        });
    }

    //Câu 1
    public List<Car> getAll() throws SQLException {
        List<Car> carList = new ArrayList<>();
        Connection connection = database.getJDBCConnection();
        String sql = "select * from car";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while(result.next()){
            Car car = new Car();
            car.setId(Long.parseLong(result.getString("id")));
            car.setName(result.getString("name"));
            car.setBrand(result.getString("brand"));
            car.setNumberPlate(result.getString("numberPlate"));
            car.setYearOfManufacture(Integer.parseInt(result.getString("yearOfManufacture")));
            if (result.getString("actionDuration") != null) {
                car.setActionDuration(Long.parseLong(result.getString("actionDuration")));
            }

            if (result.getString("havePowerSteering") != null) {
                car.setHavePositioningDevice(Long.parseLong(result.getString("havePowerSteering")) != 0);
            }

            car.setHaveInsurance(Long.parseLong(result.getString("haveInsurance")) != 0);
            if (result.getString("havePositioningDevice") != null) {
                car.setHavePositioningDevice(Long.parseLong(result.getString("havePositioningDevice")) != 0);
            }

            car.setStyleCar(result.getString("styleCar"));

            carList.add(car);
        }

        return carList;
    }

    public void init() throws SQLException {
        Connection connection = database.getJDBCConnection();
        Statement statement = connection.createStatement();
        Random random = new Random();
        carList = getAll();
        if (carList == null || carList.isEmpty()){
            for (int i=1; i<=10; i++) {
                Car car = new Car();
                car.setName("Car #("+i+")");
                car.setBrand(brands[random.nextInt(3)]);
                car.setNumberPlate(String.format("%05d", random.nextInt(100000)));
                car.setYearOfManufacture(random.nextInt(33) + 1980);
                car.setHaveInsurance(random.nextInt(2) != 0);
                car.setStyleCar(styleCar[random.nextInt(3)]);
                String sql = "insert into car(name, brand, yearOfManufacture, numberPlate, haveInsurance, havePowerSteering, styleCar) value " +
                        "('"+car.getName()+"',"+
                        "'"+car.getBrand()+"',"+
                        car.getYearOfManufacture()+","+
                        car.getNumberPlate()+","+
                        car.getHaveInsurance()+","+
                        car.getHavePowerSteering()+ ","+
                        car.getStyleCar()+
                        ")";
                statement.executeUpdate(sql);
            }
            carList = getAll();
        }

    }

    //Câu 2
    public List<PackageType> getAllPackageType() throws SQLException {
        List<PackageType> PackageTypeList = new ArrayList<>();
        Connection connection = database.getJDBCConnection();
        String sql = "select * from packagetype";
        Statement statement1 = connection.createStatement();
        ResultSet result = statement1.executeQuery(sql);
        while(result.next()){
            PackageType packageType = new PackageType();
            packageType.setId(Long.parseLong(result.getString("id")));
            packageType.setName(result.getString("name"));
            packageType.setPackagetype(result.getString("packagetype"));

            PackageTypeList.add(packageType);
        }

        return PackageTypeList;
    }

    public void init2() throws SQLException {
        Connection connection = database.getJDBCConnection();
        Statement statement = connection.createStatement();
        Random random = new Random();
        packageTypeList = getAllPackageType();
        if (packageTypeList == null || packageTypeList.isEmpty()) {
            for (int i = 1; i <= 10; i++) {
                PackageType packageType = new PackageType();
                packageType.setName("Package Type #(" + i + ")");
                packageType.setPackagetype(packageTypes[random.nextInt(3)]);
                String sql = "insert into packagetype(name, packagetype) value " +
                        "('" + packageType.getName() + "',"+
                         "'"+packageType.getPackagetype() +"')";
                statement.executeUpdate(sql);
            }
            packageTypeList = getAllPackageType();
        }
    }

    public Car findById (Long id) throws SQLException {
        Connection connection = database.getJDBCConnection();
        String sql = "select * from car where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, id);
        ResultSet result= statement.executeQuery();
        Car car = null;
        while(result.next()) {
            car = new Car();
            car.setId(Long.parseLong(result.getString("id")));
            car.setName(result.getString("name"));
            car.setBrand(result.getString("brand"));
            car.setNumberPlate(result.getString("numberPlate"));
            car.setYearOfManufacture(Integer.parseInt(result.getString("yearOfManufacture")));
            if (result.getString("actionDuration") != null) {
                car.setActionDuration(Long.parseLong(result.getString("actionDuration")));
            }

            if (result.getString("havePowerSteering") != null) {
                car.setHavePositioningDevice(Long.parseLong(result.getString("havePowerSteering")) != 0);
            }

            car.setHaveInsurance(Long.parseLong(result.getString("haveInsurance")) != 0);
            if (result.getString("havePositioningDevice") != null) {
                car.setHavePositioningDevice(Long.parseLong(result.getString("havePositioningDevice")) != 0);
            }

            if ((car.getYearOfManufacture() <= 1995 && car.getStyleCar().equals("OldCar")) ||
                    ((car.getYearOfManufacture() >= 1996 && car.getYearOfManufacture() <= 2004) && car.getStyleCar().equals("MediumCar")) ||
                    (car.getYearOfManufacture() >= 2005 && car.getStyleCar().equals("ModernCar"))){
                car.setStyleCar(result.getString("styleCar"));
            }
        }
        return car;
    }

    public PackageType findByIdPackageType(Long id) throws SQLException {
        PackageType packageType= null;
        String sql = "select * from packagetype where id = ?";
        Connection connection = database.getJDBCConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, id);
        ResultSet result = statement.executeQuery();
        while(result.next()){
            packageType = new PackageType();
            packageType.setId(Long.parseLong(result.getString("id")));
            packageType.setName(result.getString("name"));
            packageType.setPackagetype(result.getString("packagetype"));
        }

        return packageType;
    }

    public void updateCarBH(Boolean haveInsurance, Long id) throws SQLException {
        String sql = "update car set haveInsurance = ? where id = ?";
        Connection connection = database.getJDBCConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setBoolean(1, haveInsurance);
        statement.setLong(2, id);
        statement.executeQuery();
    }
}
