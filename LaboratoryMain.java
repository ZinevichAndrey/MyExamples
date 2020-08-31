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
		arrays.taskArrayOne();
		arrays.taskArrayTwo();
		arrays.taskArrayThree();
		arrays.taskArrayFour();
		arrays.taskArrayFive();
		arrays.taskArraySix();
		arrays.getFibanachi();
		arrays.taskArrayEight();
		arrays.taskArrayNine();
		arrays.taskArrayTen();
		arrays.taskGetMultiArrayOne();
		arrays.taskGetMultiArrayTwo();
		arrays.getMultiArrayThree();
		arrays.homeWorkFour_CreateAndSortArray();
		arrays.multiplicationTable();
		
	}

}
