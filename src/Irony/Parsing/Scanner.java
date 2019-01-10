package Irony.Parsing;

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
import Irony.Parsing.*;

public class Scanner {
  protected NObject javonetHandle;
  /** GetFiled */
  public ScannerData getData() {
    try {
      Object res = javonetHandle.<NObject>get("Data");
      if (res == null) return null;
      return new ScannerData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setData(ScannerData param) {
    try {
      javonetHandle.set("Data", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Parser getParser() {
    try {
      Object res = javonetHandle.<NObject>get("Parser");
      if (res == null) return null;
      return new Parser((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setParser(Parser param) {
    try {
      javonetHandle.set("Parser", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Scanner(Parser parser) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Scanner", parser);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Scanner(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Token GetToken() {
    try {
      Object res = javonetHandle.invoke("GetToken");
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Token VsReadToken(AtomicReference<java.lang.Integer> state) {
    try {
      Object res = javonetHandle.invoke("VsReadToken", new NRef(state));
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void VsSetSource(java.lang.String text, java.lang.Integer offset) {
    try {
      javonetHandle.invoke("VsSetSource", text, offset);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void BeginPreview() {
    try {
      javonetHandle.invoke("BeginPreview");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void EndPreview(java.lang.Boolean keepPreviewTokens) {
    try {
      javonetHandle.invoke("EndPreview", keepPreviewTokens);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
