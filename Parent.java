class Parent {

    // Static variable declaration with initial value of 10
    static int i = 10;

    // First static block execution triggered during class loading
    static {
        m1(); // Call to static method m1 before its declaration (allowed in static blocks)
        System.out.println("Message from first static of Parent class");
    }

    // Static method m1 that prints the value of static variable j (explained later)
    public static void m1() {
        System.out.println(j); // Accessing static variable j before its declaration (allowed in static blocks and methods)
    }

    // Static variable declaration with initial value of 100
    static int j = 100;

    public static void main(String[] args) {
        m1(); // Call to static method m1
        System.out.println("Message from second static of Parent class");
    }
}

class Child extends Parent {

    // Static variable declaration with initial value of 10
    static int x = 10;

    // First static block execution triggered during class loading (after Parent's static blocks)
    static {
        m2(); // Call to static method m2 before its declaration (allowed in static blocks)
        System.out.println("Message from first static of Child class");
    }

    // Static method m2 that prints the value of static variable y (explained later)
    public static void m2() {
        System.out.println(y); // Accessing static variable y before its declaration (allowed in static blocks and methods)
    }

    // Third static block execution triggered during class loading (after Child's first static block)
    static {
        System.out.println("Message from third static of Child class");
    }

    // Static variable declaration with initial value of 20
    static int y = 20;
}
