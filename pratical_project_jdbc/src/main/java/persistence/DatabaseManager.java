package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import util.DBUtil;

public class DatabaseManager {

    private Connection connection;

    public DatabaseManager() {
        DBUtil.createDatabase();
        connection = DBUtil.getDBConnection();

// ==============  customer table  ===============
/*
    private void createTableCustomer() {
        String sql = "CREATE TABLE IF NOT EXISTS customer (\n"
                + "	customer_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	first_name varchar(30) DEFAULT NULL,\n"
                + "	last_name varchar(30) DEFAULT NULL,\n"
                + "	email varchar(50) DEFAULT NULL,\n"
                + "	mobile varchar(10) DEFAULT NULL,\n"
                + "	username varchar(20) DEFAULT NULL,\n"
                + "	password varchar(20) DEFAULT NULL\n"
                //+ "	 PRIMARY KEY (customer_id)\n"
                + ");";
        
        try {
             Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTableCustomer();
    }
*/

//  ==================  Employee table  =======================

/*
    private void createTableEmployee() {
        String sql = "CREATE TABLE IF NOT EXISTS employee (\n"
                + "	employee_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	first_name varchar(30) DEFAULT NULL,\n"
                + "	last_name varchar(30) DEFAULT NULL,\n"
                + "	mobile varchar(10) DEFAULT NULL,\n"
                + "	email varchar(50) DEFAULT NULL,\n"
                + "	username varchar(20) DEFAULT NULL,\n"
                + "	password varchar(20) DEFAULT NULL\n"
                //+ "	 PRIMARY KEY (customer_id)\n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTableEmployee();
    }
}
*/

//  ====================== car table =============================================

/*    private void createTableCar() {
        String sql = "CREATE TABLE IF NOT EXISTS car (\n"
                + "	car_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	status int NOT NULL,\n"
                + "	reg_nr varchar(6) UNIQUE,\n"
                + "	car_type varchar(45),\n"
                + "	mark varchar(45),\n"
                + "	color varchar(45),\n"
                + "	model varchar(45),\n"
                + "	gearbox varchar(45),\n"
                + "	fuel varchar(45),\n"
                + "	nr_of_seats int(10)\n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTableCar();
    }
}*/

// ================== period table ==================================

/*    private void createTablePeriod() {
        String sql = "CREATE TABLE IF NOT EXISTS period (\n"
                + "	period_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	start datetime,\n"
                + "	end datetime,\n"
                + "	returned datetime,\n"
                + "	status int,\n"
                + "	order_id INT,\n"
                + " CONSTRAINT FOREIGN KEY (order_id) REFERENCES orders(order_id) \n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTablePeriod();
    }
 }*/

//  =================== order table =========================================

/*    private void createTableOrder() {
        String sql = "CREATE TABLE IF NOT EXISTS orders (\n"
                + "	order_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	customer_id int,\n"
                + "	order_date datetime,\n"
                + "	order_status int,\n"
                + "	processed_by int,\n"
                + " CONSTRAINT FOREIGN KEY (processed_by) REFERENCES employee(employee_id), \n"
                + " CONSTRAINT FOREIGN KEY (customer_id) REFERENCES customer(customer_id) \n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTableOrder();
    }
}*/

// ==================== order details table ======================

/*    private void createTableOrderDetails() {
        String sql = "CREATE TABLE IF NOT EXISTS order_details (\n"
                + "	order_details_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	order_id int,\n"
                + "	car_id int,\n"
                + "	period_in_days int,\n"
                + "	customer_id int,\n"
                + "	constraint foreign key (order_id) references orders(order_id),\n"
                + "	constraint foreign key (car_id) references car(car_id),\n"
                + "	constraint foreign key (customer_id) references customer(customer_id)\n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTableOrderDetails();
    }
}*/

// ============ payment ================

/*    private void createTablePayment() {
        String sql = "CREATE TABLE IF NOT EXISTS payment (\n"
                + "	payment_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	order_id int,\n"
                + "	total float,\n"
                + "	payment_date DATE,\n"
                + "	constraint foreign key (order_id) references orders(order_id)\n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTablePayment();
    }
}*/

// ============== rating =================

/*    private void createTableRating() {
        String sql = "CREATE TABLE IF NOT EXISTS rating (\n"
                + "	rating_id int PRIMARY KEY NOT NULL AUTO_INCREMENT,\n"
                + "	car_id int,\n"
                + "	score float,\n"
                + "	comments varchar(200),\n"
                + " date date, \n"
                + "	constraint foreign key (car_id) references car(car_id)\n"
                + ");";

        try {
            Statement stmt = connection.createStatement();
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void initTables() {
        createTableRating();
    }
}*/


    }
}