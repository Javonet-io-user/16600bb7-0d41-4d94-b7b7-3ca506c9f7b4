package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.*;
import jio.System.*;public class SampleClass<T> {protected NObject javonetHandle; public SampleClass (){ try {  javonetHandle = Javonet.New("SampleClass");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public SampleClass(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void GenricMethod (){ try { javonetHandle.invoke("GenricMethod");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MethodWithTypeArg (Class arg){ try { javonetHandle.invoke("MethodWithTypeArg",Javonet.getType(getReturnObjectName(arg).getTypeName()));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void MethodWithNestedEnumArg (Container.RunTypes type){ try { javonetHandle.invoke("MethodWithNestedEnumArg",NEnum.fromJavaEnum(type));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}