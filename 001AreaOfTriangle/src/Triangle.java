import javax.swing.JOptionPane;

public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double area;

	// constructor goes here
	public Triangle() {

		setVarsToZero();

	}

	// methods go here
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		area = 0.0;

	} // end of setVarsToZero()

	public void showVars() {
		String msg = 
				"side A, B, C = " + sideA + ", "+ sideB + ", " + sideC
				+ "; perimeter = " + perimeter + "; "
				+ "Area = "+ area;
		
		JOptionPane.showMessageDialog(null, msg);
	} // end of showVars()

	public void setSides() {
		boolean b = true;
		while (b) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Side A"));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			} // end Catch A
		} // end While
		b = true;
		while (b) {
			try {
			sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Side B"));
			b = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			} // end Catch B
		} // End While
		b = true;
		while (b) {
			try {
				sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Side C"));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a number");
			}
		}
	} // end setSide()

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;

	} // end calcPerimeter()

	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC) / 2.0;

		area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	} // end calcArea()

	public void calcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0;
		double cosB = 0.0, Bcos = 0.0, Bdeg = 0.0;
		double cosC = 0.0, Ccos = 0.0, Cdeg = 0.0;
		
		// Finds angle A
		cosA = (Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC);
		Acos = Math.acos(cosA);
		Adeg = Math.toDegrees(Acos);
		
		// Finds Angle B
		cosB = (Math.pow(sideC, 2) + Math.pow(sideA, 2) - Math.pow(sideB, 2)) / (2 * sideC * sideA);
		Bcos = Math.acos(cosB);
		Bdeg = Math.toDegrees(Bcos);
		
		// Finds Angle C
		cosC = (Math.pow(sideA, 2) + Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideB * sideA);
		Ccos = Math.acos(cosC);
		Cdeg = Math.toDegrees(Ccos);
		
		// Prints message4
		String message = "Angle A = " + Adeg + "  Angle B = " + Bdeg + "  Angle C = " + Cdeg;
		JOptionPane.showMessageDialog(null, message);
		
	} // end calcAngles()


} // end of class
