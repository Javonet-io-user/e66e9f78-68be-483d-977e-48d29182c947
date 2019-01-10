package jio.System.Data;

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
import jio.System.ComponentModel.*;
import jio.System.Data.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Xml.Serialization.*;
import jio.System.Collections.*;
import jio.System.Xml.Schema.*;
import jio.System.Xml.*;

public class DataTable extends MarshalByValueComponent
    implements IComponent,
        IDisposable,
        IServiceProvider,
        IListSource,
        ISupportInitializeNotification,
        ISupportInitialize,
        ISerializable,
        IXmlSerializable {
  protected NObject javonetHandle;

  public DataTable() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.DataTable");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataTable(java.lang.String tableName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.DataTable", tableName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataTable(java.lang.String tableName, java.lang.String tableNamespace) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.DataTable", tableName, tableNamespace);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataTable(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean get_ContainsListCollection() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IListSource")
              .invoke("get_ContainsListCollection");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public IList GetList() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.ComponentModel.IListSource")
              .invoke("GetList");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public XmlSchema GetSchema() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
              .invoke("GetSchema");
      if (res == null) return null;
      return new XmlSchema((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void ReadXml(XmlReader reader) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
          .invoke("ReadXml", reader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void WriteXml(XmlWriter writer) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
          .invoke("WriteXml", writer);
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
