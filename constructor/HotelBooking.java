package constructor;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    
    public HotelBooking() {
        this.guestName = "GUEST NAME";
        this.roomType = "ROOM TYPE";
        this.nights = 0;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking hotelBooking) {
        this.guestName = hotelBooking.guestName;
        this.roomType = hotelBooking.roomType;
        this.nights = hotelBooking.nights;
    }
}
