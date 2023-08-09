import java.util.Scanner;

public class L02_Q05{
	public static void main(String[] args) {
		int AnoAtual, Idade, AnoNas;

		Scanner LerAno = new Scanner(System.in);


		System.out.println("Digite o ano atual: ");
		AnoAtual = LerAno.nextInt();


		for (int i = 1; i <= 10; i++) {
			System.out.println("Ano Nasc.: ");
			AnoNas = LerAno.nextInt();
			Idade = AnoAtual - AnoNas;
			System.out.println("Idade: " + Idade + " anos.");
			if (Idade >= 18) {
				System.out.println("A pessoa " + i + " é maior de idade.");
			} else {
				System.out.println("A pessoa " + i + " é menor de idade.");
			}
		}

		LerAno.close();
	}
}


