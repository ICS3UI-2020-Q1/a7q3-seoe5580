/**
 * This program will generate random patterens of asterisks
 * @author Eric Seo
 */
public class Main {

  // creates a method for random number generating
  public static int generateRandomNum(){
    int randNum = (int)(Math.random()*(5 - 1 + 1)) + 1;
    return randNum;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // using the for loop it will repeat itself 10 times and using the method whenever it prints out intger between 1 ~ 5 it will change it to star instead
    for(int i = 0; i < 10; i++){
      if(generateRandomNum() == 1){
        System.out.println("*");
      }
      if(generateRandomNum() == 2){
        System.out.println("**");
      }
      if(generateRandomNum() == 3){
        System.out.println("***");
      }
      if(generateRandomNum() == 4){
        System.out.println("****");
      }
      if(generateRandomNum() == 5){
        System.out.println("*****");
      }
    }
    // it didnt say how much I had to print the asterisks out for so I just did 10 lines
  }
}
