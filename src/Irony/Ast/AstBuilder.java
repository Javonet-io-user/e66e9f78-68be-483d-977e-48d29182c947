package Irony.Ast;

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
import Irony.Ast.*;
import Irony.Parsing.*;

public class AstBuilder {
  protected NObject javonetHandle;
  /** GetFiled */
  public AstContext getContext() {
    try {
      Object res = javonetHandle.<NObject>get("Context");
      if (res == null) return null;
      return new AstContext((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setContext(AstContext param) {
    try {
      javonetHandle.set("Context", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstBuilder(AstContext context) {
    try {
      javonetHandle = Javonet.New("Irony.Ast.AstBuilder", context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstBuilder(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void BuildAst(ParseTree parseTree) {
    try {
      javonetHandle.invoke("BuildAst", parseTree);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void VerifyLanguageData() {
    try {
      javonetHandle.invoke("VerifyLanguageData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void BuildAst(ParseTreeNode parseNode) {
    try {
      javonetHandle.invoke("BuildAst", parseNode);
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
