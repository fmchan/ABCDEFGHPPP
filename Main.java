import java.util.LinkedHashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		/* rules:
		 - all numbers within range [0, 9]
		 - A, C, E, G != 0
		 - all numbers are unique
		*/
		System.out.println("[A, B, C, D, E, F, G, H, P]");
		for (int p = 1; p < 10; p++) {
			int ppp = Integer.valueOf("" + p + p + p);
			for (int i = 10; i < 100; i++) {
				int j = ppp - i;
				if (j < 10 || j > 100) continue;
				if (i + j == ppp) {
					Set<Integer> efgh = new LinkedHashSet<Integer>();
					efgh.add(i / 10);
					efgh.add(i % 10);
					efgh.add(j / 10);
					efgh.add(j % 10);
					efgh.add(p);
					if (efgh.size() == 5)
						for (int k = 10; k < 100; k++) {
							int l = i + k;
							if (l < 100) {
								Set<Integer> abcdefgh = new LinkedHashSet<Integer>();
								abcdefgh.add(l / 10);
								abcdefgh.add(l % 10);
								abcdefgh.add(k / 10);
								abcdefgh.add(k % 10);
								abcdefgh.addAll(efgh);
								if (abcdefgh.size() == 9)
									System.out.println(abcdefgh.toString());
							}
						}
				}
			}
		}
	}

}
