package A2;
//import java.util.Arrays;
public class ShapeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Shape[] shapes1 = new Shape[5];
        shapes1[0] = new Rectangle("Red",true,7,19){};
        shapes1[1] = new Rectangle("Blue",false,7,4){};
        shapes1[2] = new Rectangle("Green",true,6.9,42.0){};
        shapes1[3] = new Hexagon("Yellow",true,7.4){};
        shapes1[4] = new Hexagon("Pink",false,5){};

        double totalArea1 = 0;
        for(Shape shapes:shapes1){
            totalArea1 += shapes.getArea();
        }
        System.out.println("Total area for shapes in 'shapes1' is: "+totalArea1);

        Shape[] shapes2 = new Shape[5];
        for (int i=0; i<shapes1.length;i++){
            shapes2[i] = (Shape) shapes1[i].clone();
        }
        System.out.println("shapes1 has been cloned to shapes2.");
        for(int i=0; i<shapes2.length-1;i++){
            for(int j=0;j<shapes2.length-i-1;j++){
                double area1 = shapes2[j].getArea();
                double area2 = shapes2[j+1].getArea();
                Shape temp = shapes2[j];
                if(area1>area2){
                    shapes2[j] = shapes2[j+1];
                    shapes2[j+1] = temp;
                }
            }
        }
        System.out.println("shapes2 has been reordered!");

        System.out.println("Areas in shapes1\tAreas in shapes2");
        for(int i=0;i<shapes1.length;i++){
            System.out.printf("%3.2f\t\t\t%3.2f\n",shapes1[i].getArea(),shapes2[i].getArea());
        }
    }
}
