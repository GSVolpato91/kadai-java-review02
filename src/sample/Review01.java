package sample;

public class Review01 {

    public static void main(String[] args) {
        int price = 1800;
        double tax = (price * 0.10);
       int c = (int) tax;
        System.out.println("The price including tax for a"+ price + "yen item is" + (price + c)+ "yen." + "Consumption tax is" + c + "yen.");
    }
    
        public static double tax(double price, double tax) {
            double result = price * tax;
            return result;

    }

}
