import java.util.Scanner;
public class Survey {
    public static void main(String args[]) {
        
    Scanner response = new Scanner(System.in);
    
    String intro = "Welcome to the Mental Health Survey! We will be asking a number of questions to determine your mental state. Are you ready? (1:yes 2:no)";
    
    System.out.println(intro);
    int r = response.nextInt();
    
    String[] questions = new String[10];
    int[] answers = new int[10];
    
    String num_prompt = \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
    
        questions[0] = "1/10: How often do you feel sad? + num_prompt;
        questions[1] = "2/10: Do you feel worried and stressed? + num_prompt;
        questions[2] = "3/10: How often do you face a conflict? + num_prompt;
        questions[3] = "4/10: Do you get lack of sleep and experience unbalanced dieting? + num_prompt;
        questions[4] = "5/10: Do you ever think of suicide? + num_prompt;
        questions[5] = "6/10: Do you express yourself very emotionally? + num_prompt;
        questions[6] = "7/10: Do you get easily triggered? + num_prompt;
        questions[7] = "8/10: Have people complained or talked about how you act? + num_prompt;
        questions[8] = "9/10: Do you ever feel like a different person? + num_prompt;
        questions[9] = "10/10: Do you ever experience mood swings? + num_prompt;

        if (r == 1)
        {
            System.out.println("Great! Let's begin.");
        }
        
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
        String diagnosis = "Our results are in! You may have the following: ";
        
        int total = 0;
        for(int i = 0; i < 5; i++)
        {
            total += answers[i];
        }
        
        if((double)total / 5.0 >= 4.0)
        {
            diagnosis += "\n    severe depression";
        }
        else if((double)total / 5.0 >= 3.0)
        {
            diagnosis += "\n    mild depression";
        }
        else
        {
            diagnosis += "\n    n/a";
        }
        total = 0;
        
        
        for(int i = 0; i < 10; i++)
        {
            total += answers[i];
        }
        
        if ((double)total / 10.0 >= 4.0)
        {
            diagnosis += "\n    severe bipolar disorder";
        }
        else if((double)total / 10.0 >= 3.0)
        {
            diagnosis += "\n    mild bipolar disorder";
        }
        else
        {
            diagnosis += "\n    n/a";
        }
        total = 0;
        
        System.out.println(diagnosis);
        
    }
        
}
