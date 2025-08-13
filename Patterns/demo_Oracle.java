package Patterns;

public class demo_Oracle {
    public static void main(String[] args) {
        // Simulated database connection details
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "ankit.bansal.it.2022@miet.ac.in";
        String password = "Ankitbansal@2003";
        
        System.out.println("Using URL: " + url);
        System.out.println("Username: " + username);

        // Simulating connection success
        boolean isConnected = true;

        if (isConnected) {
            System.out.println("Connected to: Oracle Database (simulated)");

            // Simulate a prepared statement and update
            int newSalary = 60000;
            int empId = 10002;

            System.out.println("Preparing to update salary for empid = " + empId);
            System.out.println("New salary: " + newSalary);

            // Simulate execution
            int rowsAffected = 1; // pretend 1 row was updated
            System.out.println("Updated rows: " + rowsAffected);
        } else {
            System.out.println("FAILED to connect to Oracle database.");
        }

        System.out.println("Finished (simulation only, no real database).");
    }
}
