
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
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Tue Jun 09 13:22:47 CEST 2015
 * @generated */
public class JointTrajectoryPoint_Type extends AnnotationBase_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (JointTrajectoryPoint_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = JointTrajectoryPoint_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new JointTrajectoryPoint(addr, JointTrajectoryPoint_Type.this);
  			   JointTrajectoryPoint_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new JointTrajectoryPoint(addr, JointTrajectoryPoint_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JointTrajectoryPoint.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("robotTA.types.JointTrajectoryPoint");
 
  /** @generated */
  final Feature casFeat_positions;
  /** @generated */
  final int     casFeatCode_positions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPositions(int addr) {
        if (featOkTst && casFeat_positions == null)
      jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    return ll_cas.ll_getRefValue(addr, casFeatCode_positions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPositions(int addr, int v) {
        if (featOkTst && casFeat_positions == null)
      jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    ll_cas.ll_setRefValue(addr, casFeatCode_positions, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getPositions(int addr, int i) {
        if (featOkTst && casFeat_positions == null)
      jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_positions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_positions), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_positions), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setPositions(int addr, int i, double v) {
        if (featOkTst && casFeat_positions == null)
      jcas.throwFeatMissing("positions", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_positions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_positions), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_positions), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_velocities;
  /** @generated */
  final int     casFeatCode_velocities;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVelocities(int addr) {
        if (featOkTst && casFeat_velocities == null)
      jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    return ll_cas.ll_getRefValue(addr, casFeatCode_velocities);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVelocities(int addr, int v) {
        if (featOkTst && casFeat_velocities == null)
      jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    ll_cas.ll_setRefValue(addr, casFeatCode_velocities, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getVelocities(int addr, int i) {
        if (featOkTst && casFeat_velocities == null)
      jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocities), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_velocities), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocities), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setVelocities(int addr, int i, double v) {
        if (featOkTst && casFeat_velocities == null)
      jcas.throwFeatMissing("velocities", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocities), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_velocities), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocities), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_accelerations;
  /** @generated */
  final int     casFeatCode_accelerations;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAccelerations(int addr) {
        if (featOkTst && casFeat_accelerations == null)
      jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    return ll_cas.ll_getRefValue(addr, casFeatCode_accelerations);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAccelerations(int addr, int v) {
        if (featOkTst && casFeat_accelerations == null)
      jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    ll_cas.ll_setRefValue(addr, casFeatCode_accelerations, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getAccelerations(int addr, int i) {
        if (featOkTst && casFeat_accelerations == null)
      jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_accelerations), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_accelerations), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_accelerations), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAccelerations(int addr, int i, double v) {
        if (featOkTst && casFeat_accelerations == null)
      jcas.throwFeatMissing("accelerations", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_accelerations), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_accelerations), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_accelerations), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_effort;
  /** @generated */
  final int     casFeatCode_effort;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEffort(int addr) {
        if (featOkTst && casFeat_effort == null)
      jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    return ll_cas.ll_getRefValue(addr, casFeatCode_effort);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEffort(int addr, int v) {
        if (featOkTst && casFeat_effort == null)
      jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    ll_cas.ll_setRefValue(addr, casFeatCode_effort, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getEffort(int addr, int i) {
        if (featOkTst && casFeat_effort == null)
      jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEffort(int addr, int i, double v) {
        if (featOkTst && casFeat_effort == null)
      jcas.throwFeatMissing("effort", "robotTA.types.JointTrajectoryPoint");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public JointTrajectoryPoint_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_positions = jcas.getRequiredFeatureDE(casType, "positions", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_positions  = (null == casFeat_positions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_positions).getCode();

 
    casFeat_velocities = jcas.getRequiredFeatureDE(casType, "velocities", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_velocities  = (null == casFeat_velocities) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_velocities).getCode();

 
    casFeat_accelerations = jcas.getRequiredFeatureDE(casType, "accelerations", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_accelerations  = (null == casFeat_accelerations) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_accelerations).getCode();

 
    casFeat_effort = jcas.getRequiredFeatureDE(casType, "effort", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_effort  = (null == casFeat_effort) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_effort).getCode();

  }
}



    