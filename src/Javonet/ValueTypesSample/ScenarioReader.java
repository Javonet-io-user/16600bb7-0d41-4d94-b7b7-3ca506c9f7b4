package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.*;
import jio.System.*;public class ScenarioReader {protected NObject javonetHandle; public ScenarioReader (){ try {  javonetHandle = Javonet.New("ScenarioReader");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public ScenarioReader(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public static Scenario ReadScenario (java.lang.String filename,FuncTResult<java.lang.String> askForPassword,IProgressFeedback progress){ try { return new Scenario((NObject)Javonet.getType("ScenarioReader").invoke("ReadScenario",filename,askForPassword,progress));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}