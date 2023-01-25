import java.util.*;

public class Main {
    public static int sumbet(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++){ sum += i; }
        if (sum < 100) { return 1; }
        else { return sum; }
    }

    public static void functionSolve(float a, float b, float c, float d, float e, float f) {
        float x = ((e * d) - (b * d)) / ((a * d) - (b * c));
        float y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        System.out.printf("%.4f \n", x); System.out.printf("%.4f \n", y);
    }

    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Write a Number: "); Double inputs = input.nextDouble();
        System.out.print("Write another Number: "); Double second = input.nextDouble();
        System.out.println("The average of these two are approximately " + (inputs + second) / 2.0);

        double one = 1.0;
        double pi = 4 * (one - (one / 3.0) + (one/5.0) - (one/7.0) + (one/9.0) - (one/ 11.0) + (one/13.0));
        System.out.println("The error percentage of pi is " + ((pi - Math.PI) / Math.PI)*100);
        System.out.println("The approximation of pi is " + pi);
        System.out.println(Math.pow(2, 3));
        functionSolve(3.4f, 50.2f, 44.5f, 2.1f, 0.55f, 5.9f);

        System.out.println(sumbet(2, 5));
    }
}