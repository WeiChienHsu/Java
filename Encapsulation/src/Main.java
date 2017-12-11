public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Kevin";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.lostHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.lostHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
