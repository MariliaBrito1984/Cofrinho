package empresa;

public class Dolar extends Moeda{
	
	
	public Dolar(double valor) {
        super(valor);
    }

			
		@Override
		public double converter() {
			return valor * 5.0; //valor aleatório para converter em Real
			
	}		

		@Override
		void info() {
			System.out.println("Moeda Dólar: " + valor);
			
	}
	
}
