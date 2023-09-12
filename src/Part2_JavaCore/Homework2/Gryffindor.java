package Part2_JavaCore.Homework2;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int spellPower, int apparitionDistance, int nobility, int honor, int courage) {
        super(name, spellPower, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;

    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return
                "Gryffindor" + super.toString() + "{" +
                        "nobility=" + nobility +
                        ", honor=" + honor +
                        ", courage=" + courage +
                        '}';
    }

    public void studentСomparisonGryffindor(Gryffindor gryffindor) {

        int sumPoints1 = nobility + honor + courage;
        int sumPoints2 = gryffindor.nobility + gryffindor.honor + gryffindor.courage;
        if (sumPoints1 > sumPoints2) {
            System.out.println("Лучший ученик - " + getName());
        } else {
            System.out.println("Лучший ученик - " + gryffindor.getName());
        }
        if (sumPoints1 == sumPoints2) {
            System.out.println("Силы учеников" + gryffindor.getName() + " и " + getName() + "равны");
        }
    }


}
