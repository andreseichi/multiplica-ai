import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira um número: ");

            int number = scanner.nextInt();

            System.out.println("Tabela de multiplicação de " + number);
            System.out.println("==================================");

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            System.out.println("==================================");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
