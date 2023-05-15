package Transport.BigTransport;

public class Parohod implements UsePar{
    boolean usePar;

    public Parohod(boolean usePar) {
        this.usePar = usePar;
    }
    public void usePar(){
        System.out.println("Работает на пару? "+ (usePar?"Да":"Нет"));
    }
}
