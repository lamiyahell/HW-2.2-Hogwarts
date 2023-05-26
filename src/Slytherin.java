import java.util.Objects;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String student, int magicPower, int transgressionDistance,
                     int cunning, int determination, int ambition, int resourcefulness,
                     int lustForPower) {
        super(student, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public static void compareAllStudents(Slytherin[] slytherins) {
        int sum = 0;
        int sum1 = 0;
        int number = 0;
        for(int i = 0; i < slytherins.length; i++){
            Slytherin slytherin = slytherins[i];
            sum1 = slytherin.getCunning() + slytherin.getDetermination() + slytherin.getAmbition()
                    + slytherin.getResourcefulness() + slytherin.getLustForPower();
            if(sum < sum1){
                sum = sum1;
                number = i;
            }
        }
        System.out.println(slytherins[number].getStudent() + " лучший студент на факультете Слизерин");
    }
}
