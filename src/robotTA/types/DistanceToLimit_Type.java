
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
public class DistanceToLimit_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DistanceToLimit_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DistanceToLimit_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DistanceToLimit(addr, DistanceToLimit_Type.this);
  			   DistanceToLimit_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DistanceToLimit(addr, DistanceToLimit_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DistanceToLimit.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("robotTA.types.DistanceToLimit");
 
  /** @generated */
  final Feature casFeat_upperLimit;
  /** @generated */
  final int     casFeatCode_upperLimit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getUpperLimit(int addr) {
        if (featOkTst && casFeat_upperLimit == null)
      jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_upperLimit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUpperLimit(int addr, int v) {
        if (featOkTst && casFeat_upperLimit == null)
      jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    ll_cas.ll_setRefValue(addr, casFeatCode_upperLimit, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getUpperLimit(int addr, int i) {
        if (featOkTst && casFeat_upperLimit == null)
      jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_upperLimit), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_upperLimit), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_upperLimit), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setUpperLimit(int addr, int i, double v) {
        if (featOkTst && casFeat_upperLimit == null)
      jcas.throwFeatMissing("upperLimit", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_upperLimit), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_upperLimit), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_upperLimit), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_lowerLimit;
  /** @generated */
  final int     casFeatCode_lowerLimit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLowerLimit(int addr) {
        if (featOkTst && casFeat_lowerLimit == null)
      jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_lowerLimit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLowerLimit(int addr, int v) {
        if (featOkTst && casFeat_lowerLimit == null)
      jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    ll_cas.ll_setRefValue(addr, casFeatCode_lowerLimit, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getLowerLimit(int addr, int i) {
        if (featOkTst && casFeat_lowerLimit == null)
      jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lowerLimit), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_lowerLimit), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lowerLimit), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setLowerLimit(int addr, int i, double v) {
        if (featOkTst && casFeat_lowerLimit == null)
      jcas.throwFeatMissing("lowerLimit", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lowerLimit), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_lowerLimit), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lowerLimit), i, v);
  }
 
 
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
      jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_jointNames);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setJointNames(int addr, int v) {
        if (featOkTst && casFeat_jointNames == null)
      jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
    ll_cas.ll_setRefValue(addr, casFeatCode_jointNames, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getJointNames(int addr, int i) {
        if (featOkTst && casFeat_jointNames == null)
      jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
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
      jcas.throwFeatMissing("jointNames", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_jointNames), i, v);
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
      jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_effort);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEffort(int addr, int v) {
        if (featOkTst && casFeat_effort == null)
      jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
    ll_cas.ll_setRefValue(addr, casFeatCode_effort, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getEffort(int addr, int i) {
        if (featOkTst && casFeat_effort == null)
      jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
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
      jcas.throwFeatMissing("effort", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_effort), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_velocity;
  /** @generated */
  final int     casFeatCode_velocity;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVelocity(int addr) {
        if (featOkTst && casFeat_velocity == null)
      jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    return ll_cas.ll_getRefValue(addr, casFeatCode_velocity);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVelocity(int addr, int v) {
        if (featOkTst && casFeat_velocity == null)
      jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    ll_cas.ll_setRefValue(addr, casFeatCode_velocity, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public double getVelocity(int addr, int i) {
        if (featOkTst && casFeat_velocity == null)
      jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocity), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_velocity), i);
	return ll_cas.ll_getDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocity), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setVelocity(int addr, int i, double v) {
        if (featOkTst && casFeat_velocity == null)
      jcas.throwFeatMissing("velocity", "robotTA.types.DistanceToLimit");
    if (lowLevelTypeChecks)
      ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocity), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_velocity), i);
    ll_cas.ll_setDoubleArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_velocity), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DistanceToLimit_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_upperLimit = jcas.getRequiredFeatureDE(casType, "upperLimit", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_upperLimit  = (null == casFeat_upperLimit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_upperLimit).getCode();

 
    casFeat_lowerLimit = jcas.getRequiredFeatureDE(casType, "lowerLimit", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_lowerLimit  = (null == casFeat_lowerLimit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lowerLimit).getCode();

 
    casFeat_jointNames = jcas.getRequiredFeatureDE(casType, "jointNames", "uima.cas.StringArray", featOkTst);
    casFeatCode_jointNames  = (null == casFeat_jointNames) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_jointNames).getCode();

 
    casFeat_effort = jcas.getRequiredFeatureDE(casType, "effort", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_effort  = (null == casFeat_effort) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_effort).getCode();

 
    casFeat_velocity = jcas.getRequiredFeatureDE(casType, "velocity", "uima.cas.DoubleArray", featOkTst);
    casFeatCode_velocity  = (null == casFeat_velocity) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_velocity).getCode();

  }
}



    