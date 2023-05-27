import static java.lang.System.*;
import java.util.ArrayList;
public class Shop{
   ArrayList<Item> shop = new ArrayList<Item>();
   // add all the stuff here
  public Shop(){
    // profuse amount of add statements
    shop.add(new Item("bad sword", "ATK", 3, 15));
    shop.add(new Item("mid sword", "ATK", 5, 69));
    shop.add(new Item("herrick's third hand", "ATK", 9001, 10000));
    
    shop.add(new Item("tinfoil hat", "AP", 2, 10));
    shop.add(new Item("gandalf's hat", "AP", 4, 40));
    shop.add(new Item("herrick's brain", "AP", 10000, 10000 ));
    
    shop.add(new Item("a shirt", "DEF", 1, 10));
    shop.add(new Item("chestplate", "DEF", 3, 80));
    shop.add(new Item("underwear (same hitpoints!!!)", "DEF", 10000, 10000));

    shop.add(new Item("boots", "AGILITY", 1, 10));
    shop.add(new Item("worn tennis shoes", "AGILITY",5, 50));
    shop.add(new Item("adios flipflops", "AGILITY", 10000, 10000));

    shop.add(new Item("pants", "HP", 2, 10));
    shop.add(new Item("dress pants","HP", 7, 90));
    shop.add(new Item("cross-country shorts","HP", 2147483500, 10000));
  }
  public void display(){
    int i=0;
    for(Item yeehaw : shop){
      out.println(i + " - " + yeehaw.getName());
      i++;
    }
  }
  public void buy(String choice, Player p){
        try {
        Integer d = Integer.parseInt(choice);
    } catch (NumberFormatException nfe) {
        return;
    }
    Integer d = Integer.parseInt(choice);
    if(d > 15)
      return;
if(p.getMoney() -shop.get(d).getCost() >= 0){
    p.addToInventory(shop.get(d));
    p.increaseMoney((shop.get(d).getCost())* -1);
  }
  else{
    out.println("TU NO TIENES DINERO");
    out.println("BASICALLY UR BROKE");
    return;
  }
  }
}