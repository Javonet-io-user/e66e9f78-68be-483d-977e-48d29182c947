package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.Collections.Generic.*;

public class ExtensionMethods {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static <T> void AddIfNotContained(List<T> list, T element) {
    try {
      Javonet.getType("ExtensionMethods")
          .generic(getGetObjectName(element))
          .invoke("AddIfNotContained", list, element);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static <T> T[] ToArrayVersionIndependent(
      ICollection<T> list, Class<?> returnType, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("ExtensionMethods")
              .generic(getReturnObjectName(returnType))
              .invoke("ToArrayVersionIndependent", list);
      if (res == null) return null;
      return (T[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
