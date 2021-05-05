public class ReferenceIDComparator implements java.util.Comparator<NearEarthObject>{

  public ReferenceIDComparator(){

  }
  public int compare(NearEarthObject n1, NearEarthObject n2){
    if (n1.getReferenceID() == n2.getReferenceID()){
      return 0;
    }
    else if (n1.getReferenceID() > n2.getReferenceID()){
      return 1;
    }
    else return -1;
  }
}
