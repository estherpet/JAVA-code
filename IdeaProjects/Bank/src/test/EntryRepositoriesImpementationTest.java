package test;

import data.models.Entry;
import data.models.User;
import data.repositories.EntryRepositories;
import data.repositories.EntryRepositoriesImpementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryRepositoriesImpementationTest {
    EntryRepositories entryRepositories = new EntryRepositoriesImpementation();
    @Test
    public void saveOneEntry_countIsOneTest(){
        Entry entry = new Entry();
        entryRepositories.save(entry);
        assertEquals(1,entryRepositories.count());
    }
    @Test
    public void saveTwoEntry_countIsTwoTest(){
        Entry entry = new Entry();
        Entry entry1 = new Entry();
        entryRepositories.save(entry);
        entryRepositories.save(entry1);
        System.out.println(entry.getId());
        System.out.println(entry1.getId());
        assertEquals(2,entryRepositories.count());
    }
    @Test
    public void saveTwoEntry_deleteOneTest(){
        Entry entry = new Entry();
        Entry entry1 = new Entry();
        entryRepositories.save(entry);
        entryRepositories.save(entry1);
        entryRepositories.delete(1);
        assertEquals(1,entryRepositories.count());
    }
    @Test
    public void saveTwoEntry_DeleteAllTest(){
        Entry entry = new Entry();
        Entry entry1 = new Entry();
        entryRepositories.save(entry);
        entryRepositories.save(entry1);
        entryRepositories.deleteAll();
        assertEquals(0,entryRepositories.count());
    }
    @Test
    public void saveTwoEntry_findByIdTest(){
        Entry entry = new Entry();
        Entry entry1 = new Entry();
        entryRepositories.save(entry);
        entryRepositories.save(entry1);
        assertSame(entry,entryRepositories.findById(1));
    }
    @Test
    public void saveEntry_findAllTest(){
        Entry entry = new Entry();
        Entry entry1 = new Entry();
        Entry entry2 = new Entry();
        entryRepositories.save(entry);
        entryRepositories.save(entry1);
        entryRepositories.save(entry2);
        for (int index = 0; index < entryRepositories.findAll().size(); index++) {
            assertTrue(entryRepositories.findAll().contains(entry));
            assertTrue(entryRepositories.findAll().contains(entry1));
            assertTrue(entryRepositories.findAll().contains(entry2));
        }
    }

}