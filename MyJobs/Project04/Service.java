package erg4;

import java.beans.PropertyChangeEvent;
import java.util.Scanner;

public class Service {

    protected String name;
    protected Department depart;
    protected long thl;
    protected int arithmosErgazomenon;
    protected float m_o;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(Department department) {
        this.depart = department;
    }

    public Department getDepart() {
        return depart;
    }

    public void setThl(long thl) {
        this.thl = thl;
    }

    public long getThl() {
        return thl;
    }

    public void setArithmosErgazomenon(int arithmosErgazomenon) {
        this.arithmosErgazomenon = arithmosErgazomenon;
    }

    public int getArithmosErgazomenon() {
        return arithmosErgazomenon;
    }

    public void setM_o(int mo) {
        this.m_o = mo;
    }

    public float getM_o() {
        return m_o;
    }

    public String toString() {
        return String.format(
                "Service: Name = %s, Department(name) = %s, Thlephono = %d, ArithmosErgazomenwn = %d, M.O = %f",
                this.name, this.depart.getName(), this.thl, this.arithmosErgazomenon, this.m_o);
    }

    public Service() {
    }

    public Service(String name, Department depart, long thl, int arithmosErgazomenon, float m_o) {
        this.name = name;
        this.thl = thl;
        this.arithmosErgazomenon = arithmosErgazomenon;
        this.m_o = m_o;

        if (depart == null) {
            this.depart = new Department();
        } else {
            this.depart = depart;
        }
    }
}

    
    

