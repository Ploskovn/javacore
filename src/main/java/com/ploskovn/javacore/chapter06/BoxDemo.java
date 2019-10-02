class Box {
    double width;
    double height;
    double depth;
}
// В этом классе объявляется объект типа Box
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
