import java.util.ArrayList;
import java.util.Scanner;
public class World implements KeyListener {
  public ArrayList<Entity> currentChallenge;
  private Entity[][] map = {                               
    {null,null,new Entity("Wall", 0), null, new Entity("Wall",0), null,null},
    {null,null,new Entity("Wall", 0), null, new Entity("Wall", 0), null,null},
    {null,null,null, null, null, null,null},
    {new Entity("Wall", 0),new Entity("Wall", 0),new Entity("Wall", 0), null, new Entity("Wall", 0), new Entity("Wall", 0),new Entity("Wall", 0)},
    {null,null,new Entity("Wall", 0), null, new Entity("Wall", 0), null,null},
    {null,null,null, null, null, null,null}
  };
  Scanner kb = new Scanner(System.in);
  Player challenger;

    public World(Player p){
    map[4][3] = p;
      challenger = p;
     for(Entity i[] : map){
       for(Entity yeehaw : i){
         if(yeehaw == null)
          System.out.print("| |");
          else if(yeehaw instanceof Player){
            System.out.print("|X|");
          }
          else{
            System.out.print("|█|");
          }
       }
       System.out.println();
     }
    cycle();
  }
  public void cycle(){
    do{
      String choice = kb.nextLine();
      switch(choice){
        case "w":
          if()
        case "a":
        case "s":
        case "d":
      }
    }
    while(!completed);
  }
  
}