package jio.System.Collections.Generic;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Generic.*;public class List<T> {public NObject javonetHandle; public List (){ try {  javonetHandle = Javonet.New("List");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public List (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("List",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public List (IEnumerable<T> collection){ try {  javonetHandle = Javonet.New("List",collection);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public List(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}