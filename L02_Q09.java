import java.util.Scanner;

public class L02_Q09 {

	public static void main(String[] args) {
		String nomeProd;
		int quantidade;
		double total,precoUnitario, descontoPercentual,descontoValor,valorFinal;
		
		Scanner LerProd = new Scanner(System.in);
		Scanner LerQuantProd = new Scanner(System.in);
		Scanner LerVlrProd = new Scanner(System.in);
		Scanner Desconto = new Scanner(System.in);


	        System.out.print("Digite o nome do produto: ");
	        String nomeProduto = LerProd.nextLine();

	        System.out.print("Digite a quantidade: ");
	         quantidade = LerQuantProd.nextInt();

	        System.out.print("Digite o preço unitário: ");
	         precoUnitario = LerVlrProd.nextDouble();

	         total = precoUnitario * quantidade;

	        System.out.println("\nDetalhes do Produto:");
	        System.out.println("Nome do Produto: " + nomeProduto);
	        System.out.println("Quantidade: " + quantidade);
	        System.out.println("Preço Unitário: R$" + precoUnitario);
	        System.out.println("Total do Item: R$" + total);

	        System.out.print("\nDigite o desconto desejado (%): ");
	         descontoPercentual = Desconto.nextDouble();

	         descontoValor = (descontoPercentual / 100) * total;
	         valorFinal = total - descontoValor;

	        System.out.println("\nResumo da Compra:");
	        System.out.println("Total: R$" + total);
	        System.out.println("Desconto: " + descontoPercentual + "%");
	        System.out.println("Valor com Desconto: R$" + valorFinal);

	        LerProd.close();
	        LerQuantProd.close();
	        LerVlrProd.close();
	    }
	}