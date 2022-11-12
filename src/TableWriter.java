import albums.Albums;
import comments.Comments;
import posts.Posts;
import users.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TableWriter {
    public TableWriter(){}

    public void createUsersTable(List<User> users) throws SQLException {
        try (Connection connect = getConnection()){
            Statement statement = connect.createStatement();
            statement.execute("""
                Create table if not exists users(
            	id varchar not null,
            	username varchar not null,
            	email varchar not null,
            	street varchar not null,
            	suite varchar not null,
            	city varchar not null,
            	zipcode varchar not null,
            	lat varchar not null,
            	lng varchar not null,
            	phone varchar not null,
            	website varchar not null,
            	name varchar not null,
            	catchPhrase varchar not null,
            	bs varchar not null
                )
            """);

            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO users(id," +
                    "name," +
                    " username," +
                    " email," +
                    " street," +
                    " suite," +
                    " city," +
                    " zipcode," +
                    " lat," +
                    " lng," +
                    " phone," +
                    " website," +
                    " name," +
                    " catchPhrase," +
                    " bs) VALUES");
            for (User user : users) {
                String id = user.getId();
                String name = user.getName();
                String username = user.getUserName();
                String email = user.getEmail();
                String street = user.getAddress().getStreet();
                String suite = user.getAddress().getSuite();
                String city = user.getAddress().getCity();
                String zipcode = user.getAddress().getZipcode();
                String lat = user.getAddress().getGeo().getLat();
                String lng = user.getAddress().getGeo().getLng();
                String phone = user.getPhone();
                String website = user.getWebsite();
                String companyName = user.getCompany().getCompanyName();
                String catchPhrase = user.getCompany().getCatchPhrase();
                String bs = user.getCompany().getBs();
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
                        .append(", ")
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
                        .append(")").append(",");
            }
            sb.deleteCharAt(sb.length()-1);
            statement.execute(sb.toString());
        }
    }

    public void createPostsTable(List<Posts> posts) throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            statement.execute("""
                Create table if not exists posts(
	                id VARCHAR NOT NULL,
	                userId VARCHAR NOT NULL,
	                title VARCHAR NOT NULL,
	                body VARCHAR NOT NULL
                )
            """);

            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO users(id," +
                    " userId," +
                    " title," +
                    " body," +
                    " bs) VALUES");
            for (Posts post : posts) {
                sb.append("(")
                        .append(post.getId())
                        .append(", ")
                        .append("'")
                        .append(post.getUserId())
                        .append("'")
                        .append(", ")
                        .append("'")
                        .append(post.getTitle())
                        .append("'")
                        .append(", ")
                        .append("'")
                        .append(post.getBody())
                        .append("'")
                        .append(", ")
                        .append(")").append(",");

            }
            sb.deleteCharAt(sb.length()-1);
            statement.execute(sb.toString());
        }

    }

    public void createAlbumsTable(List<Albums> albums) throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            statement.execute("""
                Create table if not exists albums(
	                id VARCHAR NOT NULL,
	                userId VARCHAR NOT NULL,
	                title VARCHAR NOT NULL
                )
            """);
        }
    }

    public void createCommentsTable(List<Comments> comments) throws SQLException {
        try (Connection connect = getConnection()) {
            Statement statement = connect.createStatement();
            statement.execute("""
                Create table if not exists comments(
	                id VARCHAR NOT NULL,
	                postId VARCHAR NOT NULL,
	                name VARCHAR NOT NULL,
	                email VARCHAR NOT NULL,
	                body VARCHAR NOT NULL
                )
            """);
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection connection;
        String url = "jdbc:sqlite:C:\\Users\\ivanf\\OneDrive\\Рабочий стол\\project_1";
        connection = DriverManager.getConnection(url);
        return connection;
    }
}
