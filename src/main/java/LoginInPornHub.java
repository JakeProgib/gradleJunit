import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginInPornHub {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String login(){
        try {
            String log = reader.readLine();
            return  log;
        } catch (IOException e) {
            return null;
        }
    }
    public String pass(){
        try {
            String pass = reader.readLine();
            return pass;
        } catch (IOException e) {
            return null;
        }
    }
    public boolean checkAge(){
        try{
            int age = Integer.parseInt(reader.readLine());
            if(age>=18){
                return true;
            }
            else{return  false;}
        } catch (IOException e) {
            return false;
        }
    }
}
