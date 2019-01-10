package Irony.Parsing.Construction;

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
import Irony.Parsing.Construction.*;
import Irony.Parsing.*;

public class LR0Item {
  protected NObject javonetHandle;
  /** GetProperty */
  public LR0Item getShiftedItem() {
    try {
      Object res = javonetHandle.<NObject>get("ShiftedItem");
      if (res == null) return null;
      return new LR0Item((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsKernel() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsKernel");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsInitial() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsInitial");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsFinal() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsFinal");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  public Production getProduction() {
    try {
      Object res = javonetHandle.<NObject>get("Production");
      if (res == null) return null;
      return new Production((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setProduction(Production param) {
    try {
      javonetHandle.set("Production", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getPosition() {
    try {
      java.lang.Integer res = javonetHandle.get("Position");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setPosition(java.lang.Integer param) {
    try {
      javonetHandle.set("Position", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public BnfTerm getCurrent() {
    try {
      Object res = javonetHandle.<NObject>get("Current");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setCurrent(BnfTerm param) {
    try {
      javonetHandle.set("Current", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getTailIsNullable() {
    try {
      java.lang.Boolean res = javonetHandle.get("TailIsNullable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setTailIsNullable(java.lang.Boolean param) {
    try {
      javonetHandle.set("TailIsNullable", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public GrammarHintList getHints() {
    try {
      Object res = javonetHandle.<NObject>get("Hints");
      if (res == null) return null;
      return new GrammarHintList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setHints(GrammarHintList param) {
    try {
      javonetHandle.set("Hints", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LR0Item(
      java.lang.Integer id,
      Production production,
      java.lang.Integer position,
      GrammarHintList hints) {
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.Construction.LR0Item", id, production, position, hints);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LR0Item(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
  /** Method */

  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
