import javax.swing.JOptionPane;

public class Cuboid {
	private double sideA, sideB, sideC;
	private double volume, surfArea;
	
	public Cuboid() {
		setVarsToZero();
	} // end Cuboid
	
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		volume = 0.0;
		surfArea = 0.0;
	} // end setVarsToZero()
	
	public void showVars() {
		String msg = 
			"length = " + sideA + "  width= " + sideB + "  height = " + sideC
			+ "  Volume = " + volume + "  Surface Area = " + surfArea;
		JOptionPane.showMessageDialog(null, msg);
	} // end showVars()
	
	public void getVariables() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for the length"));
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for the width"));
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Enter a value for the height"));
	} // end getVariables
	
	public void calcSurfArea() {
		// 2lw + 2lh + 2hw
		// Side A = L
		// Side B = W
		// Side C = H
		surfArea = (2 * sideA * sideB) + (2 * sideA * sideC) + (2 * sideB * sideC);
	}
	public void calcVolume() {
		volume = sideA * sideB * sideC;
	}
}
