package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean islocked = true;
    private String password;
    private int gistCount = 0;
    List<Gist> gists = new ArrayList<>();

    public Diary(String username, String password) {
        this.password = password;

    }

    public boolean isLocked() {
        return islocked;
    }

    public void unlockWith(String password) {

        if (this.password.equalsIgnoreCase(password)) {
            islocked = false;
        }
    }

    public void lock() {
        islocked = true;
    }

    public void addGist(String title, String body) {
        Gist newGist = new Gist(title, body);
        gists.add(newGist);
        gistCount++;
    }

    public int countGist() {
        return gistCount;

    }


    public Gist findGistByTitle(String title) {
        for (Gist gist : gists) {
            if (gist.getTitle().equalsIgnoreCase(title)) {
                return gist;
            }
        }
        return null;

    }
}
