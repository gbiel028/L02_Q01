import java.util.Scanner;

public class L02_Q08 {
	public static void main(String[] args) {
		String nomeProd;
		int quantProd;
		double valorUnitProd, totalCompra;

		Scanner LerProd = new Scanner(System.in);
		Scanner LerQuantProd = new Scanner(System.in);
		Scanner LerVlrProd = new Scanner(System.in);

		System.out.println("Digite o Produto: ");
		nomeProd = LerProd.nextLine();
		System.out.println("Digite o Quant.: ");
		quantProd = LerQuantProd.nextInt();
		System.out.println("Digite Valor Unit.: ");
		valorUnitProd = LerVlrProd.nextDouble();

		totalCompra = quantProd * valorUnitProd;

		System.out.println("\nProduto: " + nomeProd);
		System.out.println("Quant.: " + quantProd);
		System.out.printf("Pre.Unit.: %.2f", valorUnitProd);
		System.out.printf("\nTotal: %.2f", totalCompra);

		LerProd.close();
		LerQuantProd.close();
		LerVlrProd.close();
	}

}

