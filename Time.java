public class Time {
    private int hour, min, sec;

    Time(int h, int m, int s) {
        hour = h;
        min = m;
        sec = s;
    }

    Time() {
        hour = 0;
        min = 0;
        sec = 0;
    }

    public Time add(Time ts) {
        Time t = new Time();
        t.sec = this.sec + ts.sec;
        if (t.sec > 60) {
            t.sec -= 60;
            t.min++;
        }
        t.min += this.min + ts.min;
        if (t.min > 60) {
            t.min -= 60;
            t.hour++;
        }
        t.hour += this.hour + ts.hour;
        if (t.hour > 24) {
            t.hour -= 24;
        }
        return t;
    }

    void display(String str) {
        System.out.println(str + " " + hour + ":" + min + ":" + sec);
    }

    public static void main(String args[]) {
        Time t1 = new Time(2, 25, 18);
        Time t2 = new Time(3, 38, 40);
        Time t3 = t1.add(t2);
        t1.display("Time 1:");
        t2.display("Time 2:");
        t3.display("Time after addition:");
    }
}
