package sample;

public class Review01 {

    public static void main(String[] args) {
        int price = 1800;
        double tax = tax(price, 0.10);
        System.out.println("The price including tax for a"+ price + "yen item is" + (price + tax )+ "yen." + "Consumption tax is" + tax + "yen.");
    }
        public static double tax(double num1, double num2) {
            double result = num1 * num2;
            return result;

    }

}
