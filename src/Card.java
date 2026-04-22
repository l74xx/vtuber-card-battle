public abstract class Card {
    private String names;
    private int manaCost;
    private String faction;

    public Card(String names, int manaCost, String faction) {
        this.names = names;
        this.manaCost = manaCost;
        this.faction = faction;
    }

    public abstract String display();

    public String getNames() {
        return names;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getFaction() {
        return faction;
    }
}
