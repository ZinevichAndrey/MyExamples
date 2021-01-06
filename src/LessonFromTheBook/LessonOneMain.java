package LessonFromTheBook;

public class LessonOneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LessonOne one = new LessonOne();
		LuckyNumbers l = new LuckyNumbers();
		l.setup();
		l.replicate(l.getArray(), 3);
		l.show(l.result);
		l.replicate(l.result, 7);
		l.show(l.result);
		

	}

}
