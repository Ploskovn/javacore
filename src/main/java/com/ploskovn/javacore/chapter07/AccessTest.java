// модификаторы доступа
class Test {
    int a;          // по умолчания
    public int b;   // открытый
    private int c;  //закрытый

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // правильно
        ob.a = 10;
        ob.b = 20;

        // ОШИБКА
        // ob.c = 100;

        //Надо так:
        ob.setc(100);
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}