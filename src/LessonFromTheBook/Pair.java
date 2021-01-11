package LessonFromTheBook;

public class Pair implements Comparable {

	int value;
	int count;

	public Pair(int value, int count) {
		this.value = value;
		this.count = count;
	}

	@Override
	public int compareTo(Object o) {
		Pair b = (Pair)o;
		return this.value - b.value;
	}

}
