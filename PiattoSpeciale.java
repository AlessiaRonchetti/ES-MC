//Creare una classi Piatto Speciale che ha ingredienti di tipo PRIVATE e ingredienti pubblic ( es: un panino normale o di sesamo  ) e un prezzo specifico per ognuno di loro
//(  es ingr1 = 2 euro  ) + una base di fisso (  prezzo = 1 euro )

//Creare poi una classe menu che permetta in loop di ordinare il piatto speciale selezionando tra una lista gli ingredienti 
//public e facendo inserire a mano gli ingredienti PRIVATE dopo aver stampato una lista dei possibili casi ( solo quelli devono essere accettati  ) 
//a quel punto calcolare il totale e riportare all'inizio 


import java.util.ArrayList;
import java.util.Scanner;

class Menu {

    private static ArrayList<PiattoSpeciale> menu = new ArrayList<>();

    public void aggiungiPiattoSpeciale(PiattoSpeciale piatto) {
        menu.add(piatto);
    }

    public void stampaMenu() {
       

        for (PiattoSpeciale piatto : menu) {
            System.out.println("Menu: Ingredienti - " + piatto.getListaIngredienti());
        }
    }
}





public class PiattoSpeciale {

    private ArrayList<String> listaIngredienti = new ArrayList<>();
    private int prezzo;
    private String nome;

    public PiattoSpeciale(ArrayList<String> ingredienti, int prezzo) {
        
        this.listaIngredienti = ingredienti;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getListaIngredienti() {
        return listaIngredienti;
    }

    public int getPrezzo() {
		prezzo = prezzo +1;
        return prezzo;
    }





    public static void main(String[] args) {
        ArrayList<String> ingredienti = new ArrayList<>();
        int prezzoTotale = 0;

        Scanner scanner = new Scanner(System.in);

        boolean i = true;


        while (i) {
            System.out.println("Inserisci un ingrediente (oppure scrivi 'fine' per terminare):");
            String ingrediente = scanner.nextLine();


            if (ingrediente.equalsIgnoreCase("fine")) {
                i = false;
            } else {
                ingredienti.add(ingrediente);
            }
        }

        
        
        for (String ingrediente : ingredienti) {
            if (ingrediente.equals("pane")) {
                prezzoTotale += 5; 
            } else {
                prezzoTotale += 2; 
            }
        }

    

        PiattoSpeciale piattoSpeciale = new PiattoSpeciale(ingredienti, prezzoTotale);

		
      	
   
        System.out.println("Ingredienti: " + piattoSpeciale.getListaIngredienti() + ". Prezzo: " + piattoSpeciale.getPrezzo() + " euro.");
      

		Menu menu = new Menu();
		

		menu.aggiungiPiattoSpeciale(piattoSpeciale);
		
		menu.stampaMenu();

		
		
		
        scanner.close();
    }
}
