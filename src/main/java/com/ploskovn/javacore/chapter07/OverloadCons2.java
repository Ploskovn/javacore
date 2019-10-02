class Box {
    double width;
    double height;
    double depth;

    Box(Box o) {
        
    }

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
        return width * height * depth;
    }

}