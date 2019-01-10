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

public class HostPrinterEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getIsFirstPage() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsFirstPage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsPhysicalPage() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsPhysicalPage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCommandId() {
    try {
      java.lang.Integer res = javonetHandle.get("CommandId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getHandle() {
    try {
      java.lang.Integer res = javonetHandle.get("Handle");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setDC(java.lang.Integer value) {
    try {
      javonetHandle.set("DC", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getDC() {
    try {
      java.lang.Integer res = javonetHandle.get("DC");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setOrientation(java.lang.Short value) {
    try {
      javonetHandle.set("Orientation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Short getOrientation() {
    try {
      java.lang.Short res = javonetHandle.get("Orientation");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setPaperFormat(java.lang.Integer value) {
    try {
      javonetHandle.set("PaperFormat", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getPaperFormat() {
    try {
      java.lang.Integer res = javonetHandle.get("PaperFormat");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setPaperSizeX(java.lang.Integer value) {
    try {
      javonetHandle.set("PaperSizeX", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getPaperSizeX() {
    try {
      java.lang.Integer res = javonetHandle.get("PaperSizeX");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setPaperSizeY(java.lang.Integer value) {
    try {
      javonetHandle.set("PaperSizeY", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getPaperSizeY() {
    try {
      java.lang.Integer res = javonetHandle.get("PaperSizeY");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getUniqueNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("UniqueNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getUniqueNumberCompare() {
    try {
      java.lang.Integer res = javonetHandle.get("UniqueNumberCompare");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setResultValue(java.lang.Integer value) {
    try {
      javonetHandle.set("ResultValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getResultValue() {
    try {
      java.lang.Integer res = javonetHandle.get("ResultValue");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public LlPrinter getCallbackData() {
    try {
      Object res = javonetHandle.<NObject>get("CallbackData");
      if (res == null) return null;
      return new LlPrinter((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public HostPrinterEventArgs(LlPrinter callbackData) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.HostPrinterEventArgs", callbackData);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HostPrinterEventArgs(NObject handle) {
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
