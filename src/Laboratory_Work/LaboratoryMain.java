package Laboratory_Work;

public class LaboratoryMain {

	public static void main(String[] args) {

		Laboratory1 laboratory1 = new Laboratory1();
		laboratory1.outputToTheConsolMass();
		Laboratory1.outputNumbers();
		laboratory1.squaring(7);
		laboratory1.factorial(5);
		Laboratory1.calculation(51, 13);
		System.out.println(Laboratory1.timeToFall(0.5));
		Laboratory1.CalculationHipotenuse(2, 3);
		laboratory1.factorial(0);

		LaboratoryArrays arrays = new LaboratoryArrays();
		arrays.createArrayOfEvenNumbers();
		arrays.createArrayAndOppositeDirection();
		arrays.createArrayAndCountEvenElements();
		arrays.createArrayAndReplace();
		arrays.createTwoArraysAndCompareSumOfBoth();
		arrays.createArrayAndDetemineIncreasingArray();
		arrays.createArrayAndDetermineMaxElement();
		arrays.determineWhichElementsAreMore();
		arrays.DivideTheArray();
		arrays.createDimensionalArray();
		arrays.createDimensionalArrayAndPrintMaxValue();
		arrays.createMultiArray();
		arrays.homeWorkFour_CreateAndSortArray();
		arrays.multiplicationTable();

	}

}
