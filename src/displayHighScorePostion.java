public class displayHighScorePostion {

    public void  displayHighScorePostion (String name,int  position) {

        System.out.println(name + " managed to get in a position " + position + " on the high score table");

    }

    public int calculateScorePosition (int score) {
        if (score >= 1000) {
           return 1;
        } else if (score >= 500 && score < 1000 ) {
            return 2;
        } else if (score >= 100 & score < 500) {
          return 3;
        } else {
           return 4;
        }



}
}
