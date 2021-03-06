
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
public class Movement_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Movement_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Movement_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Movement(addr, Movement_Type.this);
  			   Movement_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Movement(addr, Movement_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Movement.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("robotTA.types.Movement");
 
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
      jcas.throwFeatMissing("jointName", "robotTA.types.Movement");
    return ll_cas.ll_getStringValue(addr, casFeatCode_jointName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setJointName(int addr, String v) {
        if (featOkTst && casFeat_jointName == null)
      jcas.throwFeatMissing("jointName", "robotTA.types.Movement");
    ll_cas.ll_setStringValue(addr, casFeatCode_jointName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Movement_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_jointName = jcas.getRequiredFeatureDE(casType, "jointName", "uima.cas.String", featOkTst);
    casFeatCode_jointName  = (null == casFeat_jointName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_jointName).getCode();

  }
}



    