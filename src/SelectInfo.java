import java.sql.*;
import java.util.Scanner;

public class SelectInfo {
    public static void selectPostsByUserName() throws SQLException {
        try (Connection connect = getConnection1()) {
            Statement statement = connect.createStatement();
            System.out.println("Write user name");
            String name = new Scanner(System.in).nextLine();
            ResultSet userIdSet = statement.executeQuery("SELECT id FROM users WHERE name = '" + name + "'");
            ResultSet postsSet = statement.executeQuery("SELECT body FROM posts WHERE userId = " + userIdSet.getString("id"));
            while (postsSet.next()){
                System.out.println(postsSet.getString("body"));
                System.out.println();
            }
            statement.close();
        }
    }

    public static void selectCommentsByUserName() throws SQLException {
        try (Connection connect = getConnection1()) {
            Statement statement = connect.createStatement();
            System.out.println("Write user name");
            String name = new Scanner(System.in).nextLine();
            ResultSet userIdSet = statement.executeQuery("SELECT id FROM users WHERE name = '" + name + "'");
            ResultSet postsIdSet = statement.executeQuery("SELECT id FROM posts WHERE userId = " + userIdSet.getString("id"));
            ResultSet commentsSet = statement.executeQuery("SELECT body FROM comments WHERE postId = " + postsIdSet.getString("id"));
            while (commentsSet.next()){
                System.out.println(commentsSet.getString("body"));
                System.out.println();
            }
            statement.close();
        }
    }

    public static void selectUsernameById() throws SQLException {
        try (Connection connect = getConnection1()) {
            Statement statement = connect.createStatement();
            System.out.println("Write user id");
            String id = new Scanner(System.in).nextLine();
            ResultSet userNameById = statement.executeQuery("SELECT name FROM users Where id = '" + id + "'");
            System.out.println(userNameById.getString("name"));
    }

}

    private static Connection getConnection1() throws SQLException {
        Connection connection;
        String url = "jdbc:sqlite:C:\\Users\\ivanf\\OneDrive\\Рабочий стол\\project_1";
        connection = DriverManager.getConnection(url);
        return connection;
    }
}
