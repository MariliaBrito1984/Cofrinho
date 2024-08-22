package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho cofrinho =  new Cofrinho();		
		Scanner Scan = new Scanner(System.in);		
				
		while(true) {	
		int opcao;	
		// Menu pincipal do programa.
		System.out.println("-=-=-=-=-=-Menu-=-=-=-=-=-");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar todas as Moedas");
		System.out.println("4 - Valor convertido em Real");
		System.out.println("5 - Sair...");
		System.out.println("Digite a opção desejada:");	
		System.out.print(">> ");
		opcao = Scan.nextInt();				
		
			switch(opcao) {
			
			case 1:				 
                 int tipoMoeda = 0;	// Funcao para adicionar as moedas
                 while(tipoMoeda>=1 ||tipoMoeda <=3) {
                	 System.out.println("Escolha o tipo de moeda:");
	                 System.out.println("1. Dólar");
	                 System.out.println("2. Euro");
	                 System.out.println("3. Real");
	                 System.out.print(">> ");
	                 tipoMoeda = Scan.nextInt();                 	 
                 
	                 System.out.println("Digite o valor da Moeda: ");
	                 System.out.print(">> ");
	                 double valorMoeda = Scan.nextDouble();
	                                  
	                 if (tipoMoeda==1) {
	                	 cofrinho.adicionar(new Dolar(valorMoeda));
	                	 break;
	                 }
	                 else if (tipoMoeda==2) {
	                	 cofrinho.adicionar(new Euro(valorMoeda));
	                	 break;
	                 }
	                 else if (tipoMoeda==3) {
	                	 cofrinho.adicionar(new Real(valorMoeda));
	                	 break;
	                 }  	               
                 }
				break;   
                 
			case 2:
				 int tipoMoedas = 0;	// Funcao para remover as moedas
                 while(tipoMoedas>=1 ||tipoMoedas <=3) {
                 	 System.out.println("Escolha a moeda a ser removida:");
                     System.out.println("1. Dólar");
                     System.out.println("2. Euro");
                     System.out.println("3. Real");
                     System.out.print(">> ");
                     int escolha = Scan.nextInt();
                     System.out.print("Digite o valor da moeda: ");
                     System.out.print(">> ");
                     double valor = Scan.nextDouble();
                     Moeda moedaRemover = null;
                     switch (escolha) {
                         case 1:
                             moedaRemover = new Dolar(valor);
                             break;
                         case 2:
                             moedaRemover = new Euro(valor);
                             break;
                         case 3:
                             moedaRemover = new Real(valor);
                             break;
                         default:
                             System.out.println("Opção inválida.");
                             break;
                     }             
                     cofrinho.remover(moedaRemover);
                     break;            
                    
                 }  
			case 3: //Função para listar moedas adicionadas
				cofrinho.listagemMoedas();
				break;
			case 4:
				// função para Somar o total das moedas adicionadas e as moedas convertidas.
				double totalEmReal = cofrinho.totalConverter();
				System.out.println("Total convertido em Real: " + totalEmReal);
				System.out.println();
				break;
			case 5:
				System.out.println("Encerrando o programa...");
				return ; // Encerrar o programa				
			default:
				System.out.println("Opção inválida!");	
				System.out.println();
				break;
			
			}		
			
		}				
			
	}

}
