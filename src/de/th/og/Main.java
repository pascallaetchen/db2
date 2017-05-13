package de.th.og;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import de.th.og.view.Login;

public class Main {

    public static void main(String args[]) {

        Login test = new Login();
        test.login();

        return;

/*        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@studidb.gm.fh-koeln.de:1521:vlesung", "XXX", "XXX");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from haltestelle");
            ResultSetMetaData rsmd = rs.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                String colName = rsmd.getColumnName(i);
                String tableName = rsmd.getTableName(i);
                String name = rsmd.getColumnTypeName(i);
                boolean caseSen = rsmd.isCaseSensitive(i);
                boolean writable = rsmd.isWritable(i);
                System.out.println("Information for column " + colName);
                System.out.println(" Column is in table " + tableName);
                System.out.println(" DBMS name for type is " + name);
                System.out.println(" Is case sensitive:  " + caseSen);
                System.out.println("Is possibly writable:  " + writable);
                System.out.println("");
            }
            while (rs.next()) {
                for (int i = 1; i<=numberOfColumns; i++) {
                    String s = rs.getString(i);
                    System.out.print(s + "  ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/


    }

}
