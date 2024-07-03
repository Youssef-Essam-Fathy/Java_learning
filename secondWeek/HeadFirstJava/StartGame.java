class Player {
  int number = 0;

  void guess() {
    number = (int)(Math.random() * 10);
    System.out.println("I am guessing: " + number);
  }
}

class GuessGame {
  Player p1;
  Player p2;
  Player p3;
  
  void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    boolean isP1Right = false;
    boolean isP2Right = false;
    boolean isP3Right = false;

    int targetNumber = (int)(Math.random() * 10);
    System.out.println("Guess a number between 0 and 9...");

    while(true) {
      System.out.println("The number to guess is " + targetNumber);
      
      p1.guess();
      p2.guess();
      p3.guess();
      
      int guessP1 = p1.number;
      System.out.println("Player 1 guessed " + guessP1);
      
      int guessP2 = p2.number;
      System.out.println("Player 2 guessed " + guessP2);
      
      int guessP3 = p3.number;
      System.out.println("Player 3 guessed " + guessP3);

      if (guessP1 == targetNumber) {
        isP1Right = true;
      }
      if (guessP2 == targetNumber) {
        isP2Right = true;
      }
      if (guessP3 == targetNumber) {
        isP3Right = true;
      }
      
      if (isP1Right || isP2Right || isP3Right) {
        System.out.println("Is player 1 right ? " + isP1Right);
        System.out.println("Is player 2 right ? " + isP2Right);
        System.out.println("Is player 3 right ? " + isP3Right);
        break;
      } else {
        System.out.println("Sorry the 3 players have to guess again");
      }

    }



  }

}

public class StartGame {
  public static void main(String[] args) {
    GuessGame game = new GuessGame();
    game.startGame();
  }
} 