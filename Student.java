package javaapplication46;

public class Student {

    public static void main(String[] args) {
        
        technology student1 = new technology();
        technology student2 = new technology();
        technology student3 = new technology();
        technology student4 = new technology();
        technology student5 = new technology();
        
        
        
        System.out.println("INDEX :  Student 1 - Student 3 Used Non "
                + "Paramiterised Method");
        System.out.println();

        System.out.println("INDEX :  Student 4 - Student 5 Used  "
                + "Paramiterised Method");
        System.out.println();

        System.out.println("Information Of Student 1: ");
        
        

        student1.name = "Moon";
        student1.roll = 355578;
        student1.group = 'B';
        student1.num = 1763728938;

        student1.displayInformation();
        //declaration method

        System.out.println();
        System.out.println("Information Of Student 2: ");

        student2.name = "Abrar";
        student2.roll = 355579;
        student2.group = 'A';
        student2.num = 1763728939;
        student2.displayInformation();

        System.out.println();

        System.out.println("Information Of Student 3: ");
        student3.name = "Nahid";
        student3.roll = 355580;
        student3.group = 'A';
        student3.num = 988888888;
        student3.displayInformation();

        System.out.println();
        //thats All Non Parameterised Method

        System.out.println();

        System.out.println("Information Of Student 4: ");

        student4.setInformation("Aysha", 'A', 355581, 82839930);
        student4.displayInformation();

        System.out.println();

        System.out.println("Information Of Student 5: ");

        student5.setInformation("Anik", 'B', 355582, 82898748);
        student5.displayInformation();

        //Thats are paramiterised method
    }
}
