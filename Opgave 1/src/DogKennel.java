import java.sql.Array;
import java.util.Arrays;

public class DogKennel {
    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog(true,"Fido");
        // sæt en ejer
        myDog.setOwner("Eske");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        String[] offSpring = {"Kalle", "palle","fido","Jens"};
        myDog.setOffSpring(offSpring);



        // print alle hvalpe
        String[] myOff = myDog.getOffSpring();
        for (String myD : myOff) {
            System.out.println(myD);
        }
        System.out.println(Arrays.toString(myOff));
        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        myDog.feedDog();
        myDog.feedDog();
        //System.out.println(resString);
    }

}
