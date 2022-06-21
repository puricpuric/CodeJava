public class ZadatakSest {

    public static void main(String[] args){
        int brojac = 0;
        for(int x=0; x<1000; x=x+1){
        
            if (x%3==0){
                brojac= brojac + 1;
        }
    }
            System.out.print("Brojeva deljivih sa 3 ima " + brojac);
    }
}
