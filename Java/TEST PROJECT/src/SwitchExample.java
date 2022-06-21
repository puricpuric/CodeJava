public class SwitchExample {
    public static void main(String[] args){
        char grade = 'C';

        switch(grade){
            case 'A':
                System.out.println("Odlican!");
                break;
            case 'B':
                System.out.println("Vrlo dobar!");
                break;
            case 'C':
                System.out.println("Dobar!");
                break;
            case 'D':
                System.out.println("Dovoljan!");
                break;
            case 'E':
                System.out.println("Nedovoljan!");
                break;
            default:
                System.out.println("Uneta ocena nije dobra!");
        }
    }
    
}
