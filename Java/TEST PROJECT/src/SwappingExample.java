public class SwappingExample {

    public static void main(String[] args){
        int a = 13;
        int b = 17; 
        System.out.println("Before swapping, a = "  + a + " and b = " + b);

        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n**Now, Before and After swapping values will be same here*");
        System.out.println("After swapping, a = " + a + "and b is " + b); 
    }

    public static void swapFunction(int x, int y){
        System.out.println("Before swapping(Inside), a = " + x + " b = " + y);

        // Swap n1 with n2
        int c = x; 
        x = y; 
        y = c; 
        System.out.println("After swaping(Inside), a = " + x + " b = " + y);
    
    }
    
}
