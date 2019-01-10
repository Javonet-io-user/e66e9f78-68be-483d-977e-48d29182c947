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

public class LlBarcode {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setContent(java.lang.String value) {
    try {
      javonetHandle.set("Content", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getContent() {
    try {
      java.lang.String res = javonetHandle.get("Content");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBarcodeType(LlBarcodeType value) {
    try {
      javonetHandle.set("BarcodeType", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LlBarcodeType getBarcodeType() {
    try {
      Object res = javonetHandle.<NEnum>get("BarcodeType");
      if (res == null) return null;
      return LlBarcodeType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTextmode(LlBarcodeTextmode value) {
    try {
      javonetHandle.set("Textmode", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LlBarcodeTextmode getTextmode() {
    try {
      Object res = javonetHandle.<NEnum>get("Textmode");
      if (res == null) return null;
      return LlBarcodeTextmode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LlBarcode(java.lang.String content, LlBarcodeType barcodeType) {
    try {
      javonetHandle =
          Javonet.New("combit.ListLabel24.LlBarcode", content, NEnum.fromJavaEnum(barcodeType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlBarcode(
      java.lang.String content, LlBarcodeType barcodeType, java.lang.Boolean applyFormat) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.LlBarcode",
              content,
              NEnum.fromJavaEnum(barcodeType),
              applyFormat);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LlBarcode(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static java.lang.Boolean IsWellformed(
      java.lang.String content, LlBarcodeType barcodeType) {
    try {
      java.lang.Boolean res =
          Javonet.getType("LlBarcode")
              .invoke("IsWellformed", content, NEnum.fromJavaEnum(barcodeType));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsWellformed() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsWellformed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
