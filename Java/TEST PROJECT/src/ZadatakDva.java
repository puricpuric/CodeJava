import java.util.Scanner;

public class ZadatakDva{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Unesi prvi broj koji je manji od 100: ");
        int x = in.nextInt();
    
        if(x<100){
            System.out.println("Unesi drugi broj koji je veci od 100: ");
        int y = in.nextInt();  
            if(y>100){
            System.out.println("True");
            }
            else{
            System.out.println("False");
            }
        }        
        else{
            System.out.println("False");
        }
    }
}

