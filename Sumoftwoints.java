public class Sumoftwoints{
    public static int Sum( int a, int b){
        return a+b;
    }
    public static void main( String[]args){
        int a= 5;
        int b= 2;
        int result= Sum(a,b);
        System.out.println("Sum is:"+result);

        float c=5.5f;
        float d=2.2f;
        int mulresult= Mul(c,d);
        System.out.println("Product is:"+mulresult);
    }
    public static int Mul(float c, float d){
        return (int) (c*d);

    }

}