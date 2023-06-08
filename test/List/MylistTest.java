package List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MylistTest {
    Mylist list = new Mylist(10);

    @Test
    public void listExistTest() {
        assertNotNull(list);
    }

    @Test
    public void listIsEmptyTest() {
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void addElementTest() {
        list.add(0, "sapphire");
        Assertions.assertFalse(list.isEmpty());
    }

    @Test
    public void sizeOfElementTest() {
        list.add(3, "sapphire");
        list.add(2, "silver");
        list.add(1, "diamond");
        list.add(0, "daniela");
        assertEquals(4, list.size());

    }

    @Test
    public void clearElementTest() {
        list.add(4, "sapphire");
        list.add(3, "silver");
        list.add(2, "diamond");
        list.add(1, "daniela");
        list.add(0, "queenie");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void removeIndexTest() {
        list.add(4, "sapphire");
        list.add(3, "silver");
        list.add(2, "diamond");
        list.add(1, "daniela");
        list.add(0, "queenie");
        list.removeIndex(4);
        assertEquals(4, list.size());

    }

    @Test
    public void removeElementTest() {
        list.add(4, "sapphire");
        list.add(3, "sapphire");
        list.add(2, "sapphire");
        list.add(1, "daniela");
        list.add(0, "queenie");
        list.removeElement("sapphire");
        assertEquals(4, list.size());
    }

    @Test
    public void getIndexTest() {
        list.add(1, "sapphire");
        list.add(0, "daniela");
        assertEquals("sapphire", list.getIndex(1));
    }

    @Test
    public void setListIndexTest() {
        list.add(2, "sapphire");
        list.add(1, "dan");
        list.add(0, "pat");
        list.setList(2, "sam");
        assertEquals("sam", list.getIndex(2));
    }

    @Test
    public void indexOfElementTest() {
        list.add(2, "sapphire");
        list.add(1, "dan");
        list.add(0, "pat");

        assertEquals(0, list.indexOf("pat"));
    }

    @Test
    public void lastIndexOfElementTest() {
        list.add(2, "sapphire");
        list.add(1, "dan");
        list.add(0, "pat");
        list.add(3, "pat");
        assertEquals(3, list.lastIndexOf("pat"));
    }

    @Test
    public void equalsElementTest() {
        list.add(2, "dan");
        list.add(1, "pat");
        list.add(0, "sam");
        assertTrue(list.equalElement("pat"));
    }

    @Test
    public void containElementTest() {
        list.add(2, "dan");
        list.add(1, "pat");
        list.add(0, "sam");
        assertTrue(list.contains("dan"));
    }
}