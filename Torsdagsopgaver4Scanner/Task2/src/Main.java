import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(input + " please type your age");

        int nextinput = scanner.nextInt();
        System.out.println("you are " + nextinput + " years old, thanks for letting us know");
        int retire = 67 - nextinput;
        System.out.println("there is " + retire + " years left till you retire " + input);

    }
}
