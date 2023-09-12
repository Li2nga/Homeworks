package Part2_JavaCore.Homework2;

public class Slytherin extends Hogwarts{

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int leadership;

    public Slytherin(String name, int spellPower, int apparitionDistance, int cunning, int determination, int ambition, int resourcefulness, int leadership) {
        super(name, spellPower, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLeadership() {
        return leadership;
    }

    @Override
    public String toString() {
        return "Slytherin" + super.toString()+"{"+
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", leadership=" + leadership +
                '}';
    }
}
