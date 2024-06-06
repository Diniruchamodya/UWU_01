
/**
 * Cat
 */

public class Cat { // reserved keyword
    public void drink() {
        System.out.println("I'm drinking");
    }

    public static void main(String[] args) { // java-compiler-bitecode-interpreter
        // Cat cat1; // declaration
        // cat1 = new Cat(); // initialization
        Cat cat1 = new Cat(); // declaration and initialization combined
        cat1.drink();
    }
}
