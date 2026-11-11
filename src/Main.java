import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();

        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        Scanner in = new Scanner(System.in);

        int userVal = SafeInput.getRangedInt(in, "Enter an integer value between 1 and 100", 1, 100);

        int count = 0;
        for (int val : dataPoints) {
            if (val == userVal) {
                count++;
            }
        }
        System.out.println("The value " + userVal + " was found " + count + " time(s) in the dataPoints array.");

        int searchVal = SafeInput.getRangedInt(in, "Enter another integer value between 1 and 100 to search for", 1, 100);
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchVal) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + searchVal + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + searchVal + " was not found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(double[] values) {
        double sum = 0;
        for (double v : values) {
            sum += v;
        }
        return sum / values.length;
    }

    public static double getAverage(int[] values) {
        int sum = 0;s
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }
}