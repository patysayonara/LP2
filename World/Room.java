/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 */
public class Room 
{
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;
    public Room upExit;
    public Room downExit;
    

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
	if(up != null)
    	    upExit = up;
    	if(down != null)
	    downExit = down;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Returns a description of the exits of the current room.
     * @return The description of the exits of the current room.
     */
    public String getExitString(){
	String exitDescription = "Exits: ";

        if(northExit != null) {
           exitDescription = exitDescription.concat("north ");
        }
        if(eastExit != null) {
           exitDescription = exitDescription.concat("east ");
        }
        if(southExit != null) {
           exitDescription = exitDescription.concat("south ");
        }
        if(westExit != null) {
           exitDescription = exitDescription.concat("west ");
        }
	if(upExit != null) {
	   exitDescription = exitDescription.concat("up ");
	}
	if(downExit != null){
	   exitDescription = exitDescription.concat("down ");
	}
     
	return exitDescription;
    }

}