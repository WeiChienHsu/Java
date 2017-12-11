public class Echo {
    private AirConditioner airConditioner;
    private TV tv;

    public Echo(AirConditioner airConditioner, TV tv) {
        this.airConditioner = airConditioner;
        this.tv = tv;
    }

    public void clickAirConditioner(){
        airConditioner.turnAir();
        airConditioner.tellStatus();
    }

    public void clickTV(){
        tv.turnTv();
        tv.tellStatus();

    }

    public void changeChanel(int num){
        tv.changeChannel(num);
    }

    public void checkStatus() {
        airConditioner.tellStatus();
        tv.tellStatus();
    }
}
