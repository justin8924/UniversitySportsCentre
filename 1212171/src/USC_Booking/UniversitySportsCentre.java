package USC_Booking;

import static USC_Booking.GrpExercise.grp;
import static USC_Booking.ModifyBooking.modify;
import static USC_Booking.MonthlyReport.mr;
import static USC_Booking.ReviewClass.rc;

import java.util.Scanner;

/**
 * @author justin8924
/

 *
 */
public class UniversitySportsCentre {

	public static void UniversitySportsCentre() {
		System.out.println("1. Book a group exercise class\r\n"+"2. Change a booking\r\n" + "3. Attend a class\r\n"
				+ "4. Monthly class report\r\n" + "5. Monthly champion class report\r\n6. Exit"
				+ "\nEnter Your Choice: ");
		int ch = 0;  //integer variable for choice
		Scanner s = new Scanner(System.in); //Scanner object for user input
		ch = s.nextInt();
		
		switch(ch) {
		
		case 1: 
			grp = new GrpExercise();
			System.out.println("Do you want to selet another option\n");
			UniversitySportsCentre();
			break;
	
		case 2:
			grp.bookingList();
			modify=new ModifyBooking();
			System.out.println("Do you want to select another option\n");
			UniversitySportsCentre();
			break;
			
		case 3:
			rc=new ReviewClass();
			System.out.println("Do you want to select another option\n");
			UniversitySportsCentre();
			break;
		case 4:
			mr=new MonthlyReport();
			mr.ratinglist();
			System.out.println("Thank You\n");
			UniversitySportsCentre();
			break;
			
		case 5:
			
			break;
			
		case 6:
			break;
		}
		
		
	}
	public static void main(String[] args) {
		UniversitySportsCentre();

	}

}
