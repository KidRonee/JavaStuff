public class Fibonacci {
    static void Fibonacci (int n) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int counter = 0;

        while(counter < n) {

            System.out.print(num1 + " ");

            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter+=1;

        }
    }

    public static void main(String args[]) {
        int n = 30;

        Fibonacci(n);
    }
}
