package lesson3;

public class ExampleFour {
    public static void main(String[] args) {
        int num = 673;
        int digit1 = num % 10;  // divide by 10 and get the remainder always gets the 1s digit
        int digit3 = num / 100; // there 6 100s so divide 673 by 100 to get the 6
        int digit2 = num % 100 / 10;    // 673 % 100 = 73 / 10 = 7
        int sum = digit1 + digit2 + digit3;
        // sum of the digits
        System.out.println(sum);

    }

    
}
