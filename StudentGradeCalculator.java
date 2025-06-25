import java.util.*;
public class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of subjects:");
        int num=sc.nextInt();
        int tot=0;
        for(int i=0;i<num;i++){
            System.out.println("Enter marks obtained in "+(i+1)+":");
            int marks=sc.nextInt();
            tot+=marks;
        }
        double averPerc=(double) tot/num;
        char Grade;
        if(averPerc>=90){
            Grade='O';
        }
        else if(averPerc>=80){
            Grade='A';
        }
        else if(averPerc>=70){
            Grade='B';
        }
        else if(averPerc>=60){
            Grade='C';
        }
        else if(averPerc>=50){
            Grade='D';
        }
        else if(averPerc>=40){
            Grade='E';
        }
        else{
            Grade='F';
        }
        System.out.println("Total Marks Scored is:"+tot);
        System.out.println("Average Percentage gained is:"+averPerc+"%");
        System.out.println("Grade that student has gained:"+Grade);
    }
}