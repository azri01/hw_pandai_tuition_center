import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int markRandom = random.nextInt(101);
        int markRandom2 = random.nextInt(101);
        int markRandom3 = random.nextInt(101);
        int markRandom4 = random.nextInt(101);

        String randomName = NameGenerator.generateName();
        String randomName2 = NameGenerator.generateName2();


        Teacher teacher1 = new Teacher(new Name(randomName, randomName, randomName), "10100101010", "address -1", 10, "PHD");
        Teacher teacher2 = new Teacher(new Name(randomName2, randomName2, randomName2), "01010101010", "address 0", 5, "B.Ed.");


        StudentBatch batch1 = new StudentBatch(teacher1,5);
        StudentBatch batch2 = new StudentBatch(teacher2,5);


        batch1.setTeacher(teacher1);
        batch2.setTeacher(teacher2);


        Student student1 = new Student(new Name("Azri", "roy", "Juhaidi"), "1234567890", "address1", "school1");
        student1.setMark(0, markRandom);
        student1.setMark(1, markRandom);
        student1.setMark(2, markRandom);
        student1.setMark(3, markRandom);
        student1.setMark(4, markRandom);

        Student student2 = new Student(new Name("Barack", "", "Obama"), "101010010", "White house", "school3");
        student2.setMark(0, markRandom2);
        student2.setMark(1, markRandom2);
        student2.setMark(2, markRandom2);
        student2.setMark(3, markRandom2);
        student2.setMark(4, markRandom2);

        Student student3 = new Student(new Name("Quandale", "", "Dingle"), "01010101", "Ohio", "school3");
        student3.setMark(0, markRandom3);Math.max(student1.getHighestMark(), student2.getHighestMark());
        student3.setMark(1, markRandom3);
        student3.setMark(2, markRandom3);
        student3.setMark(3, markRandom3);
        student3.setMark(4, markRandom3);

        Student student4 = new Student(new Name("Juan", "", "Man"), "10010101001", "address2", "school3");
        student4.setMark(0, markRandom4);
        student4.setMark(1, markRandom4);
        student4.setMark(2, markRandom4);
        student4.setMark(3, markRandom4);
        student4.setMark(4, markRandom4);



        // Add the students to the student batches
        batch1.addStudent(student1);
        batch1.addStudent(student2);
        batch2.addStudent(student3);
        batch2.addStudent(student4);


        //batch1.findStudent("yoy");

        System.out.println("Average mark for tuition in KL is : " + ((student1.getAverageMark()+student2.getAverageMark()))/2);
        System.out.println("Average mark for tuition in JB is :"+ ((student3.getAverageMark()+student4.getAverageMark()))/2);


        int max1 = Math.max(student1.getHighestMark(), student2.getHighestMark());
        int max2 = Math.max(student3.getHighestMark(), student4.getHighestMark());

        System.out.println("Highest mark in tuition in KL is: " + max1);
        System.out.println("Highest mark in tuition in JB is: " + max2);

        int low1 = Math.min(student1.getLowestMark(), student2.getLowestMark());
        int low2 = Math.min(student3.getLowestMark(), student4.getLowestMark());

        System.out.println("Lowest mark in tuition in KL is: " + low1);
        System.out.println("Lowest mark in tuition in JB is: " + low2);

    }
}