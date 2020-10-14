package com.example.lottoappempty;


public class KLotto {

    int kugelmenge = 49;
    int kugelZiehungen = 6;
    int aktuelleKugelZiehung = 0;
    KugelList lottoTrommel;
    KugelList gezogeneKugeln;
    Kugel aktuelleKugel = new Kugel();
    LottoZiehungenList lottoZiehungenList = new LottoZiehungenList();

    public KLotto(KugelList lottoTrommel, KugelList gezogeneKugeln) {

        this.lottoTrommel = lottoTrommel;
        this.gezogeneKugeln = gezogeneKugeln;
        this.lottokugelnErzeugen();
        //this.lottoziehung();
        //this.ziehungDarstellen();
    }

    public KLotto(int k, int z) {

        this.lottoTrommel = lottoTrommel;
        this.gezogeneKugeln = gezogeneKugeln;
        kugelmenge = k;
        kugelZiehungen = z;
        this.lottokugelnErzeugen();
        this.lottoziehung();
        //this.ziehungDarstellen();
    }

    public KugelList getLetzteLottoziehung(){
        return this.lottoZiehungenList.get(this.lottoZiehungenList.getAnzahlZiehungen()-1);
    }

    private int zufallsZahl(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private void lottokugelnErzeugen() {

        Kugel tmpkugel;

        for (int i = 0; i < this.kugelmenge; i++) {
            tmpkugel = new Kugel(i + 1);
            this.lottoTrommel.add(tmpkugel);
        }
    }

    public void lottoziehung() {
        if (gezogeneKugeln.size() > 0){
            this.gezogeneKugeln.clear();
        }
        for (int i = 0; i < this.kugelZiehungen; i++) {
            this.kugelZiehung();
            this.aktuelleKugelZiehung++;
            this.gezogeneKugeln.add(this.aktuelleKugel);
        }
        lottoZiehungenList.add(this.gezogeneKugeln);
    }

    private void kugelZiehung() {

        int index = zufallsZahl(1, this.lottoTrommel.size())-1;
        this.aktuelleKugel = this.lottoTrommel.get(index);
        this.lottoTrommel.remove(index);
    }

/*
    private void ziehungDarstellen() {

        System.out.println("in KLotto: " + this.gezogeneKugeln.getAllNummernAsString());
    }
*/
}