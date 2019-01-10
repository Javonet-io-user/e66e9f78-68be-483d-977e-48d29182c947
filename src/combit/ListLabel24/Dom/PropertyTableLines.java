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

public class PropertyTableLines extends DomItem {
  protected NObject javonetHandle;
  /** GetProperty */
  public CollectionTableLinesData getData() {
    try {
      Object res = javonetHandle.<NObject>get("Data");
      if (res == null) return null;
      return new CollectionTableLinesData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CollectionTableLinesHeader getHeader() {
    try {
      Object res = javonetHandle.<NObject>get("Header");
      if (res == null) return null;
      return new CollectionTableLinesHeader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CollectionTableLinesGroupHeader getGroupHeader() {
    try {
      Object res = javonetHandle.<NObject>get("GroupHeader");
      if (res == null) return null;
      return new CollectionTableLinesGroupHeader((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CollectionTableLinesGroupFooter getGroupFooter() {
    try {
      Object res = javonetHandle.<NObject>get("GroupFooter");
      if (res == null) return null;
      return new CollectionTableLinesGroupFooter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CollectionTableLinesFooter getFooter() {
    try {
      Object res = javonetHandle.<NObject>get("Footer");
      if (res == null) return null;
      return new CollectionTableLinesFooter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyTableLines(NObject handle) {
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
