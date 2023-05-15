package Transport.BigTransport;

public class Parovoz implements UsePar {
    boolean usePar;

    public Parovoz(boolean usePar) {
        this.usePar = usePar;
    }
    public void usePar(){
        System.out.println("Работает на пару? "+ (usePar?"Да":"Нет"));
    }
}
