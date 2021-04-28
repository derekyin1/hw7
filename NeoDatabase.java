import java.util.*;
public class NeoDatabase implements java.util.Collection<NearEarthObject>{
  public static final String API_KEY = "wOEXEZpeeV3MZ4qNJ3mT6QKnEgJ3LkE1azcfFfCy";

  public static final String API_ROOT = "https://api.nasa.gov/neo/rest/v1/neo/browse?";

  private ArrayList<NearEarthObject> database;

  public NeoDatabase(){
    database = new ArrayList<NearEarthObject>();
  }

  public String buildQueryURL(int pageNumber) throws IllegalArgumentException{
    if (pageNumber >= 0 && pageNumber <= 715){
      String url = API_ROOT + "page=" + pageNumber + "&api_key=" + API_KEY;
      return url;
    }
    else throw new IllegalArgumentException();
  }

  public void addAll(String queryURL) throws IllegalArgumentException{

  }

  public void sort(Comparator<NearEarthObject> comp) throws IllegalArgumentException{
    if (comp == null) throw new IllegalArgumentException();
    Collection.sort(database, comp);
  }

  public void printTable(){

  }
}
