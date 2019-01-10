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

public class DsvLiteral extends DataLiteralBase {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.String getTerminator() {
    try {
      java.lang.String res = javonetHandle.get("Terminator");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setTerminator(java.lang.String param) {
    try {
      javonetHandle.set("Terminator", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getConsumeTerminator() {
    try {
      java.lang.Boolean res = javonetHandle.get("ConsumeTerminator");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setConsumeTerminator(java.lang.Boolean param) {
    try {
      javonetHandle.set("ConsumeTerminator", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DsvLiteral(java.lang.String name, TypeCode dataType, java.lang.String terminator) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Irony.Parsing.DsvLiteral", name, NEnum.fromJavaEnum(dataType), terminator);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DsvLiteral(java.lang.String name, TypeCode dataType) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.DsvLiteral", name, NEnum.fromJavaEnum(dataType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DsvLiteral(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Init(GrammarData grammarData) {
    try {
      javonetHandle.invoke("Init", grammarData);
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
