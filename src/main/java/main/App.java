package main;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hedgehog siili = new hedgehog();

        boolean exit = false;

        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");
        
            if (scanner.hasNext()) {
                int valinta = 0;
                String stringInput = scanner.nextLine();
                valinta = Integer.parseInt(stringInput);
            

            switch(valinta) {
                case 1:
                    System.out.println("Mitä siili sanoo:");
                    String teksti = scanner.nextLine();
                    siili.speak(teksti);
                    break;
                    
                case 2:
                    System.out.println("Anna siilin nimi:");
                    String uusiNimi=scanner.nextLine();
                    int uusiIka;
                    System.out.println("Anna siilin ikä:");
                    uusiIka = Integer.parseInt(scanner.nextLine());

                    siili = new hedgehog(uusiNimi, uusiIka);
                    break;
                    
                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    int kierrokset;
                    kierrokset = Integer.parseInt(scanner.nextLine());
                    siili.run(kierrokset);
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;

                default:
                    System.out.println("Syöte oli väärä. Valitse oikea numero.");
                    break;
                }
            }
        }
        scanner.close();
    }
}



