package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.*;public class ItemGroup {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setItem1 (Item value){ try { javonetHandle.set("Item1",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Item getItem1 (){ try { return new Item((NObject)javonetHandle.get("Item1"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setItem2 (Item value){ try { javonetHandle.set("Item2",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Item getItem2 (){ try { return new Item((NObject)javonetHandle.get("Item2"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public ItemGroup (Item item,Item item2){ try {  javonetHandle = Javonet.New("ItemGroup",item,item2);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ItemGroup(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}