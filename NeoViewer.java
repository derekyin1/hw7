import java.util.Scanner;
public class NeoViewer{
  public static void main(String[] args) {
    boolean menu = true;
    System.out.println("Welcome to NEO Viewer!");
    System.out.println("\nOption Menu:")
    while (menu){
      Scanner in = new Scanner(System.in);
      System.out.println("  A) Add a page to the database\n  S) Sort the database\n  P) Print the database as a table\n  Q) Quit\n");
      System.out.println("Select a menu option:");
      String s = in.nextLine();
      if (s.equalsIgnoreCase("A")){

      }
      if (s.equalsIgnoreCase("S")){
        boolean sorting = true;
        while (sorting){
          System.out.println("  R) Sort by referenceID\n  D) Sort by diameter\n  A) Sort by approach date\n  M) Sort by miss distance\n");
          System.out.println("Select a menu option:");
          String opt = in.nextLine();
          if (opt.equalsIgnoreCase("R")){

          }
          if (opt.equalsIgnoreCase("D")){

          }
          if (opt.equalsIgnoreCase("A")){

          }
          if (opt.equalsIgnoreCase("M")){

          }
          else{
            System.out.println("Invalid input.");
          }
        }
      }
      if (s.equalsIgnoreCase("P")){

      }
      if (s.equalsIgnoreCase("Q")){
        System.out.println("Program terminating normally...");
        menu = false;
      }
      else{
        System.out.println("Invalid input.");
      }
    }
  }
}
