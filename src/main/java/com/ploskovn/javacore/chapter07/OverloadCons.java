class Box {
    double width;
    double height;
    double depth;

    // все размеры
    Box( double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // нет размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // куб
    Box( double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height *depth;
    }

}

class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}