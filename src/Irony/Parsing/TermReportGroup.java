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
import jio.System.Collections.Generic.*;

public class TermReportGroup {
  protected NObject javonetHandle;
  /** GetFiled */
  public java.lang.String getAlias() {
    try {
      java.lang.String res = javonetHandle.get("Alias");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setAlias(java.lang.String param) {
    try {
      javonetHandle.set("Alias", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public TermReportGroupType getGroupType() {
    try {
      Object res = javonetHandle.<NEnum>get("GroupType");
      if (res == null) return null;
      return TermReportGroupType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setGroupType(TermReportGroupType param) {
    try {
      javonetHandle.set("GroupType", NEnum.fromJavaEnum(param));
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

  public TermReportGroup(
      java.lang.String alias, TermReportGroupType groupType, IEnumerable<Terminal> terminals) {
    try {
      javonetHandle =
          Javonet.New(
              "Irony.Parsing.TermReportGroup", alias, NEnum.fromJavaEnum(groupType), terminals);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TermReportGroup(NObject handle) {
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
