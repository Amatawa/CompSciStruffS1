import javax.swing.JOptionPane;

public class Rectangle {
	
	// class variables go here
	private double area, perimeter, sideA, sideB, diagonal;
	
	// constructor goes here 
	public Rectangle() {
		
		setVarsToZero();

	} // end Rectangle()

	// Methods go here
	public void setVarsToZero() {
		area = 0.0;
		perimeter = 0.0;
		sideA = 0.0;
		sideB = 0.0;
	} // end setVarsToZero()
	
	public void showVars() {
		String msg = "Side A = " + sideA + "  Side B = " + sideB
		+ "  Diagonal = " + diagonal
		+ "  The perimeter = " + perimeter
		+ "  The area = " + area;
		JOptionPane.showMessageDialog(null, msg);
	} // end showVars()
	
	public void setSides() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Side A"));
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for Side B"));
	} // end setSides()
	
	public void calcPerimeter() {
		perimeter = 2 * (sideA + sideB);
	} // end calcPerimeter
	
	public void calcArea() {
		area = sideA * sideB;
	} // end CalcArea
	
	public void calcDiag() {
		diagonal = Math.sqrt((Math.pow(sideA, 2) + Math.pow(sideB, 2)));
	}
	
} // end class