package com.Kerol9995;

public class StudentAction {

    public static Student[] ArrayCreator() {
        String [] name = {"Ivan","Petya","Dima","Olga","Ira","Fedor","Igor","Anna","Ivan","Ira"};
        String [] surname = {"Ivanov","Petrov","Domov","Volga","Irachkina","Fedorov","Igorev","Annova","Igorev","Fedorova"};
        String [] middle_name = {"Ivanovich","Petrovich","Dmtrievich","Igorevna","Igorevna","Fedorovich","Igorevich","Ivanovna","Fedorovich","Petrovna"};
        String [] address = {"Minsk","Orsha","Gomel","Pinsk","Borisov","Mogilev","Vitebsk","Minsk","Gomel","Gomel"};
        int [] id = {1,2,3,4,5,6,7,8,9,10};
        int [] year_of_birth = {1991,1990,1992,1996,1998,1989,1986,2000,1999,2002};
        int [] telephone = {291234567,331234567,441234567,299876543,339876543,449876543,251234567,259876543,296543210,256543210};
        int [] faculty = {Faculty.Chemistry.ordinal(),Faculty.Maths.ordinal(),Faculty.History.ordinal(),Faculty.Maths.ordinal(),Faculty.Chemistry.ordinal(),Faculty.Physics.ordinal(),Faculty.History.ordinal(),Faculty.Physics.ordinal(),Faculty.Maths.ordinal(),Faculty.History.ordinal()};
        int [] course = {1,2,3,4,4,3,2,1,3,2};
        int [] group = {11,12,13,12,11,13,12,13,11,11};

        Student [] students = new Student[10];

        for (int i =0; i< students.length; i++){
            students[i]= new Student();
        }
        for (int i =0; i< students.length; i++){
            students[i].setName(name[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setSurname(surname[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setMiddle_name(middle_name[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setAddress(address[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setId(id[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setYear_of_birth(year_of_birth[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setTelephone(telephone[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setFaculty(faculty[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setCourse(course[i]);
        }
        for (int i =0; i< students.length; i++){
            students[i].setGroup(group[i]);
        }
        return students;
    }

    public static void ViewerGroup(Student students[],int numberGroup) {
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == numberGroup) {
                System.out.println("Group "+numberGroup+": "+students[i].toString());
            }
        }
    }

    public static void StudentOfFaculty(Student students[],int faculty){
        System.out.println();
        switch (faculty){
            case 0 :
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getFaculty() == 0) {
                        System.out.println("Faculty " + Faculty.Maths + ": " + students[i].toString());
                    }
                }
                break;
            case 1 :
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getFaculty() == 1){
                    System.out.println("Faculty " + Faculty.History + ": " + students[i].toString());
                   }
                }
                break;
            case 2 :
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getFaculty() == 2) {
                        System.out.println("Faculty " + Faculty.Physics + ": " + students[i].toString());
                    }
                }
                break;
            case 3 :
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getFaculty() == 3){
                        System.out.println("Faculty " + Faculty.Chemistry + ": " + students[i].toString());
                    }
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + faculty);
            }
//        }
    }

    public static void ViewerFaculty(Student students[]) {
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty() == 0) {
                System.out.println("Faculty " + Faculty.Maths + ": " + students[i].toString());
            }
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty() == 1) {
                System.out.println("Faculty " + Faculty.History + ": " + students[i].toString());
            }
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty() == 2) {
                System.out.println("Faculty " + Faculty.Physics + ": " + students[i].toString());
            }
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty() == 3) {
                System.out.println("Faculty " + Faculty.Chemistry + ": " + students[i].toString());
            }
        }
    }

    public static void ViewerCourse(Student students[]) {
        System.out.println();
        for (int j = 0; j < 5; j++) {
            System.out.println();
            for (int i = 0; i < students.length; i++) {
                if (students[i].getCourse() == j) {
                    System.out.println("Course "+ j +": "+ students[i].toString());
                }
            }
        }
    }

    public static void ViewerYear(Student students[], int year) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getYear_of_birth() > year) {
                System.out.println("Year_of_birth after " + year + ": " +students[i].toString());
            }
        }
    }


}
