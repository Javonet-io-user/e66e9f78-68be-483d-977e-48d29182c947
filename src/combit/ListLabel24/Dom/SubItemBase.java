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

public class SubItemBase extends DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  public PageBreakOptions getPageBreakOptions() {
    try {
      Object res = javonetHandle.<NObject>get("PageBreakOptions");
      if (res == null) return null;
      return new PageBreakOptions((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTableId(java.lang.String value) {
    try {
      javonetHandle.set("TableId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTableId() {
    try {
      java.lang.String res = javonetHandle.get("TableId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyBookmark getBookmark() {
    try {
      Object res = javonetHandle.<NObject>get("Bookmark");
      if (res == null) return null;
      return new PropertyBookmark((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDistanceBottom(java.lang.String value) {
    try {
      javonetHandle.set("DistanceBottom", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDistanceBottom() {
    try {
      java.lang.String res = javonetHandle.get("DistanceBottom");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyBookmark getIndexBookmark() {
    try {
      Object res = javonetHandle.<NObject>get("IndexBookmark");
      if (res == null) return null;
      return new PropertyBookmark((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyColumns getColumns() {
    try {
      Object res = javonetHandle.<NObject>get("Columns");
      if (res == null) return null;
      return new PropertyColumns((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFilter(java.lang.String value) {
    try {
      javonetHandle.set("Filter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getFilter() {
    try {
      java.lang.String res = javonetHandle.get("Filter");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
  /** SetProperty */

  public void setDistanceTop(java.lang.String value) {
    try {
      javonetHandle.set("DistanceTop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDistanceTop() {
    try {
      java.lang.String res = javonetHandle.get("DistanceTop");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCondition(java.lang.String value) {
    try {
      javonetHandle.set("Condition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCondition() {
    try {
      java.lang.String res = javonetHandle.get("Condition");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public SubItemBase(NObject handle) {
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
