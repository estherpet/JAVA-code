package Diary;

public class Gist {
    private  String body;
    private  String title;

    public Gist(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return 0;
    }

    public void setBody(String body) {
        this.body = body;

    }

    public void setTitle(String title) {
        this.title = title;
    }

@Override
public String toString() {
    return String.format("""
                            
            """,(title),body);
 }
}