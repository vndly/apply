package com.mauriciotogneri.apply.experiment;

@SuppressWarnings("ALL")
public class NumberOperations
{
    public static Number create(double n)
    {
        return n;
    }

    public static Number add(Number a, Number b)
    {
        return a.doubleValue() + b.doubleValue();
    }

    public static Number sub(Number a, Number b)
    {
        return a.doubleValue() - b.doubleValue();
    }

    public static Number mul(Number a, Number b)
    {
        return a.doubleValue() * b.doubleValue();
    }

    public static Number div(Number a, Number b)
    {
        return a.doubleValue() / b.doubleValue();
    }

    public static Number pow(Number a, Number b)
    {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }

    public static Number mod(Number a, Number b)
    {
        return a.doubleValue() % b.doubleValue();
    }

    public static Boolean less(Number a, Number b)
    {
        return a.doubleValue() < b.doubleValue();
    }

    public static Boolean lessEqual(Number a, Number b)
    {
        return a.doubleValue() <= b.doubleValue();
    }

    public static Boolean greater(Number a, Number b)
    {
        return a.doubleValue() > b.doubleValue();
    }

    public static Boolean greaterEqual(Number a, Number b)
    {
        return a.doubleValue() >= b.doubleValue();
    }

    //    public static Boolean equal(Number a, Number b)
    //    {
    //        return Double.compare(a.doubleValue(), b.doubleValue()) == 0;
    //    }
    //
    //    public static Boolean notEqual(Number a, Number b)
    //    {
    //        return Double.compare(a.doubleValue(), b.doubleValue()) != 0;
    //    }
}