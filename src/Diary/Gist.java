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
}
