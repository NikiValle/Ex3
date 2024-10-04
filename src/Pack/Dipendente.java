package Pack;

public class Dipendente{
    private String matricola;
    private double stipendio;
    private double straordinario;
    public Dipendente(String Mat, double Sti, double Str){
        matricola=Mat;
        stipendio=Sti;
        straordinario=Str;
    }
    public double getStipendio(){
        return stipendio;
    }
    public double paga(int ore){
        return stipendio+(ore*straordinario);
    }
    public void stampa(){
        System.out.println("Matricola: "+matricola);
        System.out.println("Stipendio: "+stipendio);
        System.out.println("Straordinario: "+straordinario);
    }
}