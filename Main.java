import static java.lang.System.*;
import java.util.Scanner;
public class Main {
   /* TODO: make the battle happen, make ult
   to make battle: m
    everytinme you enter the same square as a monster, we start a text battle with the generic stuff, populate the map with monsters, check at end of each battle if there are no monsters in the level, then 
   todays goal: make the character move
   tomorrows goal: detect if moved into a monster, then print start battle
   day after tomorrows goal: do the battle (simple attack and dodge)
   if you have enough time the lobby isnt that hard actually
    
  */
  public static String name = "";
   static boolean quit = false;
    
  public static void main(String[] args) {

     Scanner kb = new Scanner(System.in);
    out.println("we are based. basedRPG!");
      out.println("Name your character: ");
        name = kb.nextLine();
    out.println("choose your class!");
    out.println("1: thomas the tank engine ");
    out.println("2: glass cannon");
    out.println("3: fladnag the wizird");
    out.println("4: Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch the warrior");
    out.println("5: for the worthy");

    String choice = kb.nextLine();
    
     System.out.print("\033[H\033[2J");  
System.out.flush(); 
    Player player = null;
    int i =0;
    boolean wasInvalid = false;
    do{
      //String n, int m, int b,int s, int p , int e
      wasInvalid = false;
    switch(choice){
      case "1":
        player = new Player(name, "tank");
        break;
      case "2":
        player = new Player(name, "speedy gonzalez");
        break;
      case "3":
          player = new Player(name, "wizard");
        break;
      case "4":
      player = new Player(name, "warrior");
        break;
      case "5":
      player = new Player(name, "ggs");
        break;
      default:
        out.println("invalid input");
        wasInvalid = true;
        break;
     
      }
       if(!wasInvalid)
        i++;
    }
    while(i<1);
   i=0;
    out.println("now lets optimize your stats!");
    out.println("1: increase HP");
    out.println("2: increase ATK");
    out.println("3: increase AP");
    out.println("4: increase Agility");
    out.println("5: increase DEF");
    
    do{
      //String n, int m, int b,int s, int p , int e
      wasInvalid = false;
      choice = kb.nextLine();
    switch(choice){
      case "1":
        player.increaseMaxHP(1);
        out.println("increased hp! hp now " + player.getMaxHP());
        break;
      case "2":
        player.increaseATK(1);
        out.println("increased ATK! atk now " + player.getATK());
        break;
      case "3":
          player.increaseAP(1);
        out.println("increased AP! ap now " + player.getAP());
        break;
      case "4":
          player.increaseAgility(1);
        out.println("increased agility! agility now " + player.getAgility());
        break;
      case "5":
          player.increaseDefense(1);
        out.println("increased defense! defense now " + player.getDefense());
        break;
      default:
        out.println("invalid input");
        wasInvalid = true;
        break;
      
      }
      if(!wasInvalid)
        i++;
    }
    while(i<5);
    out.println("character setup done! lets go!");
    do{
      
      out.println("Menu:");
      menu(player);
     
    }
    while(!quit);
  
    
    
    /*
too burnt out bruh
   
  make the most basic shit ever and add features later
    
   shop is going to be spent upgrading ur characters stats
   every time you complete a level you get gold

   ADD ULT
   infinite levels?
   
   */
  }
  public static void menu(Player p){
    Scanner kb = new Scanner(in);
    out.println("1-Battle");
    out.println("2-Shop");
    out.println("3-view stats");
    out.println("4-quit");
    String choice = kb.nextLine();
    switch(choice){
      case "1":
        battle(p);
        break;
      case "2":
        shop(p);
        break;
      case "3":
        out.println(p);
        break;
      case "4":
        quit = true;
        break;
      case "balls!!!":
        out.println("you are stupid");
        break;
      default:
        out.println("invalid input!");
        break;
    }
  }
  public static void shop(Player p){
     Scanner kb = new Scanner(System.in);
    boolean quit = false;
    Shop shop = new Shop();
    do{
      out.println("Your Money:" + p.getMoney());
      out.println("Your Stats: HP" + p.getMaxHP()+ " DEF: " + p.getDefense() + " ATK: " + p.getATK() + " AGILITY: " + p.getAgility() + " AP: " + p.getAP());
     shop.display();
      out.println("type quit to quit");
      String choice = kb.nextLine();
      if(choice.equals("quit"));
        quit = true;
      shop.buy(choice, p); // implement check for correct input
    }
    while(!quit);
    
  }
  public static void battle(Player p){

    // confirm team here
    World level = new World(p);
  }
}