package com.example.lottoappempty;

import java.util.ArrayList;

public class LottoZiehungenList extends ArrayList<KugelList> {
    private int anzahlZiehungen = 0;

    public LottoZiehungenList() { super(0); }
    public LottoZiehungenList(int length) {
        super(length);
    }

    public int getAnzahlZiehungen(){
       return this.anzahlZiehungen;
    }

    @Override
    public boolean add(KugelList kugelList) {
        super.add(kugelList);
        this.anzahlZiehungen++;
        return true;
    }
}
