
//Предположим, что у нас есть текстовый файл, который выглядит следующим образом:
//        a 1-5: abcdj
//        z 2-4: asfalseiruqwo
//        b 3-6: bhhkkbbjjjb
//        Каждая строчка состоит из требования к паролю и самого пароля. Требование к
//        паролю указывает символ, который должен содержаться в пароле, и сколько раз он
//        должен встречаться. Например, требование в первой строчке означает, что символ "a"
//        должен встречаться от 1 до 5 раз. В примере выше два пароля валидны (1 и 3),
//        потому что удовлетворяют своим требования, 2-й - нет, потому что символ "z" в нем
//        должен встречаться от 2 до 4 раз, но не встречается ни разу.
//        Нужно написать код, который посчитает количество валидных паролей в таком файле
public class TestCruxlab2 {
    public static void main(String[] args) {

        String condition1 = "a 1-5: abcdj"; //The first condition
        String condition2 = "z 2-4: asfalseiruqwo"; //The second condition
        String condition3 = "b 3-6: bhhkkbbjjjb"; //The third condition
        int counter = 0;
        int counter1, counter2, counter3;

        char min = condition1.charAt(2);
        int min1 = Character.digit(min, 10);
        char max = condition1.charAt(4);
        int max1 = Character.digit(max, 10);


        int a = 0;
        for (char element1 : condition1.toCharArray()) {
            if (element1 == 'a') {
                a++;
            }
        }
        a = a - 1;
        if (a >= min1 && a <= max1) {
            System.out.println("1. This password is valid" + " (" +condition1.substring(args.length) + ")");
            counter1 = 1;
        } else {
            System.out.println(
                    "1. This password is not valid" + " ("+condition1.substring(args.length)+")");
           counter1 = 0;
        }

        char zmin = condition2.charAt(2);
        int zmin1 = Character.digit(zmin, 10);
        char zmax = condition2.charAt(4);
        int zmax1 = Character.digit(zmax, 10);


        int z = 0;
        for (char element2 : condition2.toCharArray()) {
            if (element2 == 'z') {
                z++;
            }
        }
        z = z - 1;
        if (z >= zmin1 && z <= zmax1) {
            System.out.println("2. This password is valid" + " (" + condition2.substring(args.length) + ")");
             counter2 = 1;
        } else {
            System.out.println(
                    "2. This password is not valid" + " (" + condition2.substring(args.length) + ")");
             counter2 = 0;
        }

        char bmin = condition2.charAt(2);
        int bmin1 = Character.digit(bmin, 10);
        char bmax = condition2.charAt(4);
        int bmax1 = Character.digit(bmax, 10);


        int b = 0;
        for (char element3 : condition3.toCharArray()) {
            if (element3 == 'b') {
                b++;
            }
        }
        b = b - 1;
        if (b >= bmin1 && z <= bmax1) {
            System.out.println("3. This password is valid" + " (" + condition3.substring(args.length) + ")");
             counter3 = 1;
        } else {
            System.out.println(
                    "3. This password is not valid" + " (" + condition3.substring(args.length) + ")");
           counter3 = 0;
        }

        counter = counter1 + counter2 + counter3;
        System.out.println("Total number of valid passwords: " + counter);

    }

}

