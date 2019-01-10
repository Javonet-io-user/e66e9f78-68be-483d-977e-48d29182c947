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
import jio.System.*;

public class Token {
  protected NObject javonetHandle;
  /** GetProperty */
  public Terminal getTerminal() {
    try {
      Object res = javonetHandle.<NObject>get("Terminal");
      if (res == null) return null;
      return new Terminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getValueString() {
    try {
      java.lang.String res = javonetHandle.get("ValueString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public TokenCategory getCategory() {
    try {
      Object res = javonetHandle.<NEnum>get("Category");
      if (res == null) return null;
      return TokenCategory.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getLength() {
    try {
      java.lang.Integer res = javonetHandle.get("Length");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetFiled */

  public KeyTerm getKeyTerm() {
    try {
      Object res = javonetHandle.<NObject>get("KeyTerm");
      if (res == null) return null;
      return new KeyTerm((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setKeyTerm(KeyTerm param) {
    try {
      javonetHandle.set("KeyTerm", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public SourceLocation getLocation() {
    try {
      Object res = javonetHandle.<NObject>get("Location");
      if (res == null) return null;
      return new SourceLocation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setLocation(SourceLocation param) {
    try {
      javonetHandle.set("Location", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String getText() {
    try {
      java.lang.String res = javonetHandle.get("Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setText(java.lang.String param) {
    try {
      javonetHandle.set("Text", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Object getValue() {
    try {
      Object res = javonetHandle.<NObject>get("Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setValue(Object param) {
    try {
      javonetHandle.set("Value", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Object getDetails() {
    try {
      Object res = javonetHandle.<NObject>get("Details");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setDetails(Object param) {
    try {
      javonetHandle.set("Details", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TokenFlags getFlags() {
    try {
      Object res = javonetHandle.<NEnum>get("Flags");
      if (res == null) return null;
      return TokenFlags.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setFlags(TokenFlags param) {
    try {
      javonetHandle.set("Flags", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TokenEditorInfo getEditorInfo() {
    try {
      Object res = javonetHandle.<NObject>get("EditorInfo");
      if (res == null) return null;
      return new TokenEditorInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setEditorInfo(TokenEditorInfo param) {
    try {
      javonetHandle.set("EditorInfo", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Token getOtherBrace() {
    try {
      Object res = javonetHandle.<NObject>get("OtherBrace");
      if (res == null) return null;
      return new Token((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setOtherBrace(Token param) {
    try {
      javonetHandle.set("OtherBrace", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Short getScannerState() {
    try {
      java.lang.Short res = javonetHandle.get("ScannerState");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setScannerState(java.lang.Short param) {
    try {
      javonetHandle.set("ScannerState", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Token(Terminal term, SourceLocation location, java.lang.String text, Object value) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Token", term, location, text, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Token(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void SetTerminal(Terminal terminal) {
    try {
      javonetHandle.invoke("SetTerminal", terminal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IsSet(TokenFlags flag) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSet", NEnum.fromJavaEnum(flag));
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsError() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsError");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
