public class AreaofRect{

    public static int perimeter(double length,float width){

        double peri= 2*(length+width);
        return (int) peri;
    }
    public static void main(String[]args){
        double length= 5.23d;
        float width=9.73f;
        int result= perimeter(length,width);

        System.out.println("Perimeter of rectangle is"+result);
    }



}
