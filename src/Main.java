import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 7)
            System.out.println("Привет!");


        var example = "Вячеслав";
        System.out.println("Введите имя ");
        Scanner input = new Scanner(System.in);
        var name = input.nextLine();
        if (name.equals(example))
            System.out.println("Привет " + name);
        else
            System.out.println("Нет такого имени");

        int[] numbers = new int[]{
                3, 5, 9, 21, 34, 30, 60, 69, 45, 48, 47, 73
        };
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 3 == 0)
                System.out.println(numbers[i]);
    }

}
