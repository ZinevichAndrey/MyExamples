package Game_Life2;



public class Game_Life2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		Game_Life2 game = new Game_Life2();
		Thread thread = new Thread(game);
		thread.start();
		

		
		
		
		
	}
	
	
	public void run() {
		MainWindow mainWindow = new MainWindow();
		mainWindow.setTitle("GameLive");
		mainWindow.setVisible(true);
		
	}
}
