package Irony.Parsing.Construction;

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
import Irony.Parsing.Construction.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class TransitionList extends List<Transition>
    implements jio.System.Collections.Generic.IList<Transition>,
        jio.System.Collections.Generic.ICollection<Transition>,
        jio.System.Collections.Generic.IEnumerable<Transition>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<Transition>,
        IReadOnlyCollection<Transition> {
  protected NObject javonetHandle;

  public TransitionList() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.Parsing.Construction.TransitionList");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TransitionList(NObject handle) {
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
