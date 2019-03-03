import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Magazyn magazyn = new Magazyn();
            String komenda;
            do {
                komenda = scanner.nextLine();
                if (komenda.equalsIgnoreCase("dodajprodukt")) {
                    // tutaj załaduj pozostałe parametry
//                magazyn.dodajProdukt();
                } else if (komenda.equalsIgnoreCase("dodajpracownika")) {
                    // tutaj załaduj pozostałe parametry
//                magazyn.dodajPracownika();
                } else if (komenda.equalsIgnoreCase("usunprodukt")) {
                    //...
                } else if (komenda.equalsIgnoreCase("usunpracownika")) {
                } //... kolejne
            } while (!komenda.equalsIgnoreCase("quit"));
        }
    }


