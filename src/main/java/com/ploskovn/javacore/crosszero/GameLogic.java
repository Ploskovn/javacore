package main.java.com.ploskovn.javacore.crosszero;

import main.java.com.ploskovn.javacore.crosszero.Field;

import java.util.Scanner;

public class GameLogic {

    public static void play () {
        System.out.println("Tic tac toe game");

        Field f = new Field();
        System.out.println("This is a playing field:");
        f.showField();

        boolean winner = false;
        //Until winner false
        while (!winner) {
            //step Player
            int cell;
            String choice;
            Scanner in = new Scanner(System.in);
            do {
                f.showField();
                System.out.println("Enter cell number: ");
                choice = in.next();
                try {
                    cell = Integer.parseInt(choice);
                    cell--;
                } catch (NumberFormatException e) {
                    cell = -1;
                }
            } while (GameLogic.validateStep(f, cell));
            GameLogic.step(f, cell, "x");
            f.showField();
            winner = checkWin(f);
            if (winner) break;
            //step PC
            do {
                cell = (int) (Math.random() * 9 + 1);
            } while (GameLogic.validateStep(f, cell));
            GameLogic.step(f, cell, "0");
            System.out.println("PC step:");
            winner = checkWin(f);
        }
    }

    static void step(Field f, int index, String mark) {
        f.getField()[index] = mark;
    }

    static boolean validateStep(Field f, int index) {
        return index < 0 || index >= f.getField().length || f.getField()[index].equals("x") || f.getField()[index].equals("0");
    }

    static boolean checkWin(Field f) {
        int[][] winResult = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6} };

        for (int i=0; i<8; i++) {
            if (f.getField()[winResult[i][0]].equals("x") && f.getField()[winResult[i][1]].equals("x") && (f.getField()[winResult[i][2]].equals("x"))) {
                System.out.println("You win!!!:");
                f.showField();
                return true;
            } else if (f.getField()[winResult[i][0]].equals("0") && f.getField()[winResult[i][1]].equals("0") && (f.getField()[winResult[i][2]].equals("0"))) {
                System.out.println("PC win!:");
                f.showField();
                return true;
            }
        }

        int cnt = 0;
        for (int i=0; i<9; i++) {
            if (f.getField()[i].equals("x") || f.getField()[i].equals("0")) {
                cnt++;
            }
        }
        if (cnt == 9) {
            System.out.println("Dead heat!");
            f.showField();
            return true;
        }

        return false;
    }
}
