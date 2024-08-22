package empresa;

import java.util.ArrayList;

public class Cofrinho {
	
		private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

		public ArrayList<Moeda> getListaMoedas() {
			return listaMoedas;
		}

		public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
			this.listaMoedas = listaMoedas;
		}
		
		
		public void adicionar(Moeda moeda) {
			listaMoedas.add(moeda);
		}

		public void remover(Moeda moeda) {
			listaMoedas.remove(moeda);
		}
		
		public void listagemMoedas() {
			for(Moeda moeda : listaMoedas) {
				moeda.info();
			}
			
		}
		
		public double totalConverter() {	
			double total = 0.0;
			for(Moeda moeda : listaMoedas) {
				total += moeda.converter();
				
			}
			return total;
		}		
		
}
