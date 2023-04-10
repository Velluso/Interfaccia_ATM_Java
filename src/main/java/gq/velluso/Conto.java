package gq.velluso;

public class Conto {

    private double saldo;
    private int pin;



    public Conto(double saldo, int pin) {
        this.saldo = saldo;
        this.pin = pin;
    }

    public Conto() {

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void prelievo(double importo) {
        if (saldo < importo) {
            System.out.println("Saldo insufficiente, impossibile effettuare il prelievo");

        }
        else {
            double cifraPrelevata = saldo -= importo;
            System.out.println("\nPrelievo di" + "" + cifraPrelevata + " " + "effettuato");
        }
    }


    public void deposito(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito effettuato");
        } else {
            System.out.println("Inserire quantità di denaro valide, deposito annullato.");
        }

    }


    public void controlloSaldo() {
        System.out.println("Saldo attuale: " + saldo);
    }


    public void cambioPin(int nuovoPin) {
        pin = nuovoPin;
        System.out.println("PIN modificato");
    }

}
