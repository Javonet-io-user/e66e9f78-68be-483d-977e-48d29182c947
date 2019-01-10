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

public class LanguageData {
  protected NObject javonetHandle;
  /** GetFiled */
  public Grammar getGrammar() {
    try {
      Object res = javonetHandle.<NObject>get("Grammar");
      if (res == null) return null;
      return new Grammar((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setGrammar(Grammar param) {
    try {
      javonetHandle.set("Grammar", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public GrammarData getGrammarData() {
    try {
      Object res = javonetHandle.<NObject>get("GrammarData");
      if (res == null) return null;
      return new GrammarData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setGrammarData(GrammarData param) {
    try {
      javonetHandle.set("GrammarData", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ParserData getParserData() {
    try {
      Object res = javonetHandle.<NObject>get("ParserData");
      if (res == null) return null;
      return new ParserData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setParserData(ParserData param) {
    try {
      javonetHandle.set("ParserData", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ScannerData getScannerData() {
    try {
      Object res = javonetHandle.<NObject>get("ScannerData");
      if (res == null) return null;
      return new ScannerData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setScannerData(ScannerData param) {
    try {
      javonetHandle.set("ScannerData", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public GrammarErrorList getErrors() {
    try {
      Object res = javonetHandle.<NObject>get("Errors");
      if (res == null) return null;
      return new GrammarErrorList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setErrors(GrammarErrorList param) {
    try {
      javonetHandle.set("Errors", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public GrammarErrorLevel getErrorLevel() {
    try {
      Object res = javonetHandle.<NEnum>get("ErrorLevel");
      if (res == null) return null;
      return GrammarErrorLevel.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setErrorLevel(GrammarErrorLevel param) {
    try {
      javonetHandle.set("ErrorLevel", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Long getConstructionTime() {
    try {
      java.lang.Long res = javonetHandle.get("ConstructionTime");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setConstructionTime(java.lang.Long param) {
    try {
      javonetHandle.set("ConstructionTime", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getAstDataVerified() {
    try {
      java.lang.Boolean res = javonetHandle.get("AstDataVerified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setAstDataVerified(java.lang.Boolean param) {
    try {
      javonetHandle.set("AstDataVerified", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LanguageData(Grammar grammar) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.LanguageData", grammar);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LanguageData(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void ConstructAll() {
    try {
      javonetHandle.invoke("ConstructAll");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean CanParse() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("CanParse");
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
