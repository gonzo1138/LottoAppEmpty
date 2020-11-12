package com.example.lottoappempty;

import java.util.ArrayList;

public class LottoZiehungenList extends ArrayList<KugelList> {

    private int anzahlZiehungen = 0;


    public LottoZiehungenList() {
        super(0);
    }

    public LottoZiehungenList(int length) {
        super(length);
    }

    public int getAnzahlZiehungen(){
        return this.anzahlZiehungen;
    }

    public KugelList getLetzteZeihung(){
        return this.get(this.anzahlZiehungen-1);
    }

    public String getLetzteZeihungAsString(){
        return this.get(this.anzahlZiehungen-1).getAllNummernAsString();
    }

    @Override
    public boolean add(KugelList kugelList) {
        this.anzahlZiehungen++;
        return super.add(kugelList);
    }
}