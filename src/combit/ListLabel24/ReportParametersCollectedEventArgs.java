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
import jio.System.Collections.*;
import jio.System.Collections.Generic.*;

public class ReportParametersCollectedEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getNeedDataError() {
    try {
      java.lang.String res = javonetHandle.get("NeedDataError");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getParameterToErrorTextMapping() {
    try {
      java.lang.String res = javonetHandle.get("ParameterToErrorTextMapping");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, jio.System.Collections.IEnumerable>
      getReportParameterDependencies() {
    try {
      Object res = javonetHandle.<NObject>get("ReportParameterDependencies");
      if (res == null) return null;
      return new Dictionary<java.lang.String, jio.System.Collections.IEnumerable>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public List<ReportParameterWithData> getReportParameters() {
    try {
      Object res = javonetHandle.<NObject>get("ReportParameters");
      if (res == null) return null;
      return new List<ReportParameterWithData>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setReturnType(ReportParametersCollectedReturnType value) {
    try {
      javonetHandle.set("ReturnType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ReportParametersCollectedReturnType getReturnType() {
    try {
      Object res = javonetHandle.<NEnum>get("ReturnType");
      if (res == null) return null;
      return ReportParametersCollectedReturnType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getTriggerPrintID() {
    try {
      java.lang.String res = javonetHandle.get("TriggerPrintID");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ReportParametersCollectedEventArgs(NObject handle) {
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
