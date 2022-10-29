interface creatureActions {
   public void die();
   public void reproduce();
   public void hibernate();
   public void speech();
}

interface world {
    public void createCreature();
    public void climate();
}

class Creature implements creatureActions {
    public void die(){
        System.out.println("That sucks. You've died!");
    }
    public void reproduce(){
        System.out.println("Huzzah! You've reproduced!");
    }
    public void hibernate(){
        System.out.println("You've hibernated");
    }
    public void hibernate(int days){
        System.out.println("You've hibernated for"+ days + "days!");
    }
    public void speech(){
        System.out.println("You said... something.");
    }
    public void speech(String spoken){
        System.out.println("You said:"+ spoken);
    }
}

class Habitat implements world {
    public void createCreature(String creatureName){
        System.out.println("The world has created"+ creatureName + "out of thin air!");
    }
    public void climate(String climateType){
        System.out.println("The climate is"+ climateType);
    } 
}

public int rollDice() {
    return random.nextInt(20); //dice roller to help make chances of spwaning and/or dying
}

public class Game3 {
    public static void main (String[] args) {
    
    }
}