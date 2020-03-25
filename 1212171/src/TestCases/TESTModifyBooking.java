package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import USC_Booking.ModifyBooking;

class TESTModifyBooking {

	@Test
	//Test case for Saturday_Class method
	void testSaturday_Class() {
		ModifyBooking modify =new ModifyBooking();
        String expected =" "; 
        String actual=modify.d; 
        
        assertEquals(expected, actual);
    }
	@Test
	//Test case for Saturday_Class method
	void testSunday_Class() {
		ModifyBooking modify =new ModifyBooking();
        String expected =" "; 
        String actual=modify.d; 
        
        assertEquals(expected, actual);
    }
	

}
