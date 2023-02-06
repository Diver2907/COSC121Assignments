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
        System.out.println("Before");
        for (int i=0; i<shapes2.length;i++){
            System.out.println(shapes2[i].getArea());
        }
        System.out.println("\nAfter");
        for(int i=1; i<shapes2.length;i++){
            double areaItem = shapes2[i].getArea();
            int j = i-1;
            while(j>=0 && shapes2[j].getArea()>areaItem){
                shapes2[j+1] = shapes2[j];
                j-=1;
            }
            shapes2[j+1] = shapes2[i];
        }
        for (int i=0; i<shapes2.length;i++){
            System.out.println(shapes2[i].getArea());
        }
    }
}
