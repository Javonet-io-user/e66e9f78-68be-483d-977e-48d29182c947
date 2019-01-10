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

public class GrammarData {
  protected NObject javonetHandle;
  /** GetFiled */
  public LanguageData getLanguage() {
    try {
      Object res = javonetHandle.<NObject>get("Language");
      if (res == null) return null;
      return new LanguageData((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setLanguage(LanguageData param) {
    try {
      javonetHandle.set("Language", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
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

  public NonTerminal getAugmentedRoot() {
    try {
      Object res = javonetHandle.<NObject>get("AugmentedRoot");
      if (res == null) return null;
      return new NonTerminal((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setAugmentedRoot(NonTerminal param) {
    try {
      javonetHandle.set("AugmentedRoot", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public NonTerminalSet getAugmentedSnippetRoots() {
    try {
      Object res = javonetHandle.<NObject>get("AugmentedSnippetRoots");
      if (res == null) return null;
      return new NonTerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setAugmentedSnippetRoots(NonTerminalSet param) {
    try {
      javonetHandle.set("AugmentedSnippetRoots", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public BnfTermSet getAllTerms() {
    try {
      Object res = javonetHandle.<NObject>get("AllTerms");
      if (res == null) return null;
      return new BnfTermSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setAllTerms(BnfTermSet param) {
    try {
      javonetHandle.set("AllTerms", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TerminalSet getTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("Terminals");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setTerminals(TerminalSet param) {
    try {
      javonetHandle.set("Terminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public NonTerminalSet getNonTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("NonTerminals");
      if (res == null) return null;
      return new NonTerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setNonTerminals(NonTerminalSet param) {
    try {
      javonetHandle.set("NonTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TerminalSet getNoPrefixTerminals() {
    try {
      Object res = javonetHandle.<NObject>get("NoPrefixTerminals");
      if (res == null) return null;
      return new TerminalSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setNoPrefixTerminals(TerminalSet param) {
    try {
      javonetHandle.set("NoPrefixTerminals", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GrammarData(LanguageData language) {
    try {
      javonetHandle = Javonet.New("Irony.Parsing.GrammarData", language);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GrammarData(NObject handle) {
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
