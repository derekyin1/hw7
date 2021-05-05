/** Derek Yin 113251504 Recitation Section 1
*  This class defines the NearEarthObject object.
*
*  @author Derek Yin
*/

import java.util.*;
import java.text.*;
public class NearEarthObject{
  private int referenceID;
  private String name;
  private double absoluteMagnitude;
  private double averageDiameter;
  private boolean isDangerous;
  private Date closestApproachDate;
  private double missDistance;
  private String orbitingBody;
/**
*This is the constructor for the NearEarthObject.
*
*@param referenceIDInit
*initial reference id
*@param nameInit
*initial name
*@param absoluteMagnitudeInit
*initial absolute magnitude
*@param minDiameter
*initial minimum diameter
*@param maxDiameter
*initial maximum diameter
*@param isDangerousInit
*initial value of whether this NearEarthObject is Dangerous
*@param closestDateTimestamp
*initial closest date timestamp
*@param missDistanceInit
*initial miss distance
*@param orbitingBodyInit
*initial orbiting body.
*
*/
  public NearEarthObject(int referenceIDInit, String nameInit, double absoluteMagnitudeInit, double minDiameter, double maxDiameter, boolean isDangerousInit, long closestDateTimestamp, double missDistanceInit, String orbitingBodyInit){
    referenceID = referenceIDInit;
    name = nameInit;
    absoluteMagnitude = absoluteMagnitudeInit;
    averageDiameter = (minDiameter + maxDiameter) / 2;
    isDangerous = isDangerousInit;
    closestApproachDate = new Date(closestDateTimestamp);
    missDistance = missDistanceInit;
    orbitingBody = orbitingBodyInit;
  }
/**
*This getter returns the reference id of this NearEarthObject.
*@return
*referenceID value of this NearEarthObject
*
*/
  public int getReferenceID(){
    return referenceID;
  }
/**
*This method sets the referenceId of this NearEarthObject
*@param newID
*desired ReferenceID of this object
*
*/
  public void setReferenceID(int newID){
    referenceID = newID;
  }
/**
*This getter returns the name of this NearEarthObject
*@return
*name of this NearEarthObject
*
*/
  public String getName(){
    String[] tokens = name.split("\\(");
    String str = "(" + tokens[1];
    return str;
  }
/**
*This method sets the name of this NearEarthObject
*@param newName
*desired name of this object
*
*/
  public void setName(String newName){
    name = newName;
  }
/**
*This getter returns the absolute magnitude of this NearEarthObject
*@return
*absolute magnitude of this object
*
*/
  public double getAbsoluteMagnitude(){
    return absoluteMagnitude;
  }
/**
*This method sets the absolute Magnitude of this NearEarthObject
*@param newMagnitude
*desired absolute magnitude of this object
*
*/
  public void setAbsoluteMagnitude(double newMagnitude){
    absoluteMagnitude = newMagnitude;
  }
/**
*This getter returns the Average diameter of this NearEarthObject
*@return
*average diameter of this object.
*
*/
  public double getAverageDiameter(){
    return averageDiameter;
  }
/**
*This method sets the average diameter of this NearEarthObject
*@param newDiameter
*desired average diameter of this object
*
*/
  public void setAverageDiameter(double newDiameter){
    averageDiameter = newDiameter;
  }
/**
*This getter returns a String "True" or "false" depending on the isDangerous variable.
*@return
*String "True" or "false" to be used in the printTable() method
*
*/
  public String getIsDangerous(){
    if (isDangerous) return "true";
    return "false";
  }
/**
*This method sets the Dangerous? boolean of this NearEarthObject
*@param newBool
*desired boolean state of the isDangerous variable of this object
*
*/
  public void setIsDangerous(boolean newBool){
    isDangerous = newBool;
  }
/**
*This getter returns a formatted date of the closest approach date of this object in mm-dd-yy in String form.
*@return
*formatted date in mm-dd-yy in String form.
*
*/
  public String getClosestApproachDate(){
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yy");
    String strDate = dateFormat.format(closestApproachDate);
    return strDate;
  }
/**
*This method sets the closest approach date of this NearEarthObject
*@param newDate
*desired closest approach date of this object
*
*/
  public void setClosestApproachDate(Date newDate){
    closestApproachDate = newDate;
  }
/**
*This getter returns the missDistance of this object as an integer, to be printed in the printTable() method
*@return
*miss Distance of this object in Integer form.
*
*/
  public int getMissDistance(){
    return (int) missDistance;
  }
/**
*This method sets the miss distance of this NearEarthObject
*@param newDistance
*desired distance of this object
*
*/
  public void setMissDistance(double newDistance){
    missDistance = newDistance;
  }
/**
*This getter returns the orbting body of this NearEarthObject
*@return
*orbting body of this NearEarthObject
*
*/
  public String getOrbitingBody(){
    return orbitingBody;
  }
/**
*This method sets the orbiting body of this NearEarthObject
*@param newBody
*desired orbiting body of this object
*
*/
  public void setOrbitingBody(String newBody){
    orbitingBody = newBody;
  }





}
