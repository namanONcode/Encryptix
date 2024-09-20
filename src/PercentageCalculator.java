import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        //CODE FOR INPUT

        Scanner sc = new Scanner(System.in);

        System.out.print("Name : ");
        String Name = sc.nextLine();


        System.out.print("Class : ");
        byte std = sc.nextByte();

        sc.nextLine();


        System.out.print("Section : ");
        String sec = sc.nextLine();


        System.out.print("Roll : ");
        int roll = sc.nextInt();



        System.out.print("Marks of the subject 1 : ");
        double sub1 = sc.nextDouble();

        System.out.print("Marks of the subject 2 : ");
        double sub2 = sc.nextDouble();

        System.out.print("Marks of the subject 3 : ");
        double sub3 = sc.nextDouble();

        System.out.print("Marks of the subject 4 : ");
        double sub4 = sc.nextDouble();

        System.out.print("Marks of the subject 5 : ");
        double sub5 = sc.nextDouble();

        System.out.print("Total Marks : ");
        int out = sc.nextInt();

        // Code for Output

        System.out.println("\n  ");
        System.out.println("Student Academics SCORE");
        System.out.println("  ");
        System.out.println("Student Name : "+Name);
        System.out.println("  ");
        System.out.println("Class : "+std);
        System.out.println("  ");
        System.out.println("Sec : "+sec);
        System.out.println("  ");
        System.out.println("Roll : "+roll);
        System.out.println("  ");
        System.out.println("  ");

        double total = sub1+sub2+sub3+sub4+sub5;
        double percent = (total/out)*100;

        System.out.println("Total Marks Obained "+total+" From "+out+" M.M");
        System.out.println("  ");
        System.out.println("Total Percentage "+percent+"%");
        if(percent < 50){
            System.out.println("Fail");}
        else{
            System.out.println("Pass");
        }



        sc.close();



    }
}
