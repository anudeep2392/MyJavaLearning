public class IncrementDecrement {

    public static  void main(String[] args){

        int a = 25;

        int result = a++;

        System.out.println("Post increment: " + result);


        int result2 = ++a;

        System.out.println("Pre increment: " + result2);

        int result3 = a--;

        System.out.println("Post decrement: " + result3);

        int result4 = --a;

        System.out.println("Pre decrement: " + result4);

    }



}
