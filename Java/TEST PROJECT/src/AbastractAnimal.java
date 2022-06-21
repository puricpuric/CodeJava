// primer za Apstrakciju

abstract class AbstractAnimal {
    //Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep(){
        System.out.println("Zzz");
    }
}

//Sublcass(inherit from Animal)
class SubPig extends AbstractAnimal {
    public void animalSound(){
        //The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
    }
}
class MainMain {
    public static void main(String[]args){
        Animal newAnimal = new Animal();
        SubPig myPig = new SubPig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}