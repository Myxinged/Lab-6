import java.util.Scanner;

public class GradeCalculator
{
        public static void main(String[] args)
        {

                int PracticeProblem, Labs, Mid, Final,Total;

                Scanner sc = new Scanner(System.in);
                //Promt the user to enter the score
                System.out.print("Enter the score for practice problems:");
                PracticeProblem = sc.nextInt();
                //If the score they enter is invalid promt them to enter again
                while(PracticeProblem<0 || PracticeProblem>44) {
                	if(PracticeProblem<0 || PracticeProblem>44)
                	System.out.print("The score you enter are out of range, Please re-enter again: ");
                	PracticeProblem = sc.nextInt();
                }
                System.out.print("Enter the score for Labs:");
                Labs = sc.nextInt();
                while(Labs<0 || Labs>14) {
                	if(Labs<0 || Labs>14)
                	System.out.print("The score you enter are out of range, Please re-enter again: ");
                	Labs = sc.nextInt();
                }


                System.out.print("Enter the score you got on midterm:");
                Mid = sc.nextInt();
                while(Mid<0 || Mid>20) {
                	if(Mid<0 || Mid>20)
                	System.out.print("The score you enter are out of range, Please re-enter again: ");
                	Mid = sc.nextInt();
                }



                System.out.print("Enter the score you got on final:");
                Final = sc.nextInt();
                while(Final<0 || Final>20) {
                	if(Final<0 || Final>20)
                	System.out.print("The score you enter are out of range, Please re-enter again: ");
                	Final = sc.nextInt();
                }
                //The final grade you get for the course
                Total = PracticeProblem + Labs + Mid + Final;

                //Print out the actual grade and letter grade
                if(Total > 89)
                        System.out.print("The average score you got is " + Total + ", Grade A");
                else if(Total > 79)
                        System.out.print("The average score you got is " + Total + ", Grade B");
                else if(Total > 69)
                        System.out.print("The average score you got is " + Total + ", Grade C");
                else if(Total > 59)
                        System.out.print("The average score you got is " + Total + ", Grade D");
                else
                        System.out.print("The average score you got is " + Total + ", Grade F");
        }
}
