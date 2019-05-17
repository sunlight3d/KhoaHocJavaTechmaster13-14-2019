import java.sql.*;
import java.util.Properties;

public class Database {
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String MAX_POOL = "250"; // set your own limit
    private Connection connection;

    private Properties properties;

    public Connection connect() {
        if (connection == null) {
            try {
                properties = new Properties();
                properties.setProperty("user", USERNAME);
                properties.setProperty("password", PASSWORD);
                properties.setProperty("MaxPooledStatements", MAX_POOL);
                Class.forName(DATABASE_DRIVER);
                connection = DriverManager.getConnection(DATABASE_URL, properties);
                System.out.println("Connect DB successfully");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Cannot connect MySQL DB. Error : "+e.toString());
            } finally {
                properties = null;
            }
        }
        return connection;
    }
    public void testSQL() {
        String sql = "SELECT * FROM tblProduct";
        try {
            Statement statement = this.connect().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String productname = resultSet.getString("productname");
                Integer productId = resultSet.getInt("productId");
                System.out.println("productname:"+productname+".productId:"+productId);
            }
        } catch (SQLException e) {
            System.out.println("Cannot run SQL command. Error : "+e.toString());
        } finally {

        }
    }


    private static Database db;
    public static Database getInstance() {
        if(Database.db == null) {
            Database.db = new Database();
        }
        return Database.db;
    }
    Database() {
        connect();
    }
}
