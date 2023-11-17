package Creational_Design_Patterns.singleton;

public class RoomDataBase {

    /**
     reference to room database inside database
     */
    private static RoomDataBase roomDataBase;


    private RoomDataBase(){};


    public static RoomDataBase getInstance(){
        if (roomDataBase == null)
            roomDataBase = new RoomDataBase();
        return roomDataBase;
    }



}
