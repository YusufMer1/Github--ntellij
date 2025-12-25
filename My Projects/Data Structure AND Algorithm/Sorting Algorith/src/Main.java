public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1,12,"Mert","Mutlu","SENG",85,"asd@gmail.com");
        Student st2 = new Student(2,13,"Joe","asdf","SENG",90,"asd@gmail.com");
        Student st3 = new Student(3,14,"Bob","asdf","SENG",60,"asd@gmail.com");
        Student st4 = new Student(4,15,"Jake","asdf","SENG",76,"asd@gmail.com");
        Student st5 = new Student(5,16,"Mike","asdf","SENG",64,"asd@gmail.com");
        Student st6 = new Student(6,17,"George","asdf","SENG",69,"asd@gmail.com");
        Student st7 = new Student(7,18,"Rick","asdf","SENG",90,"asd@gmail.com");
        Student st8 = new Student(8,19,"Dexter","asdf","SENG",95,"asd@gmail.com");

        Student[] sta = {st1,st2,st3,st4,st5,st6,st7};

        StudentSorter studentSorter = new StudentSorter();

        System.out.println("---------BY GRADE-----------");
        studentSorter.InsertionSort(sta,true);
        for(int i = 0;i < sta.length;i++) {
            System.out.println(sta[i].StudentInfo());
        }
        System.out.println();

        System.out.println("------BY STUDENT ID----------");
        studentSorter.InsertionSort(sta,false);
        for(int i = 0;i < sta.length;i++) {
            System.out.println(sta[i].StudentInfo());
        }





    }
}