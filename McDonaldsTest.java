import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class McDonalds2 {
    static class Tavolo {
        boolean libero;
        String numeroTavolo;
        double prezzoPerPersona;

        Tavolo(boolean libero, double prezzoPerPersona) {
            this.libero = libero;
            this.prezzoPerPersona = prezzoPerPersona;
        }

        public boolean isLibero(){
            return libero;
        }
        public void setLibero(boolean libero) {
            this.libero = libero;
        }
        public double getPrezzoPerPersona() {
            return prezzoPerPersona;
        }
    
        public void setPrezzoPerPersona(double prezzoPerPersona) {
            this.prezzoPerPersona = prezzoPerPersona;
        }
    }
    public static void main(String[] args) {
        Scanner myStr = new Scanner(System.in);
        Scanner myInt = new Scanner(System.in);
        int numeroTavoli = 6;
        
        int ppp;//Prezzo per Persona
        Map<Integer, Tavolo> dizionarioTavoli = new HashMap<>();
        for (int i = 1; i <= numeroTavoli; i++) {
            int nomeTavolo = i;
            boolean libero=true;
            //System.out.println("Inserisci Prezzo per Persona per Tavolo "+i);
            //ppp=myInt.nextInt();
            ppp=15;

            Tavolo tavolo = new Tavolo(libero, ppp);

            dizionarioTavoli.put(nomeTavolo,tavolo); // Prezzo per persona di 15.0 come esempio
        }

        boolean m=true;
        while(m=true){
            System.out.println("Dizionario dei tavoli:");
            for (Map.Entry<Integer, Tavolo> entry : dizionarioTavoli.entrySet()) {
                Integer nomeTavolo = entry.getKey();
                Tavolo tavolo = entry.getValue();
                System.out.println("Tavolo Numero: " + nomeTavolo + ", é Libero?: " + tavolo.isLibero() + ", Prezzo per persona: " + tavolo.getPrezzoPerPersona());
            }
            System.out.println("Scegli quale Tavolo vuoi occupare");
            int sceltaTavolo=myInt.nextInt();
            if (sceltaTavolo >= 1 && sceltaTavolo <= numeroTavoli) {
                Tavolo tavoloScelto = dizionarioTavoli.get(sceltaTavolo);
                boolean tavoloLibero=tavoloScelto.isLibero();
    
                if (tavoloLibero==true){
                    System.out.println("il tavolo è libero");
                    tavoloScelto.setLibero(false);
    
    
                }else{
                    System.out.println("il tavolo non è libero");
                    System.out.println("Vuoi Liberarlo? rispondi si");
                    String liberare=myStr.nextLine();
                    if(liberare.equalsIgnoreCase("si")){
                        tavoloScelto.setLibero(true);

                    }
                }
    
                // Stampa le informazioni del tavolo scelto
                System.out.println("Hai scelto il tavolo " + sceltaTavolo);
                System.out.println("Stato: Libero = " + tavoloScelto.isLibero() + ", Prezzo per persona = " + tavoloScelto.getPrezzoPerPersona());
                
            } else {
                System.out.println("Scelta non valida. Inserisci un numero di tavolo valido.");
            }
      
            //Object x=tavoli.key();
            //System.out.println(x);

        }



    }

}

