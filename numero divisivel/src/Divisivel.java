import java.util.Scanner;

public class Divisivel {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		
		for(int y = 1;y <= x;y++) {
			if(x % y == 0) {
				System.out.println(y);
			}
		}

	}

}
