/**
 * Created by rush on 8/4/16.
 */
public class Main {
    public static void main(String[] args) {
        //Calls to the Duck class and creates two new instances
        Duck myDuck = new Duck();
        Duck myDuck2 = new Duck();


        int age = myDuck.age;
        System.out.println("Duck age is " + age);

        //Calling a method from duck and displays the ducks fate
        myDuck.homeBound(false);
    }
}

