/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication5;

/**
 *
 * @author Hiba Alashraf
 */
public class Student {

 private String name;
    private int ID;
    private int mark=0;

    Student(){}
        Student(String name, int ID, int mark){
            this.name=name;
            this.ID=ID;
            this.mark=mark;
            

        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
    
    public void setID(int ID){
      this.ID=ID;
    }
    public int getID(){
        return ID;
    }
    public void setMark(int mark){
        if (mark>0 && mark<100)
        this.mark=mark;
        else
         System.out.println("invalid");

      

    }
    public int getMark(){
    return mark;

    }
    

@Override
public String toString(){
    String out="---------\n";
    out+= "the name is :"+ getName()+"\n";
    out+= "the ID is :" + getID() + "\n";
    out+= "the mark is : " + getMark()+ "\n";
    return out;
}

public static String searcheStudent (Student[] studentList, int searcheID) {

    String hiba = "";

    for( int i=0; i< studentList.length; i++ ) {

        if ( studentList[i].getID() == searcheID ) {
            hiba = studentList[i].toString();
            break;
        }  else {
            hiba = "invalid";
        }
    }

    return hiba;


    }

    
}

