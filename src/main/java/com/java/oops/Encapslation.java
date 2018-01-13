package com.java.oops;

public class Encapslation {
    public static void main(String[] args) {
        emp e1 = new emp();
        e1.setId(1);
        e1.setName("sudha");
        e1.setAddress("india");
        System.out.println(" this print id " + e1.getId());
        System.out.println(" this is print name " + e1.getName());
        System.out.println("this is print address  " + e1.getAddress());

    }
}

class emp {
    private int id;
    private String name;
    private String address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
