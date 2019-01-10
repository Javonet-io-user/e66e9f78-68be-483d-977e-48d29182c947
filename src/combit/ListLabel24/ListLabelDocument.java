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
import jio.System.Drawing.Printing.*;
import combit.ListLabel24.*;
import jio.System.ComponentModel.*;
import jio.System.*;

public class ListLabelDocument extends PrintDocument implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setPreviewFilename(java.lang.String value) {
    try {
      javonetHandle.set("PreviewFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPreviewFilename() {
    try {
      java.lang.String res = javonetHandle.get("PreviewFilename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPreviewFile(PreviewFile value) {
    try {
      javonetHandle.set("PreviewFile", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public PreviewFile getPreviewFile() {
    try {
      Object res = javonetHandle.<NObject>get("PreviewFile");
      if (res == null) return null;
      return new PreviewFile((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ListLabelDocument() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelDocument");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelDocument(java.lang.String previewFilename) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelDocument", previewFilename);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelDocument(PreviewFile previewFile) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.ListLabelDocument", previewFile);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListLabelDocument(NObject handle) {
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
