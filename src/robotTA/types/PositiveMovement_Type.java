
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
public class PositiveMovement_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PositiveMovement_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PositiveMovement_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PositiveMovement(addr, PositiveMovement_Type.this);
  			   PositiveMovement_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PositiveMovement(addr, PositiveMovement_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PositiveMovement.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("robotTA.types.PositiveMovement");
 
  /** @generated */
  final Feature casFeat_jointName;
  /** @generated */
  final int     casFeatCode_jointName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getJointName(int addr) {
        if (featOkTst && casFeat_jointName == null)
      jcas.throwFeatMissing("jointName", "robotTA.types.PositiveMovement");
    return ll_cas.ll_getStringValue(addr, casFeatCode_jointName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setJointName(int addr, String v) {
        if (featOkTst && casFeat_jointName == null)
      jcas.throwFeatMissing("jointName", "robotTA.types.PositiveMovement");
    ll_cas.ll_setStringValue(addr, casFeatCode_jointName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_startPosition;
  /** @generated */
  final int     casFeatCode_startPosition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getStartPosition(int addr) {
        if (featOkTst && casFeat_startPosition == null)
      jcas.throwFeatMissing("startPosition", "robotTA.types.PositiveMovement");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_startPosition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStartPosition(int addr, double v) {
        if (featOkTst && casFeat_startPosition == null)
      jcas.throwFeatMissing("startPosition", "robotTA.types.PositiveMovement");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_startPosition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endPosition;
  /** @generated */
  final int     casFeatCode_endPosition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getEndPosition(int addr) {
        if (featOkTst && casFeat_endPosition == null)
      jcas.throwFeatMissing("endPosition", "robotTA.types.PositiveMovement");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_endPosition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndPosition(int addr, double v) {
        if (featOkTst && casFeat_endPosition == null)
      jcas.throwFeatMissing("endPosition", "robotTA.types.PositiveMovement");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_endPosition, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PositiveMovement_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_jointName = jcas.getRequiredFeatureDE(casType, "jointName", "uima.cas.String", featOkTst);
    casFeatCode_jointName  = (null == casFeat_jointName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_jointName).getCode();

 
    casFeat_startPosition = jcas.getRequiredFeatureDE(casType, "startPosition", "uima.cas.Double", featOkTst);
    casFeatCode_startPosition  = (null == casFeat_startPosition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_startPosition).getCode();

 
    casFeat_endPosition = jcas.getRequiredFeatureDE(casType, "endPosition", "uima.cas.Double", featOkTst);
    casFeatCode_endPosition  = (null == casFeat_endPosition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endPosition).getCode();

  }
}



    