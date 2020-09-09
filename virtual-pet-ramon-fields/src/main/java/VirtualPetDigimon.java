//package PACKAGE_NAME;
//Constructor
public class VirtualPetDigimon {
    //Fields
    private int hunger = 100;
    private int thirst = 100;
    private int boredom = 75;
    private int tiredness = 50;
    private String status = "";
    private String menu = "";
    //Getters and Setters
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getTiredness() {
        return tiredness;
    }
    public String getStatus() {
        return status;
    }
    public String getMenu() {
        return menu;
    }
    //Methods
    public void feed() {
        this.hunger -=25;
        this.thirst +=10;
        this.boredom +=10;
        this.tiredness +=25;
    }
    public void quenchThirst() {
        this.thirst -=25;
        this.hunger +=10;
        this.boredom +=10;
        this.tiredness +=10;
    }
    public void digivolve() {
        this.boredom -=50;
        this.hunger +=100;
        this.thirst +=50;
        this.tiredness +=100;
    }
    public void rest() {
        this.tiredness -=50;
        this.hunger +=25;
        this.thirst +=10;
        this.boredom -=10;
    }
    public String status() {
        System.out.println("Hunger: " + this.getHunger());
        System.out.println("Thirst: " + this.getThirst());
        System.out.println("Boredom: " + this.getBoredom());
        System.out.println("Tiredness: " + this.getTiredness());
        return status;
    }
    public String menu() {
        System.out.println("Press 1 to Feed");
        System.out.println("Press 2 to Quench thirst");
        System.out.println("Press 3 to Digivolve");
        System.out.println("Press 4 to Rest");
        System.out.println("Press 5 to Exit");
        return menu;
    }
    public void tick() {
        hunger++;
        thirst++;
        boredom++;
        tiredness++;
    }
}
