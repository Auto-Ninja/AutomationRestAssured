package data.provider;

import base.APIBase;
import org.testng.annotations.DataProvider;

public class CustomProvider extends APIBase {
    @DataProvider(name = "BookingProvider")
    public String[] GetBookingIDs(){
        return new String[]{
                "B00-101","B00-102","B00-103","B00-104","B00-105","B00-106","B00-107","B00-108"
        };
    }

    @DataProvider(name = "AvailableRoomProvider")
    public String[][] Rooms(){
        return new String[][]{
                {"Room 11","East Side"},
                {"Room 12","East Side"},
                {"Room 21","North Side"},
                {"Room 22","North Side"},
                {"Room 23","North Side"}
        };
    }
}
