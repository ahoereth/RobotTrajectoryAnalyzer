
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
public class SelfCollision_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SelfCollision_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SelfCollision_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SelfCollision(addr, SelfCollision_Type.this);
  			   SelfCollision_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SelfCollision(addr, SelfCollision_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SelfCollision.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("robotTA.types.SelfCollision");
 
  /** @generated */
  final Feature casFeat_perpetrator;
  /** @generated */
  final int     casFeatCode_perpetrator;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPerpetrator(int addr) {
        if (featOkTst && casFeat_perpetrator == null)
      jcas.throwFeatMissing("perpetrator", "robotTA.types.SelfCollision");
    return ll_cas.ll_getStringValue(addr, casFeatCode_perpetrator);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPerpetrator(int addr, String v) {
        if (featOkTst && casFeat_perpetrator == null)
      jcas.throwFeatMissing("perpetrator", "robotTA.types.SelfCollision");
    ll_cas.ll_setStringValue(addr, casFeatCode_perpetrator, v);}
    
  
 
  /** @generated */
  final Feature casFeat_victim;
  /** @generated */
  final int     casFeatCode_victim;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVictim(int addr) {
        if (featOkTst && casFeat_victim == null)
      jcas.throwFeatMissing("victim", "robotTA.types.SelfCollision");
    return ll_cas.ll_getStringValue(addr, casFeatCode_victim);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVictim(int addr, String v) {
        if (featOkTst && casFeat_victim == null)
      jcas.throwFeatMissing("victim", "robotTA.types.SelfCollision");
    ll_cas.ll_setStringValue(addr, casFeatCode_victim, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SelfCollision_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_perpetrator = jcas.getRequiredFeatureDE(casType, "perpetrator", "uima.cas.String", featOkTst);
    casFeatCode_perpetrator  = (null == casFeat_perpetrator) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_perpetrator).getCode();

 
    casFeat_victim = jcas.getRequiredFeatureDE(casType, "victim", "uima.cas.String", featOkTst);
    casFeatCode_victim  = (null == casFeat_victim) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_victim).getCode();

  }
}



    