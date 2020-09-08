
class code {

	public static void conversions() {
		char ch = 'a';
		String st = Character.toString(ch);
		System.out.println(ch + " This is char");
		System.out.println(st + " This is string");

		System.out.println();

		String s1 = "Hello";
		char a[] = s1.toCharArray();
		System.out.println(s1 + " This is string");
		System.out.println(a[3] + " This is charArray");

		System.out.println();

		char x = 'a';
		int ascii = (int) x;

		System.out.println(x + " This is char");
		System.out.println(ascii + " This is ascii");

		System.out.println();

	}

	public static void swapBitwise(int b1, int b2) {
		b1 = b1 ^ b2;
		b2 = b1 ^ b2;
		b1 = b1 ^ b2;
		System.out.println(b1 + " " + b2);

	}

	public static void printFibonacci(int count) {
		int n1 = 0, n2 = 1;
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < count; ++i) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void pyramidPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// conversions();

		// swapBitwise(5, 9);

		// printFibonacci(10);

		pyramidPattern(6);

	}

}
