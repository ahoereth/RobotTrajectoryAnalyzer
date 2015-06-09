

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
public class ControllerError extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ControllerError.class);
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
  protected ControllerError() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ControllerError(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ControllerError(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ControllerError(JCas jcas, int begin, int end) {
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
  //* Feature: jointName

  /** getter for jointName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getJointName() {
    if (ControllerError_Type.featOkTst && ((ControllerError_Type)jcasType).casFeat_jointName == null)
      jcasType.jcas.throwFeatMissing("jointName", "robotTA.types.ControllerError");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ControllerError_Type)jcasType).casFeatCode_jointName);}
    
  /** setter for jointName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setJointName(String v) {
    if (ControllerError_Type.featOkTst && ((ControllerError_Type)jcasType).casFeat_jointName == null)
      jcasType.jcas.throwFeatMissing("jointName", "robotTA.types.ControllerError");
    jcasType.ll_cas.ll_setStringValue(addr, ((ControllerError_Type)jcasType).casFeatCode_jointName, v);}    
  }

    