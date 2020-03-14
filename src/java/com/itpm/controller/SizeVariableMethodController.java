/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itpm.controller;

import com.itpm.model.SizeDTO;
import com.itpm.model.SizeVariableMetod;
import com.itpm.util.DBConnectionUtil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class SizeVariableMethodController {

    private static Connection connection;

//	private static Statement statement;
    private static PreparedStatement ps;

    private static ResultSet rs;

    //==================retrieve the size ===================================
    public static ArrayList<SizeVariableMetod> getsizemethod() {

        ArrayList<SizeVariableMetod> list = new ArrayList<SizeVariableMetod>();
        try {
            connection = DBConnectionUtil.getConnection();

            ps = connection.prepareStatement("select * from Size");
            rs = ps.executeQuery();

            while (rs.next()) {

                SizeVariableMetod sizevariablemethod = new SizeVariableMetod();
                sizevariablemethod.setId(rs.getString("id"));
                sizevariablemethod.setProgramComponent(rs.getString("ProgramComponent"));
                sizevariablemethod.setWeight(rs.getInt("weight"));

                list.add(sizevariablemethod);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            /*
			 * Close prepared statement and database connectivity at the end of transaction
             */
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
//                    connection.close();
                }
            } catch (SQLException e) {
                //log.log(Level.SEVERE, e.getMessage());
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return list;

    }

    //==========================Update the size ========================
    public int updateSave(ArrayList<SizeVariableMetod> sizess) {

//        SizeVariableMethodController size = new SizeVariableMethodController();
        int result = 0;

        try {
            connection = DBConnectionUtil.getConnection();
            for (SizeVariableMetod sizesss : sizess) {

                ps = connection.prepareStatement("UPDATE Size SET  `weight`=? WHERE `id`=?;");

                ps.setInt(1, sizesss.getWeight());
                ps.setString(2, sizesss.getId());

                result = ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
//                    connection.close();
                }
            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            }
        }
        // Get the updated employee
        return result;

    }

    //========================retrieve the variable ======================
    public static ArrayList<SizeVariableMetod> getvariablemethod() {

        ArrayList<SizeVariableMetod> list = new ArrayList<SizeVariableMetod>();
        try {
            connection = DBConnectionUtil.getConnection();

            ps = connection.prepareStatement("select * from variable");
            rs = ps.executeQuery();

            while (rs.next()) {

                SizeVariableMetod sizevariablemethod = new SizeVariableMetod();
                sizevariablemethod.setId(rs.getString("id"));
                sizevariablemethod.setProgramComponent(rs.getString("ProgramComponent"));
                sizevariablemethod.setWeight(rs.getInt("weight"));

                list.add(sizevariablemethod);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            /*
			 * Close prepared statement and database connectivity at the end of transaction
             */
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
//                    connection.close();
                }
            } catch (SQLException e) {
                //log.log(Level.SEVERE, e.getMessage());
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return list;

    }

    //=======================update the variable==========================
    public int updateVariable(ArrayList<SizeVariableMetod> variables) {

//        SizeVariableMethodController size = new SizeVariableMethodController();
        int result = 0;

        try {
            connection = DBConnectionUtil.getConnection();
            for (SizeVariableMetod variabless : variables) {

                ps = connection.prepareStatement("UPDATE variable SET  `weight`=? WHERE `id`=?;");

                ps.setInt(1, variabless.getWeight());
                ps.setString(2, variabless.getId());

                result = ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
//                    connection.close();
                }
            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            }
        }
        // Get the updated employee
        return result;

    }

    //==========================retrieve the method=================================
    public static ArrayList<SizeVariableMetod> getmethod() {

        ArrayList<SizeVariableMetod> list = new ArrayList<SizeVariableMetod>();
        try {
            connection = DBConnectionUtil.getConnection();

            ps = connection.prepareStatement("select * from method");
            rs = ps.executeQuery();

            while (rs.next()) {

                SizeVariableMetod sizevariablemethod = new SizeVariableMetod();
                sizevariablemethod.setId(rs.getString("id"));
                sizevariablemethod.setProgramComponent(rs.getString("ProgramComponent"));
                sizevariablemethod.setWeight(rs.getInt("weight"));

                list.add(sizevariablemethod);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            /*
			 * Close prepared statement and database connectivity at the end of transaction
             */
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
//                    connection.close();
                }
            } catch (SQLException e) {
                //log.log(Level.SEVERE, e.getMessage());
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        return list;

    }

    //=====================================Update the method===========================
    public int updateMethod(ArrayList<SizeVariableMetod> methodss) {

//        SizeVariableMethodController size = new SizeVariableMethodController();
        int result = 0;

        try {
            connection = DBConnectionUtil.getConnection();
            for (SizeVariableMetod methodsss : methodss) {

                ps = connection.prepareStatement("UPDATE method SET  `weight`=? WHERE `id`=?;");

                ps.setInt(1, methodsss.getWeight());
                ps.setString(2, methodsss.getId());

                result = ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
//                    connection.close();
                }
            } catch (SQLException e) {
                System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            }
        }
        // Get the updated employee
        return result;

    }

//     =====================================================================================================
//     =====================================================================================================
    public static ArrayList<SizeDTO> measureSize(String fileName) throws FileNotFoundException, IOException {
        ArrayList<SizeDTO> sizeList = new ArrayList<>();

        FileReader fr = new FileReader("c://ccmt/uploads/" + fileName);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<SizeVariableMetod> weightList = new  ArrayList<>();
        weightList=getsizemethod();

        String[] javaKeyWords = {"abstract", "assert",
            "break", "catch", "class", "const",
            "continue", "default", "else", "extends", 
            "final", "finally", "goto","implements",
            "import", "instanceof", "interface", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "static", "strictfp", "super", 
            "synchronized", "this", "throw", "throws", "transient", 
            "try", "void", "volatile"};

        int keyword = 0;
        int identifier;
        int operator;
        int nv;
        int sl;

        for (SizeVariableMetod svm : weightList) {
//            System.out.println(svm.getProgramComponent().equals("Key Word"));
            if (svm.getProgramComponent().equals("Key Word")) {
                keyword = svm.getWeight();
            } else if (svm.getProgramComponent().equals("Identifier")) {
                identifier = svm.getWeight();
            } else if (svm.getProgramComponent().equals("Operator")) {
                operator = svm.getWeight();
            } else if (svm.getProgramComponent().equals("Numerical value")) {
                nv = svm.getWeight();
            } else if (svm.getProgramComponent().equals("String literal")) {
                sl = svm.getWeight();
            }

        }

        String line;
        while ((line = br.readLine()) != null) {
            SizeDTO size = new SizeDTO();
            size.setCodeLine(line);
            //weight keywords
            int nKW = 0;
            String[] words = line.split("\\W+");
            for (int i = 0; i < words.length; i++) {
//                System.out.println(words[i]);
                for (int j = 0; j < javaKeyWords.length; j++) {
                    if (words[i].equals(javaKeyWords[j])) {
                        System.out.println(javaKeyWords[j]);
                        nKW++;
                    }
                }
                
                
                
            }

            size.setNkw(nKW);
            size.setNid(0);
            size.setNnv(0);
            size.setNop(0);
            size.setNsl(0);
            size.setCs(nKW * keyword);

            sizeList.add(size);
        }
        br.close();
        fr.close();

        return sizeList;
    }

}
