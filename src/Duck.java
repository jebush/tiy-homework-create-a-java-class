/**
 * Created by rush on 8/4/16.
 */
public class Duck {
    String duckName;
    String duckType;
    int age;
    int numberFeather;
    boolean makesItHome;

    public void typing(){
        duckType = "Dabbling";
        System.out.println(duckName + " is a " + duckType + " duck.");
    }

    public void featherFinder(int age){
        if (age <= 1){
            int numberFeather = 200;
            System.out.println("The number of feathers that " + duckName + " has is " + numberFeather);
        }
        else if (age <= 2){
            int numberFeather = 340;
            System.out.println("The number of feathers that " + duckName + " has is " + numberFeather);
        }
        else if (age <= 4){
            int numberFeather = 540;
            System.out.println("The number of feathers that " + duckName + " has is " + numberFeather);
        }
        else if (age <= 6){
            int numberFeather = 640;
            System.out.println("The number of feathers that " + duckName + " has is " + numberFeather);
        }
        else {
            int numberFeather = 840;
            System.out.println("The number of feathers that " + duckName + " has is " + numberFeather);
        }

    }

    public void homeBound(boolean homes){
        if (homes == true){
        makesItHome = true;

        System.out.println(duckName + " will go home to Canada!");}
        else {
            System.out.println(duckName + " will go home with a Hunter as a main dinner dish!");
        }
    }

    public String toString(){

        return duckName + " was banded so this is a rare find.";
    }

}
