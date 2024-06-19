public class elsestatement {
    public static void main(String[]args){
        int x=20;
        String result=(x<30)? "Good morning":"Good evening";
        System.out.println(result);
        if(x<30){
            System.out.println("Good morning");
        }
        else {
            System.out.println("Good evening");
        }
        int doorcode=38564;
        int y=38564;
        if(y!=doorcode){
            System.out.println("Wrong code");
        } else{
            System.out.println("Correct code");
        }
    }
}