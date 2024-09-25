import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        example1();
//        example2();
        example6();
    }

    private static void example6() {


    }

    private static void example5() {
        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new Triangle(3, 4, 5));
        triangleList.add(new Triangle(10, 10, 10));
        triangleList.add(0, new Triangle(11, 12, 13));
        System.out.println(triangleList);
        triangleList.stream().forEach(x -> System.out.println(x+"\n площадь = "+x.area()+" периметр = "+x.perimeter()));

    }

    private static void example4() {
        List<Triangle> triangleList = new ArrayList<>();
        triangleList.add(new Triangle(3, 4, 5));
        triangleList.add(new Triangle(10, 10, 10));
        triangleList.add(0, new Triangle(11, 12, 13));
        System.out.println(triangleList);
        for (Triangle trr : triangleList) {
            System.out.println("очередной элемент списка: " + trr);
            System.out.println("периметр очередного элемента списка: " + trr.perimeter());
        }
    }


private static void example3() {
    List<Triangle> triangleList = new ArrayList<>();
    triangleList.add(new Triangle(3, 4, 5));
    triangleList.add(new Triangle(10, 10, 10));
    triangleList.add(0, new Triangle(11, 12, 13));
    System.out.println(triangleList);
    for (int i = 0; i < triangleList.size(); i++) {
        System.out.println("очередной элемент списка: " + triangleList.get(i));
        System.out.println("площадь очередного элемента списка: " + triangleList.get(i).area());
    }
}

private static void example2() {
    List<Triangle> triangleList = new ArrayList<>();
    triangleList.add(new Triangle(3, 4, 5));
    triangleList.add(new Triangle(10, 10, 10));
    triangleList.add(0, new Triangle(11, 12, 13));
    System.out.println(triangleList);
}

private static void example1() {
    List<String> words = new ArrayList<>();
    words.add("Привет");
    words.add("мир");
    words.add(0, "ква");
    System.out.println(words);
}
}