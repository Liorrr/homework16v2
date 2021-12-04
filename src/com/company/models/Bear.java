package com.company.models;

public abstract class Bear {
	private int age;
	private Color furColor;
	private int weight;
	private boolean isHostile;

	public Bear(int age, Color furColor, int weight, boolean isHostile) {
		this.age = age;
		this.furColor = furColor;
		this.weight = weight;
		this.isHostile = isHostile;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Color getFurColor() {
		return furColor;
	}

	public void setFurColor(Color furColor) {
		this.furColor = furColor;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isHostile() {
		return isHostile;
	}

	public void setHostile(boolean hostile) {
		isHostile = hostile;
	}

	public abstract void eat();
	public abstract void sleep();


}
