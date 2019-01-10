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
import jio.System.*;
import combit.ListLabel24.*;

public class EvaluateFunctionEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setResultType(LlParamType value) {
    try {
      javonetHandle.set("ResultType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LlParamType getResultType() {
    try {
      Object res = javonetHandle.<NEnum>get("ResultType");
      if (res == null) return null;
      return LlParamType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDecimalPositions(java.lang.Integer value) {
    try {
      javonetHandle.set("DecimalPositions", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getDecimalPositions() {
    try {
      java.lang.Integer res = javonetHandle.get("DecimalPositions");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getParameters() {
    try {
      java.lang.Integer res = javonetHandle.get("Parameters");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public Object getParameter1() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter1");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getParameter2() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter2");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getParameter3() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter3");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getParameter4() {
    try {
      Object res = javonetHandle.<NObject>get("Parameter4");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setResultValue(Object value) {
    try {
      javonetHandle.set("ResultValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getResultValue() {
    try {
      Object res = javonetHandle.<NObject>get("ResultValue");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getFunctionName() {
    try {
      java.lang.String res = javonetHandle.get("FunctionName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public EvaluateFunctionEventArgs(
      LlParamType resultType,
      java.lang.Integer decimalPositions,
      java.lang.Integer parameters,
      Object parameter1,
      Object parameter2,
      Object parameter3,
      Object parameter4,
      java.lang.String functionName) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.EvaluateFunctionEventArgs",
              NEnum.fromJavaEnum(resultType),
              decimalPositions,
              parameters,
              parameter1,
              parameter2,
              parameter3,
              parameter4,
              functionName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EvaluateFunctionEventArgs(NObject handle) {
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
