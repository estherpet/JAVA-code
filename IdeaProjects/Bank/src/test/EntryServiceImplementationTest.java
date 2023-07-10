package test;

import dto.Response;
import org.junit.jupiter.api.Test;
import services.EntryServiceImplementation;
import services.EntryServices;

import static org.junit.jupiter.api.Assertions.*;

class EntryServiceImplementationTest {
    EntryServices entryServices = new EntryServiceImplementation();
@Test
    public void addOneEntry_NumberOfEntryIsOneTest(){
    Response entry = new Response();
    entry.setTitle("MY day");
    entry.setBody("my day was stressful and not fine");
    entryServices.addEntry(entry);
    assertEquals(1,entryServices.numberOfEntry());
   }
@Test
    public void addTwoEntry_NumberOfEntryIsTwoTest(){
    Response entry = new Response();
    entry.setTitle("Today");
    entry.setBody("today was fun, i really enjoyed my day");
    entryServices.addEntry(entry);
    Response entry1 = new Response();
    entry1.setTitle("fire");
    entry1.setBody("yesterday was fun, i really enjoyed my day");
    entryServices.addEntry(entry1);
    assertEquals(2,entryServices.numberOfEntry());
  }
  @Test
    public void addTwoEntry_DeleteOneTest(){
      Response entry = new Response();
      entry.setTitle("best day");
      entry.setBody("today was fun, i really enjoyed my day");
      entryServices.addEntry(entry);
      Response entry1 = new Response();
      entry1.setTitle("fire");
      entry1.setBody("yesterday was fun, i really enjoyed my day");
      entryServices.addEntry(entry1);
      entryServices.deleteEntry(1);
      assertEquals(1,entryServices.numberOfEntry());
  }
  @Test
    public void addTwoEntry_DeleteTwoTest(){
      Response entry = new Response();
      entry.setTitle("birthday");
      entry.setBody("today, i really enjoyed my day");
      entryServices.addEntry(entry);
      Response entry1 = new Response();
      entry1.setTitle("fire");
      entry1.setBody("yesterday was fun, i really enjoyed my day");
      entryServices.addEntry(entry1);
      entryServices.deleteEntry(1);
      entryServices.deleteEntry(2);
      assertEquals(0,entryServices.numberOfEntry());
  }
  @Test
    public void  addTwoEntry_FindByTitleTest(){
      Response entry = new Response();
      entry.setTitle("fact");
      entry.setBody("today was fun, i really enjoyed my day");
      entryServices.addEntry(entry);
      Response entry1 = new Response();
      entry1.setTitle("fire");
      entry1.setBody("yesterday was fun, i really enjoyed my day");
      entryServices.addEntry(entry1);
      assertEquals("fact",entryServices.findEntryByTitle(entry.getTitle()));
  }
}