public class Rettangolo extends Forma {

    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override // <- Indica che sto sovrascrivendo qui un metodo già presente altrove
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("L'area del rettangolo è: " + area);
    }
}
