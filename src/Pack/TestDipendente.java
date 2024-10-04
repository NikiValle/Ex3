package Pack;

public class TestDipendente {
    public static void main(String[]args){
        Dipendente[] dipendenti = new Dipendente[5];
        dipendenti[0] = new Dipendente("00309", 1000.0,7.5);
        for(int i=0;i<5;i++) {
            dipendenti[i] = new Dipendente("00309", 1000.0+(i*10),7.5+(i+2.5));
            System.out.println("Stipendio: " + dipendenti[i].getStipendio());
            System.out.println("Pagato: " + dipendenti[i].paga(16));
            dipendenti[i].stampa();
        }
    }
}
