import java.sql.*;
import java.util.Scanner;

public class DeletePositionOfTable {

    public static void deleteUserOnId() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write user id");
            String userId = new Scanner(System.in).nextLine();
            statement.execute("DELETE FROM users WHERE id = " + userId);
            ResultSet resultSet = statement.executeQuery("SELECT id FROM posts WHERE userId = " + userId);
            while(resultSet.next()){
                statement.execute("DELETE FROM comments WHERE postId = " + resultSet.getString("id"));
            }
            statement.execute("DELETE FROM posts WHERE userId = " + userId);
            statement.execute("DELETE FROM albums WHERE userId = " + userId);
            statement.close();
        }
    }

    public static void deleteAlbumOnId() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write album id");
            String albumId = new Scanner(System.in).nextLine();
            statement.execute("DELETE FROM albums WHERE id = " + albumId);
            statement.close();
        }
    }

    public static void deleteCommentsOnId() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write comment id");
            String commentId = new Scanner(System.in).nextLine();
            statement.execute("DELETE FROM comments WHERE id = " + commentId);
            statement.close();
        }
    }

    public static void deletePostsOnId() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            System.out.println("Write post id");
            String postId = new Scanner(System.in).nextLine();
            statement.execute("DELETE FROM albums WHERE id = " + postId);
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
