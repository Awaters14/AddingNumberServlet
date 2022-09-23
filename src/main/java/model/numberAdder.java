package model;

/**  
* @author Alex Waters - Awaters6
* CIS175 - Fall 2021
* Sep 22, 2022  
*/
public class numberAdder {

	private int num1;
	private int num2;
	private int num3;
	private int total;
	
	/**
	 * 
	 */
	public numberAdder() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public numberAdder(int num1, int num2, int num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		AddNumbers();
	}
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	/**
	 * @return the num3
	 */
	public int getNum3() {
		return num3;
	}
	/**
	 * @param num3 the num3 to set
	 */
	public void setNum3(int num3) {
		this.num3 = num3;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void AddNumbers() {
		total = num1+num2+num3;
		setTotal(total);
	}
	
	@Override
	public String toString() {
		return "numberAdder [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", total=" + total + "]";
	}
}
