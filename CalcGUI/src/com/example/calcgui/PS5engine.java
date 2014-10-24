package com.example.calcgui;

public class PS5engine {

	public static String futureValue(double investmentAmount, double years, double annualInterestRate){
		String x = "";
		double fv = investmentAmount * (Math.pow(1 + annualInterestRate/100, years));
		x = fv + "";
		return x;
	}
}
