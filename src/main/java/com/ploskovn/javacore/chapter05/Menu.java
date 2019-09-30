class Menu {
    public static void main(String args[])
        throws java.io.IOException {
            char choice;
            do {
                System.out.println("Справка по оператору:");
                System.out.println("       1. if");
                System.out.println("       2. switch");
                System.out.println("       3. while");
                System.out.println("       4. do-while");
                System.out.println("       5. for\n");
                System.out.println("Выберите нудный пункт:");
                choice = (char) System.in.read();
            } while (choice < '1' || choice > '5');

            System.out.println("\n");

            switch(choice) {
                case '1':
                    System.out.println("if:\n");
                    System.out.println("if (условие) оператор");
                    System.out.println("else оператор");
                    break;
                case '2':
                    System.out.println("switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println("case константа:");
                    System.out.println("последовательность операторов");
                    System.out.println("breake;");
                    System.out.println(" // ....");
                    System.out.println("} ");
                    break;
            }
    }
}