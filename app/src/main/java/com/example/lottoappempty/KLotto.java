package com.example.lottoappempty;

interface ILotto{
    int kugelmenge = 49;
}

public class KLotto {

    int kugelmenge = 49;
    int kugelZiehungen = 6;
    int aktuelleKugelZiehung = 0;
    KugelList lottoTrommel = new KugelList();
    KugelList gezogeneKugeln = new KugelList();
    Kugel aktuelleKugel = new Kugel();


    public KLotto(){      // Einfacher konstruktor, der aus den Standard-Parametern die Menge an Kugeln erzeugt
        this.lottokugelnErzeugen();
    }

    public KLotto(int kugelmenge, int kugelZiehungen) {
        this.kugelmenge = kugelmenge;
        this.kugelZiehungen = kugelZiehungen;
        this.lottokugelnErzeugen();
    }

    public KugelList getLetzteLottoziehung(){
        return this.gezogeneKugeln;
    }

    private int zufallsZahl(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public void lottokugelnErzeugen() {
        Kugel tmpkugel;
        this.lottoTrommel = new KugelList();
        for (int i = 0; i < this.kugelmenge; i++) {
            tmpkugel = new Kugel(i + 1);
            this.lottoTrommel.add(tmpkugel);
        }
    }

    private void kugelZiehung() {
        int index = zufallsZahl(0, this.lottoTrommel.size());
        this.aktuelleKugel = this.lottoTrommel.get(index);
        this.lottoTrommel.remove(index);
    }
    public KugelList lottoziehung() {
        if (gezogeneKugeln.size() > 0){
            gezogeneKugeln = new KugelList();
            //this.gezogeneKugeln.clear();
            this.lottoTrommel.clear();
            this.lottokugelnErzeugen();
        } else {
            this.lottokugelnErzeugen();
        }
        for (int i = 0; i < this.kugelZiehungen; i++) {
            this.kugelZiehung();
            this.aktuelleKugelZiehung++;
            this.gezogeneKugeln.add(this.aktuelleKugel);
        }
        return this.gezogeneKugeln;
    }
}