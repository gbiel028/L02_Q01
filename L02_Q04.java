
public class L02_Q04 {

	public static void main(String[] args) {
		int soma= 0, cont= 1;

		while(cont <= 10) {
			System.out.println("Contador em: " + cont);
			soma = soma + cont;
			cont++;
		}
		System.out.println("Somatório dos números de 1 a 10: " + soma);
	}

}
