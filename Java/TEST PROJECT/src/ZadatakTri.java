import java.util.Scanner;

public class ZadatakTri {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int x = in.nextInt();
       
        System.out.println("Enter the second number ");
        int y = in.nextInt();

        if(x<y){
            int z = x+y;
            System.out.println("Result is: " + z);
        }
        else if(x>y){
            int c = x-y;
            System.out.println("Result is: " + c);
        }      
        else{
            int m = x*y;
            System.out.println("Result is: " + m);
        }    
    }
}       