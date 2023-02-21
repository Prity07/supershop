package com.company.school;

public class Application {

    public static void main(String[] args) {
//        Student student1 = new Student("Ameena Nazmun Prity", 1, "Female", "8 December 2001");
//        Student student2 = new Student("Maruf Hossen", 50, "Female", "29 April 1999");
//
//        System.out.println("Blood Group: "+ student2.getBloodGroup());
//        student2.setBloodGroup("O+");
//        System.out.println("Blood Group: "+ student2.getBloodGroup());
//        Classroom classroom1 = new Classroom("Near_playground", 10, "English");
//        System.out.println(classroom1.location);
//        System.out.println(classroom1.favouriteRoom);
//
//        System.out.println(classroom1.getFanCapacity());
//        System.out.println(classroom1.getHowManyRoom());
//        System.out.println(classroom1.getHowManyBenches());
//
//        System.out.println(classroom1.getLightCapacity());
//        classroom1.setLightCapacity(200);
//        System.out.println(classroom1.getLightCapacity());
//
//
//       //Teacher
//
//        Teacher teacher1 = new Teacher("Maruf",20, 2053,"Math");
//
//        System.out.println(teacher1.getName());
//        System.out.println(teacher1.getAge());
//        System.out.println(teacher1.getId());
//        System.out.println(teacher1.getSubject());
//
//        teacher1.setName("Prity");
//        System.out.println(teacher1.getName());
//
//        teacher1.setAge(30);
//        System.out.println(teacher1.getName());
//
//        int teacherId = teacher1.setId(93774); //
//        System.out.println(teacherId);
//        System.out.println("Id: "  + teacher1.getId());
//
//        teacher1.setSubject("English");
//        System.out.println(teacher1.getSubject());

        Practice practice = new Practice(5,10,15);
        System.out.println(practice.getNumber3());

        practice.setNumber1(50);
        System.out.println(practice.getNumber1());

        practice.setNumber2(40);
        System.out.println(practice.setNumber2(3));

        practice.setNumber3(200);
        System.out.println(practice.getNumber3());

        int result5= practice.addFunction();
        System.out.println(result5);

        int result6= practice.substractFunction();
        System.out.println(result6);

        int result7 = practice.multiplyFunction();
        System.out.println(result7);

        int result8 = practice.divisionFunction();
        System.out.println(result8);




        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(30);

        int result = calculator.add();
        System.out.println("Sum of N1 and N2: " + result);

        int result2 = calculator.substract();
        System.out.println("Substract: " + result2);

        int result3 = calculator.multiply();
        System.out.println("Multiplication: " + result3);

        int result4 = calculator.division();
        System.out.println("Division: " + result4);


    }

}
