package Transport.Cars;

public class VAZ implements isItTaxi{
    boolean notTaxi;

    public VAZ(boolean notTaxi) {
        this.notTaxi = notTaxi;
    }
    public void isTaxy(){
        System.out.println("Is it Taxi?" + (notTaxi?"Yes":"No"));
    }
}
