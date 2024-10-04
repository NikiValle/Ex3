package Pack;

public class TestDipendente {
    public static void main(String[]args){
        Dipendente[] pepe = new Dipendente[5];
        pepe[0] = new Dipendente("00309", 1000.0,7.5);
        for(int i=0;i<5;i++) {
            pepe[i] = new Dipendente("00309", 1000.0+(i*10),7.5+(i+2.5));
            System.out.println("Stipendio: " + pepe[i].getStipendio());
            System.out.println("Pagato: " + pepe[i].paga(16));
            pepe[i].stampa();
        }
    }
}
