package br.com.rocha.math;

public class SimpleMath {
	public Double sum(Double numberOne,Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public Double multiplication(Double numberOne, Double numberTwo){
		return numberOne * numberTwo;
	}
	
	public Double division(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public Double mean(Double numberOne, Double numberTwo,Double numberThree){
		return (numberOne + numberTwo + numberThree) / 3;
	}
	
	public Double squareRoot(Double number) {
		return Math.sqrt(number);
	}

}
