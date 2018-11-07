package Javonet.ValueTypesSample.SportRadar;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.SportRadar.*;
import jio.System.Collections.Generic.*;public class Odd {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setId (java.lang.String value){ try { javonetHandle.set("Id",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getId (){ try { return  (java.lang.String) javonetHandle.get("Id");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setType (OddType value){ try { javonetHandle.set("Type",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public OddType getType (){ try { return OddType.valueOf(((NEnum) javonetHandle.get("Type")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSpecialOddsValue (java.lang.String value){ try { javonetHandle.set("SpecialOddsValue",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getSpecialOddsValue (){ try { return  (java.lang.String) javonetHandle.get("SpecialOddsValue");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTypeId (java.lang.Long value){ try { javonetHandle.set("TypeId",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getTypeId (){ try { return javonetHandle.get("TypeId");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSubType (java.lang.Long value){ try { javonetHandle.set("SubType",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getSubType (){ try { return javonetHandle.get("SubType");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setActive (java.lang.Boolean value){ try { javonetHandle.set("Active",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getActive (){ try { return javonetHandle.get("Active");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setOddFields (Dictionary<java.lang.String,OddField> value){ try { javonetHandle.set("OddFields",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Dictionary<java.lang.String,OddField> getOddFields (){ try { return new Dictionary<java.lang.String,OddField>((NObject)javonetHandle.get("OddFields"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Odd (){ try {  javonetHandle = Javonet.New("Odd");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Odd(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}