package work.daily;

import org.junit.Test;

import static org.junit.Assert.*;

public class floatGreatestTest {
    @Test
    public void ftest1(){
        FloatGreatest floatGreatest = new FloatGreatest();
        float res = floatGreatest.greatestFloat(40.4f,13.45f,34.4f);
        assertEquals(40.4f,res,0.0f);
    }
    @Test
    public void ftest2(){
        FloatGreatest floatGreatest = new FloatGreatest();
        float res = floatGreatest.greatestFloat(10.4f,13.45f,4.4f);
        assertEquals(13.45f,res,0.0f);
    }
    @Test
    public void ftest3(){
        FloatGreatest floatGreatest = new FloatGreatest();
        float res = floatGreatest.greatestFloat(20.4f,13.45f,34.4f);
        assertEquals(34.4f,res,0.0f);
    }
}