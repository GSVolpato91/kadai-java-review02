package sample;

public class Review01 {

    public static void main(String[] args) {
        int price = 1800;
        int result = add(price, 8);
        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円（消費税は" + result +"円）です。");
    }
    
   
        public static int add(int price, int tax) {
            int result = (price * tax) / 100;
            return result;

    }

}
