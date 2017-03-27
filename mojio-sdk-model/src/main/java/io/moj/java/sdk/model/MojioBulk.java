package io.moj.java.sdk.model;

/**
 * Created by alstiefe on 21.03.2017.
 */
public class MojioBulk {
    public static final String IMEIS = "List of IMEI";

    private String[] IMEIs;


    public String[] getIMEIs() {
        return IMEIs;
    }

    public void setIMEIs(String[] IMEIs) {
        this.IMEIs = IMEIs;
    }
}
