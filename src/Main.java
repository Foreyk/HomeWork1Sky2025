//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1
       double dog = 8;
       var cat = 3.6;
       var paper = 763789;
        System.out.println("Задание 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задание 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задание 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 4
        var friend = 19;
        System.out.println("Задание 4");
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        System.out.println("Задание 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
     System.out.println("Задание 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeightBoxers = weightBoxer1 + weightBoxer2;
        var diffWeightBoxers = totalWeightBoxers % weightBoxer1;
        System.out.println("Общий вес боксеров равен " + totalWeightBoxers + "кг! "
                + "Разница веса между боксерами состовляет " + diffWeightBoxers + "кг!" );

        //Задание 7
     System.out.println("Задание 7");
        var totalJobHours = 640;
        var normalJobHours = 8;
        var totalWorkers = totalJobHours / normalJobHours;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек.");
        totalWorkers = totalWorkers + 94;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего "
                + totalJobHours / totalWorkers + " часов работы может быть поделено между сотрудниками.");



    }
}

