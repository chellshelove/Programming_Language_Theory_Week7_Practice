// Week7Practice.java

class Week7Practice {
    int value;

    Week7Practice(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Week7Practice A1 = new Week7Practice(10);
        Week7Practice A2 = new Week7Practice(5);

        System.out.println("Before real_swap:");
        System.out.println("A1: " + A1.value);
        System.out.println("A2: " + A2.value);

        // Implementing the real swap
        real_swap(A1, A2);

        System.out.println("After real_swap:");
        System.out.println("A1: " + A1.value);
        System.out.println("A2: " + A2.value);
    }

    // real_swap() that swaps the values of the two objects
    public static void real_swap(Week7Practice obj1, Week7Practice obj2) {
        int temp = obj1.value;  // Store the value of obj1 in a temporary variable
        obj1.value = obj2.value; // Assign obj2's value to obj1
        obj2.value = temp; // Assign the temp value (original obj1's value) to obj2
    }
}

// This code demonstrates swapping object values by using references. 
// The real_swap() function swaps the value fields of the two Week7Practice objects passed to it. 
// This simulates passing by reference because Java passes object references by value, allowing modifications to the object's internal state.