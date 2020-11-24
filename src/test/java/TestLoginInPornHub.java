import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;

public class TestLoginInPornHub {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    LoginInPornHub liph = new LoginInPornHub();

    @BeforeClass
    public static void startTesting(){
        System.out.println("Start Testing Class");
    }

    @Test
    public void testLogin1(){
        Boolean testLogin = liph.login("Nik");
        assertEquals(true,testLogin);
    }

    @Test
    public void testLogin2(){
        Boolean testLogin = liph.login("");
        assertEquals(false,testLogin);
    }
    @Test
    public void testAge(){
        Boolean testAge = liph.checkAge(32);
        assertEquals(true, testAge);
    }


}
