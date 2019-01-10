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
import jio.System.*;
import jio.System.Collections.*;
import jio.System.Collections.ObjectModel.*;

public class PreviewFile implements ICollection, IEnumerable, IDisposable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IEnumerable_GetEnumerator();
  }
  /** SetProperty */

  public void setLanguage(LlLanguage value) {
    try {
      javonetHandle.set("Language", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LlLanguage getLanguage() {
    try {
      Object res = javonetHandle.<NEnum>get("Language");
      if (res == null) return null;
      return LlLanguage.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getHandle() {
    try {
      java.lang.Integer res = javonetHandle.get("Handle");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getFileVersion() {
    try {
      java.lang.Integer res = javonetHandle.get("FileVersion");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getAPIVersion() {
    try {
      java.lang.Integer res = javonetHandle.get("APIVersion");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public LlUnits getUnits() {
    try {
      Object res = javonetHandle.<NEnum>get("Units");
      if (res == null) return null;
      return LlUnits.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getEmfResolution() {
    try {
      java.lang.Integer res = javonetHandle.get("EmfResolution");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getPrinterCount() {
    try {
      java.lang.Integer res = javonetHandle.get("PrinterCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public LlBoxType getBoxType() {
    try {
      Object res = javonetHandle.<NEnum>get("BoxType");
      if (res == null) return null;
      return LlBoxType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getFilename() {
    try {
      java.lang.String res = javonetHandle.get("Filename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.ICollection").invoke("get_Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public ReadOnlyCollection<PreviewPage> getPages() {
    try {
      Object res = javonetHandle.<NObject>get("Pages");
      if (res == null) return null;
      return new ReadOnlyCollection<PreviewPage>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PreviewPage get_Item(java.lang.Integer index) {
    try {
      Object res = javonetHandle.invoke("get_Item", index);
      if (res == null) return null;
      return new PreviewPage((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PreviewFile(java.lang.String filename) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.PreviewFile", filename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PreviewFile(java.lang.String filename, java.lang.Boolean readOnly) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.PreviewFile", filename, readOnly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PreviewFile(
      java.lang.String filename,
      java.lang.Boolean readOnly,
      java.lang.String tempPath,
      LlLanguage language) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.PreviewFile",
              filename,
              readOnly,
              tempPath,
              NEnum.fromJavaEnum(language));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PreviewFile(java.lang.Integer handle) {
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.PreviewFile", handle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PreviewFile(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetProjectParameterValue(java.lang.String parameterName) {
    try {
      java.lang.String res = javonetHandle.invoke("GetProjectParameterValue", parameterName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void Close() {
    try {
      javonetHandle.invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteFiles() {
    try {
      javonetHandle.invoke("DeleteFiles");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetFilename() {
    try {
      java.lang.String res = javonetHandle.invoke("GetFilename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetFilename(java.lang.Integer jobIndex) {
    try {
      java.lang.String res = javonetHandle.invoke("GetFilename", jobIndex);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void ConvertTo(java.lang.String filename) {
    try {
      javonetHandle.invoke("ConvertTo", filename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ConvertTo(java.lang.String filename, java.lang.String targetFormat) {
    try {
      javonetHandle.invoke("ConvertTo", filename, targetFormat);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Append(java.lang.String filename) {
    try {
      javonetHandle.invoke("Append", filename);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Append(PreviewFile previewFile) {
    try {
      javonetHandle.invoke("Append", previewFile);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Append(java.lang.Integer handle) {
    try {
      javonetHandle.invoke("Append", handle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Print() {
    try {
      javonetHandle.invoke("Print");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Print(java.lang.String printerName) {
    try {
      javonetHandle.invoke("Print", printerName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Print(java.lang.String printerName1, java.lang.String printerName2) {
    try {
      javonetHandle.invoke("Print", printerName1, printerName2);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Print(
      java.lang.String printerName1,
      java.lang.String printerName2,
      java.lang.Integer startPageIndex,
      java.lang.Integer endPageIndex) {
    try {
      javonetHandle.invoke("Print", printerName1, printerName2, startPageIndex, endPageIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Print(
      java.lang.String printerName1,
      java.lang.String printerName2,
      java.lang.Integer startPageIndex,
      java.lang.Integer endPageIndex,
      java.lang.Integer copies) {
    try {
      javonetHandle.invoke(
          "Print", printerName1, printerName2, startPageIndex, endPageIndex, copies);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Print(
      java.lang.String printerName1,
      java.lang.String printerName2,
      java.lang.Integer startPageIndex,
      java.lang.Integer endPageIndex,
      java.lang.Integer copies,
      LlStgsysPrintFlag flags,
      java.lang.String title,
      java.lang.Integer windowHandle) {
    try {
      javonetHandle.invoke(
          "Print",
          printerName1,
          printerName2,
          startPageIndex,
          endPageIndex,
          copies,
          NEnum.fromJavaEnum(flags),
          title,
          windowHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object get_SyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
