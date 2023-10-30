public class Example {
    public static void main(String[] args) {
        Character warrior = new Warrior("Jean-Luc", "screwdriver");
        Character mage = new Mage("Robert");

        warrior.tryToAttack("screwdriver");
        mage.tryToAttack("hammer");
        warrior.tryToAttack("hammer");

        try {
            mage.attack("");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }
}
