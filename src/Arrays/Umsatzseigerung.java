package Arrays;

public class Umsatzseigerung {

	private static int day;
	private static int nextDay;
	private static double percentJump;
	private static int JumpCounter;
	private static int[] dailyGains = new int[31]; 
	
	 public static void main(String[] args) {
	        dailyGains[0] = 1000;
	        dailyGains[1] = 2000;
	        dailyGains[2] = 500;
	        dailyGains[3] = 9000;
	        dailyGains[4] = 9010;
	        
	 }


    public static int count5PercentJumps(int[] gains) {
    for(int i = 0; i >= dailyGains.length; i++) {
    	  day = dailyGains[i];
     if(i >= dailyGains.length) {
    System.err.println("lastDay");
    nextDay = dailyGains[0];
     }else {
    	 
     }
    nextDay = dailyGains[i +1];
     }
     percentJump = nextDay * 0.05;
     if((nextDay - day) >= percentJump) {
         percentJumpCount ++;
     }
 }
 return percentJumpCount;
}
        
        

    