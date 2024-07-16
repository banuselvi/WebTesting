package org.story;

public class WebTesting {

	private void landTrans() {
		System.out.println("Bus"); 	
	}
	private void seaTrans() {
		System.out.println("Ship");
	}
	private void airTrans(){
		System.out.println("Aero");
	}
	private void india(){
		System.out.println("ind");
	}
	private void USA(){
		System.out.println("Us");
	}
	private void newMethod1() {
		System.out.println("new");
	}
	public static void main(String[] args) {
		WebTesting f=new WebTesting();
		f.landTrans();
		f.airTrans();
		f.seaTrans();
		f.newMethod1();
	}
	}

