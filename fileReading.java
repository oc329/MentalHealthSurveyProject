class fileReading
{
  public fileReading()
  {
       BufferedReader bReader = new BufferedReader(new FileReader("foo.in"));
  }
  
  public String getArrayOfQuestions();
  {
      String[] questionArray = new String[]; 
      String current_line = bReader.readLine();
      questionArray[0] = current_line;
      int i = 1;
      while(current_line != null)
      {
          current_line = bReader.readLine();
          if(current_line != ""){
            questionArray[i] = current_line;
            i++
          {
            
      }
      return questionArray;
  }
}
    
