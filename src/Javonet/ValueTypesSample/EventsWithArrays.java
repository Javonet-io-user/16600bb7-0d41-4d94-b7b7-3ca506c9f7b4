package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.*;
import jio.System.*;public class EventsWithArrays {protected NObject javonetHandle; public EventsWithArrays (){ try {  javonetHandle = Javonet.New("EventsWithArrays");javonetHandle.addEventListener("SampleEvent", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (SampleEventHandler handler : _SampleEventListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], NObject[].class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public EventsWithArrays(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public void CallEvent (java.lang.Byte[] bytes){ try { javonetHandle.invoke("CallEvent",new Object[] {bytes});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Event
	 */
            private java.util.ArrayList< SampleEventHandler> _SampleEventListeners = new java.util.ArrayList<SampleEventHandler>();

            public void addSampleEvent(SampleEventHandler toAdd)
            {
                _SampleEventListeners.add(toAdd);
            }
            public void removeSampleEvent(SampleEventHandler toRemove)
            {
                _SampleEventListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}