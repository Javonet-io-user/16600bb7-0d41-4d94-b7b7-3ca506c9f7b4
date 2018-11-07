package Javonet.ValueTypesSample.SportRadar;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.SportRadar.*;
import jio.System.Collections.Generic.*;public class Message {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setScore (java.lang.String value){ try { javonetHandle.set("Score",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getScore (){ try { return  (java.lang.String) javonetHandle.get("Score");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setTypeOfMessage (MessageType value){ try { javonetHandle.set("TypeOfMessage",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public MessageType getTypeOfMessage (){ try { return new MessageType((NObject)javonetHandle.get("TypeOfMessage"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setEventHeader (Header value){ try { javonetHandle.set("EventHeader",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public Header getEventHeader (){ try { return new Header((NObject)javonetHandle.get("EventHeader"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetProperty
	 */
            public void setOdds (List<Odd> value){ try { javonetHandle.set("Odds",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public List<Odd> getOdds (){ try { return new List<Odd>((NObject)javonetHandle.get("Odds"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public Message (){ try {  javonetHandle = Javonet.New("Message");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public Message(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public MessageType GetType (){ try { return new MessageType((NObject)javonetHandle.invoke("GetType"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}