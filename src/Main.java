//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        double x = addition(5, 7);
        System.out.println("x: " + x);

        double Subtraction = subtract(20, 15);
        System.out.print("Subtraction: " + Subtraction);

        double Multiplication = multiply(4, 7);
        System.out.println("Multiplication: " + Multiplication);

    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
}