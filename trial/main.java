// public class main{
//     public static void main(String[] args) {
//         System.out.println("Hello, world!");
//     }
// }
// public class main{
//     public static void main(String[] args) {
//     System.out.println("hello");
//     }
// }


public class main {
    private String name;
    private int age;

    // Constructor
    public main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method definition
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        // Creating object of Person class
        main person1 = new main("John", 25);

        // Calling method on object
        person1.introduce();
    }
}

