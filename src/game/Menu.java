package game;

public class Menu {

  public static void main(String[] args){
    Menu m = new Menu();
    m.displayMenu();
  }

  public void displayMenu(){
    System.out.println("Welcome to the Nubmer Guessing Game!");
    System.out.println("Type 1 to start a new game");
    System.out.println("Type 2 to quit");
  }
}