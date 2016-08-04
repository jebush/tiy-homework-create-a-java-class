/**
 * Created by rush on 8/4/16.
 */
public class Duck {
    String duckName;
    String duckType;
    int age;
    int numberFeather;
    boolean makesItHome;

    public void homeBound(boolean homes){
        if (homes == true){
        makesItHome = true;

        System.out.println("The duck will go home");}
        else {
            System.out.println("The duck will go home with a Hunter");
        }
    }

    public String toString(){

        return "";
    }

}
