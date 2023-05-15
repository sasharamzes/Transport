package Transport.Cars;

public class Volga implements isItTaxi{
    boolean isTaxi;

    public Volga(boolean isTaxi) {
        this.isTaxi = isTaxi;
    }
    public void isTaxy(){
        System.out.println("Это такси?" + (isTaxi?"Да":"Нет"));
    }
}
