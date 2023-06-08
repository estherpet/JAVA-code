package Stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    MyStack stack;
    @BeforeEach
    public  void  stack(){
        stack = new MyStack(10);
    }
    @Test
    public void stackExistTest(){
       assertNotNull(stack);
    }
    @Test
    public void  stackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void push1ElementInAnEmptyStackTest(){
        stack.push("G-string");
        assertFalse(stack.isEmpty());
    }
    @Test
    public  void  push1Element_And_Stack_Should_Be_Empty_Test(){
        stack.push("E-string");
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void push2Element_And_Return_1Element_Test(){
        stack.push("G-string");
        stack.push("E-string");
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test
    public void push1Element_return_1_Test(){
        stack.push("T-string");
       String actual = stack.pop();
        assertEquals("T-string",actual);
    }
    @Test
    public  void push3Element_Return_1_when_pop_twice_Test(){
        stack.push("T-string");
        stack.push("E-string");
        stack.push("G-string");
        String actual = stack.pop();
        assertEquals("G-string",actual);
    }

}