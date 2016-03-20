package com.mauriciotogneri.apply.test;

import static com.mauriciotogneri.apply.test.Runtime.$f0;
import static com.mauriciotogneri.apply.test.Runtime.$f1;
import static com.mauriciotogneri.apply.test.Runtime.$f3;

public class Custom
{
    public static final $f0 pi = () -> 3.14d;

    public static final $f1 duplicate = (a) -> ((Double) a) * 2;
    public static final $f1 triplicate = (a) -> ((Double) a) * 3;
    public static final $f3 apply = (f, a, b) -> (($f1) f).apply(((Double) a) + ((Double) b));

    public static final $f1 factorial = (n) -> {
        if ((Double) n == 0)
        {
            return 1d;
        }
        else
        {
            return ((Double) n) * (Double) Custom.factorial.apply(((Double) n) - 1);
        }
    };
}