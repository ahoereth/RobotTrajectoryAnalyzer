

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
public class TaskSpacePosition extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TaskSpacePosition.class);
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
  protected TaskSpacePosition() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TaskSpacePosition(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TaskSpacePosition(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TaskSpacePosition(JCas jcas, int begin, int end) {
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
  //* Feature: linkName

  /** getter for linkName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLinkName() {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_linkName == null)
      jcasType.jcas.throwFeatMissing("linkName", "robotTA.types.TaskSpacePosition");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_linkName);}
    
  /** setter for linkName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLinkName(String v) {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_linkName == null)
      jcasType.jcas.throwFeatMissing("linkName", "robotTA.types.TaskSpacePosition");
    jcasType.ll_cas.ll_setStringValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_linkName, v);}    
   
    
  //*--------------*
  //* Feature: position

  /** getter for position - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getPosition() {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "robotTA.types.TaskSpacePosition");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_position)));}
    
  /** setter for position - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosition(DoubleArray v) {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "robotTA.types.TaskSpacePosition");
    jcasType.ll_cas.ll_setRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_position, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for position - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getPosition(int i) {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "robotTA.types.TaskSpacePosition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_position), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_position), i);}

  /** indexed setter for position - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setPosition(int i, double v) { 
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "robotTA.types.TaskSpacePosition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_position), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_position), i, v);}
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getRotation() {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "robotTA.types.TaskSpacePosition");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_rotation)));}
    
  /** setter for rotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(DoubleArray v) {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "robotTA.types.TaskSpacePosition");
    jcasType.ll_cas.ll_setRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_rotation, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for rotation - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getRotation(int i) {
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "robotTA.types.TaskSpacePosition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_rotation), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_rotation), i);}

  /** indexed setter for rotation - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setRotation(int i, double v) { 
    if (TaskSpacePosition_Type.featOkTst && ((TaskSpacePosition_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "robotTA.types.TaskSpacePosition");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_rotation), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TaskSpacePosition_Type)jcasType).casFeatCode_rotation), i, v);}
  }

    