import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("** Student Grade Calculator **");
        System.out.println("Enter number of subjects:");
        int nos=sc.nextInt();

        int Totalmarks=0;
        for (int i=1;i<=nos;i++){
            System.out.println("Enter marks for subject"+ i +"(out of 100)");
            int marks=sc.nextInt();
            Totalmarks+=marks;
        }
        System.out.println("Student Result:");
        System.out.println("Total marks obtained = "+ Totalmarks);

        double Avgpercentage=(double) Totalmarks/nos;
        System.out.println("Average Percentage = "+Avgpercentage);

        if(Avgpercentage>=90){
            System.out.println("Your grade is: A+");
        }
        else if(Avgpercentage>=80){
            System.out.println("Your grade is: A");
        }
        else if(Avgpercentage>=70){
            System.out.println("Your grade is: B");
        }
        else if(Avgpercentage>=60){
            System.out.println("Your grade is: C");
        }
        else if(Avgpercentage>=50){
            System.out.println("Your grade is: D");
        }
        else if(Avgpercentage>=40){
            System.out.println("Your grade is: E");
        }
        else {
            System.out.println("F");
        }









    }

}
