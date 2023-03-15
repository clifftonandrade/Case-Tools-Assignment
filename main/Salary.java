
package main;

public class Salary {
	

	// Static field to hold basic pay
	private static int basicPay;

	/**

	Creates a Salary object with basic pay set to zero.
	*/
	public Salary() {
	basicPay = 0;
	}
	/**

	Sets the value of basic pay.
	@param bP the new value of basic pay
	*/
	public static void setBasicPay(int bP) {
	basicPay = bP;
	}
	/**

	Calculates the dearness allowance based on the current basic pay.
	@return the dearness allowance
	*/
	public double calDA() {
	return basicPay * 0.73;
	}
	/**

	Calculates the house rent allowance based on the current basic pay.
	@return the house rent allowance
	*/
	public double calHRA() {
	return basicPay * 0.1;
	}
	/**

	Calculates the gross salary based on the current basic pay, dearness allowance,
	and house rent allowance.
	@return the gross salary
	*/
	public double calGrossSalary() {
	return basicPay + calDA() + calHRA();
	}
	/**

	Calculates the income tax based on the current gross salary.
	@return the income tax
	*/
	public double calIncomeTax() {
	return calGrossSalary() * 0.3;
	}
	/**

	Calculates the net pay based on the current gross salary and income tax.
	@return the net pay
	*/
	public double calNetPay() {
	return calGrossSalary() - calIncomeTax();
	}
	}


