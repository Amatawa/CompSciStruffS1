import javax.swing.JOptionPane;

public class Sphere {
	private double radius, surfArea, volume;
	
	public Sphere() {
		setVarsToZero();
	}

	public void setVarsToZero() {
		radius = 0.0;
		surfArea = 0.0;
		volume = 0.0;	
	}
	
	public void showVars() {
		String msg = "Radius = " + radius + "  Volume = " + volume + "  Surface Area = " + surfArea;
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void getRad() {
		radius = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for the radius"));
	}
	
	public void calcVolume() {
		// V = 4/3PIr^3
		volume = ((4.0/3.0) * Math.PI * Math.pow(radius, 3));
	}
	
	public void calcSurfArea() {
		// SA = 4PIr^2
		surfArea = (4.0 * Math.PI * Math.pow(radius, 2));
	}
}
