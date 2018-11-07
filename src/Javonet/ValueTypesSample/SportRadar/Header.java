package Javonet.ValueTypesSample.SportRadar;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.SportRadar.*;public class Header {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setBetStatus (BetStatus value){ try { javonetHandle.set("BetStatus",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public BetStatus getBetStatus (){ try { return BetStatus.valueOf(((NEnum) javonetHandle.get("BetStatus")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setActive (java.lang.Boolean value){ try { javonetHandle.set("Active",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.Boolean getActive (){ try { return javonetHandle.get("Active");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * SetProperty
	 */
            public void setStatus (Status value){ try { javonetHandle.set("Status",NEnum.fromJavaEnum(value));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Status getStatus (){ try { return Status.valueOf(((NEnum) javonetHandle.get("Status")).getValueName());} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Header (){ try {  javonetHandle = Javonet.New("Header");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Header(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}