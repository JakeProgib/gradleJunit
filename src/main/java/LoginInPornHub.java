import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginInPornHub {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public boolean login(String log){
        if (log.length() > 0) {
            return true;
        } else {
            return false;
        }

    }
    public boolean pass(String pass){
        if (pass.length()>6){
            return true;
        }
        else{return false;}
    }
    public boolean checkAge(int age){
        if(age>=18){
            return true;
        }
        else{return  false;}
    }
}
