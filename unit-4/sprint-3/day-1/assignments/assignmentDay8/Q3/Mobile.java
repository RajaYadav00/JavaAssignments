package com.assignmentDay8.Q3;

public class Mobile {

	public void NamesOfPhone(String Name, String... strings) {
		
		String[] outdatedModels = { "note4", "note5", "note6", "note7" };
		
		System.out.println("Company Name : " + Name);
		System.out.println(" ");
		System.out.println("models available");

		for (String x : strings) {
			boolean flage=false;
			for(String y:outdatedModels) {
				if(x==y) {
					flage=true;
					break;
				}
				
			}
			
			if(flage==true) {
				System.out.println(x+" _OUTDATED");
			}else {
				System.out.println(x);
			}
		}
//		for (int i = 0; i < strings.length; i++) {
//			
//			for (int j = 0; j < outdatedModels.length; j++) {
//				
//				if (strings[i].equals(outdatedModels[j])) {
//					System.out.println(strings[i] + );
//				}
//			}
		
	}
	
	public static void main(String[] args) {
		Mobile m=new Mobile();
		String[] x={"galaxy2","A1","S30","note4","s10"};
		
		m.NamesOfPhone("Samsung",x);
	}
}
