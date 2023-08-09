import java.util.Scanner;

public class L02_Q10 {

	public static void main(String[] args) {
		int cont,idade=0,contCrianca = 0,contAdolescente = 0,contAdulto = 0;

		Scanner lerIdade = new Scanner(System.in);

		for(cont = 1; cont <= 10; cont++) {
			System.out.println("Idade da "+cont+"a. pessoa.");
			idade = lerIdade.nextInt();
			if(idade <= 12) {
				contCrianca++;
			}else if ((idade >= 13) && (idade <= 18)) {
				contAdolescente++;
			}else if ((idade > 18)) {
				contAdulto++;
			}
		}
		System.out.println("Temos: "+contCrianca+" crianças (até 12 anos de idade).");
		System.out.println("Temos: "+contAdolescente+" adolecentes (entre 13 e 18 anos de idade).");
		System.out.println("Temos: "+contAdulto+" adultos (maiores que 18 anos de idade).");

	}
}