package com.athbk.changeavtarliketinder;

/**
 * Created by athbk on 6/10/17.
 */

public class DataModel {

    private String logo;
    private int stt;

    public DataModel(String logo, int stt) {
        this.logo = logo;
        this.stt = stt;
    }

    public String getLogo() {
        return logo;
    }

    public int getStt() {
        return stt;
    }
}
