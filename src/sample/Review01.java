package sample;

public class Review01 {

    public static void main(String[] args) {
        add (1500, 150);
        double tax = add(1500, 0.10);
        System.out.println("Consumption tax is" + tax + "yen.");
    }
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("The tax-inclusive price of the item is" + result + "yen.");
    }
        public static double add(double num1, double num2) {
            double result = num1 * num2;
            return result;
      
    }

}
