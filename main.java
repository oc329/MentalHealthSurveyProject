import java.util.Scanner;
public class Survey {
    public static void main(String args[]) {
        
    Scanner response = new Scanner(System.in);
    new txtReader reader = new txtReader();
    
    String[] sQuestions = txtReader.getArrayOfQuestions();
    System.out.println(sQuestions); 
        
    String intro = "Welcome to the Mental Health Survey! We will be asking a number of questions to determine your mental state. Are you ready? (1:yes 2:no)";
    
    System.out.println(intro);
    int r = response.nextInt();
    
    String[] questions = new String[10];
    int[] answers = new int[10];
    
        questions[0] = "1/10";
        questions[1] = "2/10";
        questions[2] = "3/10";
        questions[3] = "4/10";
        questions[4] = "5/10";
        questions[5] = "6/10";
        questions[6] = "7/10";
        questions[7] = "8/10";
        questions[8] = "9/10";
        questions[9] = "10/10";
    

        while (r == 1)
        {
            for(int i = 0; i < questions.length; i++)
            {
                System.out.println(questions[i] + " ");
                answers[i] = response.nextInt();
            }
            r = 0;
            
        }
        
        while (r == 2)
        {
            System.out.println(intro);
            r = response.nextInt();
        }
         
        //code to determine conditions
    }
}



