/**
 * TimeAndAddition
 */
public class TimeAndAddition {

    public static void main(String[] args) {
        TimeAdd t1 = new TimeAdd(1, 1, 0, 5, 5, 50, 45);
        TimeAdd t2 = new TimeAdd(0, 15, 0, 3, 20, 30, 55);
        t1.add_time(t2);
        System.out.println(t1.mo + ":" + t1.w + ":" + t1.d + ":" + t1.h + ":" + t1.m + ":" + t1.s);
    }
}

class TimeAdd {
    int h, m, s, d, w, mo, y;

    public TimeAdd(int y, int mo, int w, int d, int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
        this.d = d;
        this.w = w;
        this.mo = mo;
        this.y = y;
    }

    void add_time(TimeAdd t) {
        this.s += t.s;
        if (this.s >= 60) {
            this.m++;
            this.s -= 60;
        }
        this.m += t.m;
        if (this.m >= 60) {
            this.h++;
            this.m -= 60;
        }
        this.h += t.h;
        if (this.h >= 24) {
            this.d++;
            this.h -= 24;
        }
        this.d += t.d;
        if (this.d >= 7) {
            this.w++;
            this.d -= 7;
        }
        this.w += t.w;
        if (this.d >= 30) {
            this.mo++;
            this.d -= 30;
        }
        this.mo += t.mo;
        if (this.mo >= 12) {
            this.y++;
            this.mo -= 12;
        }
        this.y += t.y;
    }
}