import java.util.Scanner;
public class Survey {
    public static void main(String args[]) {
        
    Scanner response = new Scanner(System.in);
    
    String intro = "Welcome to the Mental Health Survey! We will be asking a number of questions to determine your mental state. Are you ready? (1:yes 2:no)";
    
    System.out.println(intro);
    int r = response.nextInt();
    
    String[] questions = new String[10];
    int[] answers = new int[10];
    
        questions[0] = "1/10: How often do you feel sad? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[1] = "2/10: Do you feel worried and stressed? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[2] = "3/10: How often do you face a conflict? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[3] = "4/10: Do you get lack of sleep and experience unbalanced dieting? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[4] = "5/10: Do you ever think of suicide? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[5] = "6/10: Do you express yourself very emotionally? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[6] = "7/10: Do you get easily triggered? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[7] = "8/10: Have people complained or talked about how you act? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[8] = "9/10: Do you ever feel like a different person? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";
        questions[9] = "10/10: Do you ever experience mood swings? \n(1: Never 2: Rarely 3:Sometimes 4:Often 5: Always)";

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
        String diagnosis = "Our results are in! You may have: ";
        
        int total = 0;
        for(int i = 0; i < 5; i++)
        {
            total += answers[i];
        }
        
        if((double)total / 5 >= 4.0)
        {
            diagnosis += "\n    severe depression";
        }
        else if((double)total / 5 >= 3.0)
        {
            diagnosis += "\n    mild depression";
        }
        total = 0;
        
        
        for(int i = 0; i < 10; i++)
        {
            total += answers[i];
        }
        
        if ((double)total / 10 >= 4.0)
        {
            diagnosis += "\n    severe bipolar disorder";
        }
        else if((double)total / 10 >= 3.0)
        {
            diagnosis += "\n    mild bipolar disorder";
        }
        total = 0;
        
        System.out.println(diagnosis);
        
    }
        
}
