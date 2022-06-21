import java.util.Scanner;

public class ZadatakOsam {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        System.out.println("Unesite prvi broj: ");
        double x = in.nextDouble();

        System.out.println("Unesite drugi  broj: ");
        double y = in.nextDouble();

        System.out.println("Unesite treci  broj: ");
        double z = in.nextDouble();

        System.out.println("Unesite cetvrti  broj: ");
        double m = in.nextDouble();
        
        
        double prosek = (x+y+z+m)/4;

    System.out.println("Prosecna vrednost brojeva je: " + prosek );

    }

}
