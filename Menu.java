package cartellaEsercizio;

import java.util.Scanner;
public class Eser {
    public static void main(String[] args) {
        ArrayList<String> clienti = new ArrayList<String>();
        int i = clienti.size();
        Scanner var1 = new Scanner(System.in);
    while(i < 4){
        System.out.println("ciao benvenuto inserisci il tuo nome utente");
        String nome = var1.nextLine();
        Utente utente = new Utente(clienti);
        utente.accesso(nome);
        i = clienti.size();}
    }
}

class Utente {
    Scanner scanner = new Scanner(System.in);
    String nuovonome;
    ArrayList<String> clienti;

    public Utente(ArrayList<String> clienti) {
        this.clienti = clienti;
    }

    public String getNuovonome() {
        return nuovonome;
    }

    public void setNuovonome(String nome) {
        this.nuovonome = nome;
    }

    public void accesso(String nuovonome) {
        if (clienti.contains(nuovonome)) {
            System.out.println("Felice di ritrovarti " + nuovonome);
        } else {
            clienti.add(nuovonome);
            System.out.println("Ciao benvenuto " + nuovonome);
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
