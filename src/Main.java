public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();  //nuovo oggetto Forma
        Rettangolo rettangolo= new Rettangolo(10.2, 4.5); //nuovo oggetto Rettangolo che prende i parametri di base e altezza

        forma.calcolaArea(); //invoco metodo in Forma
        rettangolo.calcolaArea(); //invoco metodo sovrascritto in Rettangolo

    }
}