import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение: ");
        Scanner in = new Scanner(System.in);
        String userExpression = in.nextLine();
        String answer = calc(userExpression);
    }

    public static String calc(String input) {
        String answer = "";
        String[] operation = input.split(" ");

        var a = operation[0];
        var operator = operation[1];
        var b = operation[2];


        return answer;
    }

}