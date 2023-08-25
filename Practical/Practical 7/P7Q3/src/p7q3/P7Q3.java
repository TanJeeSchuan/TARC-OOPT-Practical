/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p7q3;

/**
 *
 * @author Tan Jee Schuan
 */
public class P7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparableCircle a = new ComparableCircle(4.00);
        ComparableCircle b = new ComparableCircle(2.00);
        
        if(a.compareTo(b) > 0)
        {
            System.out.println("a is larger");
        }
        else if (a.compareTo(b) < 0)
        {
            System.out.println("b is larger");
        }
        else
            System.out.println("Equal");
            
        a.howToColor();
    }
    
}

class ComparableCircle extends Circle implements Colorable,Comparable{
    ComparableCircle(double radius)
    {
        super(radius);
    }
    
    public void howToColor()
    {
        System.out.println("Colour a circle");
    }
    
    public int compareTo(Object obj)
    {
        Circle cir = (Circle)obj; 
        if(super.getRadius() >  cir.getRadius())
            return 1;
        else if(super.getRadius() <  cir.getRadius())
            return -1;
        else
            return 0;
    }
}

class Circle{
	private double radius;
	
	public Circle(double radius){
		this.radius =  radius;
	}
	public double getRadius(){
		return radius;
	}
	
}

interface Colorable {
  public void howToColor();
}


interface Comparable {
    public int compareTo(Object obj);
}


