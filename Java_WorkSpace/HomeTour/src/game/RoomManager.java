package game;

import fixtures.Computer;
import fixtures.Couch;
import fixtures.Stove;
import fixtures.Toilet;
import java.util.List;

import fixtures.Room;

public class RoomManager {
   Room startingRoom;
   Room[] rooms;

   public void init() {

       Room living = new Room("The living room", "a small small open space",
               "the main part of the house with white walls a couch and computer.\n"
                       + "To the north is the kitchen and to the south is the gameroom.\n"
                       + "To the west is the bathroom");
       
       List<String> directions = living.getDrections();
       rooms = new Room[directions.size()];
       this.startingRoom = living;
       
       Room game = new Room("The Gameroom", "An entertainment area",
               "This is a small room with a tv and a small couch\n"
    		   +"There are also many different consoles from nes to ps4 and another computer that is hooked up to the tv. \n"
    		   +"To the north is the living room");
       Room kitchen = new Room("The kitchen", "a cooking area",
               "This is a small kitchen with not enough counter space.\n"
                       + "There are cabinets and a stove. There is also a door that leads to the back yard\n"
                       + "The stove is old and hardly works with only two working eyes. Next to is is the breaker box that constantly blows.\n");
       Room bath = new Room("The Bathroom", "a small half bathroom",
               "This is a small bathroom with a sink and toilet. There is not much space in here for anything\n"
    		   + "There is a cabinet that has towles and other bathroom items");

       rooms[directions.indexOf("South")] = game;
       rooms[directions.indexOf("North")] = kitchen;
       rooms[directions.indexOf("West")] = bath;
       
       living.setExits(rooms);
       rooms = new Room[directions.size()];
       rooms[directions.indexOf("South")] = living;
       rooms[directions.indexOf("West")] = bath;
       Couch couch = new Couch("Couch", "Old Cloth Couch", "An Old couch with holes made by cats.");
       Computer computer = new Computer("Computer", "Old computer", "A donated computer from Dominos includes a greasy screen.");
       
       living.setItems(couch);
       living.setItems(computer);
       
       kitchen.setExits(rooms);
       rooms = new Room[directions.size()];
       rooms[directions.indexOf("North")] = living;
       rooms[directions.indexOf("West")] = bath;
       Stove stove = new Stove("Stove", "Broken white and old", "A hardly working stove that can only heat up food");       
       kitchen.setItems(stove);
     
       
       game.setExits(rooms);
       rooms[directions.indexOf("North")] = living;
       Couch couch2 = new Couch("Small Couch", "Fake leather couch", "A couch that is small compared to most but takes up most of the room.");
       Computer computer2 = new Computer("Computer", "Game computer", "A large computer built for coding and games.");
       game.setItems(couch2);
       game.setItems(computer2);
   }
}