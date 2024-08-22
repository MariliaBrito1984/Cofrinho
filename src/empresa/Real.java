package empresa;

public class Real extends Moeda{
	
		public Real(double valor) {
	        super(valor);
	    }


		@Override
		public double converter() {
			return valor; //moeda já esta no valor de convesao
			
	}
	
		@Override
		void info() {
			System.out.println("Moeda Real: " + valor);
			
	}		
}
