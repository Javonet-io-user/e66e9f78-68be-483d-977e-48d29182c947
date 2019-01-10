package combit.ListLabel24.Dom;

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
import combit.ListLabel24.Dom.*;
import jio.System.CodeDom.*;
import combit.ListLabel24.*;

public class DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  public ListLabel getParentComponent() {
    try {
      Object res = javonetHandle.<NObject>get("ParentComponent");
      if (res == null) return null;
      return new ListLabel((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DomItem(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean PropertyExists(java.lang.String propertyName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("PropertyExists", propertyName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean ObjectExists(java.lang.String objectName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ObjectExists", objectName);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String GetProperty(java.lang.String propertyName) {
    try {
      java.lang.String res = javonetHandle.invoke("GetProperty", propertyName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetProperty(
      java.lang.String propertyName, java.lang.Boolean throwException) {
    try {
      java.lang.String res = javonetHandle.invoke("GetProperty", propertyName, throwException);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void SetProperty(java.lang.String propertyName, java.lang.String propertyValue) {
    try {
      javonetHandle.invoke("SetProperty", propertyName, propertyValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetProperty(
      java.lang.String propertyName,
      java.lang.String propertyValue,
      java.lang.Boolean throwException) {
    try {
      javonetHandle.invoke("SetProperty", propertyName, propertyValue, throwException);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GenerateCode(CodeMemberMethod method, java.lang.String prefix) {
    try {
      javonetHandle.invoke("GenerateCode", method, prefix);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyFrom(DomItem source) {
    try {
      javonetHandle.invoke("CopyFrom", source);
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
