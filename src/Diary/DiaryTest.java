package Diary;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary = new Diary("username","password");
    @Test
    public  void diaryTest(){
        assertNotNull(diary);
    }
    @Test
    public void diary_Locked_ByDefault_Test(){
        assertTrue(diary.isLocked());
    }
    @Test
    public  void diary_CanBe_Unlocked_Test(){
        assertTrue(diary.isLocked());
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
    }
    @Test
    public  void  diary_CannotBe_Unlocked_WithWrong_Password_Test(){
        assertTrue(diary.isLocked());
        diary.unlockWith("wrong password");
        assertTrue(diary.isLocked());
    }
    @Test
    public void diary_CanBe_Locked_Test(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test
    public void unlocked_Diary_CanCreate_Gist_Test(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("Title","Body");
        assertEquals(1,diary.countGist());
    }
    @Test
    public void createGist_FindGist_ByTitle_return_createdGist_Test(){
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.addGist("Title","Body");
        Gist gist = diary.findGistByTitle("Title");
        assertEquals("Body",gist.getBody());
    }
}