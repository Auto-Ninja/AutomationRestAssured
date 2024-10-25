package booking.api;

import data.provider.CustomProvider;
import org.testng.annotations.Test;


public class HotelRooms extends CustomProvider
{
    @Test(description = "Available Rooms", dataProvider = "AvailableRoomProvider")
    public void GetRoomAvailability(String room, String side){
        logger.info("HotelRooms > GetRoomAvailability - Started");
        System.out.println("HotelRooms > GetRoomAvailability : " + room + " -- " + side);
        logger.info("HotelRooms > GetRoomAvailability - Ended");
    }

    @Test(description = "Book a new Room")
    public void GetRoomFacility(){
        logger.info("HotelRooms > GetRoomFacility - Started");
        System.out.println("HotelRooms > GetRoomFacility :");
        logger.info("HotelRooms > GetRoomFacility - Ended");
    }


}
