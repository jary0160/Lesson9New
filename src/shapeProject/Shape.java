
package shapeProject;


import TurtleGraphics.Pen;

//abstract = cant make direct objects from Shape class
abstract public  class Shape {
    
    protected double xPos, yPos;
    
    public Shape(){
        xPos=0;
        yPos=0;
    }
    
    public Shape (double xp, double yp){
        xPos=xp;
        yPos=yp;
    }
    
    //all shapes have area but its different for each
    //mus deckare that dact here
    //must ak emehtod abstarct
    //abstarct mthod is decared like it is in interface 
    //must be difened by child class
    abstract public double area();
    abstract public double perimeter(double circumference, double diameter);
     
    abstract public void draw(Pen p);
    abstract public void stretchBy (double factor);
    
    
    final public double getXPos() {
        return xPos;
    }

 
    final public double getYPos() {
        return yPos;
    }


    final public void move(double xLoc, double yLoc) {
        xPos=xLoc;
        yPos=yLoc;
    }

    
  
    public String toString(){
        String str = ("(x,y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area();
        return str;
    }
    
}
