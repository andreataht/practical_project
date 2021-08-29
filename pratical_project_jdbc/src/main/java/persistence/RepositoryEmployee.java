package persistence;


import util.DBUtil;
import  model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositoryEmployee {

    private Connection connection;

    public RepositoryEmployee() { connection = DBUtil.getDBConnection(); }

    public List<Employee> listAllEmployees() {

        List<Employee> employeeList = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try {
            PreparedStatement pstmt = DBUtil.getDBConnection().prepareStatement(sql);

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setEmployeeId(resultSet.getInt("employee_id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setMobile(resultSet.getInt("mobile"));
                employee.setEmail(resultSet.getString("email"));
                employee.setUsername(resultSet.getString("username"));

                employeeList.add(employee);
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;




    }

    //Add class RepositoryEmployee,  implement method to update phone employee filtering by employeeId

    public void menUpdateMobileEmployee(int mobile, int employeeId ) throws SQLException {
        String sql = "UPDATE employee SET mobile = ? WHERE employee_id = ?";


        try {
            PreparedStatement pstmt = DBUtil.getDBConnection().prepareStatement(sql);
            pstmt.setInt(4, mobile);
            pstmt.setInt(1, employeeId);
            int result = pstmt.executeUpdate();
            if(result > 0) {
                System.out.println("Employee mobile nr updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
