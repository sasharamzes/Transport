import Transport.Cars.VAZ;
import Transport.Cars.Volga;
import Transport.Parovoz;

public class Main {
    public static void main(String[] args) {
        Parovoz parovoz = new Parovoz(true);
        parovoz.isTrain();

        Volga volga = new Volga(true);
        volga.isTaxy();

        VAZ jiguli = new VAZ(false);
        jiguli.isTaxy();
    }
}
