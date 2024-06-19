public class Logical {
    public static void main(String[]args){
        int x= 50;
        int y=60;
        boolean z=(x<100&&y<100);
        boolean a=(x!=50);
        boolean b=(x>40||y>100);
        System.out.println("Result: "+z+","+a+","+b);
    }
}