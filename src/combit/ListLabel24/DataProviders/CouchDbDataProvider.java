package combit.ListLabel24.DataProviders;

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
import combit.ListLabel24.DataProviders.*;
import jio.System.Collections.ObjectModel.*;

public class CouchDbDataProvider implements IDataProvider {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setFlattenStructure(java.lang.Boolean value) {
    try {
      javonetHandle.set("FlattenStructure", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFlattenStructure() {
    try {
      java.lang.Boolean res = javonetHandle.get("FlattenStructure");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setConnectionTimeout(java.lang.Integer value) {
    try {
      javonetHandle.set("ConnectionTimeout", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getConnectionTimeout() {
    try {
      java.lang.Integer res = javonetHandle.get("ConnectionTimeout");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setUsername(java.lang.String value) {
    try {
      javonetHandle.set("Username", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUsername() {
    try {
      java.lang.String res = javonetHandle.get("Username");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPassword(java.lang.String value) {
    try {
      javonetHandle.set("Password", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPassword() {
    try {
      java.lang.String res = javonetHandle.get("Password");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDomain(java.lang.String value) {
    try {
      javonetHandle.set("Domain", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDomain() {
    try {
      java.lang.String res = javonetHandle.get("Domain");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setQueryParameters(java.lang.String value) {
    try {
      javonetHandle.set("QueryParameters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getQueryParameters() {
    try {
      java.lang.String res = javonetHandle.get("QueryParameters");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CouchDbDataProvider(
      java.lang.String serverUrl,
      java.lang.String databaseName,
      java.lang.String viewName,
      java.lang.String serverPort,
      java.lang.String username,
      java.lang.String password,
      java.lang.String domain) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CouchDbDataProvider",
              serverUrl,
              databaseName,
              viewName,
              serverPort,
              username,
              password,
              domain);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CouchDbDataProvider(
      java.lang.String serverUrl,
      java.lang.String databaseName,
      java.lang.String viewName,
      java.lang.String serverPort) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CouchDbDataProvider",
              serverUrl,
              databaseName,
              viewName,
              serverPort);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CouchDbDataProvider(
      java.lang.String serverUrl, java.lang.String databaseName, java.lang.String viewName) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.CouchDbDataProvider",
              serverUrl,
              databaseName,
              viewName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CouchDbDataProvider(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean get_SupportsAnyBaseTable() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_SupportsAnyBaseTable");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public ReadOnlyCollection<ITable> get_Tables() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Tables");
      if (res == null) return null;
      return new ReadOnlyCollection<ITable>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ReadOnlyCollection<ITableRelation> get_Relations() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("get_Relations");
      if (res == null) return null;
      return new ReadOnlyCollection<ITableRelation>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ITable GetTable(java.lang.String tableName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetTable", tableName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ITableRelation GetRelation(java.lang.String relationName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("combit.ListLabel24.DataProviders.IDataProvider")
              .invoke("GetRelation", relationName);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
