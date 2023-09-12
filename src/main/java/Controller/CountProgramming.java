/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import View.Menu;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author HP
 */
public class CountProgramming extends Menu<String> {

    static String[] mc = {"Letter and Charater Count", "Convert base number", "Exit"};
    String str;
    Library Lib;

    public CountProgramming() {
        super("PROGRAMMING", mc);
        Lib = new Library();
        str = Lib.getString("Input string: ");
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                countLetter(str);
                break;
            case 2:
                str = str.replaceAll("\\s+", "");
                countCharater(str);
                break;
            case 3:
                System.exit(0);
        }
    }
    
    public void countLetter(String str) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>(); //lưu trữ ký tự và số lần xuất hiện
        String[] strSplit = str.split("\\s"); //tách chuỗi
        for (int i = 0; i < strSplit.length; i++) {
            String ch = strSplit[i];
            int count = 0;
            for (int j = 0; j < strSplit.length; j++) {
                if (strSplit[j].equals(ch)) {
                    count++;
                } //đếm số lần xuất hiện
            }
            lhm.put(ch, count);
        }
        
        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }

    public void countCharater(String str) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            lhm.put(ch + "", count);
        }

        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
