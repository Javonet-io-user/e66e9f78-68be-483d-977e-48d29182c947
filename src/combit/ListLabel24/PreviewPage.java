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
import jio.System.Drawing.Imaging.*;
import jio.System.Drawing.*;
import jio.System.Drawing.Printing.*;

public class PreviewPage {
  protected NObject javonetHandle;
  /** GetProperty */
  public PreviewFile getFile() {
    try {
      Object res = javonetHandle.<NObject>get("File");
      if (res == null) return null;
      return new PreviewFile((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getPageIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("PageIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getPageNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("PageNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCopies() {
    try {
      java.lang.Integer res = javonetHandle.get("Copies");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public LlOrientation getOrientation() {
    try {
      Object res = javonetHandle.<NEnum>get("Orientation");
      if (res == null) return null;
      return LlOrientation.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getPrintPhysicalPage() {
    try {
      java.lang.Boolean res = javonetHandle.get("PrintPhysicalPage");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public Point getPrintablePageOffset() {
    try {
      Object res = javonetHandle.<NObject>get("PrintablePageOffset");
      if (res == null) return null;
      return new Point((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Size getPrintablePageSize() {
    try {
      Object res = javonetHandle.<NObject>get("PrintablePageSize");
      if (res == null) return null;
      return new Size((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Size getPhysicalPageSize() {
    try {
      Object res = javonetHandle.<NObject>get("PhysicalPageSize");
      if (res == null) return null;
      return new Size((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Size getPrinterResolution() {
    try {
      Object res = javonetHandle.<NObject>get("PrinterResolution");
      if (res == null) return null;
      return new Size((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getPrinterIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("PrinterIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getProjectName() {
    try {
      java.lang.String res = javonetHandle.get("ProjectName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setJobName(java.lang.String value) {
    try {
      javonetHandle.set("JobName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getJobName() {
    try {
      java.lang.String res = javonetHandle.get("JobName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getPrinterName() {
    try {
      java.lang.String res = javonetHandle.get("PrinterName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getPrinterDevice() {
    try {
      java.lang.String res = javonetHandle.get("PrinterDevice");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getPrinterPort() {
    try {
      java.lang.String res = javonetHandle.get("PrinterPort");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setUserValue(java.lang.String value) {
    try {
      javonetHandle.set("UserValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUserValue() {
    try {
      java.lang.String res = javonetHandle.get("UserValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public LlPreviewPageCreation getCreation() {
    try {
      Object res = javonetHandle.<NObject>get("Creation");
      if (res == null) return null;
      return new LlPreviewPageCreation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PageSettings getPageSettings() {
    try {
      Object res = javonetHandle.<NObject>get("PageSettings");
      if (res == null) return null;
      return new PageSettings((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PreviewPage(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Metafile GetMetafile() {
    try {
      Object res = javonetHandle.invoke("GetMetafile");
      if (res == null) return null;
      return new Metafile((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Bitmap GetBitmap() {
    try {
      Object res = javonetHandle.invoke("GetBitmap");
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Bitmap GetBitmap(java.lang.Integer maxSize) {
    try {
      Object res = javonetHandle.invoke("GetBitmap", maxSize);
      if (res == null) return null;
      return new Bitmap((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Draw(Graphics g) {
    try {
      javonetHandle.invoke("Draw", g);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Draw(Graphics g, Rectangle rectangle) {
    try {
      javonetHandle.invoke("Draw", g, rectangle);
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
