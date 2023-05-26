import java.util.Objects;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String student, int magicPower, int transgressionDistance,
                      int nobility, int honor, int courage) {
        super(student, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public static void compareAllStudents(Gryffindor[] gryffindors) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for(int i = 0; i < gryffindors.length; i++){
            Gryffindor gryffindor = gryffindors[i];
            sum1 = gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getCourage();
            if(sum < sum1){
                sum = sum1;
                number = i;
            }
        }
        System.out.println(gryffindors[number].getStudent() + " лучший студент на факультете Грифиндор");
    }
}
