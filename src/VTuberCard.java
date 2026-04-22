public class VTuberCard extends Card{
    private int attack;
    private int health;

    public VTuberCard(String names, int manaCost, String faction, int attack, int health){
        super(names, manaCost, faction);
        this.attack = attack;
        this.health = health;
    }

    @Override
    public String display() {
        return String.format("[%s] Mana: %d ATK: %d HP: %d", getNames(), getManaCost(), attack, health);
    }
}

