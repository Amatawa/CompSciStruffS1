import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;

public class Calculator implements ActionListener {

    // class vars aka instance variables aka field variables

    JFrame frame;
    JTextField textField;
    // buttons 0 - 9, add, subtract, multiply, divide, equals, clear, backspace
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub, bmul, bdiv, beq, bclr, bksp, bsqr, bcbe, bsqt,
            blog, bPx, bln;
    String subScrpt1 = "\u2081";
    String subScrpt0 = "\u2080";

    Double firstNumber;
    Double secondNumber;
    int operator;
    Double result;

    // constructor
    Calculator() {
        frame = new JFrame("Calculator - Sylar Smith");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(221, 255, 252));

        textField = new JTextField();
        textField.setBounds(30, 40, 350, 30);
        frame.add(textField);

        bclr = new JButton("CLR");
        bclr.setBounds(30, 380, 95, 40);
        bclr.setBackground(new Color(255, 15, 15));
        bclr.setForeground(Color.WHITE);
        frame.add(bclr);
        bksp = new JButton("BACK");
        bksp.setBounds(135, 380, 95, 40);
        bksp.setBackground(new Color(255, 15, 15));
        bksp.setForeground(Color.WHITE);
        frame.add(bksp);

        b7 = new JButton("7");
        b7.setBounds(30, 100, 60, 40);
        frame.add(b7);
        b4 = new JButton("4");
        b4.setBounds(30, 170, 60, 40);
        frame.add(b4);
        b1 = new JButton("1");
        b1.setBounds(30, 240, 60, 40);
        frame.add(b1);
        bdec = new JButton(".");
        bdec.setBounds(30, 310, 60, 40);
        bdec.setBackground(new Color(81, 204, 77));
        frame.add(bdec);

        b8 = new JButton("8");
        b8.setBounds(100, 100, 60, 40);
        frame.add(b8);
        b5 = new JButton("5");
        b5.setBounds(100, 170, 60, 40);
        frame.add(b5);
        b2 = new JButton("2");
        b2.setBounds(100, 240, 60, 40);
        frame.add(b2);
        b0 = new JButton("0");
        b0.setBounds(100, 310, 60, 40);
        frame.add(b0);

        b9 = new JButton("9");
        b9.setBounds(170, 100, 60, 40);
        frame.add(b9);
        b6 = new JButton("6");
        b6.setBounds(170, 170, 60, 40);
        frame.add(b6);
        b3 = new JButton("3");
        b3.setBounds(170, 240, 60, 40);
        frame.add(b3);
        beq = new JButton("=");
        beq.setBounds(170, 310, 60, 40);
        beq.setBackground(new Color(81, 204, 77));
        frame.add(beq);

        bdiv = new JButton("/");
        bdiv.setBackground(new Color(255, 207, 173));
        bdiv.setBounds(240, 100, 60, 40);
        frame.add(bdiv);
        bmul = new JButton("*");
        bmul.setBackground(new Color(255, 207, 173));
        bmul.setBounds(240, 170, 60, 40);
        frame.add(bmul);
        badd = new JButton("+");
        badd.setBackground(new Color(255, 207, 173));
        badd.setBounds(240, 240, 60, 40);
        frame.add(badd);
        bsub = new JButton("-");
        bsub.setBackground(new Color(255, 207, 173));
        bsub.setBounds(240, 310, 60, 40);
        frame.add(bsub);
        bln = new JButton("ln(");
        bln.setBounds(240, 380, 60, 40);
        bln.setBackground(new Color(255, 158, 158));
        frame.add(bln);

        bPx = new JButton("^x");
        bPx.setBounds(310, 100, 70, 40);
        bPx.setBackground(new Color(248, 255, 163));
        frame.add(bPx);
        bcbe = new JButton("^3");
        bcbe.setBounds(310, 170, 70, 40);
        bcbe.setBackground(new Color(248, 255, 163));
        frame.add(bcbe);
        bsqr = new JButton("^2");
        bsqr.setBounds(310, 240, 70, 40);
        bsqr.setBackground(new Color(248, 255, 163));
        frame.add(bsqr);
        bsqt = new JButton("√");
        bsqt.setBounds(310, 310, 70, 40);
        bsqt.setBackground(new Color(248, 255, 163));
        frame.add(bsqt);
        blog = new JButton("log" + subScrpt1 + subScrpt0);
        blog.setBounds(310, 380, 70, 40);
        blog.setBackground(new Color(255, 158, 158));
        frame.add(blog);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(410, 500);
        frame.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bcbe.addActionListener(this);
        bsqr.addActionListener(this);
        bsqt.addActionListener(this);
        blog.addActionListener(this);
        bln.addActionListener(this);
        bPx.addActionListener(this);
        beq.addActionListener(this);
        bdec.addActionListener(this);
        bksp.addActionListener(this);
        bclr.addActionListener(this);

    }

    // Listener -- waiting for an event, mouse click, mouse over...
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            textField.setText(textField.getText().concat("1"));
        if (e.getSource() == b2)
            textField.setText(textField.getText().concat("2"));
        if (e.getSource() == b3)
            textField.setText(textField.getText().concat("3"));
        if (e.getSource() == b4)
            textField.setText(textField.getText().concat("4"));
        if (e.getSource() == b5)
            textField.setText(textField.getText().concat("5"));
        if (e.getSource() == b6)
            textField.setText(textField.getText().concat("6"));
        if (e.getSource() == b7)
            textField.setText(textField.getText().concat("7"));
        if (e.getSource() == b8)
            textField.setText(textField.getText().concat("8"));
        if (e.getSource() == b9)
            textField.setText(textField.getText().concat("9"));
        if (e.getSource() == b0)
            textField.setText(textField.getText().concat("0"));
        if (e.getSource() == bdec)
            textField.setText(textField.getText().concat("."));

        if (e.getSource() == bclr)
            textField.setText("");
        if (e.getSource() == bksp) {
            // s is what is on the text field
            String s = textField.getText();
            // clear text field
            textField.setText("");
            // for every character in s minus one,
            for (int i = 0; i < s.length() - 1; i++)
                // add that character from s into the text field
                textField.setText(textField.getText() + s.charAt(i));
        }

        if (e.getSource() == badd) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 1;
            textField.setText("");
        }
        if (e.getSource() == bsub) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 2;
            textField.setText("");
        }
        if (e.getSource() == bmul) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 3;
            textField.setText("");
        }
        if (e.getSource() == bdiv) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 4;
            textField.setText("");
        }
        if (e.getSource() == bsqr) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 5;
            textField.setText(firstNumber + "^2");
        }
        if (e.getSource() == bcbe) {
            firstNumber = Double.parseDouble(textField.getText());
            textField.setText(firstNumber + "^3");
            operator = 6;
        }
        if (e.getSource() == bsqt) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 7;
            textField.setText("√" + firstNumber);
        }
        if (e.getSource() == blog) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 8;
            textField.setText("");
            textField.setText(textField.getText().concat("log" + subScrpt1 + subScrpt0 + "(" + firstNumber));
        }
        if (e.getSource() == bln) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 9;
            textField.setText("");
            textField.setText(textField.getText().concat("ln(" + firstNumber));
        }
        if (e.getSource() == bPx) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = 10;
            textField.setText("");
        }
        if (e.getSource() == beq) {

            switch (operator) {
            case 1:
                secondNumber = Double.parseDouble(textField.getText());
                result = firstNumber + secondNumber;
                break;
            case 2:
                secondNumber = Double.parseDouble(textField.getText());
                result = firstNumber - secondNumber;
                break;
            case 3:
                secondNumber = Double.parseDouble(textField.getText());
                result = firstNumber * secondNumber;
                break;
            case 4:
                secondNumber = Double.parseDouble(textField.getText());
                result = firstNumber / secondNumber;
                break;
            case 5:
                result = Math.pow(firstNumber, 2);
                break;
            case 6:
                result = Math.pow(firstNumber, 3);
                break;
            case 7:
                result = Math.pow(firstNumber, 0.5);
                break;
            case 8:
                result = Math.log10(firstNumber);
                break;
            case 9:
                result = Math.log(firstNumber);
                break;
            case 10:
                secondNumber = Double.parseDouble(textField.getText());
                result = Math.pow(firstNumber, secondNumber);
                break;
            default:
                result = 0d;
            } // end of switch
            textField.setText("" + result);
        } // end of beq if statement

    } // end of actionPremformed

    // Handler methods

} // end of calculator class



