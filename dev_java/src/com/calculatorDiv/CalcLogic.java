package com.calculatorDiv;

public class CalcLogic {
	CalcDisplay calc = null;
	
	public CalcLogic(CalcDisplay calcDisplay) {
		CalcDisplay calc = calcDisplay;
	}

	public String calcurate(String v1, String v2, String op) {
		double d1 = Double.parseDouble(v1);
		double d2 = Double.parseDouble(v2);
		if("+".equals(op)) {
			return String.valueOf(d1+d2);
		}
		else if("-".equals(op)) {
			return String.valueOf(d1-d2);			
		}
		else if("*".equals(op)) {
			return String.valueOf(d1*d2);						
		}
		else if("/".equals(op)) {
			return String.valueOf(d1/d2);									
		}
		else {
			return "error";
		}
	}///////// end of calcurate //////////

}
