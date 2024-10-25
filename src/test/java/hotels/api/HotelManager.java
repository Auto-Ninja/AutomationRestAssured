package hotels.api;

import base.APIBase;
import org.testng.annotations.Test;

public class HotelManager extends APIBase {
    @Test()
    public void AddHotel(){
        logger.info("HotelManager > AddHotel - Started");
        System.out.println("HotelManager > AddHotel :");
        logger.info("HotelManager > AddHotel - Ended");
    }
    @Test
    public void GetHotels(){
        logger.info("HotelManager > GetHotels - Started");
        System.out.println("HotelManager > GetHotels :");
        logger.info("HotelManager > GetHotels - Ended");
    }
//    @Test
//    public void GetHotelById(String searchKeyword){
//        logger.info("HotelManager > GetHotelById - Started");
//        System.out.println("HotelManager > GetHotelById :");
//        System.out.println("Searching for: " + searchKeyword);
//        logger.info("HotelManager > GetHotelById - Ended");
//    }
    @Test
    public void UpdateHotel(){
        logger.info("HotelManager > UpdateHotel - Started");
        System.out.println("HotelManager > UpdateHotel :");
        logger.info("HotelManager > UpdateHotel - Ended");
    }
//    @Test
//    public void DeleteHotel(String searchKeyword){
//        logger.info("HotelManager > DeleteHotel - Started");
//        System.out.println("HotelManager > DeleteHotel :");
//        System.out.println("Searching for: " + searchKeyword);
//        logger.info("HotelManager > DeleteHotel - Ended");
//    }
    @Test
    public void SearchHotels(String searchKeyword, int expectedResults) {
        logger.info("HotelManager > DeleteHotel - Started");
        System.out.println("HotelManager > DeleteHotel :");
        System.out.println("Searching for: " + searchKeyword);
        System.out.println("Expecting results: " + expectedResults);
        logger.info("HotelManager > DeleteHotel - Ended");
    }

}
