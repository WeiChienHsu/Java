public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Kevin";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.lostHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.lostHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword");
//        System.out.println("Initial health is " + player.getHp());

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagePrinted());
        int pagePrinted = printer.printPages(4);
        System.out.println("Page printed was " + pagePrinted + "new total print count for printer = " + printer.getPagePrinted() );

    }
}
