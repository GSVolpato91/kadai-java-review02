package sample;

public class Review02 {

    public static void main(String[] args) {
        //Conditions
        for (int i = 1; i <= 100; i++) {
            //FizzBuzz divisibile by 3 AND 5
           if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
           } else if (i % 5 == 0) {
               // Buzz divisible by 5 ONLY
               System.out.println("Buzz");
           } else if (i % 3== 0 ) {
               // Fizz divisible by 3 ONLY
                   System.out.println("Fizz");
               } else {
                   //NOT divisible by 3 AND 5
                   System.out.println(i);
           }
       }
    }
}
