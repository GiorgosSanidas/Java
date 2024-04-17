package erg5;

import java.sql.*;

public class Mysql {
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(

 Statement stmt = con.createStatement();}}}