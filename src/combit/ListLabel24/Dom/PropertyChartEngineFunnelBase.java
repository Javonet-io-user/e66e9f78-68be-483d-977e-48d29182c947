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

public abstract class PropertyChartEngineFunnelBase extends PropertyChartEngineBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setColorMode(java.lang.String value) {
    try {
      javonetHandle.set("ColorMode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getColorMode() {
    try {
      java.lang.String res = javonetHandle.get("ColorMode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setShowSeparatorLines(java.lang.String value) {
    try {
      javonetHandle.set("ShowSeparatorLines", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getShowSeparatorLines() {
    try {
      java.lang.String res = javonetHandle.get("ShowSeparatorLines");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setRelativeRadiusOfStart(java.lang.String value) {
    try {
      javonetHandle.set("RelativeRadiusOfStart", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getRelativeRadiusOfStart() {
    try {
      java.lang.String res = javonetHandle.get("RelativeRadiusOfStart");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyRelativeRadiusOfParallelPart getRelativeRadiusOfParallelPart() {
    try {
      Object res = javonetHandle.<NObject>get("RelativeRadiusOfParallelPart");
      if (res == null) return null;
      return new PropertyRelativeRadiusOfParallelPart((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyValueAxisFunnel getYAxis() {
    try {
      Object res = javonetHandle.<NObject>get("YAxis");
      if (res == null) return null;
      return new PropertyValueAxisFunnel((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyCategoryAxisFunnel getXAxis() {
    try {
      Object res = javonetHandle.<NObject>get("XAxis");
      if (res == null) return null;
      return new PropertyCategoryAxisFunnel((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyChartEngineFunnelBase(NObject handle) {
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
