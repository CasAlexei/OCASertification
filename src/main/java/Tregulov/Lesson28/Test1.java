package Tregulov.Lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {
    static StringBuilder abc() {
        StringBuilder sb = new StringBuilder("privet");
        try {
            File f = new File("file9.txt");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("eto try block");
        } catch (FileNotFoundException e) {
            System.out.println("eto exception block");
            System.out.println("sb in catch = " + sb);
            return sb;
        } finally {
            System.out.println("eto final block");
            sb.append("!!!");
            System.out.println("sb in final block = " + sb);
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(abc());
        Long m = new Long(5);
        Integer i = new Integer(1);
        if (i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");

//        Baap b = new Beta();
//        System.out.println(b.h + " " + b.getH());
//        Beta bb = (Beta) b;
//        System.out.println(bb.h + " " + bb.getH());
        int q, j, k;
        q = j = k = 9;
        System.out.println("q=" + q);

        String mStr = "123";
        long m5 = new Long(mStr);
        long m1 = Long.parseLong(mStr);
//        long m2 = Long.longValue(mStr);
//        long m3 = (new Long()).parseLong(mStr);
        long m4 = Long.valueOf(mStr).longValue();
        System.out.println("m4=" + m4);

    }
}

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
    }
}
