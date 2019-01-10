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
import jio.System.*;
import combit.ListLabel24.DataProviders.*;

public class AddRelationEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setProvider(DbCommandSetDataProvider value) {
    try {
      javonetHandle.set("Provider", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DbCommandSetDataProvider getProvider() {
    try {
      Object res = javonetHandle.<NObject>get("Provider");
      if (res == null) return null;
      return new DbCommandSetDataProvider((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public AddRelationEventArgs() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.AddRelationEventArgs");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AddRelationEventArgs(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
