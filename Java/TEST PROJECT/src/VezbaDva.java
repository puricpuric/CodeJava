
import java.util.Scanner;

class infoKlasa{
   
    private String ime;
    private String prezime;
    
    public void uzmiPodatke(){

        Scanner in = new Scanner(System.in);
        System.out.println("Unesite vase ime: ");
        ime = in.nextLine();

        System.out.println("Unesite vase prezime: ");
        String prezime = in.nextLine();
    }

    public void ispisiPodatke(){
        System.out.println("Vase ime je: " + ime);
        System.out.println("Vase prezime je: " + prezime);
        }

    public static void main(String[] args){
        infoKlasa c1 = new infoKlasa();
        c1.uzmiPodatke();
        c1.ispisiPodatke();
    }
}
