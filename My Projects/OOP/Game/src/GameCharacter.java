import java.util.Random;
public class GameCharacter {
     Random random = new Random();
    private int characterId;

    private String name;
    private int level;
    private  int health;
    private static int totalCharacters=0;

    public GameCharacter(String name, int level, int health) {
        characterId = random.nextInt(100);
        this.name = name;
        this.level = level;
        this.health = health;
        totalCharacters++;
    }


    int getCharacterId(){
        return characterId;
    }
    String GetName(){
        return name;
    }
    int getLevel(){
        return level;
    }
    int getHealth(){
        return health;
    }
    public int getTotalCharacters(){
        return getTotalCharacters();
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health < 0){
            health = 0;
        }
    }
    public void heal(int amount){
        health+=amount;
    }
    public String getInfo(){
        return "CharacterId: " + characterId +
                " Name: " + GetName() +
                " Level: " + getLevel() +
                " Health: " + getHealth() +
                " Total Characters: " + totalCharacters;
    }



}
