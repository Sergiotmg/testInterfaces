import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Player dan = new Player();
        String test="";
        Person chris = new Person();
        Monster grez = new Monster();
        dan.talkTo(chris); // prints "Hello."
        dan.talkTo(grez); // prints "Grrr!"
        //dan.talkTo(test);
        List<Speaker> speakers=new ArrayList<>();
        speakers.add(chris);
        speakers.add(grez);
        Person chris2 =(Person)speakers.get(0);//encapsulacion de java con casteo
        chris2.test();
    }
}
