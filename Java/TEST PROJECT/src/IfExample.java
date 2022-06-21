public class IfExample {

    public static void main(String[] args){
        int x = 4;
        int y = 10;

        if(y==10){
            if(x==5){
                System.out.print("Y ima vrednost 10 a X 5");
            }
            else{
                System.out.print("Y ima vrednost 10 ali X 5");
            }
        }
        else{
            System.out.println("Y nije 10!!!");
        }
    }
}
