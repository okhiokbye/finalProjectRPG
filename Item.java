public class Item{
  private String name;
  private String statType;
  private int stat;
  private int cost;
  public Item(String n, String sT, int s, int c){
    name =n;
    statType=sT;
    stat =s;
    cost = c;
  }
  public String getStatType(){
    return statType;
  }
  public int getStat(){
    return stat;
  }
  public int getCost(){
    return cost;
  }
  public String getName(){
    return name;
  }
  
  
}