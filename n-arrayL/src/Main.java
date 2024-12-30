import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile imion chcesz podać? ");
        int ile = scanner.nextInt();
        scanner.nextLine();
        int k = 0;

        for (int i = 1; i <= ile; i++) {
            System.out.println("\nPODAJ IMIĘ " + i + " : ");
            String name = scanner.nextLine();

            ArrayList<String> names = new ArrayList<>();
            names.add(name);

            System.out.println("dodano imię: " + name);

            for (String womans : names) {
                if (name.endsWith("a")) {
                    k = k+1;
                }
            }
        }

        System.out.println("");
        System.out.println("LICZBA KOBIET: " + k);
        System.out.println("LICZBA MĘŻCZYZN: " + (ile - k));
    }
}