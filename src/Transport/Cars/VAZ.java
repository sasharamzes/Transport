package Transport.Cars;

import Transport.Transport;
public class VAZ extends Transport implements isItTaxi{
    boolean notTaxi;

    public VAZ(String name) {
        super(name);
    }

    public VAZ(String name, boolean notTaxi) {
        super(name);
        this.notTaxi = notTaxi;
    }

    public void isTaxy(){
        System.out.println("Это такси?" + (notTaxi?"Да":"Нет"));
    }
}
