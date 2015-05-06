package com.knight;

public class Boss {
	private Person person;
	
	
	public Boss(Person person){
		this.person = person;
	}
	
	public void wantPersonDo(){
		person.work();
	}
	
}
