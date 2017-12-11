public class Main {
    public static void main(String[] args){
        AirConditioner airConditioner = new AirConditioner(true);
        TV tv = new TV(true, new TvChannel());
        Echo echo = new Echo(airConditioner, tv);
        echo.checkStatus();
        System.out.println("After checking init situation, Start actions!!!");
        System.out.println("*********************");
        echo.clickAirConditioner();
        echo.clickTV();
        echo.changeChanel(22);
        echo.clickTV();
        echo.changeChanel(22);
        echo.clickAirConditioner();

        System.out.println("*********************");
        echo.checkStatus();


    }
}
