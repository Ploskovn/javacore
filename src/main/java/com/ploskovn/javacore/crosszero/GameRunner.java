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
        } while (GameLogic.checkStep(f, cell));
        f.field[cell] = "0";
        System.out.println("��� PC:");
    }

    static boolean checkStep(Field f, int idx) {
        return idx < 0 || idx >= f.field.length || f.field[idx].equals("x") || f.field[idx].equals("0");
    }

    static boolean checkWin(Field f) {
        int[][] winResult = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6} };

        for (int i=0; i<8; i++) {
            if (f.field[winResult[i][0]].equals("x") && f.field[winResult[i][1]].equals("x") && (f.field[winResult[i][2]].equals("x"))) {
                System.out.println("���, �� ��������!!!:");
                f.showFild();
                return true;
            } else if (f.field[winResult[i][0]].equals("0") && f.field[winResult[i][1]].equals("0") && (f.field[winResult[i][2]].equals("0"))) {
                System.out.println("������� PC:");
                f.showFild();
                return true;
            }
        }

        int cnt = 0;
        for (int i=0; i<9; i++) {
            if (f.field[i].equals("x") || f.field[i].equals("0")) {
                cnt++;
            }
        }
        if (cnt == 9) {
            System.out.println("�����!");
            f.showFild();
            return true;
        }

        return false;
    }
}

class GameRunner {
    public static void main(String[] args) {
        Field f = new Field();
        System.out.println("���� \"�������� ������\"");
        System.out.println("��� ������� ����:");
        f.showFild();
        System.out.println("�� ����� ������ ���� ����� ������� ����� ������");
        GameLogic.play(f);
    }
}
