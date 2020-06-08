package exception;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
			throw new Exception("RupakOutOfBoundException");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String exc_flag=" ";
		if (exc_flag.equals("No") || exc_flag.equals(" ")) {
			try {
				throw new Exception("ExcecutionFlagNo-OR-Blank_Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
