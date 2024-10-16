package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBDD {

    private static String database = "ventas_mg";
    private static String user = "root";
    private static String password = "";
    private static String url = "jdbc:mysql://localhost:3306/"+database;

    public  static  Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Establecida");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;

    }
}