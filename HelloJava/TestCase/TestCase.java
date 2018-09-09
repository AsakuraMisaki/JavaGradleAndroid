//TestCase
/** MISAKI 180905 */


//java org.junit.runner.JUnitCore className
//import junit 
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Date;

import allTest.ImportTest;

public class TestCase{

	// public static void main(String[] args){ 
	// 	Date date= new Date();
	// 	System.out.println(date);
	// 	ImportTest t0= new ImportTest();
	// 	System.out.println("testCase");
	// }

	@Test
	public void junitAssert(){
		ImportTest t1= new ImportTest();
		assertEquals(1, ImportTest.explorer);
		assertEquals(1, t1.explorer);
	}
}