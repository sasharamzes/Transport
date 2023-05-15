package Transport;

public class Parovoz implements UsePar{
    boolean usePar;

    public Parovoz(boolean usePar) {
        this.usePar = usePar;
    }
    public void isTrain(){
        System.out.println("Is it train? "+ (usePar?"Yes":"No"));
    }
}
