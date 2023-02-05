package A2;

abstract class Hexagon extends Shape{
    //Attributes
    private double length;
    
    //constructors
    protected Hexagon(){this("White",true,0.0);}
    protected Hexagon(String colour, boolean filled, double length){
        super.setColor(colour);
        super.setFilled(filled);
        setLength(length);
    }
    //Setters and Getters
    public double getLength(){return length;}
    public void setLength(double length){this.length = length;}

    //Methods
    public double getArea(){
        return (3*Math.sqrt(3)*Math.pow(length,2))/2;
    }
    public double getPerimeter(){
        return 6*length;
    }
    public String toString(){
        return "Side length: "+length+". "+super.toString() +"\nArea: "+getArea()+" Perimeter: "+getPerimeter();
    }

    //Clone and Compare
    public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

    public int compareTo(Hexagon hex){
        if (getArea() > hex.getArea() || getPerimeter() > hex.getPerimeter()){
            return 1;
        }
        if (getArea() < hex.getArea() || getPerimeter() < hex.getPerimeter()){
            return -1;
        }
        return 0;
    }
}