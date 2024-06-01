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

//Execute Child Class (Identification of static members from parent to child top down)
//Put numbering from parent class then continue numbering to chld class. 
// Execution of static block and variables from parent to child and top down.
//Atlast, child class' main method will be executed. Not the main method of Parent class. 
//If child class has no main method, then parent class' main method is executed.
//Above I have commented the main method of Child class to activate the main method of Parent class.