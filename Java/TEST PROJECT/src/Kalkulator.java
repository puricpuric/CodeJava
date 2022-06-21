public class Kalkulator {

    int brojJedan;
    int brojDva;
    
    public Kalkulator(int a, int b ){
        brojJedan = a;
        brojDva = b;
    }
    
    public  int saberi(){
        return brojJedan+brojDva;
    }

    public static void main(String[]args){
        Kalkulator imeObjekta = new Kalkulator(6,7);
        int rezultat = imeObjekta.saberi();

        System.out.println(rezultat);
    }
}
