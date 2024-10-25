package booking.api;

import data.provider.CustomProvider;
import org.testng.annotations.Test;

public class RoomBooking extends CustomProvider {


    @Test(description = "Get Booking By ID", dataProvider = "BookingProvider")
    public void GetCurrentBooking(String id){
        logger.info("RoomBooking > GetCurrentBooking - Started");
        System.out.println("RoomBooking > GetCurrentBooking : " + id);
        logger.info("RoomBooking > GetCurrentBooking - Ended");
    }

    @Test(description = "Book a new Room")
    public void NewBooking(){
        logger.info("RoomBooking > NewBooking - Started");
        System.out.println("RoomBooking > NewBooking :");
        logger.info("RoomBooking > NewBooking - Ended");
    }


}
