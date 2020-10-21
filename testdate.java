package Fix;

public class testdate {
    public static void main(String[] args) {
        Date d1 = new Date(2020, 10, 5);
        Date d2 = new Date(2019, 10, 1);
        Date d3 = new Date(2001, 9, 6);

        d1.setDate(2012, 7, 5);
        System.out.println(d1);
    }
}
