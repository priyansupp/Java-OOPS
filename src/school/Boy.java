package school;

public class Boy extends Student {
    private int sportsIndex;

    public Boy(int rollNo, String name,
               int standard, int sportsIndex) {
        super(rollNo, name, standard);      // first pass the params in parent class's constructor
        this.sportsIndex = sportsIndex;     // then instantiate the child class's param
    }

    // overridden method -> Will call this overridden method only
    public void sayHello() {
        System.out.println("Hello Boys");
    }

    // getter
    public int getSportsIndex() {
        return sportsIndex;
    }

    // setter
    public void setSportsIndex(int sportsIndex) {
        this.sportsIndex = sportsIndex;
    }
}
