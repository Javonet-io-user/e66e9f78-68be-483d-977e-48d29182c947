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

public class PropertyChartEngineShapeFile extends PropertyChartEngineBase {
  protected NObject javonetHandle;
  /** GetProperty */
  public PropertyShapeDefinition getShapeDefinition() {
    try {
      Object res = javonetHandle.<NObject>get("ShapeDefinition");
      if (res == null) return null;
      return new PropertyShapeDefinition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public PropertyShapeXAxis getXAxis() {
    try {
      Object res = javonetHandle.<NObject>get("XAxis");
      if (res == null) return null;
      return new PropertyShapeXAxis((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public CollectionPropertyShapeAxis getYAxes() {
    try {
      Object res = javonetHandle.<NObject>get("YAxes");
      if (res == null) return null;
      return new CollectionPropertyShapeAxis((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public PropertyChartEngineShapeFile(PropertyChartEngineBase item) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.Dom.PropertyChartEngineShapeFile", item);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PropertyChartEngineShapeFile(NObject handle) {
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
