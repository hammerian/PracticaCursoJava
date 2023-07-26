package practicas.Java_230726;

public class Series08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int conta = 1;
		boolean serie = true;
		while (serie == true) {
			if ((conta * 8) > 500) {
				serie = false;
			} else {
				System.out.println("Serie " + (conta * 8));
				conta++;
			}
		}
	}

}
