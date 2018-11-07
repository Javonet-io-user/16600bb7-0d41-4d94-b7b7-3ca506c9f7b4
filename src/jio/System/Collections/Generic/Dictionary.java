package jio.System.Collections.Generic;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Generic.*;public class Dictionary<TKey,TValue> {public NObject javonetHandle; public Dictionary (){ try {  javonetHandle = Javonet.New("Dictionary");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Dictionary (java.lang.Integer capacity){ try {  javonetHandle = Javonet.New("Dictionary",capacity);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Dictionary (IEqualityComparer<TKey> comparer){ try {  javonetHandle = Javonet.New("Dictionary",comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Dictionary (java.lang.Integer capacity,IEqualityComparer<TKey> comparer){ try {  javonetHandle = Javonet.New("Dictionary",capacity,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Dictionary (IDictionary<TKey,TValue> dictionary,IEqualityComparer<TKey> comparer){ try {  javonetHandle = Javonet.New("Dictionary",dictionary,comparer);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Dictionary (IDictionary<TKey,TValue> dictionary){ try {  javonetHandle = Javonet.New("Dictionary",dictionary);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Dictionary(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}