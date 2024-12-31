package school;

public class Girl extends Student{
    int girlyIndex;                         // By default public -> No getter/setter needed

    public Girl(int rollNo, String name,
                int standard, int girlyIndex) {
        super(rollNo, name, standard);      // first pass the params in parent class's constructor
        this.girlyIndex = girlyIndex;       // then instantiate the child class's param
    }

    // no overridden method sayHello() in Girl -> Will call parent's method
}