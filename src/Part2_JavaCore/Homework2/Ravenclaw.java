package Part2_JavaCore.Homework2;

public class Ravenclaw extends Hogwarts{

    private int intelligence;
    private int knowledge;
    private int creativity;
    private int wit;

    public Ravenclaw(String name, int spellPower, int apparitionDistance, int intelligence, int knowledge, int creativity, int wit) {
        super(name, spellPower, apparitionDistance);
        this.intelligence = intelligence;
        this.knowledge = knowledge;
        this.creativity = creativity;
        this.wit = wit;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWit() {
        return wit;
    }

    @Override
    public String toString() {
        return "Ravenclaw" + super.toString()+"{" +
                "intelligence=" + intelligence +
                ", knowledge=" + knowledge +
                ", creativity=" + creativity +
                ", wit=" + wit +
                '}';
    }
}
