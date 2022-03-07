package org.byk;

public class R15 extends Ktm {

	@Override
	public void rpm() {
		// TODO Auto-generated method stub
		System.out.println(" byk model is yamaha fz ");
	}

	@Override
	public void model() {
		// TODO Auto-generated method stub
		System.out.println("byk rpm is 7000rpm");
	}

	public static void main(String[] args) {
		
		R15 a = new R15();
		a.bykname();
		a.rpm();
		a.model();
		
	}
	
}
