public class ClearScreen {  

	public final static void clearConsole() {

		public static void main(String[] arguments) {
			try {
				final String os = System.getProperty("os.name");
				if (os.contains("Windows")) {
					Runtime.getRuntime().exec("cls");
				}
			}  
			catch (final Exception e) {  
				e.printStackTrace();
			}
	}
