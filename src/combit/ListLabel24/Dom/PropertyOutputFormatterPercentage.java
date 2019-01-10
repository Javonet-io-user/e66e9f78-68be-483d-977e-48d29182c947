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

public class PropertyOutputFormatterPercentage extends PropertyOutputFormatterBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setForceSign(java.lang.String value) {
    try {
      javonetHandle.set("ForceSign", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getForceSign() {
    try {
      java.lang.String res = javonetHandle.get("ForceSign");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMultiplyBy100(java.lang.String value) {
    try {
      javonetHandle.set("MultiplyBy100", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMultiplyBy100() {
    try {
      java.lang.String res = javonetHandle.get("MultiplyBy100");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCountOfDecimals(java.lang.String value) {
    try {
      javonetHandle.set("CountOfDecimals", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCountOfDecimals() {
    try {
      java.lang.String res = javonetHandle.get("CountOfDecimals");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDecimalSeparatorCharType(java.lang.String value) {
    try {
      javonetHandle.set("DecimalSeparatorCharType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDecimalSeparatorCharType() {
    try {
      java.lang.String res = javonetHandle.get("DecimalSeparatorCharType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setEmptyStringIfZero(java.lang.String value) {
    try {
      javonetHandle.set("EmptyStringIfZero", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getEmptyStringIfZero() {
    try {
      java.lang.String res = javonetHandle.get("EmptyStringIfZero");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setForceZeroBeforeDecimalSeparator(java.lang.String value) {
    try {
      javonetHandle.set("ForceZeroBeforeDecimalSeparator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getForceZeroBeforeDecimalSeparator() {
    try {
      java.lang.String res = javonetHandle.get("ForceZeroBeforeDecimalSeparator");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNegativeFormatType(java.lang.String value) {
    try {
      javonetHandle.set("NegativeFormatType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNegativeFormatType() {
    try {
      java.lang.String res = javonetHandle.get("NegativeFormatType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setThousandsSeparatorCharType(java.lang.String value) {
    try {
      javonetHandle.set("ThousandsSeparatorCharType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getThousandsSeparatorCharType() {
    try {
      java.lang.String res = javonetHandle.get("ThousandsSeparatorCharType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public PropertyOutputFormatterPercentage(PropertyOutputFormatterBase item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.PropertyOutputFormatterPercentage", item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PropertyOutputFormatterPercentage(NObject handle) {
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
