package A2;

public abstract class Rectangle extends Shape {
    //Attributes
    private double width;
    private double height;

    //Constructors
    protected Rectangle(){this("White",true,0.0,0.0);}
    protected Rectangle(String colour, boolean filled, double width, double height){
        super.setColor(colour);
        super.setFilled(filled);
        setWidth(width);
        setHeight(height);
    }

    //Setters and Getters and toString
    public double getWidth(){return width;}
    public void setWidth(double width){this.width=width;}

    public double getHeight(){return height;}
    public void setHeight(double height){this.height = height;}

    //Methods
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (2*width)+(2*height);
    }

    public String toString(){
        return super.toString() + "Width: "+width+" Height: "+height+" Area: "+getArea()+" Perimiter: "+getPerimeter();
    }

    //Clone and Compare
    public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

    public int compareTo(Rectangle rect){
        if (getArea() > rect.getArea() || getPerimeter() > rect.getPerimeter()){
            return 1;
        }
        if (getArea() < rect.getArea() || getPerimeter() < rect.getPerimeter()){
            return -1;
        }
        return 0;
    }
}
