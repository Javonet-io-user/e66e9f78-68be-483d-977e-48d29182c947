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

public class TableFieldGauge extends TableFieldBase {
  protected NObject javonetHandle;
  /** GetProperty */
  public PropertyGaugeDefinition getDefinition() {
    try {
      Object res = javonetHandle.<NObject>get("Definition");
      if (res == null) return null;
      return new PropertyGaugeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setExportAsPicture(java.lang.String value) {
    try {
      javonetHandle.set("ExportAsPicture", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getExportAsPicture() {
    try {
      java.lang.String res = javonetHandle.get("ExportAsPicture");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHeight(java.lang.String value) {
    try {
      javonetHandle.set("Height", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getHeight() {
    try {
      java.lang.String res = javonetHandle.get("Height");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSourceTablePath(java.lang.String value) {
    try {
      javonetHandle.set("SourceTablePath", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSourceTablePath() {
    try {
      java.lang.String res = javonetHandle.get("SourceTablePath");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public TableFieldGauge(
      LlDomGaugeType gaugeType, CollectionTableFieldBases itemCollection, java.lang.Integer index) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.Dom.TableFieldGauge",
              NEnum.fromJavaEnum(gaugeType),
              itemCollection,
              index);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TableFieldGauge(LlDomGaugeType gaugeType, CollectionTableFieldBases itemCollection) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.Dom.TableFieldGauge",
              NEnum.fromJavaEnum(gaugeType),
              itemCollection);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TableFieldGauge(NObject handle) {
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
