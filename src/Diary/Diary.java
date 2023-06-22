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

    public void updateGist(int id, String title, String body) {
        boolean diaryIsUnlocked = !islocked;
        if (diaryIsUnlocked){
            for (Gist gist:gists){
                if (gist.getId() == id){
                    gist.setBody(body);
                    gist.setTitle(title);
                }
            }
        }
    }

    public void deleteGist(String title) {
        boolean diaryIsUnlocked = !islocked;
        if (diaryIsUnlocked){
            for (Gist gist :gists){
                if (gist.getTitle().equals(title)){
                    gists.remove(gist);
                    gistCount--;
                    break;
                }
            }
        }
    }
}
