package mermy.plasur;

/**
 * Created by Mermy on 25.01.2015.
 */
public class Player {

    public String name = ""; // what's the name?

    public int age = 0; // how old is the player. can be used later
    public int hungry = 100; // is the player hungry?
    public int health = 100;

    public Player() {
    }

    public Player(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
