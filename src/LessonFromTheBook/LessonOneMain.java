package LessonFromTheBook;

import java.util.ArrayList;
import java.util.List;

public class LessonOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayLenght = 100000;
		int[] array = new int[arrayLenght];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10);
		//	System.out.println(array[i]);
		}
		//	LessonOne one = new LessonOne();
		//	LuckyNumbers l = new LuckyNumbers();
		//	l.setup();
		//	l.replicate(l.getArray(), 3);
		//	l.show(l.result);
		//	l.replicate(l.result, 7);
		//	l.show(l.result);
		//	GreatestCommonDivisor g = new GreatestCommonDivisor();
		//	System.out.println(g.getLeastCommonDivisor(40, 8));
		//	System.out.println(GreatestCommonDivisor.gcd(15, 12));
		//	System.out.println(GreatestCommonDivisor.lcm(15, 12));
		DescendingOrder d = new DescendingOrder();
		long start1 = System.currentTimeMillis();
	//	d.getDescendingOrder(3, 3, 2, 1, 45, 54, 66, 84, 32);
		//List<Pair> value1 = d.getFrequency(array);
		List<Pair> value1 = new ArrayList<>();
		long finish1 = System.currentTimeMillis();
		long start2 = System.currentTimeMillis();
		List<Pair> value2 = d.getFrequencyMap(array);
		long finish2 = System.currentTimeMillis();
		long time1 = finish1 - start1;
		long time2 = finish2 - start2;
		System.out.println("time sort = " + time1);
		System.out.println("time map = " + time2);
		System.out.println("=== sort frequency ===");
		for(int i = 0; i < value1.size(); i++) {
			Pair pair = value1.get(i);
			System.out.println(pair.value + " - " + pair.count);
		}
	
		System.out.println("=== map frequency ===");
		for(int i = 0; i < value2.size(); i++) {
			Pair pair = value2.get(i);
			System.out.println(pair.value + " - " + pair.count);
		}
//		System.out.println(GreatestCommonDivisor.greatestCommonDivisor(10, 4));
		
		
		
	}

}
