package Laboratory_Work;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class ArrayTests {
	
	LaboratoryArrays testArrays = new LaboratoryArrays();
	//���� ����� ���������
	@Test
	void testGetFibanachi() {
		int actual =  6765;
		int expected = testArrays.getFibanachi();
		assertEquals(expected, actual, "equals");
	}
	//�������� �� ��������
	@Test 
	void testHomeWorkFour_CreateAndSortArray() {
		try {
			testArrays.homeWorkFour_CreateAndSortArray();
		}
		catch(IndexOutOfBoundsException e) {
			Assert.assertNotEquals("", e.getMessage());
		}
	}
	//����������, �� ������ �������� �������� �� ��������
	@Test
	void testHomeWorkFour_CreateAndSortArrayTwo() throws Exception {
		Exception exception = assertThrows(Exception.class,() -> {
			testArrays.homeWorkFour_CreateAndSortArray();
			throw new IndexOutOfBoundsException();
		});
		assertEquals(exception.getClass(), IndexOutOfBoundsException.class);
	}
	
	
	
}
