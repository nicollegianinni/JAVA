package JAVA;

public class questao1 {

	public static void main(String[] args) {
		System.out.println("\n\n   PARES: ");
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0)
				System.out.print(  "  "+num);

		}

		System.out.println("\n\n   IMPARES: ");
		for (int num = 1; num <= 10; num++) {
			if (num % 2 != 0)
				System.out.print(" " + num+ " "  );

		}
	}
}