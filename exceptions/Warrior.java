public class Warrior extends Character {
    public Warrior(String name, String weapon) {
        super(name, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) throws WeaponException {
        if (weapon.isEmpty()){
            throw new WeaponException(name + ": I refuse to fight with my bare hands.");
        }
        else {
            super.attack(weapon); 
            System.out.println(name + ": Feel the power of my magic!");    
        }
    }


    @Override
    public void moveRight() {
        System.out.println(name + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(name + ": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(name + ": moves back like a bad boy.");
    }
}
