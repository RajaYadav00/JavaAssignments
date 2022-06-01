package com.assignmentsDay3;

public class VovelConsonent {
	
	void checkVovelOrConsonent(int x) {
		if(x<'A'||x>'z') {
			System.out.println("Invalid charector");
		}
		else if(x=='a'||x=='e'||x=='i'||x=='0'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
			System.out.println("vovel");
		}else {
			System.out.println("consonent");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			VovelConsonent d1=new VovelConsonent();
			
			d1.checkVovelOrConsonent('a');
			d1.checkVovelOrConsonent('C');
			d1.checkVovelOrConsonent('%');
	}

}
