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

public class LRItem {
  protected NObject javonetHandle;
  /** GetFiled */
  public ParserState getState() {
    try {
      Object res = javonetHandle.<NObject>get("State");
      if (res == null) return null;
      return new ParserState((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setState(ParserState param) {
    try {
      javonetHandle.set("State", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public LR0Item getCore() {
    try {
      Object res = javonetHandle.<NObject>get("Core");
      if (res == null) return null;
      return new LR0Item((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setCore(LR0Item param) {
    try {
      javonetHandle.set("Core", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public LRItem getShiftedItem() {
    try {
      Object res = javonetHandle.<NObject>get("ShiftedItem");
      if (res == null) return null;
      return new LRItem((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setShiftedItem(LRItem param) {
    try {
      javonetHandle.set("ShiftedItem", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Transition getTransition() {
    try {
      Object res = javonetHandle.<NObject>get("Transition");
      if (res == null) return null;
      return new Transition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTransition(Transition param) {
    try {
      javonetHandle.set("Transition", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TransitionSet getLookbacks() {
    try {
      Object res = javonetHandle.<NObject>get("Lookbacks");
      if (res == null) return null;
      return new TransitionSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setLookbacks(TransitionSet param) {
    try {
      javonetHandle.set("Lookbacks", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TerminalSet getLookaheads() {
    try {
      Object res = javonetHandle.<NObject>get("Lookaheads");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setLookaheads(TerminalSet param) {
    try {
      javonetHandle.set("Lookaheads", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LRItem(ParserState state, LR0Item core) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Construction.LRItem", state, core);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LRItem(NObject handle) {
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
  /** Method */

  public TerminalSet GetLookaheadsInConflict() {
    try {
      Object res = javonetHandle.invoke("GetLookaheadsInConflict");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
