public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {

        System.out.println("Задача 1");

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("собак " + dog);
        System.out.println("котов " + cat);
        System.out.println("бумаги " + paper);
    }
    public static void task2() {

        System.out.println("Задача 2");

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("собак " + dog);
        System.out.println("котов " + cat);
        System.out.println("бумаги " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("собак " + dog);
        System.out.println("котов " + cat);
        System.out.println("бумаги " + paper);
    }
    public static void task3() {

        System.out.println("Задача 3");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("собак " + dog);
        System.out.println("котов " + cat);
        System.out.println("бумаги " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("собак " + dog);
        System.out.println("котов " + cat);
        System.out.println("бумаги " + paper);
    }
    public static void task4() {

        System.out.println("Задача 4");

        var friend = 19;

        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {

        System.out.println("Задача 5");

        var frog = 3.5;

        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {

        System.out.println("Задача 6");

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightBoxers = boxer1 + boxer2;

        System.out.println("Общий вес боксёров " + weightBoxers);

    }
    public static void task7() {

        System.out.println("Задача 7");

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightBoxers = boxer1 + boxer2;

        System.out.println("Общий вес боксёров " + weightBoxers);
        var difference1 = boxer2 - boxer1;
        System.out.println("разница в весе" + difference1);
        var difference2 = boxer2 % boxer1;
        System.out.println("разница в весе" + difference2);
    }
    public static void task8(){

        var allWorkingHourse = 640;
        var jobHourseEmployee = 8;
        var numbersEmployee = allWorkingHourse / jobHourseEmployee;

        System.out.println("Если в компании работает " + numbersEmployee + " человек, то всего " + allWorkingHourse + " часов работы может быть поделено между сотрудниками.");
        numbersEmployee = numbersEmployee + 94;
        allWorkingHourse = numbersEmployee * jobHourseEmployee;
        System.out.println("Если в компании работает " + numbersEmployee + " человек, то всего " + allWorkingHourse + " часов работы может быть поделено между сотрудниками.");

    }



}
