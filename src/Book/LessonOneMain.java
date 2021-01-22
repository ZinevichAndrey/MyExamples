package Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LessonOneMain {

	public static void main(String[] args) throws Exception {
		//	LogicForMiniGame l = new LogicForMiniGame();
		//	l.answersThePlayers();

		ChildSeria childSeria = new ChildSeria();
		childSeria.childLvl = 22;
		childSeria.lvl = 55;

		FileOutputStream fileOutputStream = new FileOutputStream("temp");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(childSeria);
		objectOutputStream.close();

		FileInputStream fileInputStream = new FileInputStream("temp");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		ChildSeria child = (ChildSeria) inputStream.readObject();
		inputStream.close();

		System.out.println(child.childLvl);
		System.out.println(child.lvl);
	}

}
