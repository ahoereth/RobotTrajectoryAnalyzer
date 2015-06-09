
/* First created by JCasGen Tue Jun 09 13:22:47 CEST 2015 */
package robotTA.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Jun 09 13:22:47 CEST 2015
 * @generated */
public class ControllerInput_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ControllerInput_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ControllerInput_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ControllerInput(addr, ControllerInput_Type.this);
  			   ControllerInput_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ControllerInput(addr, ControllerInput_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ControllerInput.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("robotTA.types.ControllerInput");
 
  /** @generated */
  final Feature casFeat_time;
  /** @generated */
  final int     casFeatCode_time;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getTime(int addr) {
        if (featOkTst && casFeat_time == null)
      jcas.throwFeatMissing("time", "robotTA.types.ControllerInput");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_time);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTime(int addr, double v) {
        if (featOkTst && casFeat_time == null)
      jcas.throwFeatMissing("time", "robotTA.types.ControllerInput");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_time, v);}
    
  
 
  /** @generated */
  final Feature casFeat_jointNames;
  /** @generated */
  final int     casFeatCode_jointNames;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getJointNames(int addr) {
        if (featOkTst && casFeat_jointNames == null)
      jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    return ll_cas.ll_getRefValue(addr, casFeatCode_jointNames);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setJointNames(int addr, int v) {
        if (featOkTst && casFeat_jointNames == null)
      jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    ll_cas.ll_setRefValue(addr, casFeatCode_jointNames, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getJointNames(int addr, int i) {
        if (featOkTst && casFeat_jointNames == null)
      jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setJointNames(int addr, int i, String v) {
        if (featOkTst && casFeat_jointNames == null)
      jcas.throwFeatMissing("jointNames", "robotTA.types.ControllerInput");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_desired;
  /** @generated */
  final int     casFeatCode_desired;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDesired(int addr) {
        if (featOkTst && casFeat_desired == null)
      jcas.throwFeatMissing("desired", "robotTA.types.ControllerInput");
    return ll_cas.ll_getRefValue(addr, casFeatCode_desired);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDesired(int addr, int v) {
        if (featOkTst && casFeat_desired == null)
      jcas.throwFeatMissing("desired", "robotTA.types.ControllerInput");
    ll_cas.ll_setRefValue(addr, casFeatCode_desired, v);}
    
  
 
  /** @generated */
  final Feature casFeat_actual;
  /** @generated */
  final int     casFeatCode_actual;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getActual(int addr) {
        if (featOkTst && casFeat_actual == null)
      jcas.throwFeatMissing("actual", "robotTA.types.ControllerInput");
    return ll_cas.ll_getRefValue(addr, casFeatCode_actual);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setActual(int addr, int v) {
        if (featOkTst && casFeat_actual == null)
      jcas.throwFeatMissing("actual", "robotTA.types.ControllerInput");
    ll_cas.ll_setRefValue(addr, casFeatCode_actual, v);}
    
  
 
  /** @generated */
  final Feature casFeat_error;
  /** @generated */
  final int     casFeatCode_error;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getError(int addr) {
        if (featOkTst && casFeat_error == null)
      jcas.throwFeatMissing("error", "robotTA.types.ControllerInput");
    return ll_cas.ll_getRefValue(addr, casFeatCode_error);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setError(int addr, int v) {
        if (featOkTst && casFeat_error == null)
      jcas.throwFeatMissing("error", "robotTA.types.ControllerInput");
    ll_cas.ll_setRefValue(addr, casFeatCode_error, v);}
    
  
 
  /** @generated */
  final Feature casFeat_controllerType;
  /** @generated */
  final int     casFeatCode_controllerType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getControllerType(int addr) {
        if (featOkTst && casFeat_controllerType == null)
      jcas.throwFeatMissing("controllerType", "robotTA.types.ControllerInput");
    return ll_cas.ll_getStringValue(addr, casFeatCode_controllerType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setControllerType(int addr, String v) {
        if (featOkTst && casFeat_controllerType == null)
      jcas.throwFeatMissing("controllerType", "robotTA.types.ControllerInput");
    ll_cas.ll_setStringValue(addr, casFeatCode_controllerType, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ControllerInput_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_time = jcas.getRequiredFeatureDE(casType, "time", "uima.cas.Double", featOkTst);
    casFeatCode_time  = (null == casFeat_time) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_time).getCode();

 
    casFeat_jointNames = jcas.getRequiredFeatureDE(casType, "jointNames", "uima.cas.StringArray", featOkTst);
    casFeatCode_jointNames  = (null == casFeat_jointNames) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_jointNames).getCode();

 
    casFeat_desired = jcas.getRequiredFeatureDE(casType, "desired", "robotTA.types.JointTrajectoryPoint", featOkTst);
    casFeatCode_desired  = (null == casFeat_desired) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_desired).getCode();

 
    casFeat_actual = jcas.getRequiredFeatureDE(casType, "actual", "robotTA.types.JointTrajectoryPoint", featOkTst);
    casFeatCode_actual  = (null == casFeat_actual) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_actual).getCode();

 
    casFeat_error = jcas.getRequiredFeatureDE(casType, "error", "robotTA.types.JointTrajectoryPoint", featOkTst);
    casFeatCode_error  = (null == casFeat_error) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_error).getCode();

 
    casFeat_controllerType = jcas.getRequiredFeatureDE(casType, "controllerType", "uima.cas.String", featOkTst);
    casFeatCode_controllerType  = (null == casFeat_controllerType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_controllerType).getCode();

  }
}



    