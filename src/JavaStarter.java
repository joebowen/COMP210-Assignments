package assn01;

import java.util.Scanner;

public class JavaStarter {
    public static double quadFun(double a, double b, int m) {
        double result = a * (m * m) + b;
        return result;
    }

    public static int stringFun1(String s1) {
        return s1.length();
    }

    public static String stringFun2(String s1, int i1, int i2, int i3, int i4) {
        String sA = s1.substring(i1, i2);
        String sB = s1.substring(i3, i4);
        return sA + sB; 
    }

    public static void main(String[] args) {

        // Get Scanner
        Scanner scanner = new Scanner(System.in);

        // Read integer from user
        int n = scanner.nextInt();

        // Begin logic for tasks
        if (n == 1) {
            System.out.println("Hello, World!");
        }
        else if (n == 2) {
            // Task 2
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            int m = scanner.nextInt();

            System.out.println("a = " + a + ", b = " + b + ", m = " + m);
        }
        else if (n == 3) {
            // Task 3
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            int m = scanner.nextInt();

            double result = quadFun(a, b, m);
            System.out.println(result);        
        }
        else if (n == 4) {
            // Task 4
            String s1 = scanner.next();
            int result = stringFun1(s1);
            System.out.println(result);
        }
        else if (n == 5) {
            // Task 5
            String s1 = scanner.next();
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            int i3 = scanner.nextInt();
            int i4 = scanner.nextInt();
            String result = stringFun2(s1, i1, i2, i3, i4);
            System.out.println(result);
        }
        else if (n == 6) {
            // Task 6
            int m = scanner.nextInt();
            double[] arr = new double[m];
            double sum = 0.0;
            // for loop
            for (int i = 0; i < m; i++) {
                arr[i] = scanner.nextDouble();
                sum += arr[i]; 
            }

            // Calculate mean
            double mean = sum / m;

            // Print average with 2 decimal places
            System.out.printf("Average = %.2f%n", mean);

            // Print array in reverse order
            for (int i = m - 1; i >= 0; i--) {
                System.out.println("arr[" + i + "]=" + arr[i]);
            }
        }
        
        // Close Scanner
        scanner.close();
    }
}