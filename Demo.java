public class Demo {

	public static void printLoop(int x) {
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args){
		printLoop(10);
	}

}
