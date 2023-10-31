package exceptions;
class WeaponException extends Exception {
    private String name;
    private String weapon;

    public WeaponException(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void attack() throws WeaponException {
        if (weapon.isEmpty()) {
            throw new WeaponException(name, "I refuse to fight with my bare hands.");
        } else if (name.equals("Warrior")) {
            throw new WeaponException(name, "A " + weapon + "?? What should I do with this?!");
        } else if (name.equals("Mage")) {
            throw new WeaponException(name, "I don't need this stupid " + weapon + "! Don't misjudge my powers!");
        }
    }

    public void tryToAttack() {
        try {
            attack();
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getMessage() {
        return "[" + name + "]: " + super.getMessage();
    }
}

