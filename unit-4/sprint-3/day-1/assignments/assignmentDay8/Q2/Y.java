package com.assignmentDay8.Q2;

public interface Y {
	 public abstract	void methodAbstractY1();
	    
	    default void methodDefaultY() {
	    	System.out.println("inside methodDefaultY of Y ");
	    }
	    
	    public static void methodStaticY() {
	    	System.out.println("inside methodDefaultY of Y");
	    }
	    
}
