import java.util.Scanner;
public class WeatherScore
{
    public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please enter expected temperature, rain and hudmidity for Day 1:");
    System.out.println("Please enter expected temperature, rain and hudmidity for Day 2:");
    System.out.println("");
    double numTemp1, numTemp2, totalScore1, totalScore2;
    int scoreTemp1, scoreRain1, scoreHumid1, numRain1, numHumid1;
    int scoreTemp2, scoreRain2, scoreHumid2, numRain2, numHumid2;
    numTemp1 = scnr.nextDouble();
    numRain1 = scnr.nextInt();
    numHumid1 = scnr.nextInt();
    numTemp2 = scnr.nextDouble();
    numRain2 = scnr.nextInt();
    numHumid2 = scnr.nextInt();
    if (numTemp1 < 15) {
        scoreTemp1 = 2;
    }
    else if (numTemp1 <= 25) {
        scoreTemp1 = 3;
    }
    else {
        scoreTemp1 = 1;
    }

    if (numRain1 >= 0 && numRain1 < 4) {
        scoreRain1 = 3;
    }
    else if(numRain1 >= 4 && numRain1 < 9) {
        scoreRain1 = 2;
    }
    else {
        scoreRain1 = 1;
    }

    if (numHumid1 >= 0 && numHumid1 < 46) {
        scoreHumid1 = 3;
    }
    else if (numHumid1 >= 46 && numHumid1 < 61) {
        scoreHumid1 = 2;
    }
    else {
        scoreHumid1 = 1;
    }

    if (numTemp2 < 15) {
        scoreTemp2 = 2;
    }
    else if (numTemp1 <= 25) {
        scoreTemp2 = 3;
    }
    else {
        scoreTemp2 = 1;
    }

    if (numRain2 >= 0 && numRain2 < 4) {
        scoreRain2 = 3;
    }
    else if(numRain2 >= 4 && numRain2 < 9) {
        scoreRain2 = 2;
    }
    else {
        scoreRain2 = 1;
    }

    if (numHumid2 >= 0 && numHumid2 < 46) {
        scoreHumid2 = 3;
    }
    else if (numHumid2 >= 46 && numHumid2 < 61) {
        scoreHumid2 = 2;
    }
    else {
        scoreHumid2 = 1;
    }
    totalScore1 = scoreTemp1 * 3 + scoreRain1 * 2 + scoreHumid1;
    totalScore2 = scoreTemp2 * 3 + scoreRain2 * 2 + scoreHumid2;

    System.out.println("Outcome score day 1: " + totalScore1);
    System.out.println("Outcome score day 2: " + totalScore2);
    if (totalScore1 == totalScore2) {
        System.out.println("The best day to hold your event is: Day 1 or Day 2");
    }
    else if (totalScore1 > totalScore2) {
        System.out.println("The best day to hold your event is: Day 1");      
    }
    else {
        System.out.println("The best day to hold your event is: Day 2");
    }
  }
}
