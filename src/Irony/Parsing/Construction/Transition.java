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

public class Transition {
  protected NObject javonetHandle;
  /** GetFiled */
  public ParserState getFromState() {
    try {
      Object res = javonetHandle.<NObject>get("FromState");
      if (res == null) return null;
      return new ParserState((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setFromState(ParserState param) {
    try {
      javonetHandle.set("FromState", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public ParserState getToState() {
    try {
      Object res = javonetHandle.<NObject>get("ToState");
      if (res == null) return null;
      return new ParserState((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setToState(ParserState param) {
    try {
      javonetHandle.set("ToState", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public NonTerminal getOverNonTerminal() {
    try {
      Object res = javonetHandle.<NObject>get("OverNonTerminal");
      if (res == null) return null;
      return new NonTerminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setOverNonTerminal(NonTerminal param) {
    try {
      javonetHandle.set("OverNonTerminal", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public LRItemSet getItems() {
    try {
      Object res = javonetHandle.<NObject>get("Items");
      if (res == null) return null;
      return new LRItemSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setItems(LRItemSet param) {
    try {
      javonetHandle.set("Items", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TransitionSet getIncludes() {
    try {
      Object res = javonetHandle.<NObject>get("Includes");
      if (res == null) return null;
      return new TransitionSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setIncludes(TransitionSet param) {
    try {
      javonetHandle.set("Includes", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TransitionSet getIncludedBy() {
    try {
      Object res = javonetHandle.<NObject>get("IncludedBy");
      if (res == null) return null;
      return new TransitionSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setIncludedBy(TransitionSet param) {
    try {
      javonetHandle.set("IncludedBy", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Transition(ParserState fromState, NonTerminal overNonTerminal) {
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.Construction.Transition", fromState, overNonTerminal);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Transition(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Include(Transition other) {
    try {
      javonetHandle.invoke("Include", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
