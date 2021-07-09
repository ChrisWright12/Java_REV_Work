package game;

import java.util.Scanner;
import fixtures.Interactable;
public class Main {
   public static void main(String[] args) {
       RoomManager manager = new RoomManager();
       manager.init();
       Player player = new Player(manager.startingRoom);
       while (true) {
           printRoom(player);
           parse(collectInput(), player);
       }
   }

   public static void printRoom(Player player) {
       System.out.println(player.getCurrentRoom().toString());
   }

   public static String[] collectInput() {
       Scanner s = new Scanner(System.in);

       return s.nextLine().split(" ");
   }

   public static void parse(String[] input, Player player) {
       switch (input[0]) {
       case "go":
           player.setCurrentRoom(player.getCurrentRoom().getExit(input[1]));
           break;
       
//       case "interact":

       default:
           break;
       }
   }

private static void Touch() {
	
}
}