import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTable {
    public static void updateUser() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write new name");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Write user id");
            String id = new Scanner(System.in).nextLine();
            statement.execute("UPDATE users SET name = '" + userName + "' WHERE id = " + id);
            statement.close();
        }
    }

    public static void updatePost() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write new title");
            String title = new Scanner(System.in).nextLine();
            System.out.println("Write post id");
            String id = new Scanner(System.in).nextLine();
            statement.execute("UPDATE posts SET title = '" + title + "' WHERE id = " + id);
            statement.close();
        }
    }

    public static void updateAlbum() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write new title");
            String title = new Scanner(System.in).nextLine();
            System.out.println("Write album id");
            String id = new Scanner(System.in).nextLine();
            statement.execute("UPDATE albums SET title = '" + title + "' WHERE id = " + id);
            statement.close();
        }
    }

    public static void updateComment() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write new name");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Write comment id");
            String id = new Scanner(System.in).nextLine();
            statement.execute("UPDATE comments SET name = '" + name + "' WHERE id = " + id);
            statement.close();
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection;
        String url = "jdbc:sqlite:C:\\Users\\ivanf\\OneDrive\\Рабочий стол\\project_1";
        connection = DriverManager.getConnection(url);
        return connection;
    }
}
