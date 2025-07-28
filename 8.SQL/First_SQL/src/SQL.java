import java.sql.*;

public class SQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/libreria";
        String user = "root";
        String password = "bahia";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM usuario";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()) {

                System.out.println(rs.getInt("id_usuario")+ ":" +rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

