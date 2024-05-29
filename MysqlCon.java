import java.sql.*; //import the jdbc package

class MysqlCon {   //define a class name mysqlcon
    public static void main(String args[]) {    //main method entry point of program
        try {
            // Load the MySQL JDBC driver
            //this tells the jdbc driver manager which driver to use
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            // URL: jdbc:mysql://localhost:3306/sonoo
            // "sonoo" is the database name, "root" is the username, and "" is the password
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo", "root", ""
            );
            
            // Create a statement object to perform queries
            // rs.getInt(1), rs.getString(2), rs.getString(3) get the values of the first, second, and third columns
            Statement stmt = con.createStatement();

            // Execute a query and get a result set
            ResultSet rs = stmt.executeQuery("select * from emp");

            // Process the result set
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            // Close the connection
            con.close();
        } catch (Exception e) {
            // If any exception occurs, print the exception message
            System.out.println(e);
        }
    }
}
