import java.util.ArrayList;
import java.util.Scanner;
public class World{

  private Entity[][] map = {                               
    {null,null,new Entity("Wall", 0), null, new Entity("Wall",0), null,null},
    {null,null,new Entity("Wall", 0), null, new Entity("Wall", 0), null,null},
    {null,null,null, null, null, null,null},
    {new Entity("Wall", 0),new Entity("Wall", 0),new Entity("Wall", 0), null, new Entity("Wall", 0), new Entity("Wall", 0),new Entity("Wall", 0)},
    {null,null,new Entity("Wall", 0), null, new Entity("Wall", 0), null,null},
    {null,null,null, null, null, null,null}
  };
  Scanner kb = new Scanner(System.in);
  Player p;

    public World(Player p){
    map[4][3] = p;
      p.setPos(3,4);
      this.p = p;
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
    boolean completed = false;
    do{
      String choice = kb.nextLine();
      switch(choice){
        case "w":
          if(p.getYPos()-1 >=0 && map[p.getYPos()-1][p.getXPos()] == null){
            map[p.getYPos()-1][p.getXPos()] = p;
            map[p.getYPos()][p.getXPos()] = null;
            p.setPos(p.getXPos(),p.getYPos()-1);
          }
          break;
        case "a":
          if(p.getXPos()-1 >=0 && map[p.getYPos()][p.getXPos()-1] == null){
            map[p.getYPos()][p.getXPos()-1] = p;
            map[p.getYPos()][p.getXPos()] = null;
            p.setPos(p.getXPos()-1,p.getYPos());
          }
          break;
        case "s":
          if(p.getYPos()+1<map.length && map[p.getYPos()+1][p.getXPos()] == null){
            map[p.getYPos()+1][p.getXPos()] = p;
            map[p.getYPos()][p.getXPos()] = null;
            p.setPos(p.getXPos(),p.getYPos()+1);
          }
          break;
        case "d":
          if(p.getXPos()+1 <map[0].length && 
             map[p.getYPos()][p.getXPos()+1] == null){
            map[p.getYPos()][p.getXPos()+1] = p;
            map[p.getYPos()][p.getXPos()] = null;
            p.setPos(p.getXPos()+1,p.getYPos());
          }
          break;
        default: 
          System.out.println("no");
          break;   
      }
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
      displayMap();
      System.out.println(p.getXPos() + "," + p.getYPos());  
      // to commit please
      
      
    }
    while(!completed);
  }
  public void displayMap(){
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
  }
}