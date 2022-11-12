import albums.Albums;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import comments.Comments;
import posts.Posts;
import users.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static List<User> parseJsonToObjectUsers() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = mapper.readValue(new File("C:\\Program From Git\\project_1\\users.json"), new TypeReference<>() {});
        return users;
    }
    public static ArrayList<Comments> parseJsonToObjectComments() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Comments> comments = mapper.readValue(new File("C:\\Program From Git\\project_1\\comments.json"), new TypeReference<>() {});
        return (ArrayList<Comments>) comments;

    }public static ArrayList<Albums> parseJsonToObjectAlbums() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Albums> albums = mapper.readValue(new File("C:\\Program From Git\\project_1\\albums.json"), new TypeReference<>() {});
        return (ArrayList<Albums>) albums;
    }
    public static ArrayList<Posts> parseJsonToObjectPosts() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Posts> posts = mapper.readValue(new File("C:\\Program From Git\\project_1\\posts.json"), new TypeReference<>() {});
        return (ArrayList<Posts>) posts;
    }
}
