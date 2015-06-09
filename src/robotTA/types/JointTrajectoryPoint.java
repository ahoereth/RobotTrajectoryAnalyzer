

/* First created by JCasGen Tue Jun 09 13:22:47 CEST 2015 */
package robotTA.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.cas.DoubleArray;


/** 
 * Updated by JCasGen Tue Jun 09 13:22:47 CEST 2015
 * XML source: /home/ahoereth/Devel/RobotTrajectoryAnalyzer/src/robotTA/types/TypeSystem.xml
 * @generated */
public class JointTrajectoryPoint extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(JointTrajectoryPoint.class);
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
  protected JointTrajectoryPoint() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public JointTrajectoryPoint(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public JointTrajectoryPoint(JCas jcas) {
    super(jcas);
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
  //* Feature: positions

  /** getter for positions - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getPositions() {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_positions == null)
      jcasType.jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_positions)));}
    
  /** setter for positions - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPositions(DoubleArray v) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_positions == null)
      jcasType.jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    jcasType.ll_cas.ll_setRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_positions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for positions - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getPositions(int i) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_positions == null)
      jcasType.jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_positions), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_positions), i);}

  /** indexed setter for positions - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setPositions(int i, double v) { 
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_positions == null)
      jcasType.jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_positions), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_positions), i, v);}
   
    
  //*--------------*
  //* Feature: velocities

  /** getter for velocities - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getVelocities() {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_velocities == null)
      jcasType.jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_velocities)));}
    
  /** setter for velocities - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVelocities(DoubleArray v) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_velocities == null)
      jcasType.jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    jcasType.ll_cas.ll_setRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_velocities, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for velocities - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getVelocities(int i) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_velocities == null)
      jcasType.jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_velocities), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_velocities), i);}

  /** indexed setter for velocities - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVelocities(int i, double v) { 
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_velocities == null)
      jcasType.jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_velocities), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_velocities), i, v);}
   
    
  //*--------------*
  //* Feature: accelerations

  /** getter for accelerations - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getAccelerations() {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_accelerations == null)
      jcasType.jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_accelerations)));}
    
  /** setter for accelerations - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAccelerations(DoubleArray v) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_accelerations == null)
      jcasType.jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    jcasType.ll_cas.ll_setRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_accelerations, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for accelerations - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getAccelerations(int i) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_accelerations == null)
      jcasType.jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_accelerations), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_accelerations), i);}

  /** indexed setter for accelerations - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAccelerations(int i, double v) { 
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_accelerations == null)
      jcasType.jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_accelerations), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_accelerations), i, v);}
   
    
  //*--------------*
  //* Feature: effort

  /** getter for effort - gets 
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getEffort() {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_effort)));}
    
  /** setter for effort - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEffort(DoubleArray v) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    jcasType.ll_cas.ll_setRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_effort, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for effort - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getEffort(int i) {
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_effort), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_effort), i);}

  /** indexed setter for effort - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEffort(int i, double v) { 
    if (JointTrajectoryPoint_Type.featOkTst && ((JointTrajectoryPoint_Type)jcasType).casFeat_effort == null)
      jcasType.jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_effort), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((JointTrajectoryPoint_Type)jcasType).casFeatCode_effort), i, v);}
  }

    