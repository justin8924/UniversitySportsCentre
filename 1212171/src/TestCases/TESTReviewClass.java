package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import USC_Booking.ReviewClass;

class TESTReviewClass {

	@Test
	void testReviewClass() {
		ReviewClass rc =new ReviewClass();
        String expected =" ";  //Expected
        String actual=rc.feedback; //Actual
        assertEquals(expected, actual);
	}

}
