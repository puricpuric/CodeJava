import java.util.Scanner;

public class ZadatakSedam {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Unesite broj od 1 do 5: ");
        int x = in.nextInt();

        int [] brojevi = {1, 1, 3, 5, 5, 5, 3, 2, 2, 2, 1, 1, 1, 1 };
        int brojac = 0; 

        for (int y:brojevi){
            if(x==y){
                brojac++;
            }
        }
        System.out.println(brojac);
    }
}