package org.tensorflow.lite.examples.classification.Models;

public class Capital {
    String DLST;
    Double TD;
    int Flg;
    String NameCapital;
    int GTP [];

    public Capital() {
    }

    public Capital(String DLST, Double TD, int flg, String nameCapital, int[] GTP) {
        this.DLST = DLST;
        this.TD = TD;
        Flg = flg;
        NameCapital = nameCapital;
        this.GTP = GTP;
    }

    public String getDLST() {
        return DLST;
    }

    public void setDLST(String DLST) {
        this.DLST = DLST;
    }

    public Double getTD() {
        return TD;
    }

    public void setTD(Double TD) {
        this.TD = TD;
    }

    public int getFlg() {
        return Flg;
    }

    public void setFlg(int flg) {
        Flg = flg;
    }

    public String getNameCapital() {
        return NameCapital;
    }

    public void setNameCapital(String nameCapital) {
        NameCapital = nameCapital;
    }

    public int[] getGTP() {
        return GTP;
    }

    public void setGTP(int[] GTP) {
        this.GTP = GTP;
    }
}
