public class TvChannel {

    private int channel;

    public TvChannel() {
        this.channel = 12;
    }

    public void changeChannel(int num){
        this.channel = num;
    }

    public void setChannel(int number){
        this.channel = number;
    }

    public void getChannel() {
        System.out.println("TV now is on channel: " + this.channel);
    }
}
