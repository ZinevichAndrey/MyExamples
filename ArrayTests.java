package Laboratory_Work;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayTests {

	LaboratoryArrays testArrays = new LaboratoryArrays();
	//Test numbers of Fibanachi
	@Test
	void testGetFibanachi() {
		int actual =  6765;
		int expected = testArrays.getFibanachi();
		assertEquals(expected, actual, "equals");
	}
	//Checking for excetion
	@Test 
	void testHomeWorkFour_CreateAndSortArray() {
		try {
			testArrays.homeWorkFour_CreateAndSortArray();
		}
		catch(IndexOutOfBoundsException e) {
			Assert.assertNotEquals("", e.getMessage());
		}
	}
	//Checking for excetion. Another way
	@Test
	void testHomeWorkFour_CreateAndSortArrayTwo() throws Exception {
		Exception exception = assertThrows(Exception.class,() -> {
			testArrays.homeWorkFour_CreateAndSortArray();
			throw new IndexOutOfBoundsException();
		});
		assertEquals(exception.getClass(), IndexOutOfBoundsException.class);
	}	

}
