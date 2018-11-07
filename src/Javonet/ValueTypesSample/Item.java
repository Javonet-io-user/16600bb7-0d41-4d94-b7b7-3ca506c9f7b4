package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.*;public class Item {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setItemName (java.lang.String value){ try { javonetHandle.set("ItemName",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getItemName (){ try { return  (java.lang.String) javonetHandle.get("ItemName");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public Item (java.lang.String itemName){ try {  javonetHandle = Javonet.New("Item",itemName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Item(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void QlikTest (){ try { javonetHandle.invoke("QlikTest");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}