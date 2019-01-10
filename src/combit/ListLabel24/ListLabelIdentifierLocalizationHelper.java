package combit.ListLabel24;

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
import combit.ListLabel24.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;

public class ListLabelIdentifierLocalizationHelper extends ListLabelLocalizationHelperBase
    implements ITranslationList,
        IQueryableTranslationList,
        jio.System.Collections.Generic.IEnumerable<java.lang.Integer>,
        jio.System.Collections.IEnumerable,
        IQueryableIdentifierTranslationList {
  protected NObject javonetHandle;

  public ListLabelIdentifierLocalizationHelper(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.explicitInterface("combit.ListLabel24.ITranslationList").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Add(java.lang.String itemName, java.lang.String itemDisplayName) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ITranslationList")
          .invoke("Add", itemName, itemDisplayName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Add(
      java.lang.String itemName, java.lang.String itemDisplayName, java.lang.Integer LCID) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.ITranslationList")
          .invoke("Add", itemName, itemDisplayName, LCID);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetComplexItemDisplayString(
      java.lang.String complexItem, java.lang.Integer LCID, java.lang.String parentTable) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.IQueryableIdentifierTranslationList")
              .invoke("GetComplexItemDisplayString", complexItem, LCID, parentTable);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void SetupComplexIdentifier(java.lang.String itemName) {
    try {
      javonetHandle
          .explicitInterface("combit.ListLabel24.IQueryableIdentifierTranslationList")
          .invoke("SetupComplexIdentifier", itemName);
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
