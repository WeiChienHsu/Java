public class EnhancedPlayer {
    private  String name;
    private int hp = 100;
    private String weapon;

    public EnhancedPlayer(String name, int hp, String weapon) {
        this.name = name;
        if(hp > 0 && hp <= 100){
            this.hp = hp;
        }
        this.weapon = weapon;
    }

    public void lostHealth(int damage) {
        this.hp = this.hp - damage;
        if(this.hp <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHp() {
        return hp;
    }
}


