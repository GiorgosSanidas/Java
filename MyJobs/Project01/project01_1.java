package erg1_ask1;

import java.util.Scanner;

public class Erg1_Ask1 {
	  
	public static void main(String[] args) {
	    double kostos = 0;
	    double xiliometra;
	    double sinolika_xiliometra=0;
	    double sinolika_katanalosh=0;
	    double megaliteri_apostash=0;
	
		do {
		
            Scanner in = new Scanner(System.in); 
            System.out.print("���� ������������ �������� � 0 ��� �� ���������� � ����������: ");
            xiliometra = in.nextDouble();
            	    
            if (xiliometra<0) {} //������� ��������� �������
            if (xiliometra>-1&&xiliometra!=0)	{
                
    		    double katanalosh = (xiliometra/100)*5.7; 
    		    kostos = katanalosh*1.473; // ����������� �������
    		    sinolika_xiliometra = sinolika_xiliometra+xiliometra;
    		    sinolika_katanalosh = sinolika_katanalosh+katanalosh;
    		    
    		    
    		    if (megaliteri_apostash<xiliometra) {
    		    	megaliteri_apostash=xiliometra;
    		    }
            	
            }
           
	}while (xiliometra!=0);
    System.out.println("���������� �������� : "+sinolika_xiliometra+" ����������");
    System.out.println("� �������� ���������� ����� : "+sinolika_katanalosh+" �����");
    System.out.println("� ���������� �������� ��� ��������� ����� : "+megaliteri_apostash+ " ����������");

}}
