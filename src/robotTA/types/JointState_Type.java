
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
public class JointState_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (JointState_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = JointState_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new JointState(addr, JointState_Type.this);
  			   JointState_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new JointState(addr, JointState_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JointState.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("robotTA.types.JointState");
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "robotTA.types.JointState");
    return ll_cas.ll_getRefValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, int v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "robotTA.types.JointState");
    ll_cas.ll_setRefValue(addr, casFeatCode_name, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getName(int addr, int i) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "robotTA.types.JointState");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_name), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setName(int addr, int i, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "robotTA.types.JointState");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_name), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_name), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_seq;
  /** @generated */
  final int     casFeatCode_seq;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSeq(int addr) {
        if (featOkTst && casFeat_seq == null)
      jcas.throwFeatMissing("seq", "robotTA.types.JointState");
    return ll_cas.ll_getIntValue(addr, casFeatCode_seq);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSeq(int addr, int v) {
        if (featOkTst && casFeat_seq == null)
      jcas.throwFeatMissing("seq", "robotTA.types.JointState");
    ll_cas.ll_setIntValue(addr, casFeatCode_seq, v);}
    
  
 
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
      jcas.throwFeatMissing("time", "robotTA.types.JointState");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_time);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTime(int addr, double v) {
        if (featOkTst && casFeat_time == null)
      jcas.throwFeatMissing("time", "robotTA.types.JointState");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_time, v);}
    
  
 
  /** @generated */
  final Feature casFeat_frameID;
  /** @generated */
  final int     casFeatCode_frameID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFrameID(int addr) {
        if (featOkTst && casFeat_frameID == null)
      jcas.throwFeatMissing("frameID", "robotTA.types.JointState");
    return ll_cas.ll_getStringValue(addr, casFeatCode_frameID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFrameID(int addr, String v) {
        if (featOkTst && casFeat_frameID == null)
      jcas.throwFeatMissing("frameID", "robotTA.types.JointState");
    ll_cas.ll_setStringValue(addr, casFeatCode_frameID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_jointTrajectoryPoint;
  /** @generated */
  final int     casFeatCode_jointTrajectoryPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getJointTrajectoryPoint(int addr) {
        if (featOkTst && casFeat_jointTrajectoryPoint == null)
      jcas.throwFeatMissing("jointTrajectoryPoint", "robotTA.types.JointState");
    return ll_cas.ll_getRefValue(addr, casFeatCode_jointTrajectoryPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setJointTrajectoryPoint(int addr, int v) {
        if (featOkTst && casFeat_jointTrajectoryPoint == null)
      jcas.throwFeatMissing("jointTrajectoryPoint", "robotTA.types.JointState");
    ll_cas.ll_setRefValue(addr, casFeatCode_jointTrajectoryPoint, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public JointState_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.StringArray", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_seq = jcas.getRequiredFeatureDE(casType, "seq", "uima.cas.Integer", featOkTst);
    casFeatCode_seq  = (null == casFeat_seq) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_seq).getCode();

 
    casFeat_time = jcas.getRequiredFeatureDE(casType, "time", "uima.cas.Double", featOkTst);
    casFeatCode_time  = (null == casFeat_time) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_time).getCode();

 
    casFeat_frameID = jcas.getRequiredFeatureDE(casType, "frameID", "uima.cas.String", featOkTst);
    casFeatCode_frameID  = (null == casFeat_frameID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_frameID).getCode();

 
    casFeat_jointTrajectoryPoint = jcas.getRequiredFeatureDE(casType, "jointTrajectoryPoint", "robotTA.types.JointTrajectoryPoint", featOkTst);
    casFeatCode_jointTrajectoryPoint  = (null == casFeat_jointTrajectoryPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_jointTrajectoryPoint).getCode();

  }
}



    