public class Demo {

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
	}

}
