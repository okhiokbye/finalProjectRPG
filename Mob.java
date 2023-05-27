public class Mob extends Entity{
  int atk;
  public Mob(String name, int ATK, int HP){
    super(name,HP);
    atk=ATK;
  }
  public String getName(){
    return name;
  }
  public int getHP(){
    return HP;
  }
  public int getATK(){
    return atk;
  }

}