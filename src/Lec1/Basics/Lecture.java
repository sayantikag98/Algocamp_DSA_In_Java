package Lec1.Basics;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            String className = sc.next();

            Class st = Class.forName(className);

            if(st.getName().equals("java.lang.String")){
                System.out.println(st);
            }
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
