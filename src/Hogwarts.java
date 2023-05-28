import java.util.Objects;

public class Hogwarts {
    private String student;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String student, int magicPower, int transgressionDistance) {
        this.student = student;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String name) {
        this.student = student;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
