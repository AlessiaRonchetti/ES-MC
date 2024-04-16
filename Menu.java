package cartellaEsercizio;

import java.util.Scanner;

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
                return getMenuForBudget(budget);
            case 2:
                return getMenuForBudget(budget);
            case 3:
                return getMenuForBudget(budget);
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
        Scanner s = new Scanner(System.in);

        System.out.println("Ciao! In quanti siete?");
        int numeroPersone = s.nextInt();

        System.out.println("Qual è il vostro budget a persona? 10-20-30-40");
        int budget = s.nextInt();

        Menu menu = new Menu(numeroPersone, budget);

        System.out.println("Numero di persone: " + menu.numeroPersone);
        System.out.println("Tipologia del menu: " + menu.tipologiaMenu);

        s.close();
    }
}