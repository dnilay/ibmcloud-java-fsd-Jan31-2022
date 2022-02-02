package com.example.model;

public class Adition {

    public int add()
    {
        return 0;
    }

    public int add(int a,int b)
    {
        return a+b;
    }

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }

    public double add(int a,double b)
    {
        return a+b;
    }

    public int addMe(int...a)
    {
        int sum=0;
        for(int a1:a)
        {
            sum+=a1;
        }
        return sum;
    }
}
