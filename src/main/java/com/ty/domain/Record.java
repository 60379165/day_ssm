package com.ty.domain;

import java.util.Date;

public class Record {
    private Integer oid;

    private String name;

    private Integer hid;

    private String starttime;

    private String endtime;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }



    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", name='" + name + '\'' +
                ", hid=" + hid +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                '}';
    }
}