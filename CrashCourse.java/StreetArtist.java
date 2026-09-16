public class StreetArtist {
    // data-attributes
    String characterName;
    int health;
    int skillLevel;
    int reputationScore;
    String artStylePreference;
    int moneySaved;
    int energyLevel;
    
    // constructor
    public StreetArtist(String name, int skillLevel, String artStyle) {
        characterName = name;
        this.skillLevel = skillLevel;
        artStylePreference = artStyle;
        
        health = 100;
        reputationScore = 0;
        moneySaved = 50;
        energyLevel = 80;
    }
    
    // behaviors/mehtods
    public void earnMoney() {
        moneySaved = moneySaved + 10;
    }
    
    public void paintMural() {
        reputationScore = reputationScore + 5;
        energyLevel = energyLevel - 10;
    }
    
    public void restAndRecover() {
        energyLevel = energyLevel + 20;
    }
    
    public void claimTerritory() {
        reputationScore = reputationScore + 15;
    }
    
    public void collaborateWith(String artistName) {
        reputationScore = reputationScore + 10;
    }
}