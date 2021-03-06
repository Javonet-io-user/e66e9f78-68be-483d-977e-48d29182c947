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
import combit.ListLabel24.*;
import jio.System.*;

public class ProjectList extends ProjectBase implements IDisposable {
  protected NObject javonetHandle;

  public ProjectList(ListLabel parentComponent) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.ProjectList", parentComponent);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ProjectList(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Open(
      java.lang.String projectFile,
      LlDomFileMode fileMode,
      LlDomAccessMode accessMode,
      LlDomSettings settings) {
    try {
      javonetHandle.invoke(
          "Open",
          projectFile,
          NEnum.fromJavaEnum(fileMode),
          NEnum.fromJavaEnum(accessMode),
          NEnum.fromJavaEnum(settings));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
