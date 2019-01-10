package combit.ListLabel24.Dom;

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
import combit.ListLabel24.Dom.*;

public class ObjectBase extends DomItem {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setBreakBefore(java.lang.String value) {
    try {
      javonetHandle.set("BreakBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBreakBefore() {
    try {
      java.lang.String res = javonetHandle.get("BreakBefore");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCondition(java.lang.String value) {
    try {
      javonetHandle.set("Condition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCondition() {
    try {
      java.lang.String res = javonetHandle.get("Condition");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setIssueCondition(java.lang.String value) {
    try {
      javonetHandle.set("IssueCondition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getIssueCondition() {
    try {
      java.lang.String res = javonetHandle.get("IssueCondition");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLocked(java.lang.String value) {
    try {
      javonetHandle.set("Locked", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getLocked() {
    try {
      java.lang.String res = javonetHandle.get("Locked");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyBookmark getBookmark() {
    try {
      Object res = javonetHandle.<NObject>get("Bookmark");
      if (res == null) return null;
      return new PropertyBookmark((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyBookmark getIndexBookmark() {
    try {
      Object res = javonetHandle.<NObject>get("IndexBookmark");
      if (res == null) return null;
      return new PropertyBookmark((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setReadOnly(java.lang.String value) {
    try {
      javonetHandle.set("ReadOnly", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getReadOnly() {
    try {
      java.lang.String res = javonetHandle.get("ReadOnly");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getTemplateUUID() {
    try {
      java.lang.String res = javonetHandle.get("TemplateUUID");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLayerId(java.lang.Integer value) {
    try {
      javonetHandle.set("LayerId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLayerId() {
    try {
      java.lang.Integer res = javonetHandle.get("LayerId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setGroupId(java.lang.Integer value) {
    try {
      javonetHandle.set("GroupId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getGroupId() {
    try {
      java.lang.Integer res = javonetHandle.get("GroupId");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSelected(java.lang.String value) {
    try {
      javonetHandle.set("Selected", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSelected() {
    try {
      java.lang.String res = javonetHandle.get("Selected");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public PropertyRect getPosition() {
    try {
      Object res = javonetHandle.<NObject>get("Position");
      if (res == null) return null;
      return new PropertyRect((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyAnimation getAnimation() {
    try {
      Object res = javonetHandle.<NObject>get("Animation");
      if (res == null) return null;
      return new PropertyAnimation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ObjectBase(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Unlink() {
    try {
      javonetHandle.invoke("Unlink");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LinkTo(ObjectBase parentObject) {
    try {
      javonetHandle.invoke("LinkTo", parentObject);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LinkTo(
      ObjectBase parentObject,
      LlDomVerticalLinkType verticalLinkType,
      LlDomVerticalSizeAdaptionType verticalSizeAdaptionType) {
    try {
      javonetHandle.invoke(
          "LinkTo",
          parentObject,
          NEnum.fromJavaEnum(verticalLinkType),
          NEnum.fromJavaEnum(verticalSizeAdaptionType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LinkTo(
      ObjectBase parentObject,
      LlDomVerticalLinkType verticalLinkType,
      LlDomVerticalSizeAdaptionType verticalSizeAdaptionType,
      LlDomHorizontalLinkType horizontalLinkType,
      LlDomHorizontalSizeAdaptionType horizontalSizeAdaptionType) {
    try {
      javonetHandle.invoke(
          "LinkTo",
          parentObject,
          NEnum.fromJavaEnum(verticalLinkType),
          NEnum.fromJavaEnum(verticalSizeAdaptionType),
          NEnum.fromJavaEnum(horizontalLinkType),
          NEnum.fromJavaEnum(horizontalSizeAdaptionType));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void LinkTo(ObjectBase parentObject, java.lang.Integer linkMode) {
    try {
      javonetHandle.invoke("LinkTo", parentObject, linkMode);
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
