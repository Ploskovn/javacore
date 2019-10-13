import java.util.Scanner;

class Field {

    String[] field;

    Field() {
        field = new String[9];

        for (int i=0; i<9; i++) {
            String j = (i + 1) + "";
            field[i] = j;
        }
    }

    void showFild() {
        int cnt = 0;
        for (int i=0; i<9; i++) {
            cnt++;
            System.out.print(field[i] + " ");
            if (cnt == 3) {
                cnt = 0;
                System.out.println("");
            }
        }
    }
}

class GameLogic {
    public static void play (Field f) {
        boolean winner = false;
        //���� ��� ��������
        while (!winner) {
            //��� ������
            GameLogic.stepPlayer(f);
            //�������� �� ��������
            winner = checkWin(f);
            //���� ������� �����
            if (winner) break;
            //��� PC
            GameLogic.stepPC(f);
            //�������� �� ��������
            winner = checkWin(f);
        }
    }

    static void stepPlayer(Field f) {
        int cell;
        String choice;
        Scanner in = new Scanner(System.in);
        do {
            f.showFild();
            System.out.println("������� ����� ������: ");
            choice = in.next();
            try {
                cell = Integer.parseInt(choice);
                cell--;
            } catch (NumberFormatException e) {
                cell = -1;
            }
        } while (GameLogic.checkStep(f, cell));
        f.field[cell] = "x";
        f.showFild();
    }

    static void stepPC(Field f) {
        int cell;
        String choice;
        do {
            cell = (int) (Math.random() * 9 + 1);
            System.out.println("��� PC cell: " + cell);
        } while (GameLogic.checkStep(f, cell));
        f.field[cell] = "0";
        System.out.println("��� PC:");
    }

    static boolean checkStep(Field f, int idx) {
        return idx < 0 || idx >= f.field.length || f.field[idx].equals("x") || f.field[idx].equals("0");
    }

    static boolean checkWin(Field f) {
        boolean win = false;
        
        return win;
    }
}

class GameRunner {
    public static void main(String[] args) {
        Field f = new Field();
        System.out.println("��� ������� ����:");
        f.showFild();
        System.out.println("�� ����� ������ ���� ����� ������� ����� ������");
        GameLogic.play(f);
    }
}
