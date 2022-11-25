import java.util.Scanner;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) { 
        while(true){
            int b = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your kilometer : ");
            
            int a =  scan.nextInt();
            if (a >= 7){
                b = 85 + (a-7)*5 ;
                System.out.print("money = ");
                System.out.println(b);
            }
            else{
                b = 85;
                System.out.print("money = ");
                System.out.println(b);
            }
        }
    }
}