import java.sql.*;

public class ToDoListDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Replace with your database URL
        String username = "your-username"; // Replace with your database username
        String password = "your-password"; // Replace with your database password

        String inputValue = ""; // Variable to store the input value (should be set dynamically)

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a PreparedStatement for the insert query
            String query = "INSERT INTO Todolist (task) VALUES (?)"; // Replace with your table and column names
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, inputValue);

            // Execute the insert query
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Task added successfully to the database!");
            } else {
                System.out.println("Failed to add task to the database.");
            }

            // Close the statement and connection
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}
