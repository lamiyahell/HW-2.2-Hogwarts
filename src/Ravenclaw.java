import java.util.Objects;

public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String student, int magicPower, int transgressionDistance,
                      int intelligence, int wisdom, int wit, int creativity) {
        super(student, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void compareAllStudents(Ravenclaw[] ravenclaws) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for(int i = 0; i < ravenclaws.length; i++){
            Ravenclaw ravenclaw = ravenclaws[i];
            sum1 = ravenclaw.getIntelligence() + ravenclaw.getWisdom()
                    + ravenclaw.getWit() + ravenclaw.getCreativity();
            if(sum < sum1){
                sum = sum1;
                number = i;
            }
        }
        System.out.println(ravenclaws[number].getStudent() + " лучший студент на факультете Когтевран");
    }
}
