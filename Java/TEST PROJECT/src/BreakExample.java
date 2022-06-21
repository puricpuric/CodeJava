public class BreakExample {
    public static void main(String[] args) {
        int [] brojevi = {10, 20, 30, 40, 50};
        
        for(int broj:brojevi){
            if(broj == 30){
                break;
            }
            System.out.println(broj);
        }
        System.out.println("Ovo je naredba ispod for!");
    }
}
