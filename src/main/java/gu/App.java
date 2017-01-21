package gu;

public class App {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		int z = new App().add(5, 3);
	System.out.println("result is :"+z);
	}

}
