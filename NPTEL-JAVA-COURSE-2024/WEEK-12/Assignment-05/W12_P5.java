// Write a program to create a Tic-Tac-Toe game.

// You have to create the logic for determining the winner, INPUT and OUTPUT is already taken care of.

// Read the code and find a method to determine the winner and store in the variable `winner` (x, o).
// If it's a draw then set the `gameWon` variable as false.
import java.util.Scanner;

public class W12_P5 {

  private static final int ROWS = 3;
  private static final int COLS = 3;

  private static char[][] board = new char[ROWS][COLS];

  private static void initializeBoard() {
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {
        board[i][j] = '-';
      }
    }
  }

  private static void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < ROWS; i++) {
      System.out.print("| ");
      for (int j = 0; j < COLS; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("-------------");
    }
  }

  private static void inputBoard(Scanner scanner) {
    for (int i = 0; i < ROWS; i++) {
      String line = scanner.nextLine();
      String[] cells = line.split(" ");
      for (int j = 0; j < COLS; j++) {
        board[i][j] = cells[j].charAt(0);
      }
    }
  }

  private static void printWinner(boolean gameWon, char winner) {
    // Print result
    if (gameWon) {
      System.out.print("Player " + winner + " wins!");
    } else {
      System.out.print("It's a draw!");
    }
  }

  public static void main(String[] args) {
    boolean gameWon = false;
    char winner = '-';

    Scanner scanner = new Scanner(System.in);

    initializeBoard();
    inputBoard(scanner);
    printBoard();
// Check for winner
    for (int i = 0; i < ROWS; i++) {
      if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
        gameWon = true;
        winner = board[i][0];
        break;
      }
      if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != '-') {
        gameWon = true;
        winner = board[0][i];
        break;
      }
    }
    if (!gameWon) {
      if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
        gameWon = true;
        winner = board[0][0];
      }
      if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != '-') {
        gameWon = true;
        winner = board[0][2];
      }
    }
printWinner(gameWon, winner);
    scanner.close();
  }
}