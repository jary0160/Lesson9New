
package shapeProject;

import TurtleGraphics.Pen;


public class Triangle extends Shape {
     protected double radius;
    //only avaible here and to child class (parent and child exclusive)
    
    public Triangle(){
        super(); // up to shape
        radius=1;
    }
    public Triangle (double xPos, double yPos, double x2, double y2, double x3, double y3, double r){
        super(xPos,yPos, x2, y2, x3, y3);
        radius=r;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        double side = 2 * Math.PI * radius / 20;
        //120 sided shape
        p.up();
        p.move(xPos,yPos);
        // go to edge
        p.setDirection(0);
        p.move(radius);
        p.setDirection(90);
        p.down();
        for (int i = 1; i <=120; i++) {
            p.move(side);
            p.turn(3); //120 * 3 = 360 degreees            
        }
    }



    @Override
    public void stretchBy(double factor) {
        radius *= factor;
        //radius = factor * radius;
    }
    
    @Override
    public String toString(){
        String  str = "CIRCLE\n";
        str+= "Radius: " + radius + "\n";
       str+= super.toString();
        return str;
        
    }

    @Override
    public double perimeter(double circumference, double diameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
