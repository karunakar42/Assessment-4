import java.util.Scanner;

public class ExceptionHandling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = Integer.MAX_VALUE; 
            try {
                int result = a + b;
                if (result < min) min = result;
            } catch (Exception e) {
                
            }
            try {
                int result = a - b;
                if (result < min) min = result;
            } catch (Exception e) {
               
            }
            try {
                int result = a * b;
                if (result < min) min = result;
            } catch (Exception e) {
                
            }
            try {
                int result = a / b;
                if (result < min) min = result;
            } catch (Exception e) {
                // ignore exception
            }
            System.out.println(min);
        }
    }
}
