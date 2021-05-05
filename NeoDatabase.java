/** Derek Yin 113251504 Recitation Section 1
*  This class represents the database that holds Near Earth Objects. ArrayList data structure was used.
*
*  @author Derek Yin
*/
import java.util.*;
import big.data.*;

public class NeoDatabase{
  public static final String API_KEY = "wOEXEZpeeV3MZ4qNJ3mT6QKnEgJ3LkE1azcfFfCy";

  public static final String API_ROOT = "https://api.nasa.gov/neo/rest/v1/neo/browse?";

  private ArrayList<NearEarthObject> database;
/**
*This is the constructor for the NeoDatabase
*
*/
  public NeoDatabase(){
    database = new ArrayList<NearEarthObject>();
  }
/**
*This method builds the URL to be parsed by the DataSource object.
*@param pageNumber
*desired page number of the online database.
*@return
*URL with specified page number in String form.
*@throws
*IllegalArgumentException if pageNumber is out of bounds.
*/
  public String buildQueryURL(int pageNumber) throws IllegalArgumentException{
    if (pageNumber >= 0 && pageNumber <= 715){
      String url = API_ROOT + "page=" + pageNumber + "&api_key=" + API_KEY;
      return url;
    }
    else throw new IllegalArgumentException();
  }
/**
*This method adds all the near earth objects gathered by the DataSource object to the database ArrayList.
*@param queryURL
*URL for DataSource to connect to
*@throws
*IllegalArgumentException if queryURL is null.
*/
  public void addAll(String queryURL) throws IllegalArgumentException{
    if (queryURL == null) throw new IllegalArgumentException();
    DataSource ds = DataSource.connectJSON(queryURL);
    ds.load();
    List<NearEarthObject> toAdd = ds.fetchList("NearEarthObject", "near_earth_objects/neo_reference_id", "near_earth_objects/name", "near_earth_objects/absolute_magnitude_h", "near_earth_objects/estimated_diameter/kilometers/estimated_diameter_min", "near_earth_objects/estimated_diameter/kilometers/estimated_diameter_max", "near_earth_objects/is_potentially_hazardous_asteroid", "near_earth_objects/close_approach_data/epoch_date_close_approach", "near_earth_objects/close_approach_data/miss_distance/kilometers","near_earth_objects/close_approach_data/orbiting_body");
    for (NearEarthObject n : toAdd){
      database.add(n);
    }

  }
/**
*This method sorts the database on the specified comparator.
*@param comp
*desired comparator to sort the database with
*@throws
*IllegalArgumentException if comp is null.
*/
  public void sort(Comparator<NearEarthObject> comp) throws IllegalArgumentException{
    if (comp == null) throw new IllegalArgumentException();
    Collections.sort(database, comp);
  }
/**
*This method prints a Table of the database.
*/
  public void printTable(){
    String str = "     ID   |      Name    | Mag. | Diameter | Danger | Close Date | Miss Dist | Orbits\n" +
            "======================================================================================\n";
    int counter = 0;
    for (NearEarthObject n : database){
      counter++;
      if (counter>21) break;
      str += String.format("%-14d%-13s%-8s%-10s%-10s%-12s%-12d%-12s", n.getReferenceID(), (String) n.getName(), String.format("%.1f", n.getAbsoluteMagnitude()), String.format("%.3f", n.getAverageDiameter()), (String) n.getIsDangerous(), (String) n.getClosestApproachDate(), n.getMissDistance(), (String) n.getOrbitingBody());
    //  str+= n.getReferenceID()+ "      " +  (String) n.getName() + "   " + String.format("%.1f", n.getAbsoluteMagnitude()) + "     "+ String.format("%.3f", n.getAverageDiameter()) + "      "+ (String) n.getIsDangerous() + "     "+  (String) n.getClosestApproachDate() + "    "+   n.getMissDistance() + "    "+ (String) n.getOrbitingBody();
      str+="\n";
    }
    System.out.println(str);

  }

}
