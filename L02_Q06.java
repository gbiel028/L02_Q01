import java.util.Scanner;

public class L02_Q06{
	public static void main(String[] args) {
		int cont, anoAtual, anoNasc, idade, qMaiores = 0, qMenores = 0;

		Scanner lerValor = new Scanner(System.in);

		System.out.println("Ano Atual: ");
		anoAtual = lerValor.nextInt();

		for(cont = 1; cont <= 10; cont++) {
			System.out.println("Ano Nasc.: ");
			anoNasc = lerValor.nextInt();
			idade = anoAtual - anoNasc;
			System.out.println("Idade: " + idade + " anos.");
			if(idade <= 18) {
				System.out.println("Menor de idade.");
				qMenores++;
			}else {
				System.out.println("Maior de Idade");
				qMaiores++;
			}
		}
		System.out.println("Total de Menores: " + qMenores);
		System.out.println("Total de Maiores: " + qMaiores);
	}

}