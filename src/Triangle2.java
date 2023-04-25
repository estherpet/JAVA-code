public class Triangle2 {
    public static void main(String[] args) {
        int esther = 1;
        while (esther <= 10) {
            String pre = "th";
            if (esther == 1) {pre = ("st");}
            if (esther == 2) {pre = ("nd");}
            if (esther == 3) {pre = ("rd");}
                if (esther == 4) {pre = ("th");}
                System.out.println(esther + pre);
                esther++;
            }
        }
    }