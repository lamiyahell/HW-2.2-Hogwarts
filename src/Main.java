public class Main {
    public static void printSeparator() {
        System.out.println("=========================================================================================");
    }

    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 50, 40,
                        60, 50, 42),
                new Gryffindor("Гермиона Грейнджер", 31, 25,
                        37, 70, 34),
                new Gryffindor("Рон Уизли", 12, 18,
                        30, 27, 20)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 41, 36,
                        67, 49, 40),
                new Hufflepuff("Седрик Диггори", 60, 43,
                        45, 51, 64),
                new Hufflepuff("Джастин Финч-Флетчли", 27, 30,
                        31, 27, 21)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 35, 21,
                        45, 12, 43, 42),
                new Ravenclaw("Падма Патил", 61, 42,
                        70, 67, 41, 90),
                new Ravenclaw("Маркус Белби", 12, 19,
                        31, 24, 26, 30)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 45, 40,
                        30, 51, 90, 14, 100),
                new Slytherin("Грехэм Монтегю", 22, 20,
                        10, 15, 1, 1, 50),
                new Slytherin("Шрегори Гойл", 16, 18,
                        15, 20, 10, 7, 39)
        };

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printSeparator();
        printService.print(hufflepuffs);
        printSeparator();
        printService.print(ravenclaws);
        printSeparator();
        printService.print(slytherins);
        printSeparator();
        Gryffindor.compareAllStudents(gryffindors);
        Hufflepuff.compareAllStudents(hufflepuffs);
        Ravenclaw.compareAllStudents(ravenclaws);
        Slytherin.compareAllStudents(slytherins);
        printSeparator();
    }
}