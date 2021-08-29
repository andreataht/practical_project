package menu;

import model.Employee;
import persistence.RepositoryEmployee;
import util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class MenuEmployee {

    RepositoryEmployee repositoryEmployee = new RepositoryEmployee();

    private int menuOptions(Scanner input) {


        System.out.println("\n/***************************************************/");
        System.out.println("Select the employee's menu option: ");
        System.out.println("-------------------------\n");
        System.out.println();
        System.out.println("1: List of all employees");
        System.out.println("2: Update employee phone number by employee id");
        System.out.println("3: Add new employee");
        System.out.println("4: Remove employee");
        System.out.println("100 - Return to Main Menu");
        System.out.println("\n/***************************************************/");
        return input.nextInt();

    }

    protected void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    menuListAllEmployees(input);
                    break;
//                case 2:
//                    menuUpdateMobileEmployee(input.nextInt(), input.nextInt());
//                    break;
//                case 3:
//                    menuAddNewEmployee(input);
//                    break;
//                case 4:
//                    menuListActiveAndNotActiveCustomers();
//                    break;
//                case 5:
//                    menuUpdatePhoneNumberByCustomerId(input);
//                    break;
                case 100:
                    Main.getMainMenu();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
                    menuOptions(input);
                    break;
            }// End of switch statement
        } while (userChoice != 100);
    }


/*    private void menuAddNewEmployee(Scanner input) { // I HAVE SQL SYNTAX ERROR

// ask new employee's data

        Scanner scanner = new Scanner(System.in);

*//*        System.out.println("Enter employee's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter employee's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter employee's mobile number:");
        String mobile = scanner.next();
        System.out.println("Enter employee's email address:");
        String email = scanner.next();
        System.out.println("Enter employee's password:");
        String password = scanner.next();*//*



//add new data to the database

// example data for testing database syntax because i have ERROR
        String firstName = "Margus";
        String lastName = "Magus";
        String mobile = "55664456";
        String email = "margusmagus@gmail.com";
        String password = "margus123";

        try {
            Statement stmt = DBUtil.getDBConnection().createStatement();
            stmt.execute(  "INSERT INTO employee(first_name, last_name, mobile, email, password)"
                    + "VALUES('" + firstName + "', '"
                    + "'" + lastName + "', "
                    + "'" + mobile + "', "
                    + "'" + email + "', "
                    + "'" + password + "')");



            System.out.println("New employee added");

        }catch (SQLException e) {
            e.printStackTrace();
        }


    }*/

    private void menuListAllEmployees(Scanner input) {

        List<Employee> listEmployee = repositoryEmployee.listAllEmployees();

        if (listEmployee.size() > 0) {
            System.out.println("\nList of Employees:");
            for (Employee employee : listEmployee) {
                System.out.println(employee.toString());
            }
        } else {
            System.out.println("\nNo employees registered\n");
            menuOptions(input);
        }
    }

    //Add class RepositoryEmployee,  implement method to update phone employee filtering by employeeId

    public void menuUpdateMobileEmployee(int mobile, int employeeId ) throws SQLException {
        String sql = "UPDATE employee SET mobile = ? WHERE employee_id = ?";

//            private void menuUpdateAccountStatus(Scanner input) {
//        System.out.println("Type the customer ID");
//        int id = input.nextInt();
//        Customer result = repositoryCustomer.findCustomerById(id);
//        if (result == null) {
//            System.out.println("\nCustomer not found\n");
//            menuOptions(input);
//        } else {
//            System.out.println("Type the new stock value");
//            int stock = input.nextInt();
//            repositoryCustomer.updateStockProduct(id, stock);
//        }
//    }


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
