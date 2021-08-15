class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	//static이란 전역. 
	
	public void print() {
		System.out.println("Value of supply : " + +valueOfSupply);	
		System.out.println("VAT : "+  getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getexpense());
		System.out.println("Income : "  + getIncome());
		System.out.println("Dividend 1 : " + getDividend1());
		System.out.println("Dividend 2 : " + getDividend2());
		System.out.println("Dividend 2 : " + getDividend3());
	}

	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getDividend2() {
		return getIncome() * 0.3;
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}

	public double getIncome() {
		return valueOfSupply - getexpense();
	}

	public double getexpense() {
		return valueOfSupply * expenseRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply*vatRate;
	}

}


public class AccoutingClassApp {
	
	public static void main(String[] args) {
		Accounting a0 = new Accounting();
		
		a0.valueOfSupply = 10000.0;
		a0.vatRate = 0.1;
		a0.expenseRate = 0.3;
		a0.print();
		
		//인스턴스ㅓ
		Accounting a1 = new Accounting();
		
		a1.valueOfSupply = 20000.0;
		a1.vatRate = 0.05;
		a1.expenseRate = 0.2;
		a1.print();
		
		Accounting a2 = new Accounting();
		
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();

	}

}