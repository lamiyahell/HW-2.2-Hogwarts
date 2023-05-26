public class PrintService {

    public void print(Gryffindor[] gryffindors) {
        System.out.println("Грифиндор: " + gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Студент " + gryffindor.getStudent() + ", Сила магии: " + gryffindor.getMagicPower()
                    + ", Расстояние трангрессии: " + gryffindor.getTransgressionDistance()
                    + ", Благодародство: " + gryffindor.getNobility() + ", Честь: "
                    + gryffindor.getHonor() + ", Храбрость: " + gryffindor.getCourage());
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Пуффендуй: " + hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Студент " + hufflepuff.getStudent() + ", Сила магии: " + hufflepuff.getMagicPower()
                    + ", Расстояние трангрессии: " + hufflepuff.getTransgressionDistance()
                    + ", Трудолюбие: " + hufflepuff.getDiligence() + ", Верность: "
                    + hufflepuff.getLoyalty() + ", Честность: " + hufflepuff.getHonesty());
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Когтевран: " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Студент " + ravenclaw.getStudent() + ", Сила магии: " + ravenclaw.getMagicPower()
                    + ", Расстояние трангрессии: " + ravenclaw.getTransgressionDistance()
                    + ", Ум: " + ravenclaw.getIntelligence() + ", Мудрость: "
                    + ravenclaw.getWisdom() + ", Остроумие: " + ravenclaw.getWit()
                    + ", Творчество: " + ravenclaw.getCreativity());
        }
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Слизерин: " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Студент " + slytherin.getStudent() + ", Сила магии: " + slytherin.getMagicPower()
                    + ", Расстояние трангрессии: " + slytherin.getTransgressionDistance()
                    + ", Хитрость: " + slytherin.getCunning() + ", Решительность: "
                    + slytherin.getDetermination() + ", Амбициозность: " + slytherin.getAmbition()
                    + ", Находчивость: " + slytherin.getResourcefulness()
                    + ", Жажда власти: " + slytherin.getLustForPower());
        }
    }
}
