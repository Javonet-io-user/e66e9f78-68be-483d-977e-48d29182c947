package combit.ListLabel24.DesignerExtensions;

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
import combit.ListLabel24.DesignerExtensions.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;

public class DialogBasedDesignerProperty extends DesignerProperty
    implements IDesignerProperty, IDisposable {
  protected NObject javonetHandle;
  /** GetProperty */
  public Object getValueAsDialogBasedDesignerProperty() {
    try {
      Object res = javonetHandle.<NObject>get("Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFormulaAsDialogBasedDesignerProperty(Object value) {
    try {
      javonetHandle.set("Formula", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getFormulaAsDialogBasedDesignerProperty() {
    try {
      Object res = javonetHandle.<NObject>get("Formula");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public DialogBasedDesignerProperty(java.lang.String name, ISerializable defaultValue) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DesignerExtensions.DialogBasedDesignerProperty",
              name,
              defaultValue);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "ButtonClicked",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (EventHandler<EventArgs> handler : _ButtonClickedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class), Convert(objects[1], EventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DialogBasedDesignerProperty(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Event */

  private java.util.ArrayList<EventHandler<EventArgs>> _ButtonClickedListeners =
      new java.util.ArrayList<EventHandler<EventArgs>>();

  public void addButtonClicked(EventHandler<EventArgs> toAdd) {
    _ButtonClickedListeners.add(toAdd);
  }

  public void removeButtonClicked(EventHandler<EventArgs> toRemove) {
    _ButtonClickedListeners.remove(toRemove);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
