package Javonet.ValueTypesSample.SportRadar;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.SportRadar.*;
import jio.System.*;public class OddField {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTypeId (java.lang.Integer value){ try { javonetHandle.set("TypeId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getTypeId (){ try { return javonetHandle.get("TypeId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setValue (Nullable<java.math.BigDecimal> value){ try { javonetHandle.set("Value",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Nullable<java.math.BigDecimal> getValue (){ try { return javonetHandle.get("Value");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setOutcome (Nullable<java.lang.Boolean> value){ try { javonetHandle.set("Outcome",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Nullable<java.lang.Boolean> getOutcome (){ try { return javonetHandle.get("Outcome");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setVoidFactor (java.lang.Double value){ try { javonetHandle.set("VoidFactor",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getVoidFactor (){ try { return javonetHandle.get("VoidFactor");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setActive (java.lang.Boolean value){ try { javonetHandle.set("Active",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getActive (){ try { return javonetHandle.get("Active");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public OddField (){ try {  javonetHandle = Javonet.New("OddField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public OddField(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}