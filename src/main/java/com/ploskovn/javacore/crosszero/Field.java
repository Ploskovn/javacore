package main.java.com.ploskovn.javacore.crosszero;

public class Field {
    private String[] field;

    public String[] getField() {
        return field;
    }

    public void setField(String[] field) {
        this.field = field;
    }

    Field() {
        setField(new String[9]);

        for (int i=0; i<9; i++) {
            String j = (i + 1) + "";
            getField()[i] = j;
        }
    }

    void showField() {
        int cnt = 0;
        for (int i=0; i<9; i++) {
            cnt++;
            System.out.print(getField()[i] + " ");
            if (cnt == 3) {
                cnt = 0;
                System.out.println("");
            }
        }
    }
}
