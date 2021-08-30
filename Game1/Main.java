package Games.Game1;


import javax.swing.*;
import java.util.Random;

class PlayGround{
    static int leftx=-180;
    static int rightx=180;

}
class FootBall{
   static   int d=5;
   public static int hitx(){
       Random random=new Random();

       int xrange=PlayGround.rightx-PlayGround.leftx+1;



       int placex = random.nextInt(xrange)+PlayGround.leftx+FootBall.d;
       return placex;


   }
    public static int  hity(){
        Random random=new Random();
        int yrange=random.nextInt(Goal.topy);
        int placey=random.nextInt(yrange)-FootBall.d;
        return placey;


}

}
class GoalKeeper{
    final int height=60;
    final int weight=25;

}
class Goal{
 static int height=80;
 static int weight=60;
 static int leftsidex=-30;
 static int rightsidex=30;
 static int topy=80;
 final int bottomy=0;

}

public class Main {
    public static void main(String[] args) {
        int chances=5;
        int GoalCount=0;
        while(chances>0){
            if(Goal.rightsidex<=FootBall.hitx()&&Goal.leftsidex<=FootBall.d+FootBall.hitx()&&Goal.topy>=FootBall.hity()){
                System.out.println("Goal");
                GoalCount++;

            }
            else{
                System.out.println("Fail");

            }
            chances--;
        }
        System.out.println("You Got "+GoalCount+" Goals");



    }
}
