package work.daily;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringGreatestTest {
    @Test
    public void Stest1(){
        StringGreatest stringGreatest = new StringGreatest();
        String res =stringGreatest.greatestString("hello","abc","def");
        assertEquals("hello",res);
    }

    @Test
    public void Stest2(){
        StringGreatest stringGreatest = new StringGreatest();
        String res =stringGreatest.greatestString("hello","sk","bro");
        assertEquals("sk",res);
    }

    @Test
    public void Stest3(){
        StringGreatest stringGreatest = new StringGreatest();
        String res =stringGreatest.greatestString("hello","sk","zeon");
        assertEquals("zeon",res);

    }


}