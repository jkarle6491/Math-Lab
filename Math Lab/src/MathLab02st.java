
// MathLab02st.java
// The Rational Class Program I
// This is the student, starting version of the MathLab02 assignment.

import java.awt.font.NumericShaper.Range;

import javax.swing.JOptionPane;

public class MathLab02st {
	public static void main(String args[]) {
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator ");
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational r = new Rational(num, den);
		JOptionPane.showMessageDialog(null,r.getOriginal() + " equals " + r.getDecimal() + " which reduces to " + r.getRational());

		System.exit(0);
	}
}

class Rational {
	private int num, den, oNum, oDen;

	// Rational
	public Rational(int n, int d) {
		num = oNum = n;
		den = oDen = d;
		reduce();
	}

	// getNum
	public int getNum() {
		return num;
	}

	// getDen
	public int getDen() {
		return den;
	}

	// getDecimal
	public double getDecimal() {
		System.out.println(num + " " + den);
		System.out.println(oNum + " " + oDen);

		return (double) num / den;
		
	}

	// getRational 		
	public String getOriginal() {
		return oNum + "/" + oDen;
	}

	public String getReduceNum() {
		int gcf = getGCF(num, den);
		int numw = (num / gcf);
		return Integer.toString(numw);
	}
	
	public String getReduceDen(int den, int gcf) {
		int denw = (den / gcf);
		return Integer.toString(denw);
	}

	// getOriginal
	public String getRational() {
		return (num) + "/" + (den);
	}

	// reduce
	public void reduce()
	{
		int gcf = getGCF(oNum, oDen);
		System.out.println(gcf);
		num = oNum/gcf;
		den = oDen/gcf;
	}

	private int getGCF(int n1,int n2)
	{
		int rem = 0;
		int gcf = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	} 

}
