import java.util.Scanner;
import java.util.ArrayList;

class Utente {
    static ArrayList<String> clienti = new ArrayList<>(); // Inizializzazione di clienti

    public boolean verificaPromozione(String nome) {
        if (clienti.contains(nome)) {
            System.out.println("Felice di ritrovarti " + nome);
            return true;
        } else {
            clienti.add(nome);
            System.out.println("Ciao benvenuto " + nome);
            return false;
        }
    }
}

public class Menu {
    private int numeroPersone;
    private String tipologiaMenu;
    private int budget;

    public Menu(int numeroPersone, int budget) {
        this.numeroPersone = numeroPersone;
        this.budget = budget;
        this.tipologiaMenu = sceltaMenu(numeroPersone, budget);
    }

    private String sceltaMenu(int numeroPersone, int budget) {
        switch (numeroPersone) {
            case 1:
            case 2:
            case 3:
            case 4:
                return getMenuForBudget(budget);
            default:
                return null;
        }
    }

    private String getMenuForBudget(int budget) {
        switch (budget) {
            case 10:
                return "small";
            case 20:
                return "medium";
            case 30:
                return "large";
            case 40:
                return "extra large";
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        boolean continua = true;
        Scanner scanner = new Scanner(System.in);
        Utente utente = new Utente();

        while (continua) {
        	scanner.nextLine();
            System.out.println("Ciao, come ti chiami?");
            String nome = scanner.nextLine();

            System.out.println("Ciao " + nome + "! In quanti siete?");
            int numeroPersone = scanner.nextInt();

            System.out.println("Qual è il vostro budget a persona? 10-20-30-40");
            int budget = scanner.nextInt();

            Menu menu = new Menu(numeroPersone, budget);

            System.out.println("Numero di persone: " + menu.numeroPersone);
            System.out.println("Tipologia del menu: " + menu.tipologiaMenu);
            System.out.println("Il prezzo totale da pagare: " + (menu.numeroPersone * menu.budget));

            if(utente.verificaPromozione(nome)) {
                float budgetPromo = (float) (0.3 * (menu.numeroPersone * menu.budget));

                System.out.println("Vuoi utilizzare il tuo budget? Si-No");
                String risposta = scanner.next();

                if (risposta.equals("Si")) {
                	
                    if (budgetPromo < 10) {
                        System.out.println("Complimenti hai vinto una ciambella!");
                    } else if (budgetPromo < 20 && budgetPromo >= 10) {
                        System.out.println("Complimenti hai vinto un McFlurry al pistacchio!");
                    } else {
                        System.out.println("Complimenti hai vinto un buono sconto di 15 euro sul tuo prossimo ordine!");
                    }
                }
            }

            System.out.println("Vuoi fare un altro ordine? Si-No");
            String risposta2 = scanner.next();

            if (risposta2.equalsIgnoreCase("No")) {
                continua = false;
            }
        }
        scanner.close();
    }

}
