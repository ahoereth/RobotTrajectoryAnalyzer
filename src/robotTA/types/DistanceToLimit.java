

/* First created by JCasGen Tue Jun 09 13:22:47 CEST 2015 */
package robotTA.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.DoubleArray;
import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Tue Jun 09 13:22:47 CEST 2015
 * XML source: /home/ahoereth/Devel/RobotTrajectoryAnalyzer/src/robotTA/types/TypeSystem.xml
 * @generated */
public class DistanceToLimit extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DistanceToLimit.class);
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
  protected DistanceToLimit() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DistanceToLimit(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DistanceToLimit(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DistanceToLimit(JCas jcas, int begin, int end) {
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
  //* Feature: upperLimit

  /** getter for upperLimit - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getUpperLimit() {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_upperLimit == null)
      jcasType.jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_upperLimit)));}
    
  /** setter for upperLimit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUpperLimit(DoubleArray v) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_upperLimit == null)
      jcasType.jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    jcasType.ll_cas.ll_setRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_upperLimit, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for upperLimit - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getUpperLimit(int i) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_upperLimit == null)
      jcasType.jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_upperLimit), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_upperLimit), i);}

  /** indexed setter for upperLimit - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setUpperLimit(int i, double v) { 
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_upperLimit == null)
      jcasType.jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_upperLimit), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_upperLimit), i, v);}
   
    
  //*--------------*
  //* Feature: lowerLimit

  /** getter for lowerLimit - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getLowerLimit() {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_lowerLimit == null)
      jcasType.jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_lowerLimit)));}
    
  /** setter for lowerLimit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLowerLimit(DoubleArray v) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_lowerLimit == null)
      jcasType.jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    jcasType.ll_cas.ll_setRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_lowerLimit, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for lowerLimit - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getLowerLimit(int i) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_lowerLimit == null)
      jcasType.jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_lowerLimit), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_lowerLimit), i);}

  /** indexed setter for lowerLimit - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setLowerLimit(int i, double v) { 
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_lowerLimit == null)
      jcasType.jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_lowerLimit), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_lowerLimit), i, v);}
   
    
  //*--------------*
  //* Feature: jointNames

  /** getter for jointNames - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getJointNames() {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_jointNames)));}
    
  /** setter for jointNames - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setJointNames(StringArray v) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
    jcasType.ll_cas.ll_setRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_jointNames, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for jointNames - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getJointNames(int i) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_jointNames), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_jointNames), i);}

  /** indexed setter for jointNames - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setJointNames(int i, String v) { 
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_jointNames), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_jointNames), i, v);}
   
    
  //*--------------*
  //* Feature: effort

  /** getter for effort - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getEffort() {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_effort)));}
    
  /** setter for effort - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEffort(DoubleArray v) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
    jcasType.ll_cas.ll_setRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_effort, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for effort - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getEffort(int i) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_effort), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_effort), i);}

  /** indexed setter for effort - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEffort(int i, double v) { 
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_effort), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_effort), i, v);}
   
    
  //*--------------*
  //* Feature: velocity

  /** getter for velocity - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getVelocity() {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_velocity == null)
      jcasType.jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_velocity)));}
    
  /** setter for velocity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVelocity(DoubleArray v) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_velocity == null)
      jcasType.jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    jcasType.ll_cas.ll_setRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_velocity, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for velocity - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getVelocity(int i) {
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_velocity == null)
      jcasType.jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_velocity), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_velocity), i);}

  /** indexed setter for velocity - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVelocity(int i, double v) { 
    if (DistanceToLimit_Type.featOkTst && ((DistanceToLimit_Type)jcasType).casFeat_velocity == null)
      jcasType.jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_velocity), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DistanceToLimit_Type)jcasType).casFeatCode_velocity), i, v);}
  }

    