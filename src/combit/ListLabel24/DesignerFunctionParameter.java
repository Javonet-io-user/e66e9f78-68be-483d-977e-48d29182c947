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

public class DesignerFunctionParameter {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setType(LlParamType value) {
    try {
      javonetHandle.set("Type", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LlParamType getType() {
    try {
      Object res = javonetHandle.<NEnum>get("Type");
      if (res == null) return null;
      return LlParamType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescription() {
    try {
      java.lang.String res = javonetHandle.get("Description");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public DesignerFunctionParameter() {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DesignerFunctionParameter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DesignerFunctionParameter(java.lang.String description) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DesignerFunctionParameter", description);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DesignerFunctionParameter(NObject handle) {
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
