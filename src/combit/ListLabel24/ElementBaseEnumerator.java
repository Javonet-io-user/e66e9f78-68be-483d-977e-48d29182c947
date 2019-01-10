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
import jio.System.*;
import jio.System.Collections.*;

public abstract class ElementBaseEnumerator
    implements IDictionaryEnumerator, IEnumerator, Iterator<Object> {
  protected NObject javonetHandle;

  @Override
  public boolean hasNext() {
    return (java.lang.Boolean) this.IEnumerator_MoveNext();
  }

  @Override
  public Object next() {
    return (Object) this.get_Current();
  }
  /** GetProperty */

  public Element getCurrentProperty() {
    try {
      Object res = javonetHandle.<NObject>get("Current");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public Object getValue() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
              .invoke("get_Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ElementBaseEnumerator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean IEnumerator_MoveNext() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("MoveNext");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void IEnumerator_Reset() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object get_Key() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
              .invoke("get_Key");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DictionaryEntry get_Entry() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionaryEnumerator")
              .invoke("get_Entry");
      if (res == null) return null;
      return new DictionaryEntry((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object get_Current() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerator")
              .invoke("get_Current");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
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
