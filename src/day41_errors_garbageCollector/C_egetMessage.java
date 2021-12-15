package day41_errors_garbageCollector;

public class C_egetMessage {

	public static void main(String[] args) {
		
		try { calis();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			
		}
		
		}

	private static void calis() {
		throw new RuntimeException("Coook calis");
		
	}

}
