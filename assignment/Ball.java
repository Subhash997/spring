package com.xworkz.assignment;

public class Ball {
	private String type;
	private double weight;
	private String usedFor;

	public Ball(String type,String usedFor){
		System.out.println("This given string type and string is usedfor");

		this.type=type;
		this.usedFor=usedFor;

	}
	public Ball(String type,double weight){
		System.out.println("the string type and the double weight:");
		this.type=type;
		this.weight=weight;
	}
	public Ball(double weight, String type){
		System.out.println("the given double weight and the string type is");
		this.weight=weight;
		this.type=type; 
	}



	public void display(){
		System.out.println("this ball is used for"+this.usedFor);
	}

	@Override
	public String toString() {
		return "Ball [type=" + type + ", weight=" + weight + ", usedFor=" + usedFor + "]";
	}

}

