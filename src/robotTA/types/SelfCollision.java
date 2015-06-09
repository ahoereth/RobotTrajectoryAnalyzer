

/* First created by JCasGen Tue Jun 09 13:22:47 CEST 2015 */
package robotTA.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Jun 09 13:22:47 CEST 2015
 * XML source: /home/ahoereth/Devel/RobotTrajectoryAnalyzer/src/robotTA/types/TypeSystem.xml
 * @generated */
public class SelfCollision extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SelfCollision.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected SelfCollision() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SelfCollision(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SelfCollision(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SelfCollision(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: perpetrator

  /** getter for perpetrator - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPerpetrator() {
    if (SelfCollision_Type.featOkTst && ((SelfCollision_Type)jcasType).casFeat_perpetrator == null)
      jcasType.jcas.throwFeatMissing("perpetrator", "robotTA.types.SelfCollision");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SelfCollision_Type)jcasType).casFeatCode_perpetrator);}
    
  /** setter for perpetrator - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPerpetrator(String v) {
    if (SelfCollision_Type.featOkTst && ((SelfCollision_Type)jcasType).casFeat_perpetrator == null)
      jcasType.jcas.throwFeatMissing("perpetrator", "robotTA.types.SelfCollision");
    jcasType.ll_cas.ll_setStringValue(addr, ((SelfCollision_Type)jcasType).casFeatCode_perpetrator, v);}    
   
    
  //*--------------*
  //* Feature: victim

  /** getter for victim - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVictim() {
    if (SelfCollision_Type.featOkTst && ((SelfCollision_Type)jcasType).casFeat_victim == null)
      jcasType.jcas.throwFeatMissing("victim", "robotTA.types.SelfCollision");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SelfCollision_Type)jcasType).casFeatCode_victim);}
    
  /** setter for victim - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVictim(String v) {
    if (SelfCollision_Type.featOkTst && ((SelfCollision_Type)jcasType).casFeat_victim == null)
      jcasType.jcas.throwFeatMissing("victim", "robotTA.types.SelfCollision");
    jcasType.ll_cas.ll_setStringValue(addr, ((SelfCollision_Type)jcasType).casFeatCode_victim, v);}    
  }

    