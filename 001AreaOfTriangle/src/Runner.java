import javax.swing.JOptionPane;

public class Runner {
	
	/***********************************************
	 * Circle : input r, calculate circumference, area
	 * Rectangle: input sides A, B, calc perimeter, area, and diagonal
	 * Triangle: inputn sides A,B,C, calc perimeter
	 * Cuboid: input sides A, B, C, calc volume, total surface area
	 * Sphere: input radius, calc volume, and surface area
	 * 
	 */

	public static void main(String[] args) {

		// Instantiate each class

		Triangle myTriangle = new Triangle();
		Rectangle myRectangle = new Rectangle();
		Circle myCircle = new Circle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		
		JOptionPane.showMessageDialog(null, "Welcome to my program created by Sylar Smith, Period 3A, 9/18/18 ");

		int goAgain = 1;

		while (goAgain == 1) {

			String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
			String answer = JOptionPane.showInputDialog(msg);

			// When comparing strings, == is unreliable
			// use String class methods .equals
			if (answer.equals("Triangle")) {
				// Start Triangle
				myTriangle.setVarsToZero();
				myTriangle.setSides();
				myTriangle.calcPerimeter();
				myTriangle.calcArea();
				myTriangle.showVars();
				myTriangle.calcAngles();
				// End triangle
			} else if ((answer.equals("Rectangle")) || (answer.equals("triangle"))) {
				// Start rectangle
				myRectangle.setVarsToZero();
				myRectangle.setSides();
				myRectangle.calcPerimeter();
				myRectangle.calcArea();
				myRectangle.calcDiag();
				myRectangle.showVars();
				// end Rectangle
			} else if (answer.equals("Circle") || (answer.equals("circle"))) {
				// Start Circle
				myCircle.setVarsToZero();
				myCircle.setRadius();
				myCircle.calcCircumference();
				myCircle.calcArea();
				myCircle.showVars();
			} else if (answer.equals("Cuboid") || (answer.equals("cuboid"))) {
				// Start Cuboid
				myCuboid.setVarsToZero();
				myCuboid.getVariables();
				myCuboid.calcSurfArea();
				myCuboid.calcVolume();
				myCuboid.showVars();
				// end Cuboid
			} else if ((answer.equals("Sphere")) || (answer.equals("sphere"))) {
				// Start Sphere
				mySphere.setVarsToZero();
				mySphere.getRad();
				mySphere.calcVolume();
				mySphere.calcSurfArea();
				mySphere.showVars();
			} else {
				JOptionPane.showMessageDialog(null, "Whattt?????");
			} // End Else
			
			msg = "Would you like to go again (Y/N)";
			answer = JOptionPane.showInputDialog(msg);

			if (answer.equals("Y") || answer.equals("y") || answer.equals("Yes") || answer.equals("yes")) {
				goAgain = 1;
			} else {
				goAgain = 0;
			} // End Else

		} // End While
	} // End Main
} // End Runner