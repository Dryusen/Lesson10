package app;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int num = scanner.nextInt();
        System.out.println("Квадрат числа " + num + " дорівнює " + square(num));

        System.out.print("\nВведіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = scanner.nextDouble();
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + cylinderVolume(radius, height));

        System.out.print("\nВведіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = generateRandomArray(size);
        System.out.print("Масив чисел: ");
        for (int numInArray : array) {
            System.out.print(numInArray + " ");
        }
        System.out.println("\nСума всіх елементів масиву дорівнює " + sumArray(array));

        scanner.nextLine();
        System.out.print("\nВведіть рядок: ");
        String inputString = scanner.nextLine();
        System.out.println("Рядок в зворотньому порядку: " + reverseString(inputString));

        System.out.print("\nВведіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b));

        System.out.print("\nВведіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        repeatText(n, text);
    }

    public static int square(int num) {
        return num * num;
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
