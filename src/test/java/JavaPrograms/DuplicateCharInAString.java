package JavaPrograms;

import java.util.HashSet;

public class DuplicateCharInAString {

	public static void main(String[] args) {
		String a = "Great explanation";
		char St[] = a.toCharArray();

		for (char str : St) {
			System.out.print(str + ", ");
		}
		System.out.println();

		HashSet<Character> c = new HashSet<Character>();
		for (char hased : St) {
			if (c.add(hased) == false) {
				System.out.print(hased + " ");
			}
		}
	}
}
