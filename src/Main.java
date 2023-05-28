public class Main {
    public static void printSeparator() {
        System.out.println("=========================================================================================");
    }

    public static void main(String[] args) {
        printSeparator();
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 50,
                40, 60, 50, 42);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 31,
                25, 37, 70, 34);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 12,
                18,30, 27, 20);
        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        printSeparator();

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 41,
                36,67, 49, 40);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 60,
                43,45, 51, 64);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 27,
                30,31, 27, 21);

        System.out.println(zachariasSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinchFletchley);
        printSeparator();

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 35, 21,
                        45, 12, 43, 42);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 61, 42,
                        70, 67, 41, 90);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 12, 19,
                        31, 24, 26, 30);

        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        printSeparator();

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 45, 40,
                        30, 51, 90, 14, 100);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", 22, 20,
                        10, 15, 1, 1, 50);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 16, 18,
                        15, 20, 10, 7, 39);

        System.out.println(dracoMalfoy);
        System.out.println(grahamMontagu);
        System.out.println(gregoryGoyle);
        printSeparator();

        PrintService printService = new PrintService();
        printService.compareGryffindor(harryPotter,hermioneGranger);
        printService.compareGryffindor(hermioneGranger,ronWeasley);
        printService.compareHufflepuff(zachariasSmith,cedricDiggory);
        printService.compareHufflepuff(justinFinchFletchley,cedricDiggory);
        printService.compareRavenclaw(zhouChang,padmaPatil);
        printService.compareRavenclaw(marcusBelby,zhouChang);
        printService.compareSlytherin(dracoMalfoy,gregoryGoyle);
        printService.compareSlytherin(grahamMontagu,gregoryGoyle);
        printSeparator();
        printService.compareAllHogwarts(harryPotter,dracoMalfoy);
        printService.compareAllHogwarts(zhouChang,cedricDiggory);
        printService.compareAllHogwarts(hermioneGranger,padmaPatil);
        printSeparator();
    }
}