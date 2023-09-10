package src;

public class AboutMe {
    public static void main(String[] args) {
        String name = args[0];
        String lastName = args[1];
        int age = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);

        System.out.println("Hello, my name is " + name + " " + lastName + ", I'm " + age + " years old and I'm " + height + " tall.");
    }
}
