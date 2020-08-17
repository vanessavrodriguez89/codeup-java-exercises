public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static void String (int num) {
        for (int i = 1; i <= num; i++) {
            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
