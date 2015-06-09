

/* First created by JCasGen Tue Jun 09 13:22:47 CEST 2015 */
package robotTA.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Tue Jun 09 13:22:47 CEST 2015
 * XML source: /home/ahoereth/Devel/RobotTrajectoryAnalyzer/src/robotTA/types/TypeSystem.xml
 * @generated */
public class ControllerInput extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ControllerInput.class);
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
  protected ControllerInput() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ControllerInput(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ControllerInput(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ControllerInput(JCas jcas, int begin, int end) {
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
  //* Feature: time

  /** getter for time - gets 
   * @generated
   * @return value of the feature 
   */
  public double getTime() {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "robotTA.types.ControllerInput");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_time);}
    
  /** setter for time - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTime(double v) {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "robotTA.types.ControllerInput");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_time, v);}    
   
    
  //*--------------*
  //* Feature: jointNames

  /** getter for jointNames - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getJointNames() {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_jointNames)));}
    
  /** setter for jointNames - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setJointNames(StringArray v) {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    jcasType.ll_cas.ll_setRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_jointNames, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for jointNames - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getJointNames(int i) {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_jointNames), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_jointNames), i);}

  /** indexed setter for jointNames - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setJointNames(int i, String v) { 
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_jointNames == null)
      jcasType.jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_jointNames), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_jointNames), i, v);}
   
    
  //*--------------*
  //* Feature: desired

  /** getter for desired - gets 
   * @generated
   * @return value of the feature 
   */
  public JointTrajectoryPoint getDesired() {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_desired == null)
      jcasType.jcas.throwFeatMissing("desired", "robotTA.types.ControllerInput");
    return (JointTrajectoryPoint)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_desired)));}
    
  /** setter for desired - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDesired(JointTrajectoryPoint v) {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_desired == null)
      jcasType.jcas.throwFeatMissing("desired", "robotTA.types.ControllerInput");
    jcasType.ll_cas.ll_setRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_desired, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: actual

  /** getter for actual - gets 
   * @generated
   * @return value of the feature 
   */
  public JointTrajectoryPoint getActual() {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_actual == null)
      jcasType.jcas.throwFeatMissing("actual", "robotTA.types.ControllerInput");
    return (JointTrajectoryPoint)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_actual)));}
    
  /** setter for actual - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setActual(JointTrajectoryPoint v) {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_actual == null)
      jcasType.jcas.throwFeatMissing("actual", "robotTA.types.ControllerInput");
    jcasType.ll_cas.ll_setRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_actual, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: error

  /** getter for error - gets 
   * @generated
   * @return value of the feature 
   */
  public JointTrajectoryPoint getError() {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_error == null)
      jcasType.jcas.throwFeatMissing("error", "robotTA.types.ControllerInput");
    return (JointTrajectoryPoint)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_error)));}
    
  /** setter for error - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setError(JointTrajectoryPoint v) {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_error == null)
      jcasType.jcas.throwFeatMissing("error", "robotTA.types.ControllerInput");
    jcasType.ll_cas.ll_setRefValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_error, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: controllerType

  /** getter for controllerType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getControllerType() {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_controllerType == null)
      jcasType.jcas.throwFeatMissing("controllerType", "robotTA.types.ControllerInput");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_controllerType);}
    
  /** setter for controllerType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setControllerType(String v) {
    if (ControllerInput_Type.featOkTst && ((ControllerInput_Type)jcasType).casFeat_controllerType == null)
      jcasType.jcas.throwFeatMissing("controllerType", "robotTA.types.ControllerInput");
    jcasType.ll_cas.ll_setStringValue(addr, ((ControllerInput_Type)jcasType).casFeatCode_controllerType, v);}    
  }

    