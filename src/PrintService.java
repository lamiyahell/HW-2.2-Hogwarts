public class PrintService {

    public void compareGryffindor(Gryffindor first, Gryffindor second) {
        int firstSum = first.getCourage() + first.getHonor() + first.getNobility();
        int secondSum = second.getCourage() + second.getHonor() + second.getNobility();

        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Гриффиндорец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Гриффиндорец, чем " + first.getStudent());
        } else {
            System.out.println(second.getStudent() + " равен " + first.getStudent());
        }
    }

    public void compareHufflepuff(Hufflepuff first, Hufflepuff second) {
        int firstSum = first.getDiligence() + first.getHonesty() + first.getLoyalty();
        int secondSum = second.getDiligence() + second.getHonesty() + second.getLoyalty();

        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Пуффендуец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Пуффендуец, чем " + first.getStudent());
        } else {
            System.out.println(second.getStudent() + " равен " + first.getStudent());
        }
    }

    public void compareRavenclaw(Ravenclaw first, Ravenclaw second) {
        int firstSum = first.getCreativity() + first.getWit() + first.getWisdom() + first.getIntelligence();
        int secondSum = second.getCreativity() + second.getWit() + second.getWisdom() + second.getIntelligence();

        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Когтевранец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Когтевранец, чем " + first.getStudent());
        } else {
            System.out.println(second.getStudent() + " равен " + first.getStudent());
        }
    }

    public void compareSlytherin(Slytherin first, Slytherin second) {
        int firstSum = first.getAmbition() + first.getCunning() + first.getResourcefulness()
                + first.getDetermination() + first.getLustForPower();
        int secondSum = second.getAmbition() + second.getCunning() + second.getResourcefulness()
                + second.getDetermination() + second.getLustForPower();

        if (firstSum > secondSum) {
            System.out.println(first.getStudent() + " лучший Слизеринец, чем " + second.getStudent());
        } else if (secondSum > firstSum) {
            System.out.println(second.getStudent() + " лучший Слизеринец, чем " + first.getStudent());
        } else {
            System.out.println(second.getStudent() + " равен " + first.getStudent());
        }
    }

    public void compareAllHogwarts(Hogwarts first, Hogwarts second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getStudent() + " обладает большей мощностью магии, чем " + second.getStudent());
        } else if (second.getMagicPower() > first.getMagicPower()) {
            System.out.println(second.getStudent() + " обладает большей мощностью магии, чем " + first.getStudent());
        } else {
            System.out.println(second.getStudent() + " равен по мощности магии с " + first.getStudent());
        }

        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.println(first.getStudent() + " обладает большим расстоянием трансгрессии, чем "
                    + second.getStudent());
        } else if (second.getTransgressionDistance() > first.getTransgressionDistance()) {
            System.out.println(second.getStudent() + " обладает большим расстоянием трансгрессии, чем "
                    + first.getStudent());
        } else {
            System.out.println(second.getStudent() + " равен по расстоянию трансгрессии с " + first.getStudent());
        }
    }
}
