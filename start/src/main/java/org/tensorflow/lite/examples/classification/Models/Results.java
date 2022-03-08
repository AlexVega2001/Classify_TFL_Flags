package org.tensorflow.lite.examples.classification.Models;

public class Results {
    String Name;
    int SeqID;
    String TelPref;
    String CountryInfo;

    public Results() {
    }

    public Results(String name, int seqID, String telPref, String countryInfo) {
        Name = name;
        SeqID = seqID;
        TelPref = telPref;
        CountryInfo = countryInfo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSeqID() {
        return SeqID;
    }

    public void setSeqID(int seqID) {
        SeqID = seqID;
    }

    public String getTelPref() {
        return TelPref;
    }

    public void setTelPref(String telPref) {
        TelPref = telPref;
    }

    public String getCountryInfo() {
        return CountryInfo;
    }

    public void setCountryInfo(String countryInfo) {
        CountryInfo = countryInfo;
    }
}
