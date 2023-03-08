package A5;

public class Q1 {
    public static void main(String[] args){
        function(5);
    }
    public static double function(int i){
        if(i>0){
            double result = ((1.0/(2*i))+(function(i-1)));
            System.out.printf("i = %d f(i) = %.2f \n",i,result);
            return result;
        }else{
            return 0;
        }
    }
}
