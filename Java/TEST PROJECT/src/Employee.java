//Ovo je super klasa
public class Employee {
    float salary=40000;
}
// Ovo je podklasa koja nasledjuje super klasu
class Programmer extends Employee {
    int bonus=10000;

    public static void main( String args []){
        Programmer p = new Programmer();
        System.out.println("Progammer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}