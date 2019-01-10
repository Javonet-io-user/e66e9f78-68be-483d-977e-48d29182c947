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

public class LlTableLine extends ValueType {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.Integer getnSize() {
    try {
      java.lang.Integer res = javonetHandle.get("nSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnSize(java.lang.Integer param) {
    try {
      javonetHandle.set("nSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnType() {
    try {
      java.lang.Integer res = javonetHandle.get("nType");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnType(java.lang.Integer param) {
    try {
      javonetHandle.set("nType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gethRefDC() {
    try {
      java.lang.Integer res = javonetHandle.get("hRefDC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void sethRefDC(java.lang.Integer param) {
    try {
      javonetHandle.set("hRefDC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gethPaintDC() {
    try {
      java.lang.Integer res = javonetHandle.get("hPaintDC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void sethPaintDC(java.lang.Integer param) {
    try {
      javonetHandle.set("hPaintDC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public RECT getrcPaint() {
    try {
      Object res = javonetHandle.<NObject>get("rcPaint");
      if (res == null) return null;
      return new RECT((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setrcPaint(RECT param) {
    try {
      javonetHandle.set("rcPaint", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnPageLine() {
    try {
      java.lang.Integer res = javonetHandle.get("nPageLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnPageLine(java.lang.Integer param) {
    try {
      javonetHandle.set("nPageLine", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnLine() {
    try {
      java.lang.Integer res = javonetHandle.get("nLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnLine(java.lang.Integer param) {
    try {
      javonetHandle.set("nLine", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnLineDef() {
    try {
      java.lang.Integer res = javonetHandle.get("nLineDef");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnLineDef(java.lang.Integer param) {
    try {
      javonetHandle.set("nLineDef", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getbZebra() {
    try {
      java.lang.Boolean res = javonetHandle.get("bZebra");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setbZebra(java.lang.Boolean param) {
    try {
      javonetHandle.set("bZebra", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public RECT getrcSpacing() {
    try {
      Object res = javonetHandle.<NObject>get("rcSpacing");
      if (res == null) return null;
      return new RECT((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setrcSpacing(RECT param) {
    try {
      javonetHandle.set("rcSpacing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlTableLine(NObject handle) {
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
