package albums;

import java.util.ArrayList;

public class Albums {

    public int userId;
    public int id;
    public String title;

    public Albums(int userId, int id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "albums.Albums{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
