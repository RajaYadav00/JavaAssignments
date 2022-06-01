package com.masai;

public class PresentationBean {
	
	private ServiceBean s;

	
	
	public void setS(ServiceBean s) {
		this.s = s;
	}



	public int presentationSum(int x, int y) {
		System.out.println("inside presentation layer layer");
		
	  return	 s.serviceSum(x, y);
	}
	
	
	public int presentationMultiplication(int x, int y) {
		return s.serviceMultiplication(x, y);
	}
	
	public int presentationSub(int x, int y) {
		return s.serviceSub(x, y);
	}
	
	
}
