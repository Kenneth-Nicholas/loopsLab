package loopsLab;

public class Application {

	public static void main(String[] args) {
		
		// 1.
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2.
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 3.
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 4.
		
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 5.
		
		for(int i = 0, number = 1; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(number);
			}
			System.out.println();
			number++;
		}
		
		// 6.
		
		for(int i = 0, number2 = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(number2);
			}
			System.out.println();
			number2++;
		}
		
	}
}
