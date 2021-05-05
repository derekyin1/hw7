/** Derek Yin 113251504 Recitation Section 1
*  This class runs a terminal-driven menu that allows a user to add pages from the NASA database to this program and sort them. 
*
*  @author Derek Yin
*/

import java.util.Scanner;
public class NeoViewer{

  public static void main(String[] args) {
    boolean menu = true;
    NeoDatabase database = new NeoDatabase();
    System.out.println("Welcome to NEO Viewer!");
    System.out.println("\nOption Menu:");
    while (menu){
      Scanner in = new Scanner(System.in);
      System.out.println("  A) Add a page to the database\n  S) Sort the database\n  P) Print the database as a table\n  Q) Quit\n");
      System.out.println("Select a menu option:");
      String s = in.nextLine();
      if (s.equalsIgnoreCase("A")){
        System.out.println("Enter the page to load:");
        if (in.hasNextInt()){
          int page = in.nextInt();
          try {
            String url = database.buildQueryURL(page);
            database.addAll(url);
            System.out.println("Page loaded successfully!");
          }
          catch (IllegalArgumentException e){
            System.out.println("Invalid input.");
            menu = false;
            menu = true;
            in.nextLine();
          }
        }
        else {
          System.out.println("Invalid input.");
          menu = false;
          menu = true;
          in.nextLine();
        }
      }
      else if (s.equalsIgnoreCase("S")){
        boolean sorting = true;
        while (sorting){
          System.out.println("  R) Sort by referenceID\n  D) Sort by diameter\n  A) Sort by approach date\n  M) Sort by miss distance\n");
          System.out.println("Select a menu option:");
          String opt = in.nextLine();
          if (opt.equalsIgnoreCase("R")){
            try{
              database.sort(new ReferenceIDComparator());
              System.out.println("Table sorted on reference ID.");
              sorting = false;
            }
            catch (IllegalArgumentException e){
              System.out.println("Invalid input.");
              menu = false;
              menu = true;
            }
          }
          else if (opt.equalsIgnoreCase("D")){
            try{
              database.sort(new DiameterComparator());
              System.out.println("Table sorted on diameter.");
              sorting = false;
            }
            catch (IllegalArgumentException e){
              System.out.println("Invalid input.");
              menu = false;
              menu = true;
            }
          }
          else if (opt.equalsIgnoreCase("A")){
            try{
              database.sort(new ApproachDateComparator());
              System.out.println("Table sorted on approach date.");
              sorting = false;
            }
            catch (IllegalArgumentException e){
              System.out.println("Invalid input.");
              menu = false;
              menu = true;
            }

          }
          else if (opt.equalsIgnoreCase("M")){
            try{
              database.sort(new MissDistanceComparator());
              System.out.println("Table sorted on miss distance.");
              sorting = false;
            }
            catch (IllegalArgumentException e){
              System.out.println("Invalid input.");
              menu = false;
              menu = true;
            }
          }
          else{
            System.out.println("Invalid input.");
            menu = false;
            menu = true;
          }
        }
      }
      else if (s.equalsIgnoreCase("P")){
        database.printTable();
      }
      else if (s.equalsIgnoreCase("Q")){
        System.out.println("Program terminating normally...");
        menu = false;
      }
      else{
        System.out.println("Invalid input.");
      }
    }
  }
}
