package practicasMedio310723;

public class Circle {
	private int radio;
	
	public Circle(int radio) {
		this.radio = radio;
	}
	public Circle() {

	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return (radio*radio)*3.141592;
	}
	
	public double getCirc() {
		return 2*(3.141592 *radio);
	}
	
}
