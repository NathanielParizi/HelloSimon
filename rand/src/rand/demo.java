package rand;

import java.util.Random;

public class demo {

	public static void main(String[] args) {

		Random rand = new Random();

		for (;;) {

			int x = rand.nextInt(3);
			System.out.println(x);

		}

	}

}
