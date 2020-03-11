package com.epsilon.assignment.day.two;

public class Cylinder extends Circle {

	double height = 1.0;
	double volume = 1.0;

	public Cylinder() {
		super();
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * getHeight();
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "\nCylinder [getVolume()=" + getVolume() + ", getColor()=" + getColor() + ", getArea()=" + getArea()
				+ "]";
	}

}
