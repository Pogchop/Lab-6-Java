package Fix;

public class testtime {
    public static void main(String[] args){
        Time t1 = new Time(1, 2, 3);
        Time t2 = new Time(3, 4, 5);

        t1.setHour(4);
        System.out.println("Hour is: " + t1.getHour());

        t1.setTime(23, 42,10);
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond().nextSecond());
    }
}
