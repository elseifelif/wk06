import java.sql.*;

public class Employee {

    public static final String DB_URL = "jdbc:mysql://localhost/company";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main (String [] args) {
        Connection connect = null;
        String sql = "SELECT * FROM employees";

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement statement = connect.createStatement();
            ResultSet data = statement.executeQuery(sql);

            while (data.next()) {
                System.out.println("ID: " +data.getInt("employee_id"));
                System.out.println("Name: "+data.getNString("employee_name"));
                System.out.println("Title: "+data.getString("employee_title"));
                System.out.println("Salary: "+data.getInt("employee_salary"));
                System.out.println("_____________________________");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
