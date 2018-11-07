package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.*;
import jio.System.Collections.Generic.*;
import jio.System.*;public class Sample implements IDisposable {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public DefaultEnum getEnumProperty (){ try { return DefaultEnum.valueOf(((NEnum) javonetHandle.get("EnumProperty")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setMeasureEventsTime (java.lang.Long value){ try { javonetHandle.set("MeasureEventsTime",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getMeasureEventsTime (){ try { return javonetHandle.get("MeasureEventsTime");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setDefaultEnum (DefaultEnum value){ try { javonetHandle.set("DefaultEnum",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public DefaultEnum getDefaultEnum (){ try { return DefaultEnum.valueOf(((NEnum) javonetHandle.get("DefaultEnum")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setLongEnum (LongEnum value){ try { javonetHandle.set("LongEnum",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public LongEnum getLongEnum (){ try { return LongEnum.valueOf(((NEnum) javonetHandle.get("LongEnum")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setByteEnum (ByteEnum value){ try { javonetHandle.set("ByteEnum",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ByteEnum getByteEnum (){ try { return ByteEnum.valueOf(((NEnum) javonetHandle.get("ByteEnum")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setShortEnum (ShortEnum value){ try { javonetHandle.set("ShortEnum",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public ShortEnum getShortEnum (){ try { return ShortEnum.valueOf(((NEnum) javonetHandle.get("ShortEnum")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setCarriers (java.lang.Integer[] value){ try { javonetHandle.set("Carriers",new Object[] {value});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer[] getCarriers (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.get("Carriers"),java.lang.Integer[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getTestInt (){ try { return javonetHandle.get("TestInt");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Short getTestShort (){ try { return javonetHandle.get("TestShort");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Long getTestLong (){ try { return javonetHandle.get("TestLong");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Float getTestFloat (){ try { return javonetHandle.get("TestFloat");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Boolean getTestBool (){ try { return javonetHandle.get("TestBool");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * GetProperty
	 */
            public java.lang.Integer getTestUShort (){ try { return javonetHandle.get("TestUShort");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Character getTestChar (){ try { return javonetHandle.get("TestChar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Byte getTestByte (){ try { return javonetHandle.get("TestByte");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Byte getTestSByte (){ try { return javonetHandle.get("TestSByte");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * GetProperty
	 */
            public java.lang.Long getTestUInt (){ try { return javonetHandle.get("TestUInt");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.math.BigInteger getTestULong (){ try { return javonetHandle.get("TestULong");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * GetProperty
	 */
            public java.lang.Double getTestDouble (){ try { return javonetHandle.get("TestDouble");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * GetProperty
	 */
            public java.math.BigDecimal getTestDecimal (){ try { return javonetHandle.get("TestDecimal");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGetSetInt (java.lang.Integer value){ try { javonetHandle.set("GetSetInt",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Integer getGetSetInt (){ try { return javonetHandle.get("GetSetInt");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * SetProperty
	 */
            public void setGetSetLong (java.lang.Long value){ try { javonetHandle.set("GetSetLong",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Long getGetSetLong (){ try { return javonetHandle.get("GetSetLong");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGetSetChar (java.lang.Character value){ try { javonetHandle.set("GetSetChar",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Character getGetSetChar (){ try { return javonetHandle.get("GetSetChar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setGetSetShort (java.lang.Short value){ try { javonetHandle.set("GetSetShort",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Short getGetSetShort (){ try { return javonetHandle.get("GetSetShort");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public Sample (){ try {  javonetHandle = Javonet.New("Sample");javonetHandle.addEventListener("TestEvent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (ShowResultHandler handler : _TestEventListeners) {handler.Invoke(Convert(objects[0], java.math.BigDecimal.class),Convert(objects[1], Sample.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Sample(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ShowInt (){ try { return  (java.lang.String) javonetHandle.invoke("ShowInt");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ShowLong (){ try { return  (java.lang.String) javonetHandle.invoke("ShowLong");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ShowChar (){ try { return  (java.lang.String) javonetHandle.invoke("ShowChar");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public java.lang.String ShowShort (){ try { return  (java.lang.String) javonetHandle.invoke("ShowShort");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public <T> T MyGenericMethod (T genericArgument, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getGetObjectName(genericArgument),getReturnObjectName(returnType)).invoke("MyGenericMethod",genericArgument), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public <T> void MyGenericMethodVoid (T genericArgument){ try { javonetHandle.generic(getGetObjectName(genericArgument)).invoke("MyGenericMethodVoid",genericArgument);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static <T> T MyGenericMethodStatic (T genericArgument, Class<?> returnType){ try { return (T)Convert(Javonet.getType("Sample").generic(getGetObjectName(genericArgument),getReturnObjectName(returnType)).invoke("MyGenericMethodStatic",genericArgument), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public <T> T MyGenericMethod (T genericArgument,java.lang.Integer a, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getGetObjectName(genericArgument),getReturnObjectName(returnType)).invoke("MyGenericMethod",genericArgument,a), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public <T> T MyGenericMethod (T genericArgument,java.lang.String b, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getGetObjectName(genericArgument),getReturnObjectName(returnType)).invoke("MyGenericMethod",genericArgument,b), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static <T> void MyGenericMethodVoidStatic (T genericArgument){ try { Javonet.getType("Sample").generic(getGetObjectName(genericArgument)).invoke("MyGenericMethodVoidStatic",genericArgument);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Byte[] LoadFile (java.lang.String filePath){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("LoadFile",filePath),java.lang.Byte[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Double[] IncreaseByTen (java.lang.Double[] inputArray){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("IncreaseByTen",new Object[] {inputArray}),java.lang.Double[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void SaveFile (java.lang.Byte[] byteArray,java.lang.String filePath){ try { javonetHandle.invoke("SaveFile",new Object[] {byteArray},filePath);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GetByteArray (AtomicReference<java.lang.Byte[]> array){ try { javonetHandle.invoke("GetByteArray",new NOut(array, Helper.JavaToDotnetType.get(java.lang.Byte[].class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public List<Document> GetDocs (){ try { return new List<Document>((NObject)javonetHandle.invoke("GetDocs"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void DisplayDocs (Document[] docs){ try { javonetHandle.invoke("DisplayDocs",new Object[] {docs});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DisplayDocs (List<Document> docs){ try { javonetHandle.invoke("DisplayDocs",docs);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void EnumArg (DefaultEnum arg){ try { javonetHandle.invoke("EnumArg",NEnum.fromJavaEnum(arg));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void EmptyMethod (){ try { javonetHandle.invoke("EmptyMethod");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void TenArgs (java.lang.String arg1,java.lang.Integer arg2,java.lang.String arg3,java.lang.Integer arg4,java.lang.String arg5,java.lang.Integer arg6,java.lang.Integer arg7,java.lang.Integer arg8,java.lang.Integer arg9,java.lang.Integer arg10){ try { javonetHandle.invoke("TenArgs",arg1,arg2,arg3,arg4,arg5,arg6,arg7,arg8,arg9,arg10);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public DefaultEnum EnumResult (){ try { return DefaultEnum.valueOf(((NEnum) javonetHandle.invoke("EnumResult")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Boolean GetOutMultipleStrings (AtomicReference<java.lang.String> str1,AtomicReference<java.lang.String> str2,AtomicReference<java.lang.String> str3,AtomicReference<java.lang.String> str4,AtomicReference<java.lang.String> str5){ try { return javonetHandle.invoke("GetOutMultipleStrings",new NOut(str1, Helper.JavaToDotnetType.get(java.lang.String.class)),new NOut(str2, Helper.JavaToDotnetType.get(java.lang.String.class)),new NOut(str3, Helper.JavaToDotnetType.get(java.lang.String.class)),new NOut(str4, Helper.JavaToDotnetType.get(java.lang.String.class)),new NOut(str5, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean GetDateTime (java.util.Date date){ try { return javonetHandle.invoke("GetDateTime",date);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean GetOutString (AtomicReference<java.lang.String> date){ try { return javonetHandle.invoke("GetOutString",new NOut(date, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean GetOutList (List<CashierEntity> date){ try { return javonetHandle.invoke("GetOutList",date);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Boolean MethodWithIntArg (ITestInt testint){ try { return javonetHandle.invoke("MethodWithIntArg",testint);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void PassTypeArg (Class myType){ try { javonetHandle.invoke("PassTypeArg",Javonet.getType(getReturnObjectName(myType).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Dispose (){ try { javonetHandle.invoke("Dispose");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void GenerateEvents (){ try { javonetHandle.invoke("GenerateEvents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Callback (){ try { javonetHandle.invoke("Callback");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Test (){ try { javonetHandle.invoke("Test");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RunCalculate (java.lang.Integer count){ try { javonetHandle.invoke("RunCalculate",count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void RunCalculatePrime (java.lang.Integer count){ try { javonetHandle.invoke("RunCalculatePrime",count);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Boolean IsPrimeNumber (java.lang.Integer num){ try { return javonetHandle.invoke("IsPrimeNumber",num);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public java.lang.Integer Calculate (java.lang.Integer i,java.lang.Integer result){ try { return javonetHandle.invoke("Calculate",i,result);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public void RunCalculate (){ try { javonetHandle.invoke("RunCalculate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void Calculate (){ try { javonetHandle.invoke("Calculate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MeasureEvents (){ try { javonetHandle.invoke("MeasureEvents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer GetRandomInt (){ try { return javonetHandle.invoke("GetRandomInt");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public <T> java.lang.String GetRandom (T param){ try { return  (java.lang.String) javonetHandle.generic(getGetObjectName(param)).invoke("GetRandom",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public static void StaticSetRef (AtomicReference<java.lang.String> arg){ try { Javonet.getType("Sample").invoke("StaticSetRef",new NRef(arg));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void StaticSetRefArray (AtomicReference<java.lang.String[]> arg){ try { Javonet.getType("Sample").invoke("StaticSetRefArray",new NRef(arg));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void StaticSetRefArray (Item[] arg){ try { Javonet.getType("Sample").invoke("StaticSetRefArray",new Object[] {arg});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void PopulateOutArray (Item[] arg){ try { javonetHandle.invoke("PopulateOutArray",new Object[] {arg});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void StaticSetOut (AtomicReference<java.lang.String> arg){ try { Javonet.getType("Sample").invoke("StaticSetOut",new NOut(arg, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void StaticSetOutInt (AtomicReference<java.lang.Integer> arg){ try { Javonet.getType("Sample").invoke("StaticSetOutInt",new NOut(arg, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static <T> void StaticSetRef (T arg,T value){ try { Javonet.getType("Sample").generic(getGetObjectName(arg),getGetObjectName(value)).invoke("StaticSetRef",arg,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static void StaticSetRefItem (Item arg,Item value){ try { Javonet.getType("Sample").invoke("StaticSetRefItem",arg,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public static <T> void StaticSetOut (T arg,T value){ try { Javonet.getType("Sample").generic(getGetObjectName(arg),getGetObjectName(value)).invoke("StaticSetOut",arg,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetRef (AtomicReference<java.lang.String> arg){ try { javonetHandle.invoke("SetRef",new NRef(arg));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetRefArray (AtomicReference<java.lang.String[]> arg){ try { javonetHandle.invoke("SetRefArray",new NRef(arg));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetRefArray (Item[] arg){ try { javonetHandle.invoke("SetRefArray",new Object[] {arg});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetOut (AtomicReference<java.lang.String> arg){ try { javonetHandle.invoke("SetOut",new NOut(arg, Helper.JavaToDotnetType.get(java.lang.String.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetOutInt (AtomicReference<java.lang.Integer> arg){ try { javonetHandle.invoke("SetOutInt",new NOut(arg, Helper.JavaToDotnetType.get(java.lang.Integer.class)));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public <T> void SetRef (T arg,T value){ try { javonetHandle.generic(getGetObjectName(arg),getGetObjectName(value)).invoke("SetRef",arg,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void SetRefItem (Item arg,Item value){ try { javonetHandle.invoke("SetRefItem",arg,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public <T> void SetOut (T arg,T value){ try { javonetHandle.generic(getGetObjectName(arg),getGetObjectName(value)).invoke("SetOut",arg,value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public <T> T GetRandom (NObject arg1,NObject arg2, Class<?> returnType){ try { return (T)Convert(javonetHandle.generic(getReturnObjectName(returnType)).invoke("GetRandom",arg1,arg2), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public static <T> T GetStaticRandom (NObject arg1,NObject arg2, Class<?> returnType){ try { return (T)Convert(Javonet.getType("Sample").generic(getReturnObjectName(returnType)).invoke("GetStaticRandom",arg1,arg2), returnType);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.String[] GetItems (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetItems"),java.lang.String[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public Item[] GetRefItems (){ try { return Helper.ConvertNObjectToDestinationType((NObject[])javonetHandle.invoke("GetRefItems"),Item[].class);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public void DisplayArray (java.lang.String[] items){ try { javonetHandle.invoke("DisplayArray",new Object[] {items});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void DisplayArray (Item[] items){ try { javonetHandle.invoke("DisplayArray",new Object[] {items});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.Integer AddInt (java.lang.Integer a,java.lang.Integer b){ try { return javonetHandle.invoke("AddInt",a,b);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }/**
	 * Method
	 */
            public java.lang.Character ReturnChar (java.lang.Character c){ try { return javonetHandle.invoke("ReturnChar",c);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Long AddLong (java.lang.Long a,java.lang.Long b){ try { return javonetHandle.invoke("AddLong",a,b);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Float AddFloat (java.lang.Float a,java.lang.Float b){ try { return javonetHandle.invoke("AddFloat",a,b);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * Method
	 */
            public java.lang.Double AddDouble (java.lang.Double a,java.lang.Double b){ try { return javonetHandle.invoke("AddDouble",a,b);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0.0;} }/**
	 * Event
	 */
            private java.util.ArrayList< ShowResultHandler> _TestEventListeners = new java.util.ArrayList<ShowResultHandler>();

            public void addTestEvent(ShowResultHandler toAdd)
            {
                _TestEventListeners.add(toAdd);
            }
            public void removeTestEvent(ShowResultHandler toRemove)
            {
                _TestEventListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}