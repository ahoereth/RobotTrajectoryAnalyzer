

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
public class JointState extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(JointState.class);
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
  protected JointState() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public JointState(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public JointState(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public JointState(JCas jcas, int begin, int end) {
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
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getName() {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "robotTA.types.JointState");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((JointState_Type)jcasType).casFeatCode_name)));}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(StringArray v) {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "robotTA.types.JointState");
    jcasType.ll_cas.ll_setRefValue(addr, ((JointState_Type)jcasType).casFeatCode_name, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for name - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getName(int i) {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "robotTA.types.JointState");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointState_Type)jcasType).casFeatCode_name), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointState_Type)jcasType).casFeatCode_name), i);}

  /** indexed setter for name - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setName(int i, String v) { 
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "robotTA.types.JointState");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointState_Type)jcasType).casFeatCode_name), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointState_Type)jcasType).casFeatCode_name), i, v);}
   
    
  //*--------------*
  //* Feature: seq

  /** getter for seq - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSeq() {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_seq == null)
      jcasType.jcas.throwFeatMissing("seq", "robotTA.types.JointState");
    return jcasType.ll_cas.ll_getIntValue(addr, ((JointState_Type)jcasType).casFeatCode_seq);}
    
  /** setter for seq - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSeq(int v) {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_seq == null)
      jcasType.jcas.throwFeatMissing("seq", "robotTA.types.JointState");
    jcasType.ll_cas.ll_setIntValue(addr, ((JointState_Type)jcasType).casFeatCode_seq, v);}    
   
    
  //*--------------*
  //* Feature: time

  /** getter for time - gets 
   * @generated
   * @return value of the feature 
   */
  public double getTime() {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "robotTA.types.JointState");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((JointState_Type)jcasType).casFeatCode_time);}
    
  /** setter for time - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTime(double v) {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_time == null)
      jcasType.jcas.throwFeatMissing("time", "robotTA.types.JointState");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((JointState_Type)jcasType).casFeatCode_time, v);}    
   
    
  //*--------------*
  //* Feature: frameID

  /** getter for frameID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFrameID() {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_frameID == null)
      jcasType.jcas.throwFeatMissing("frameID", "robotTA.types.JointState");
    return jcasType.ll_cas.ll_getStringValue(addr, ((JointState_Type)jcasType).casFeatCode_frameID);}
    
  /** setter for frameID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFrameID(String v) {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_frameID == null)
      jcasType.jcas.throwFeatMissing("frameID", "robotTA.types.JointState");
    jcasType.ll_cas.ll_setStringValue(addr, ((JointState_Type)jcasType).casFeatCode_frameID, v);}    
   
    
  //*--------------*
  //* Feature: jointTrajectoryPoint

  /** getter for jointTrajectoryPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public JointTrajectoryPoint getJointTrajectoryPoint() {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_jointTrajectoryPoint == null)
      jcasType.jcas.throwFeatMissing("jointTrajectoryPoint", "robotTA.types.JointState");
    return (JointTrajectoryPoint)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((JointState_Type)jcasType).casFeatCode_jointTrajectoryPoint)));}
    
  /** setter for jointTrajectoryPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setJointTrajectoryPoint(JointTrajectoryPoint v) {
    if (JointState_Type.featOkTst && ((JointState_Type)jcasType).casFeat_jointTrajectoryPoint == null)
      jcasType.jcas.throwFeatMissing("jointTrajectoryPoint", "robotTA.types.JointState");
    jcasType.ll_cas.ll_setRefValue(addr, ((JointState_Type)jcasType).casFeatCode_jointTrajectoryPoint, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    