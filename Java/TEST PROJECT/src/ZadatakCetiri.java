import java.util.Scanner;

public class ZadatakCetiri {
   
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);

            System.out.println("Unesite broj od 1 do 5: ");
            int ocena = in.nextInt();

            switch(ocena){
                case 5:
                    System.out.println("Odlican!");
                    break;
                case 4:
                    System.out.println("Vrlo dobar!");
                    break;
                case 3:
                    System.out.println("Dobar!");
                    break;
                case 2:
                    System.out.println("Dovoljan!");
                    break;
                case 1:
                    System.out.println("Nedovoljan!");
                    break;
                default:
                    System.out.println("Uneta ocena nije dobra!");
            }
        }
        
    }
    
    
