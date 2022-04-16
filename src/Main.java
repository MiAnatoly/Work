import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        while (true) {
            int number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст:");
            String text = scanner.nextLine();
            do {
                System.out.println("1. Шифровка\n2. Дешифровка");
                number = scanner.nextInt();
                if (number == 1) {
                    Encryption encryption = new Encryption(text);
                    encryption.textNum();
                } else if (number == 2) {
                    Decryption decryption = new Decryption(text);
                    decryption.numText();
                } else {
                    System.out.println("НЕТ ТАКОЙ КОМАНДЫ");
                }
            } while (number < 1 || number > 2);

        }
    }

}