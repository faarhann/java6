public class Player {
    private String playerName;
    private int amountOfGoals;


  public Player(String playerName){
      this(playerName, 0);
  }
  public Player(String name, int amountOfGoals){
      this.playerName = name;
      this.amountOfGoals = amountOfGoals;
  }

    public String getPlayerName() {
        return playerName;
    }

    public int getAmountOfGoals() {
        return amountOfGoals;
    }

    public String toString(){
      return  this.playerName + ", goals " + this.amountOfGoals;
    }
}
