package kma.upp.neruhomist.entity;

public class Object {

    private String address;
    private int roomsNum;
    private String type;
    private double price;
    private int daysInRent;

    public Object(String address, int roomsNum, String type, double price, int daysInRent) {
        this.address = address;
        this.roomsNum = roomsNum;
        this.type = type;
        this.price = price;
        this.daysInRent = daysInRent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoomsNum() {
        return roomsNum;
    }

    public void setRoomsNum(int roomsNum) {
        this.roomsNum = roomsNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDaysInRent() {
        return daysInRent;
    }

    public void setDaysInRent(int daysInRent) {
        this.daysInRent = daysInRent;
    }
}