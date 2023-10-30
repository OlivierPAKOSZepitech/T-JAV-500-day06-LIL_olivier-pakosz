public abstract class Character {
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;

    protected String RPGClass;

    protected Character (String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.life = 50;
        this.agility = 2;
        this.strength = 2;
        this.wit = 2;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }
    public void attack(String target){
        System.out.println(name + "Rrrrrrrrr....");
    }

    public static void main(String[] args) {
        Character perso = new TestCharacter("Jean-Luc");
        System.out.println(perso.getName());
        System.out.println(perso.getLife());
        System.out.println(perso.getAgility());
        System.out.println(perso.getStrength());
        System.out.println(perso.getWit());
        System.out.println(perso.getRPGClass());
        perso.attack("my weapon");
    }
}

