package exam01;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        Class cls = Ex02.class;
        MyAnno anno = (MyAnno)cls.getAnnotation(MyAnno.class);
        String[] values = anno.value();
        System.out.println(Arrays.toString(values));
    }
}
