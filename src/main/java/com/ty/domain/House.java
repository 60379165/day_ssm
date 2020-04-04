package com.ty.domain;

public class House {
    private Integer hid;

    private String type;

    private String address;

    private String size;

    private Integer price;

    private String state;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "House{" +
                "hid=" + hid +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }
}