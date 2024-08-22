package empresa;

public abstract class Moeda {
	
		protected double valor;
		
		public Moeda(double valor) {
			super();
			this.valor = valor;
		}	
		
		abstract double converter();		
			
		abstract void info();
		
		// Função para comparar os valores fornecidos para apagar da lista.
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Moeda other = (Moeda) obj;
			return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
		}	
		
		
}
