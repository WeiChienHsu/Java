public class TV {

    private boolean status;
    private TvChannel channel;

    public TV(boolean status, TvChannel channel) {
        this.status = true;
        this.channel = channel;
    }

    public void turnTv() {
        this.status = !status;
    }

    public void tellStatus() {
        if (this.status){
            System.out.println("TV in Room is ON");
            this.channel.getChannel();
        } else {
            System.out.println("TV in Room is OFF");
        }
    }

    public void changeChannel(int num){
        if (this.status){
            channel.changeChannel(num);
            channel.setChannel(num);
        } else {
            System.out.println("Please turn on the TV");
        }
    }

}
