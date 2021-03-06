/**
 * Created by rush on 8/4/16.
 */
public class Main {
    public static void main(String[] args) {
        //Calls to the Duck class and creates two new instances
        Duck myDuck = new Duck("Wood", "Thing", 2, 40);
        Duck myDuck2 = new Duck("MAll", "Thrasing", 4, 1000);

        //These are creating a myDuck variables
        myDuck.duckName = "Woodie";
        myDuck.age = 9;
        myDuck.duckType = "Noodle";


        //This method print out the type of duck it is
        myDuck.typing();

        //Prints out the statement
        System.out.println(myDuck.duckName + "'s age is " + myDuck.age + " years old.");

        //This has an output of banded status
        System.out.println(myDuck);

        //Determines the number of feathers based on age from the method featherFinder
        myDuck.featherFinder(myDuck.age);

        //Calling a method from duck and displays the ducks fate
        myDuck.homeBound(false);

        //
        //These provide a break for readability between each duck
        System.out.println();
        System.out.println();

        //These are creating a myDuck2 variables
        myDuck2.duckName = "Mallard";
        myDuck2.age = 1;
        myDuck2.makesItHome = false;

        //This method print out the type of duck it is
        myDuck2.typing();

        //Prints out the statement
        System.out.println(myDuck2.duckName + "'s age is " + myDuck2.age + " years old.");

        //This has an output of banded status
        System.out.println(myDuck2);

        //Determines the number of feathers based on age from the method featherFinder
        myDuck2.featherFinder(myDuck2.age);

        //Calling a method from duck and displays the ducks fate
        myDuck2.homeBound(true);
    }
}

