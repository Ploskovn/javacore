// Продемонстрировать срок действия переменной
class LifeTime {
    public static void main (String args []) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; // переменная у инициализируется при
                        // каждом вхождении в блок кода
            System.out.println ("y равно: " + y);   // здесь всегда
                                                    // выводится значение -1
            y = 100;
            System.out.println ("y теперь равно : " + y);
        }
    }
}