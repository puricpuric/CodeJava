public class ForEachExample {
    public static void main(String[] args){
        int [] brojevi = {10, 20, 30, 40, 50};

        int x = brojevi[2];
        System.out.println(x);

        for(int broj:brojevi){
            System.out.println(broj);
        }
    }
    
}
