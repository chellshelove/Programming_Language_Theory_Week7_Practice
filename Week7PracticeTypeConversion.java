// Week7Practice.java

class Parent {
    int parentValue;

    Parent(int value) {
        this.parentValue = value;
    }

    void showValue() {
        System.out.println("Parent value: " + parentValue);
    }
}

class Child extends Parent {
    int childValue;

    Child(int parentValue, int childValue) {
        super(parentValue);
        this.childValue = childValue;
    }

    @Override
    void showValue() {
        super.showValue(); // Call parent class method
        System.out.println("Child value: " + childValue);
    }
}

public class Week7PracticeTypeConversion {
    public static void main(String[] args) {
        // Implicit conversion (upcasting)
        Child child = new Child(100, 200);
        Parent parent = child; // Upcasting Child to Parent implicitly
        System.out.println("After upcasting:");
        parent.showValue(); // Only Parent's method is accessible

        // Explicit conversion (downcasting)
        if (parent instanceof Child) {
            Child childAgain = (Child) parent; // Downcasting Parent to Child explicitly
            System.out.println("After downcasting:");
            childAgain.showValue(); // Both Parent and Child's methods are accessible
        }
    }
}

// Upcasting: Child is implicitly cast to Parent. Only Parent methods are accessible, but the actual object is still a Child.
// Downcasting: The Parent reference is explicitly cast back to Child, allowing access to both parent and child-specific methods. 
// This illustrates the difference between implicit (upcasting) and explicit (downcasting) conversions.