import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    Calc calc = new Calc();
    @BeforeClass
    public static void startTesting(){
        System.out.println("Start Testing Class");
    }

    @Test
    public void resTest1() {
        int result = calc.div(2, 2);
        assertEquals(1,result);
    }

    @Test
    public void resTest2(){
        int result = calc.minus(4,2);
        assertEquals(2,result);
    }

    @Test
    public void resTest3(){
        int result = calc.multi(2,4);
        assertEquals(8,result);
    }

    @Test
    public  void resTest4(){
        int result = calc.plus(3,4);
        assertEquals(7,result);
    }




}
