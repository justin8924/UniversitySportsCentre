package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import USC_Booking.GrpExercise;

class TESTGrpExcercise {

	@Test
	//Test case for Saturday_Class method
	void testSaturday_Class() {
		GrpExercise grp =new GrpExercise();
        String expected =" "; 
        String actual=grp.d; 
        
        assertEquals(expected, actual);
    }
	@Test
	//Test case for Saturday_Class method
	void testSunday_Class() {
		GrpExercise grp =new GrpExercise();
        String expected =" "; 
        String actual=grp.d; 
        
        assertEquals(expected, actual);
    }

}
