package projects7;


import java.util.ArrayList;
import java.util.Scanner;

class Doctor {
    String name;
    String qualification;
    String experience;
    String salary;

    public Doctor() {
        name = null;
        qualification = null;
        experience = null;
        salary = null;
    }

    public Doctor(String drname, String qali, String expi, String sal) {
        name = drname;
        qualification = qali;
        experience = expi;
        salary = sal;
    }
}
class Patient{
    String namep;
    String age;
    String Illness;
    String bloodGroup;

    public Patient() {
        namep = null;
        age = null;
        Illness = null;
        bloodGroup = null;
    }

    public Patient(String ptname, String ag, String ill, String bG) {
        namep = ptname;
        age = ag;
        Illness = ill;
        bloodGroup = bG;
    }

    @Override
    public String toString() {
        return ""+ namep+", "+age+ ", "+ Illness+", "+bloodGroup;
    }
}
public class Main {
    static ArrayList<Patient> pt = new ArrayList<Patient>();
    static ArrayList<Doctor> dr = new ArrayList<Doctor>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("****************************************");
        System.out.println("*        WELCOME TO MY HOSPITAL        *");
        System.out.println("****************************************");

        System.out.println("Enter Choice\n");
        System.out.println("1.Add doctor");
        System.out.println("2.Add patient");
        System.out.println("3.show staff");
        System.out.println("4.show patients");
        System.out.println("5.Discharge patients");

        while(true){
            Scanner ch  = new Scanner(System.in);
            int x = ch.nextInt();
            int i = 0;

            switch(x){
                case 1:
                    Scanner scn = new Scanner(System.in);
                    System.out.println("Enter information of doct");
                    System.out.println("enter name of doctor");
                    String tempname = scn.nextLine();

                    System.out.println("enter qualification");
                    String tempq = scn.nextLine();

                    System.out.println("enter experience");
                    String tempex = scn.nextLine();

                    System.out.println("enter salary given to doctor");
                    String tempsal = scn.nextLine();

                    dr.add( new Doctor(tempname,tempq,tempex,tempsal));

                    System.out.println("___________________________");
                    break;

                case 2:
                    Scanner san = new Scanner(System.in);
                    System.out.println("Enter information of patient");
                    System.out.println("enter name of patient");
                    String tempnamep = san.nextLine();

                    System.out.println("enter age");
                    String tempag = san.nextLine();

                    System.out.println("enter Illness");
                    String tempill = san.nextLine();

                    System.out.println("blood group");
                    String tempbg = san.nextLine();

                    pt.add( new Patient(tempnamep,tempag,tempill,tempbg));

                    System.out.println("___________________________");
                    break;

                case 3:
                    System.out.println("NAME  QUALIFICATIONS EXPERIENCE SALARY");
                    for(int j = 0 ;j<dr.size() ; j++){
                        System.out.println(dr.get(j));
                    }
                    break;
                case 4:
                    System.out.println("NAME AGE ILLNESS BLOODGROUP");
                    for(int k = 0;k<pt.size();k++){
                        System.out.println(pt.get(k));
                    }
                    break;
                case 5:
                    System.out.println("comming soon");
                    break;

                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
