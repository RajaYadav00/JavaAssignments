package com.assignmentDay7.Q1;

public class Demo {
	
	public Animal[] getAnimals() {
		
		Animal[] a = new Animal[3];
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Tiger();
		
		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();

		Animal[] a = d.getAnimals();
		
		for(int i=0;i<a.length;i++) {
			a[i].eat();
			a[i].walk();
			a[i].makeNoise();
			
			if(a[i]instanceof Dog) {
				Dog dog=(Dog)a[i];
				dog.handShake();
			}
		}
	}

}
