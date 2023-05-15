import Transport.BigTransport.Parohod;
import Transport.Cars.VAZ;
import Transport.Cars.Volga;
import Transport.BigTransport.Parovoz;

public class Main {
    public static void main(String[] args) {
        Parovoz parovoz = new Parovoz(true);
        parovoz.usePar();

        Volga volga = new Volga(true);
        volga.isTaxy();

        VAZ jiguli = new VAZ("Жигули", false);
        jiguli.whotIsName();
        jiguli.isTaxy();

        Parohod parohod = new Parohod("Пароход", true);
        parohod.whotIsName();
        parohod.usePar();

    }
}
