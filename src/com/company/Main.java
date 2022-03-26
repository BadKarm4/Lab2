package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
/*
        List<String> car = new ArrayList();
        car.add("Мерседес");
        car.add("БВМ");
        car.add("Лексус");
        car.add("Тойота");
        car.add("Ауди");
        car.add("Нива");
        car.add("Волга");

        for (String name:car)
        {
            System.out.println(name);
        }

        System.out.println();
        System.out.println(car.get(5));
        System.out.println(car.indexOf("Нива"));
*/

        /*
//ЗАДАНИЕ 3, 4 и 6
        List<Integer> nums = new ArrayList<>(Arrays.asList(23, 43, 23, 216, 53, 23, 4, 6, 23, 45, 67, 2));
        int count1 = 0, count2 = 0, min = nums.get(0), max = nums.get(0);
        for (Integer num : nums) {
            if (num < 45) {
                count1++;
            }
            if (num > 45) {
                count2++;
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Количество элементов, меньших 45: " + count1);
        System.out.println("Количество элементов, больших 45: " + count2);
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

*/
        /*

        //ЗАДАНИЕ 5
        List<String> City = new ArrayList<>(Arrays.asList("LA", "New York", "San Francisco", "Paris", "Moscow", "Tokyo", "Philadelphia"));
        for (int i = 0; i < City.size(); i++)
        {
            System.out.println("В позиции " + i + " содержится " + City.get(i));
        }
        */

//ЗАДАНИЕ 7
/*
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(3,9,2,12,4,5,11,13));
        for (Integer num1 : nums1) {
            System.out.print(num1 + " | ");
        }
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            nums1.set(i, nums1.get(i) + 3);
            sum = sum + nums1.get(i);
        }
        System.out.println();
        for (Integer num1 : nums1) {
            System.out.print(num1 + " | ");
        }
        System.out.println();
        System.out.println("Сумма всех элементов после увеличения на 3: " + sum);
*/
//ЗАДАНИЕ 8
        /*
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(23, 43, 23, 216, 53, 23, 4, 6, 23, 45, 67, 2));
        System.out.println("Первые 4 элемента");
        for (int i = 0; i < 4; i++)
        {
            System.out.print(nums2.get(i) + " | ");
        }
        System.out.println();
        System.out.println("Последние 3 элемента");
        for (int i = nums2.size() - 3; i < nums2.size(); i++)
        {
            System.out.print(nums2.get(i) + " | ");
        }
*/
        //ЗАДАНИЕ 9
        /*
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(23, 43, 23, 216, 53, 23, 4, 6, 23, 45, 67, 2));
        for (int i = 0; i < nums2.size(); i++)
        {
            System.out.print(nums2.get(i) + " | ");
        }
        System.out.println();
        Collections.sort(nums2);
        for (int i = 0; i < nums2.size(); i++)
        {
            System.out.print(nums2.get(i) + " | ");
        }
        */

        /*
//ЗАДАНИЕ 10
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        List<Person> personList = new ArrayList();

        for (int i = 0; i < 10; i++)
        {
            personList.add(new Person());
            personList.get(i).setName(in.nextLine());
            personList.get(i).setAge(random.nextInt(10,30));
            System.out.println("Имя: " + personList.get(i).getName() + " и его возраст: " + personList.get(i).getAge());
        }

        List<Person> personListOver18 = new ArrayList();

        for (int i = 0; i < personList.size(); i++)
        {
            if (personList.get(i).getAge() >= 18)
            {
                personListOver18.add(personList.get(i));
                personList.remove(i);
                i--;
            }
        }

        for (int i = 0; i < personList.size(); i++)
        {
            if (personList.get(i).getAge() >= 18)
            {
                personListOver18.add(personList.get(i));
                personList.remove(i);
            }
        }

        System.out.println("");
        System.out.println("Новый список");
        for (Person person : personListOver18) {
            System.out.println("Имя: " + person.getName() + " и его возраст: " + person.getAge());
        }

        System.out.println("");
        System.out.println("Старый список");
        for (Person person : personList) {
            System.out.println("Имя: " + person.getName() + " и его возраст: " + person.getAge());
        }
         */

        //ЗАДАНИЕ 1 - ПОЛИМОРФИЗМ
        /*
        MathOperation math = new MathOperation();
        System.out.println(math.add(2,2));
        System.out.println(math.add(3,3, 3));
        System.out.println(math.add(4,4,4,4));
        */

        //ЗАДАНИЕ 2 - ПОЛИМОРФИЗМ
        /*
        Shape rectangle = new Rectangle(2.5,5.5);
        System.out.println("Периметр: "+ rectangle.calculatePerimeter());
        System.out.println("Площадь: "+ rectangle.calculateArea());

        Shape circle = new Circle(1.5);
        System.out.println("Периметр: "+ circle.calculatePerimeter());
        System.out.println("Площадь: "+ circle.calculateArea());
*/

        //ЗАДАНИЕ 3 - ПОЛИМОРФИЗМ
        Animal cat = new Cat("Peter", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");
        System.out.println(cat.manageSelf());
        System.out.println(dog.manageSelf());
    }
}
