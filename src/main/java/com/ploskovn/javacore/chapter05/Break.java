class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break");
                    if (t) break second; // выход из блока second
                        System.out.println("Не будет выполняться");
                }
                System.out.println("Не будет выполняться тоже");
            }
            System.out.println("Следует за блоком second");
        }
    }
}