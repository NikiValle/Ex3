package Pack;

public class TestDipendente {
    public static void main(String[]args){
        Dipendente Mike = new Dipendente("00309", 1000.0,7.5);
        System.out.println("Stipendio: "+Mike.getStipendio());
        System.out.println("Pagato: "+Mike.paga(16));
        Mike.stampa();
    }
}
