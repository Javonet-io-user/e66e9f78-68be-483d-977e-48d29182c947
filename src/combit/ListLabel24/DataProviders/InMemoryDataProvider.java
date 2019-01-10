package combit.ListLabel24.DataProviders;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import combit.ListLabel24.DataProviders.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import combit.ListLabel24.*;

public class InMemoryDataProvider extends SQLiteConnectionDataProvider
    implements IDataProvider,
        ICanHandleUsedIdentifiers,
        ISerializable,
        IDisposable,
        ISupportsLogger {
  protected NObject javonetHandle;

  public InMemoryDataProvider() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.InMemoryDataProvider");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InMemoryDataProvider(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void AddTable(IDataProvider provider, java.lang.String tableName) {
    try {
      javonetHandle.invoke("AddTable", provider, tableName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AddTable(ITable table) {
    try {
      javonetHandle.invoke("AddTable", table);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AddRelation(
      java.lang.String parentTableName,
      java.lang.String childTableName,
      java.lang.String parentColumnName,
      java.lang.String childColumnName) {
    try {
      javonetHandle.invoke(
          "AddRelation", parentTableName, childTableName, parentColumnName, childColumnName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
