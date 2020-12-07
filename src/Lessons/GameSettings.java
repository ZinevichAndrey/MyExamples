package Game_Life2;



public class GameSettings {

	private final int lineCountXMin = 10;
	private final int lineCountYMin = 10;
	private final int lineCountXMax = 1000;
	private final int lineCountYMax = 1000;
	private int lineCountXValue = 100;
	private int lineCountYValue = 100;
	private boolean isGameRunning = false;

	public void setIsGameRunning(boolean isGameRunning) {
		this.isGameRunning = isGameRunning;
	}
	
	public boolean getIsGameRunning() {
		return this.isGameRunning;
	}
	
	public void setLineCountXValue(int currentValue) {
		int min = Math.min(currentValue, this.lineCountXMax);
		this.lineCountXValue = Math.max(min, this.lineCountXMin);	
	}

	public void setLineCountYValue(int currentValue) {
		int min = Math.min(currentValue, this.lineCountYMax);
		this.lineCountYValue = Math.max(min, this.lineCountYMin);	
	}

	public int getLineCountXValue() {
		return this.lineCountXValue;
	}

	public int getLineCountYValue() {
		return this.lineCountYValue;
	}


}
