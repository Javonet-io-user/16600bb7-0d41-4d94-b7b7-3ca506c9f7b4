package jio.System.Data;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Data.*;public class DataTable {public NObject javonetHandle; public DataTable (){ try {  javonetHandle = Javonet.New("DataTable");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataTable (java.lang.String tableName){ try {  javonetHandle = Javonet.New("DataTable",tableName);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataTable (java.lang.String tableName,java.lang.String tableNamespace){ try {  javonetHandle = Javonet.New("DataTable",tableName,tableNamespace);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DataTable(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}