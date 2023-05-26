import java.util.Objects;

public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String student, int magicPower, int transgressionDistance,
                      int diligence, int loyalty, int honesty) {
        super(student, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void compareAllStudents(Hufflepuff[] hufflepuffs) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for(int i = 0; i < hufflepuffs.length; i++){
            Hufflepuff hufflepuff = hufflepuffs[i];
            sum1 = hufflepuff.getDiligence() + hufflepuff.getLoyalty() + hufflepuff.getHonesty();
            if(sum < sum1){
                sum = sum1;
                number = i;
            }
        }
        System.out.println(hufflepuffs[number].getStudent() + " лучший студент на факультете Пуффендуй");
    }
}
