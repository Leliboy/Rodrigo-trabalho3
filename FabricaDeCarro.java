// Desafio 2 - Tentei...
public class FabricaDeCarro {
    
	private static FabricaDeCarro Chassi;

	private FabricaDeCarro() {
	}

	public static synchronized FabricaDeCarro getInstance() {
		if (Chassi == null)
			Chassi = new FabricaDeCarro();

		return Chassi;
	}
    
}
