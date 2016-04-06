package sample;

public class Calculator {
	private int result = 0;
	
	public void add(int n1, int n2){
		this.result = n1 + n2;
	}
	public int getResult(){
		return this.result;
	}
}
