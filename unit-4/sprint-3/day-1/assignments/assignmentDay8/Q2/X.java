package com.assignmentDay8.Q2;

public interface X {
	
    public abstract	void methodAbstractX1();
    
    default void methodDefaultX() {
    	System.out.println("inside methodDefaultX of X ");
    }
    
    public static void methodStaticX() {
    	System.out.println("insidemehodStaticX of X ");
    }
    

}
