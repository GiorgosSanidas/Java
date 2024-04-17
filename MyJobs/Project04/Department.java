package erg4;

import java.util.Scanner;

public class Department {

    protected String name;
    protected String address;
    protected long thl;
    protected int arithmosFititon;
    protected int arithmosErgazomenon;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setThl(long thl) {
        this.thl = thl;
    }

    public long getThl() {
        return thl;
    }

    public void setArithmosFititon(int num) {
        this.arithmosFititon = num;
    }

    public int getArithmosFititon() {
        return arithmosFititon;
    }

    public void setArithmosErgazomenon(int num) {
        this.arithmosErgazomenon = num;
    }

    public int getArithmosErgazomenon() {
        return arithmosErgazomenon;
    }

    public String toString() {
        return String.format(
                "Department: Name = %s, Address = %s, Thlephono = %d, Arithmos Ergazomenwn = %d, Arithmos Fititon = %d",
                this.name, this.address, this.thl, this.arithmosErgazomenon, this.arithmosFititon);
    }

    public Department() {
    }

    public Department(String name, String address, long thl, int arithmosFititon, int arithmosErgazomenon) {
        this.name = name;
        this.address = address;
        this.thl = thl;
        this.arithmosErgazomenon = arithmosErgazomenon;
        this.arithmosFititon = arithmosFititon;
    }
}

