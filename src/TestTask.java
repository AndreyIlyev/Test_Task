import java.util.Scanner;

public class TestTask {
    public void hello() {
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();
        if (number == 7)
            System.out.println("Привет!");
    }

    public void name() {
        var example = "Вячеслав";
        System.out.println("Введите имя ");
        Scanner input = new Scanner(System.in);
        var name = input.nextLine();
        if (name.equals(example))
            System.out.println("Привет " + name);
        else
            System.out.println("Нет такого имени");
    }

    public void numbers() {

        int[] numbers = new int[]{
                3, 5, 9, 21, 34, 30, 60, 69, 45, 48, 47, 73
        };
        for (int j : numbers)
            if (j % 3 == 0)
                System.out.println(j);
    }

}
