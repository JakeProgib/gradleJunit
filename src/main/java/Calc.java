public class Calc {
    public int plus(int a, int b) {
        try {
            return a + b;
        } catch (ArithmeticException e){
            return  0;
        }
    }

    public int minus(int a, int b) {
        try {
            return a - b;
        } catch (ArithmeticException e){
            return 0;
        }
    }

    public int div (int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public int multi(int a, int b){
        try {
            return a * b;
        } catch (ArithmeticException e){
            return 0;
        }
    }

}
