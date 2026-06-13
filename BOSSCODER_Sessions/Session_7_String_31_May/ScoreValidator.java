package BOSSCODER_Sessions.Session_7_String_31_May;

public class ScoreValidator {
    static public int[] validateScore(String[] events){
        int[] finalScore = {0,0};
        int score = 0;
        int counter = 0;
        
          for(int i=0;i<events.length;i++){
            //int sum =0;
              if(events[i].equals("WD") ||events[i].equals("NB")) score++;
              else if(events[i]=="W") counter++;
              else { 
                score = score+Integer.parseInt(events[i]);
              }
          }
        finalScore[0] = score;
        finalScore[1] = counter;
        return finalScore;
    }
  
  public static void main(String[] args) {
    String[] events = {"WD","NB","0","4","4"};
        System.out.println(validateScore(events)[0]+" "+validateScore(events)[1]);


  }
}
