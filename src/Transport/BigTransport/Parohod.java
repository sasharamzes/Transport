package Transport.BigTransport;

import Transport.Transport;

public class Parohod extends Transport implements UsePar{
    boolean usePar;
    public Parohod(String name) {
        super(name);
    }

    public Parohod(String name, boolean usePar) {
        super(name);
        this.usePar = usePar;
    }

    public void usePar(){
        System.out.println("Работает на пару? "+ (usePar?"Да":"Нет"));
    }
}
