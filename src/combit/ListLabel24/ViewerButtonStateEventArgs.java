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
import jio.System.*;
import combit.ListLabel24.*;
import jio.System.Windows.Forms.*;

public class ViewerButtonStateEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getId() {
    try {
      java.lang.Integer res = javonetHandle.get("Id");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public LlViewerAction getAction() {
    try {
      Object res = javonetHandle.<NEnum>get("Action");
      if (res == null) return null;
      return LlViewerAction.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setState(LlViewerButtonState value) {
    try {
      javonetHandle.set("State", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LlViewerButtonState getState() {
    try {
      Object res = javonetHandle.<NEnum>get("State");
      if (res == null) return null;
      return LlViewerButtonState.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IWin32Window getViewerWindow() {
    try {
      Object res = javonetHandle.<NObject>get("ViewerWindow");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ViewerButtonStateEventArgs(
      java.lang.Integer id, LlViewerButtonState state, IWin32Window viewerWindow) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.ViewerButtonStateEventArgs",
              id,
              NEnum.fromJavaEnum(state),
              viewerWindow);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ViewerButtonStateEventArgs(NObject handle) {
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
