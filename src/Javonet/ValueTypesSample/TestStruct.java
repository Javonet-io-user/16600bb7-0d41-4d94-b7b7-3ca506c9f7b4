package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import Javonet.ValueTypesSample.*;
import jio.System.Collections.Generic.*;public class TestStruct extends ValueType {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setDecimalField (java.math.BigDecimal value){ try { javonetHandle.set("DecimalField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.math.BigDecimal getDecimalField (){ try { return javonetHandle.get("DecimalField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public Decimal[][] getTwoDimArray (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.get("TwoDimArray"),Decimal[][].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public List<TestStruct> getStructList (){ try { return new List<TestStruct>((NObject)javonetHandle.get("StructList"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDoubleField (java.lang.Double value){ try { javonetHandle.set("DoubleField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Double getDoubleField (){ try { return javonetHandle.get("DoubleField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * SetProperty
	 */
            public void setFloatField (java.lang.Float value){ try { javonetHandle.set("FloatField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Float getFloatField (){ try { return javonetHandle.get("FloatField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setUShortField (java.lang.Integer value){ try { javonetHandle.set("UShortField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getUShortField (){ try { return javonetHandle.get("UShortField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setUIntField (java.lang.Long value){ try { javonetHandle.set("UIntField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getUIntField (){ try { return javonetHandle.get("UIntField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setULongField (java.math.BigInteger value){ try { javonetHandle.set("ULongField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.math.BigInteger getULongField (){ try { return javonetHandle.get("ULongField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setShortField (java.lang.Short value){ try { javonetHandle.set("ShortField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Short getShortField (){ try { return javonetHandle.get("ShortField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setIntField (java.lang.Integer value){ try { javonetHandle.set("IntField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getIntField (){ try { return javonetHandle.get("IntField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setLongField (java.lang.Long value){ try { javonetHandle.set("LongField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getLongField (){ try { return javonetHandle.get("LongField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setSByteField (java.lang.Byte value){ try { javonetHandle.set("SByteField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getSByteField (){ try { return javonetHandle.get("SByteField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setByteField (java.lang.Byte value){ try { javonetHandle.set("ByteField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Byte getByteField (){ try { return javonetHandle.get("ByteField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setCharField (java.lang.Character value){ try { javonetHandle.set("CharField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getCharField (){ try { return javonetHandle.get("CharField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setStringField (java.lang.String value){ try { javonetHandle.set("StringField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getStringField (){ try { return  (java.lang.String) javonetHandle.get("StringField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setBoolField (java.lang.Boolean value){ try { javonetHandle.set("BoolField",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getBoolField (){ try { return javonetHandle.get("BoolField");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }public TestStruct(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public Int32[,] GetTwoDimArray (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetTwoDimArray"),Int32[,].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}