package gq.velluso;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Creo un nuovo oggetto conto con dei parametri di default
        // dichiaro le variabili scelta e pin senza inizializzarle per poter assegnare loro dei valori successivamente
        // dichiaro anche uno Scanner per gestire l'input utente
        Conto conto = new Conto(20000.00, 1111);
        int scelta;
        int pin;
        Scanner opzioneIniziale = new Scanner(System.in);


        System.out.println("Interfaccia Conto, sviluppata da Velluso Marco");


        // Ciclo do while che richiede il PIN all'utente attraverso lo scanner dichiarato in precedenza finchè il PIN è uguale
        // a quello dichiarato nell'oggetto "conto"
        do {
            System.out.println("Inserisci il PIN:");
            pin = opzioneIniziale.nextInt();
        }

        while (pin != conto.getPin());

        System.out.println("Quale operazione vorresti effettuare?");

        // altro ciclo do while che contiene uno switch per gestire l'input dell'utente e far partire i metodi dichiarati nella classe Conto
        do {
            System.out.println("Seleziona l'operazione da effettuare");
            System.out.println("1 - Prelievo");
            System.out.println("2 - Deposito");
            System.out.println("3 - Controllo saldo");
            System.out.println("4 - Cambio PIN");
            System.out.println("0 - Esci");

            scelta = opzioneIniziale.nextInt();

            switch (scelta) {

                case 1:
                    System.out.println("Inserisci l'importo da prelevare");
                    double importo = opzioneIniziale.nextDouble();
                    conto.prelievo(importo);
                    break;

                case 2:
                    System.out.println("Inserisci l'importo da depositare");
                    importo = opzioneIniziale.nextDouble();
                    conto.deposito(importo);
                    break;

                case 3:
                    conto.controlloSaldo();
                    break;

                case 4:
                    // richiedi il vecchio PIN e il nuovo PIN all'utente
                    System.out.println("Inserisci il vecchio PIN");
                    int oldPin = opzioneIniziale.nextInt();
                    if (oldPin != conto.getPin()) {
                        System.out.println("PIN errato");
                        break;
                    }

                    System.out.println("Inserisci il nuovo PIN");
                    int newPin = opzioneIniziale.nextInt();
                    // se il PIN è uguale al precedente l'operazione viene annullata.
                    if (newPin == oldPin) {
                        System.out.println("il nuovo PIN non può essere uguale a quello precedente");
                    }

                    else {
                        conto.cambioPin(newPin);
                    }
                    break;

                case 0:
                    System.out.println("Grazie per aver usato l'ATM");
                    break;

                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }
        while (scelta != 0);

    }
}





