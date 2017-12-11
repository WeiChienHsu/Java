public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2539, 1440));
        Motherboard motherboard = new Motherboard("Bj-200", "Asus", 4, 5, "2v.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.getMonitor().drawPixelAt(155, 200, "Red");
    }
}
