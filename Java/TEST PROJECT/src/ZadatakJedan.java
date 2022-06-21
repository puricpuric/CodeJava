import java.util.Scanner;

public class ZadatakJedan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Unesi prvi broj: ");
        int x = in.nextInt();
    
        System.out.println("Unesi drugi broj: ");
        int y = in.nextInt();    

        if(x>y){
        System.out.println("Veci je broj " + x);
        }
        else if(x==y){
        System.out.println("Brojevi su jednaki!");
        }
        else{
        System.out.println("Veci je broj " + y);
        }
    }
}

