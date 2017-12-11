public class AirConditioner {
    private boolean status;

    public AirConditioner(boolean status) {
        this.status = true;
    }

    public void turnAir() {
        this.status = !status;
    }

    public void tellStatus() {
        if (this.status){
            System.out.println("AirConditioner in Room is ON");
        } else {
            System.out.println("AirConditioner in Room is OFF");
        }
    }
}
