

public class Functions {

    public static void canTakeNStrings(String[] argslots) {
        for (int i = 0; i < argslots.length; i++) {
            System.out.println(argslots[i]);
        }
    }


    //this function can take n number of integer arguments.
    public static void canTakeNIntegers(int[] argu){
        for(int i =0;i<argu.length;i++) {
            System.out.println(argu[i]);
        }
    }

    public static void threeDots(String ...arg){
        //the below line of code will print the type of arg
        System.out.println(((Object)arg).getClass().getSimpleName());
        //this for loop will print the contents inside the arg variable.
        for(int i =0; i<arg.length;i++){
            System.out.println(arg[i]);
        }
    }
    public static void main(String ...args){
        //widening type casting


        //narrowing type casting



        //let's invoke/call the function
        //it will allow us to pass 0 or more than 1 arguments when function is called
        //lets call the funciton with one argument
        System.out.println("call the funciton with one argument");

        threeDots("Anushree");

        //lets call the same function with 0 argument
        //lets call the same function with 0 argument
        System.out.println("call the funciton with zero argument");
        threeDots();

        //lets call the same function with 5 argument
        //lets call the same function with 5 argument
        System.out.println("call the funciton with five argument");
        threeDots("Anushree","Is","learning","java and ","Git");

//        canTakeNStrings(new String[] {"I","love","laddu"});
//        canTakeNIntegers(new int[]{1, 2, 3});
    }


    }

