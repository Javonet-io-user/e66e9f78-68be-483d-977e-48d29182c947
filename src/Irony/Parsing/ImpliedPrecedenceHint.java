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
import Irony.Parsing.Construction.*;

public class ImpliedPrecedenceHint extends GrammarHint {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.Integer getImpliedPrecedenceCustomFlag() {
    try {
      java.lang.Integer res =
          Javonet.getType("ImpliedPrecedenceHint").get("ImpliedPrecedenceCustomFlag");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setImpliedPrecedenceCustomFlag(java.lang.Integer param) {
    try {
      Javonet.getType("ImpliedPrecedenceHint").set("ImpliedPrecedenceCustomFlag", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ImpliedPrecedenceHint(java.lang.Integer precedence, Associativity associativity) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.ImpliedPrecedenceHint", precedence, NEnum.fromJavaEnum(associativity));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ImpliedPrecedenceHint(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Apply(LanguageData language, LRItem owner) {
    try {
      javonetHandle.invoke("Apply", language, owner);
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
