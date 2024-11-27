/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author QUY
 */
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            // Tải driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Thông tin kết nối
            String url = "jdbc:mysql://localhost:3306/bms";
            String username = "root";
            String password = "quycute2003";
            
            // Cố gắng tạo kết nối
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver JDBC.");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Lỗi khi kết nối với cơ sở dữ liệu.");
            e.printStackTrace();
            return null;
        }
    }
}
