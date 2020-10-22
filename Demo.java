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

	public static void printLoop(int x) {
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < x - i + 1; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){
		//printLoop(Integer.valueOf(args[0]));
		int[][] thing = new int[Integer.valueOf(args[0])][Integer.valueOf(args[1])];
		System.out.println(arrayDeepToString(thing));
	}

}
