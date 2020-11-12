package com.example.lottoappempty;

import java.util.ArrayList;
import java.util.List;

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

    public int countOfEqualKugelNummernWith(KugelList vergleich){
        int hasEquals = 0;
        for(int i=0; i<this.size(); i++) {
            for (int j = 0; j < vergleich.size(); j++) {
                if (this.get(i).getNummer() == vergleich.get(j).getNummer()) hasEquals++;
            }
        }
        return hasEquals;
    }

    public KugelList EqualKugelNummernWith(KugelList vergleich){
        KugelList ausgabe = new KugelList(0);
        for(int i=0; i<this.size(); i++) {
            for (Kugel kugel : vergleich) {
                if (this.get(i).getNummer() == kugel.getNummer()) ausgabe.add(this.get(i));
            }
        }
        return ausgabe;
    }

    public int getAnzahlKugeln() { return this.size(); }

    public void addList(List list){
        list.forEach((e)->{
            add(new Kugel(Integer.parseInt(e.toString())));
        });
    }
}