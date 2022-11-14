import java.io.*;
import java.sql.SQLException;
import java.util.List;

import albums.Albums;
import comments.Comments;
import posts.Posts;
import users.User;

public class Main {
    public static void main(String[] args) throws SQLException {
        List<User> users;
        List<Comments> comments;
        List<Albums> albums;
        List<Posts> posts;
        TableWriter tableWriter = new TableWriter();
        try {
            users = Parser.parseJsonToObjectUsers();
            comments = Parser.parseJsonToObjectComments();
            albums = Parser.parseJsonToObjectAlbums();
            posts = Parser.parseJsonToObjectPosts();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        tableWriter.createUsersTable(users);
        tableWriter.createPostsTable(posts);
        tableWriter.createAlbumsTable(albums);
        tableWriter.createCommentsTable(comments);

        //DeletePositionOfTable.deleteAlbumOnId();
        //DeletePositionOfTable.deleteUserOnId();

        //UpdateTable.updateUser();
        //UpdateTable.updatePost();

        //CreateNewEntryInTable.postNewEntry();

        //SelectInfo.selectPostsByUserName();
        //UpdateTable.updateComment();
        //SelectInfo.selectCommentsByUserName();
        SelectInfo.selectUsernameById();

    }





}