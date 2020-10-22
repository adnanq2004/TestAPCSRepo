import java.util.Random;

public class Demo {

	public static String arrToString(int[] arr) {
		String val = "{";
		for (int i = 0; i < arr.length; i++) {
			val += Integer.toString(arr[i]);
			if (i!= arr.length-1) {
				val += ", ";
			}
			else {
				val += "}";
			}
		}
		if (arr.length == 0) {
			val = "{}";
		}
		return val;
	}

	public static String arrayDeepToString(int[][] arr) {
		String returnval = "{";
		for (int row = 0; row < arr.length; row++) {
			returnval += arrToString(arr[row]);
			if (row != arr.length-1) {
				returnval += ", ";
			}
		}
		returnval += "}";
		return returnval;
	}

	public static int[][] create2DArray(int rows, int cols, int maxValue) {
		int[][] thing = new int[rows][cols];
		int r = 0;
		Random random = new Random();
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				r = random.nextInt(maxValue + 1);
				thing[row][col] = r;
			}
		}
		return thing;
	}

	public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
		int[][] otherthing = new int[rows][];
		Random random = new Random();
		for (int row = 0; row < rows; row++) {
			int r = random.nextInt(cols+1);
			otherthing[row] = new int[r];
			for (int col = 0; col < r; col ++) {
				int n = random.nextInt(maxValue + 1);
				otherthing[row][col] = n;
			}
		}
		return otherthing;
	}

	public static void printLoop(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < x - i + 1; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){
		printLoop(Integer.valueOf(args[0]));
		//int[][] thing = new int[Integer.valueOf(args[0])][Integer.valueOf(args[1])];
		//System.out.println(arrayDeepToString(thing));
		//String returnval = arrayDeepToString(create2DArray(Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2])));
		//System.out.println(returnval);
		//String val = arrayDeepToString(create2DArrayRandomized(Integer.valueOf(args[0]), Integer.valueOf(args[1]), Integer.valueOf(args[2])));
		//System.out.println(val);
	}

}
