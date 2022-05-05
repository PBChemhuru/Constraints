package com.example.constraints;

public class King {

    private String name;
    private int from;
    private  int to;
    private String kingd;

    public King(String name, int from, int to, String kingd)
{
this.name=name;
this.from=from;
this.to=to;
this.kingd=kingd;
}

    public String getName() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public String toString() {
        return name;
    }

    public String toStringEx() {
        return name+"("+from+")"+"-"+"("+to+")";
    }


    public String getText() {
return kingd;
    }
}