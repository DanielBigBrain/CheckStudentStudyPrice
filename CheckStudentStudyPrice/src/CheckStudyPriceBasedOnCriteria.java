import java.util.Scanner;
public class CheckStudyPriceBasedOnCriteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double Price_For_Long_Time_Student = 1539;
        final double Price_For_Short_Time_Student = 2079;
        double Course_Points;
        double End_Price;
        //here we will check how much student will pay based on course points//
        System.out.println("Enter The amount of course point you have : ");
        Course_Points = scan.nextDouble();
        if (Course_Points > 18)
        {
            End_Price = Price_For_Long_Time_Student;
        }
        else
        {
            End_Price = Price_For_Short_Time_Student;
        }
        // here we check if the End_Price gets a discount based on status in life //
        int Life_Status;
        System.out.println("Enter the correct number based on the following criteria: : " +
                " 1 for retired or serving combat soldier" +" 2 for retired or serving non combat soldier" +
                " 3 other");
        Life_Status = scan.nextInt();
        switch (Life_Status)
        {
            case 1:
                End_Price *= 0.5 ;
                break;
            case 2:
                End_Price *= 0.9 ;
                break;
            case 3:
                End_Price *= 1.0 ;
                break;
            default:
                System.out.println("Wrong choice try again");
        }
        // here we determine End_Price based on the guidance given in the course //
        int guidance;
        System.out.println("please enter the number based on the guidance in the course " +
                "1 for normal guidance " + "2 for increased guidance");
        guidance = scan.nextInt();
        switch (guidance) {
            case 1:
                End_Price *= 1.0;
                break;
            case 2:
                End_Price += 301;
                break;
            default:
                System.out.println("Wrong choice try again");
        }
        // here we adjust the End_Price based on the semester//
        int semester;
        System.out.println("please enter the number based on the semester type " +
                " 1 for regular semester" + " 2 for summer semester");
        semester = scan.nextInt();
        switch (semester)
        {
            case 1: End_Price *= 1.0;
                    break;
            case 2: End_Price += 286;
                    break;
            default:
                System.out.println("Wrong choice try again");
        }
        System.out.println(" Based on the given circumstances the course price will be " + End_Price);





    }

}