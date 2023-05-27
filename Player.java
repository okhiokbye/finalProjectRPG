import java.util.ArrayList;
public class Player extends Entity{
  private int maxHP, atk, agility, def, ap, currentHP, skillPoints;
  private String name;
  private int money;
  private ArrayList<Item> inventory = new ArrayList<Item>();
  public Player(String name, String type ){
    super(name, 10);
   if(type.equals("tank")){
     //set stats to this
     maxHP = 10;
     atk = 3;
     agility = 1;
     def = 4;
     ap = 1;
     skillPoints = 4;
    
   }
    if(type.equals("speedy gonzalez")){
     maxHP = 2;
     atk = 10;
     agility = 10;
     def = 1;
     ap = 1;
     skillPoints = 4;
    }
    if(type.equals("wizard")){
      maxHP = 7;
     atk = 5;
     agility = 2;
     def = 2;
     ap = 10;
     skillPoints = 1;
    }
    if(type.equals("warrior")){
     maxHP = 10;
     atk = 9;
     agility = 4;
     def = 2;
     ap = 2;
     skillPoints = 4;
    }
    if(type.equals("ggs")){
     maxHP = 1;
     atk = 1;
     agility = 1;
     def = 0;
     ap = 1;
     skillPoints = 1;
    }
    money = 100;
  }
  public int getMaxHP(){
    return maxHP;
  }
  public int getHP(){
    return currentHP;
  }
  public int getATK(){
    return atk;
  }
  public int getAgility(){
    return agility;
  }
  public int getDefense(){
    return def;
  }
  public int getAP(){
    return ap;
  }
  public String getName(){
    return name;
  }
  public int getMoney(){
    return money;
  }
  
  public void increaseMaxHP(int i){
    maxHP+=i;
  }
  public void increaseCurrentHP(int i){
    currentHP+=i;
  }
  public void increaseATK(int i){
    atk+=i;
  }
  public void increaseAgility(int i){
    agility+=i;
  }
  public void increaseDefense(int i){
    def+=i;
  }
  public void increaseAP(int i){
    ap+=i;
  }
  public void increaseMoney(int i){
    money +=i;
  }
  public void addToInventory(Item i){
    inventory.add(i);
    String type = i.getStatType();
    switch(type){
      case "ATK":
        increaseATK(i.getStat());
        break;
      case "DEF":
        increaseDefense(i.getStat());
        break;
      case "AP":
        increaseAP(i.getStat());
        break;
      case "HP":
        increaseMaxHP(i.getStat());
        break;
      case "AGILITY":
        increaseAgility(i.getStat());
        break;
    }
  }
public String toString(){
 return "HP: " + maxHP + "\n" +"ATK: " + atk + "\n" +"DEF: " + def + "\n" +"Agility: " + agility + "\n" +"AP: " + ap + "\n";
}
  
  
}