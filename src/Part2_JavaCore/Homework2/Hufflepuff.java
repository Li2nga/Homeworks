package Part2_JavaCore.Homework2;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int fairPlay;

    public Hufflepuff(String name, int spellPower, int apparitionDistance, int hardWork, int loyalty, int fairPlay) {
        super(name, spellPower, apparitionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.fairPlay = fairPlay;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getFairPlay() {
        return fairPlay;
    }

    @Override
    public String toString() {
        return "Hufflepuff" +super.toString()+ "{"+
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", fairPlay=" + fairPlay +
                '}';
    }

    public void studentСomparisonHufflepuff(Hufflepuff hufflepuff) {

        if (sumPoints() > hufflepuff.sumPoints()) {
            System.out.println("Лучший ученик - " + getName());
        } else if (sumPoints() == hufflepuff.sumPoints()) {
            System.out.println("Силы учеников " + hufflepuff.getName() + " и " + getName() + " равны");
        } else {
            System.out.println("Лучший ученик - " + hufflepuff.getName());
        }

    }

    private int sumPoints() {
        return hardWork + loyalty + fairPlay;
    }

}
