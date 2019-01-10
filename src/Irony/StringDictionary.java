package Irony;

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
import jio.System.Collections.Generic.*;
import Irony.*;
import jio.System.Collections.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;

public class StringDictionary extends Dictionary<java.lang.String, java.lang.String>
    implements jio.System.Collections.Generic.IDictionary<java.lang.String, java.lang.String>,
        jio.System.Collections.Generic.ICollection<
            KeyValuePair<java.lang.String, java.lang.String>>,
        jio.System.Collections.Generic.IEnumerable<
            KeyValuePair<java.lang.String, java.lang.String>>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection,
        IReadOnlyDictionary<java.lang.String, java.lang.String>,
        IReadOnlyCollection<KeyValuePair<java.lang.String, java.lang.String>>,
        ISerializable,
        IDeserializationCallback {
  protected NObject javonetHandle;

  public StringDictionary() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Irony.StringDictionary");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StringDictionary(NObject handle) {
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
