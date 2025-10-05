//Codigo do Retangulo
package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area(){
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width*width + height*height);
	}
	
}

//Codigo Principal
package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Program{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle react = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		react.width = sc.nextDouble();
		react.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", react.area());
		System.out.printf("PERIMETER = %.2f%n", react.perimeter());
		System.out.printf("DIAGONAL = %.2f", react.diagonal());
		
		sc.close();
	}
}
