/**
 * Created by rush on 8/4/16.
 */
public class Duck {
    String duckName;
    String duckType;
    int age;
    int numberFeather;
    boolean makesItHome;

    //This is the constructor
    public Duck(String duckName, String duckType, int age, int numberFeather) {
        this.duckName = duckName;
        this.duckType = duckType;
        this.age = age;
        this.numberFeather = numberFeather;

    }

    public void typing(){
        this.duckType = "Dabbling";
        System.out.println(this.duckName + " is a " + this.duckType + " duck.");
    }

    public void featherFinder(int age){
        if (age <= 1){
            this.numberFeather = 203;
            System.out.println("The number of feathers that " + this.duckName + " has is " + this.numberFeather);
        }
        else if (age <= 2){
            this.numberFeather = 344;
            System.out.println("The number of feathers that " + this.duckName + " has is " + this.numberFeather);
        }
        else if (age <= 4){
            this.numberFeather = 567;
            System.out.println("The number of feathers that " + this.duckName + " has is " + this.numberFeather);
        }
        else if (age <= 6){
            this.numberFeather = 698;
            System.out.println("The number of feathers that " + this.duckName + " has is " + this.numberFeather);
        }
        else {
            this.numberFeather = 821;
            System.out.println("The number of feathers that " + this.duckName + " has is " + this.numberFeather);
        }

    }

    public void homeBound(boolean homes){
        if (homes == true){
            this.makesItHome = true;

        System.out.println(this.duckName + " will go home to Canada!");}
        else {
            System.out.println(this.duckName + " will go home with a Hunter as a main dinner dish!");
        }
    }

    public String toString(){

        return this.duckName + " was banded so this is a rare find.";
    }

}
