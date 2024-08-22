package empresa;

public class Euro extends Moeda{

		public Euro(double valor) {
	        super(valor);
	    }
	
	
		@Override
		public double converter() {
			return valor * 6.0; //valor aleatório para converter em Real
			
	}
		
		@Override
		void info() {
			System.out.println("Moeda Euro: " + valor);
	}
	
		
}
