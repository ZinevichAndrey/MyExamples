package LessonFromTheBook;

public class PascalsTriangle {
	// Construct Pascal's triangle.
	final int linesCount = 5;
	int pascalTriangle[][] = getPascalTriangle(linesCount);

	public void show() {
		for (int array[]: pascalTriangle) {
			System.out.print(getSpaces(array, getLineLength(pascalTriangle[linesCount - 1])));
			for (int var: array) {
				if (var != 0) {
					System.out.print(var + " ");
				}
			}
			System.out.println();
		}
	}

	static int getDigitsCount(int value) {
		int digitCounter = 1;
		for (int divider = 10; digitCounter < 10000; digitCounter++, divider *= 10) {
			if (value / divider < 1) {
				break;
			}
		}
		return digitCounter;
	}

	static int getLineLength(int line[]) {
		int length = -1;
		for (int value : line) {
			if (value == 0) {
				break;
			}
			length++;
			length += getDigitsCount(value);
		}
		return length;
	}

	static String getSpaces(int line[], int maxLineLength) {
		String spaces = "";
		int spaceCount = maxLineLength - getLineLength(line);
		spaceCount /= 2;
		for (int i = 0; i < spaceCount; i++) {
			spaces += " ";
		}
		return spaces;
	}

	static int[][] getPascalTriangle(int height) {
		if (height == 0) {
			System.out.println("take your exception");
			return null;
		}
		int pascalTriangle[][] = new int[height][height];

		for (int mainVar = 0; mainVar < height; mainVar++) {
			for (int secondVar = 0; secondVar < mainVar + 1; secondVar++) {
				try {
					pascalTriangle[mainVar][secondVar] =
							pascalTriangle[mainVar - 1][secondVar - 1] + pascalTriangle[mainVar - 1][secondVar];

				} catch (ArrayIndexOutOfBoundsException ex) {
					if (secondVar == 0) {
						pascalTriangle[mainVar][secondVar] = 1;
					} else {
						System.out.println("WAT1");
					}

				} catch (NullPointerException ex) {
					if (secondVar == mainVar) {
						pascalTriangle[mainVar][secondVar] = 1;
					} else {
						System.out.println("WAT2");
					}
				}
			}
		}
		return pascalTriangle;
	}
}
