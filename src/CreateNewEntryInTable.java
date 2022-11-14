import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateNewEntryInTable {
    public static void userNewEntry() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO users(id, " +
                    "name, " +
                    " username, " +
                    " email, " +
                    " street, " +
                    " suite, " +
                    " city, " +
                    " zipcode, " +
                    " lat, " +
                    " lng, " +
                    " phone, " +
                    " website, " +
                    " companyname, " +
                    " catchPhrase, " +
                    " bs) VALUES");
            System.out.println("Write id");
            String id = new Scanner(System.in).nextLine();
            System.out.println("Write name");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Write username");
            String username = new Scanner(System.in).nextLine();
            System.out.println("Write email");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Write street");
            String street = new Scanner(System.in).nextLine();
            System.out.println("Write suite");
            String suite = new Scanner(System.in).nextLine();
            System.out.println("Write city");
            String city = new Scanner(System.in).nextLine();
            System.out.println("Write zipcode");
            String zipcode = new Scanner(System.in).nextLine();
            System.out.println("Write lat");
            String lat = new Scanner(System.in).nextLine();
            System.out.println("Write lng");
            String lng = new Scanner(System.in).nextLine();
            System.out.println("Write phone");
            String phone = new Scanner(System.in).nextLine();
            System.out.println("Write website");
            String website = new Scanner(System.in).nextLine();
            System.out.println("Write companyName");
            String companyName = new Scanner(System.in).nextLine();
            System.out.println("Write catchPhrase");
            String catchPhrase = new Scanner(System.in).nextLine();
            System.out.println("Write bs");
            String bs = new Scanner(System.in).nextLine();
            sb.append("(")
                    .append("'")
                    .append(id)
                    .append("', ")
                    .append("'")
                    .append(name)
                    .append("', ")
                    .append("'")
                    .append(username)
                    .append("', ")
                    .append("'")
                    .append(email)
                    .append("', ")
                    .append("'")
                    .append(street)
                    .append("', ")
                    .append("'")
                    .append(suite)
                    .append("', ")
                    .append("'")
                    .append(city)
                    .append("', ")
                    .append("'")
                    .append(zipcode)
                    .append("', ")
                    .append("'")
                    .append(lat)
                    .append("', ")
                    .append("'")
                    .append(lng)
                    .append("', ")
                    .append("'")
                    .append(phone)
                    .append("', ")
                    .append("'")
                    .append(website)
                    .append("', ")
                    .append("'")
                    .append(companyName)
                    .append("', ")
                    .append("'")
                    .append(catchPhrase)
                    .append("', ")
                    .append("'")
                    .append(bs)
                    .append("'")
                    .append(")");
            statement.execute(sb.toString());
            statement.close();
        }
    }

    public static void postNewEntry() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO posts(id," +
                    " userId," +
                    " title," +
                    " body) VALUES");
            System.out.println("Write id");
            String id = new Scanner(System.in).nextLine();
            System.out.println("Write userId");
            String userId = new Scanner(System.in).nextLine();
            System.out.println("Write title");
            String title = new Scanner(System.in).nextLine();
            System.out.println("Write body");
            String body = new Scanner(System.in).nextLine();
            sb.append("(")
                    .append(id)
                    .append(", ")
                    .append("'")
                    .append(userId)
                    .append("'")
                    .append(", ")
                    .append("'")
                    .append(title)
                    .append("'")
                    .append(", ")
                    .append("'")
                    .append(body)
                    .append("'")
                    .append(")");
            statement.execute(sb.toString());
            statement.close();
        }
    }

    public static void albumNewEntry() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO albums(id, userId, title) VALUES");
            System.out.println("Write id");
            String id = new Scanner(System.in).nextLine();
            System.out.println("Write userId");
            String userId = new Scanner(System.in).nextLine();
            System.out.println("Write title");
            String title = new Scanner(System.in).nextLine();
            sb.append("(")
                    .append("'")
                    .append(id)
                    .append("', ")
                    .append("'")
                    .append(userId)
                    .append("', ")
                    .append("'")
                    .append(title)
                    .append("'")
                    .append(")");
            statement.execute(sb.toString());
            statement.close();
        }
    }

    public static void commentNewEntry() throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO comments(id, postId, name, email, body) VALUES");
            System.out.println("Write id");
            String id = new Scanner(System.in).nextLine();
            System.out.println("Write postId");
            String postId = new Scanner(System.in).nextLine();
            System.out.println("Write name");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Write email");
            String email = new Scanner(System.in).nextLine();
            System.out.println("Write body");
            String body = new Scanner(System.in).nextLine();
            sb.append("(")
                    .append("'")
                    .append(id)
                    .append("', ")
                    .append("'")
                    .append(postId)
                    .append("', ")
                    .append("'")
                    .append(name)
                    .append("', ")
                    .append("'")
                    .append(email)
                    .append("', ")
                    .append("'")
                    .append(body)
                    .append("'")
                    .append(")");
            statement.execute(sb.toString());
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
