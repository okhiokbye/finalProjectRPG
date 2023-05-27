public class Entity{
  String name;
  int HP;
  public Entity(String name, int HP){
    this.name = name;
    this.HP= HP;
  }
  public int getHP(){
    return HP;
  }
  public String getName(){
    return name;
  }
}