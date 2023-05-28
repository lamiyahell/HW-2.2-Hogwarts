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

    @Override
    public String toString() {
        return "Gryffindor{" + "student=" + getStudent() + ", magicPower=" + getMagicPower() +
                ", transgressionDistance=" + getTransgressionDistance() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                "}";
    }
}
