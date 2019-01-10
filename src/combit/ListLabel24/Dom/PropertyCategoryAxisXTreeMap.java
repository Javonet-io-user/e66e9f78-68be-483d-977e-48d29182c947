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

public class PropertyCategoryAxisXTreeMap extends PropertyCategoryAxisBase {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setRoundLimitsAsPropertyCategoryAxisXTreeMap(java.lang.String value) {
    try {
      javonetHandle.set("RoundLimits", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getRoundLimitsAsPropertyCategoryAxisXTreeMap() {
    try {
      java.lang.String res = javonetHandle.get("RoundLimits");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setFixedColorGroup(java.lang.String value) {
    try {
      javonetHandle.set("FixedColorGroup", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFixedColorGroup() {
    try {
      java.lang.String res = javonetHandle.get("FixedColorGroup");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyMaxEntryCount getMaxEntryCount() {
    try {
      Object res = javonetHandle.<NObject>get("MaxEntryCount");
      if (res == null) return null;
      return new PropertyMaxEntryCount((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyGridLines getGridLines() {
    try {
      Object res = javonetHandle.<NObject>get("GridLines");
      if (res == null) return null;
      return new PropertyGridLines((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyCategoryAxisXTreeMap(NObject handle) {
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
