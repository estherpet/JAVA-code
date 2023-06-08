package mySet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

 public class MySetTest {
     MySet myset;

     @BeforeEach public void startTest () {
         myset = new MySet();
     }
     @Test
     public void addTest () {
         myset.add("2");
         myset.add("3");
         myset.add("4");
         assertEquals(3, myset.getSize());

     }
     @Test
     public void clearTest(){
         myset.add("2");
         myset.add("3");
         myset.add("4");
         myset.clear();
         assertEquals(0, myset.getSize());
     }
     @Test
     public  void containTest(){
    myset.add("2");
    myset.add("3");
    myset.add("4");
    assertTrue(myset.contain("2"));
   }
   @Test
     public void emptyTest(){
       myset.add("2");
       myset.add("3");
       myset.add("4");
       assertTrue(myset.isEmpty());
   }
   @Test
     public void toArray(){
       myset.add("2");
       myset.add("3");
       myset.add("4");
       assertEquals("[2, 3, 4]", Arrays.toString(myset.toArray()));
   }
}