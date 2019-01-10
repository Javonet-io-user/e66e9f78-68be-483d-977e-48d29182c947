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

public class LlPrinter extends ValueType {
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

  public java.lang.Boolean getbFirst() {
    try {
      java.lang.Boolean res = javonetHandle.get("bFirst");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setbFirst(java.lang.Boolean param) {
    try {
      javonetHandle.set("bFirst", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnCmd() {
    try {
      java.lang.Integer res = javonetHandle.get("nCmd");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnCmd(java.lang.Integer param) {
    try {
      javonetHandle.set("nCmd", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gethWnd() {
    try {
      java.lang.Integer res = javonetHandle.get("hWnd");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void sethWnd(java.lang.Integer param) {
    try {
      javonetHandle.set("hWnd", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gethDC() {
    try {
      java.lang.Integer res = javonetHandle.get("hDC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void sethDC(java.lang.Integer param) {
    try {
      javonetHandle.set("hDC", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Short getnOrientation() {
    try {
      java.lang.Short res = javonetHandle.get("nOrientation");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnOrientation(java.lang.Short param) {
    try {
      javonetHandle.set("nOrientation", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getbPhysPage() {
    try {
      java.lang.Boolean res = javonetHandle.get("bPhysPage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setbPhysPage(java.lang.Boolean param) {
    try {
      javonetHandle.set("bPhysPage", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnBufSize() {
    try {
      java.lang.Integer res = javonetHandle.get("nBufSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnBufSize(java.lang.Integer param) {
    try {
      javonetHandle.set("nBufSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getpszBuffer() {
    try {
      java.lang.Integer res = javonetHandle.get("pszBuffer");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setpszBuffer(java.lang.Integer param) {
    try {
      javonetHandle.set("pszBuffer", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnUniqueNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("nUniqueNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnUniqueNumber(java.lang.Integer param) {
    try {
      javonetHandle.set("nUniqueNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnUniqueNumberCompare() {
    try {
      java.lang.Integer res = javonetHandle.get("nUniqueNumberCompare");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnUniqueNumberCompare(java.lang.Integer param) {
    try {
      javonetHandle.set("nUniqueNumberCompare", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getnPaperFormat() {
    try {
      java.lang.Integer res = javonetHandle.get("nPaperFormat");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setnPaperFormat(java.lang.Integer param) {
    try {
      javonetHandle.set("nPaperFormat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getxPaperSize() {
    try {
      java.lang.Integer res = javonetHandle.get("xPaperSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setxPaperSize(java.lang.Integer param) {
    try {
      javonetHandle.set("xPaperSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getyPaperSize() {
    try {
      java.lang.Integer res = javonetHandle.get("yPaperSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setyPaperSize(java.lang.Integer param) {
    try {
      javonetHandle.set("yPaperSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlPrinter(NObject handle) {
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
