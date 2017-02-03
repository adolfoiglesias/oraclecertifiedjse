package javaclassdesign.oop.classfundamentals.accessmodifiers.example.appcanvas;

import javaclassdesign.oop.classfundamentals.accessmodifiers.example.graphicshape.Circle;

public class Canvas {

	
	void getArea() {
		Circle circle = new Circle();
		circle.area(); 	//call to public method area(), outside package
	}
}
