package com.example.lottoappempty;

import java.util.ArrayList;

public class KugelList extends ArrayList<Kugel> {

    public KugelList(int length) {
        super(length);
    }

    public KugelList() { super(0); }

    public String getAllNummernAsString() {

        String s="";
        for (int i = 0; i < this.size(); i ++) {
            s += Integer.toString(this.get(i).getNummer());
            s += ", ";
        }
        s = s.substring(0, s.length() - 2);
        s += ".";
        return s;
    }

    public int getAnzahlKugeln() { return this.size(); }
}