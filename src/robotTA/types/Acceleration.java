

/* First created by JCasGen Tue Jun 09 13:22:47 CEST 2015 */
package robotTA.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.DoubleArray;


/** 
 * Updated by JCasGen Tue Jun 09 13:22:47 CEST 2015
 * XML source: /home/ahoereth/Devel/RobotTrajectoryAnalyzer/src/robotTA/types/TypeSystem.xml
 * @generated */
public class Acceleration extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Acceleration.class);
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
  protected Acceleration() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Acceleration(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Acceleration(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Acceleration(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getValue() {
    if (Acceleration_Type.featOkTst && ((Acceleration_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "robotTA.types.Acceleration");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Acceleration_Type)jcasType).casFeatCode_value)));}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(DoubleArray v) {
    if (Acceleration_Type.featOkTst && ((Acceleration_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "robotTA.types.Acceleration");
    jcasType.ll_cas.ll_setRefValue(addr, ((Acceleration_Type)jcasType).casFeatCode_value, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for value - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getValue(int i) {
    if (Acceleration_Type.featOkTst && ((Acceleration_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "robotTA.types.Acceleration");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Acceleration_Type)jcasType).casFeatCode_value), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Acceleration_Type)jcasType).casFeatCode_value), i);}

  /** indexed setter for value - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setValue(int i, double v) { 
    if (Acceleration_Type.featOkTst && ((Acceleration_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "robotTA.types.Acceleration");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Acceleration_Type)jcasType).casFeatCode_value), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Acceleration_Type)jcasType).casFeatCode_value), i, v);}
  }

    