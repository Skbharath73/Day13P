package work.daily;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumPbTest {
    @Test
    public void test1(){
        MaximumPb maximumPb = new MaximumPb();
        int res = maximumPb.greatest(10,3,8);
        assertEquals(10,res);//res = 2;a > b,c
    }

    @Test
    public void test2(){
        MaximumPb maximumPb = new MaximumPb();
        int res = maximumPb.greatest(7,16,8);
        assertEquals(16,res);//r
    }

    @Test
    public void test3(){
        MaximumPb maximumPb = new MaximumPb();
        int res = maximumPb.greatest(10,13,18);
        assertEquals(18,res);
    }

}