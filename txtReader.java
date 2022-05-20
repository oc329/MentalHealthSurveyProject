import java.io.*; // Imports all of java's input output library 

class txtReader 
{
  public fileReading()
  {
       BufferedReader bReader = new BufferedReader(new FileReader("../questions.txt"));
  }
  
  public String getArrayOfQuestions();
  {
      String[] questionArray = new String[10]; 
      String current_line = bReader.readLine(new FileReader("../questions.txt"));
      questionArray[0] = current_line;
      int i = 1;
      while(current_line != null)
      {
          current_line = bReader.readLine();
          if(current_line != ""){
            questionArray[i] = current_line;
            i++;
          }
            
      }
      return questionArray;
  }
}
    
