import javax.swing.JOptionPane;

public class Circle {
	
	private double radius, circum, area;
	
	public Circle() {
		setVarsToZero();
	}

	public void setVarsToZero() {
		radius  = 0.0;
		circum = 0.0;
		area = 0.0;
	}
	
	public void showVars() {
		String msg = "Radius = " + radius
		+ "  Circumference = " + circum
		+ "  Area = " + area;
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void setRadius() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for the Radius"));
	}
	
	public void calcCircumference() {
		circum = 2 * Math.PI * radius;
	}
	
	public void calcArea() {
		area = Math.PI * (Math.pow(radius,2)); 
	}

}


