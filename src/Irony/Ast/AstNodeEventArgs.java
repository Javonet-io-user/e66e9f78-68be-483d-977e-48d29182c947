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
import jio.System.*;
import Irony.Ast.*;
import Irony.Parsing.*;

public class AstNodeEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public Object getAstNode() {
    try {
      Object res = javonetHandle.<NObject>get("AstNode");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public ParseTreeNode getParseTreeNode() {
    try {
      Object res = javonetHandle.<NObject>get("ParseTreeNode");
      if (res == null) return null;
      return new ParseTreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setParseTreeNode(ParseTreeNode param) {
    try {
      javonetHandle.set("ParseTreeNode", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstNodeEventArgs(ParseTreeNode parseTreeNode) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Ast.AstNodeEventArgs", parseTreeNode);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstNodeEventArgs(NObject handle) {
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
