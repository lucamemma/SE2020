/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sapienza.softeng.dbsimplemanager;

import java.sql.*;



public class DBManager { // remember to run with arguments home/studente/database create for creating the db

    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");
        Connection conn
                = DriverManager.getConnection("jdbc:sqlite:"+args[0]);
        Statement stat = conn.createStatement();

        if (args[1].equals("create")) {
            stat.executeUpdate("drop table if exists fligth;"); // clear the db
            stat.executeUpdate("create table fligth (id, name);"); // create table flight
            PreparedStatement prep = conn.prepareStatement(
                    "insert into fligth values (?, ?);"); // sintax for putting record in database
            prep.setString(1, "1"); // first id of first flight
            prep.setString(2, "AZ140"); // flight name
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "2"); // second id..
            prep.setString(2, "LH999");
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "3");
            prep.setString(2, "FR123");
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
            
            prep.setString(1, "4");
            prep.setString(2, "US666");
            prep.addBatch();
            conn.setAutoCommit(false);
            prep.executeBatch();
            conn.setAutoCommit(true);
        } else { // here for query
            ResultSet rs = stat.executeQuery("select * from fligth;");
            while (rs.next()) {
                System.out.print("Fligth = " + rs.getString("id") + " is : ");
                System.out.println(rs.getString("name"));
            }
            rs.close();
        }
        conn.close();
    }
}
