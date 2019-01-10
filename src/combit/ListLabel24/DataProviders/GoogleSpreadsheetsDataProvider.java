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

public class GoogleSpreadsheetsDataProvider implements IDataProvider {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getRefreshToken() {
    try {
      java.lang.String res = javonetHandle.get("RefreshToken");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getClientId() {
    try {
      java.lang.String res = javonetHandle.get("ClientId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getTableId() {
    try {
      java.lang.String res = javonetHandle.get("TableId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFirstRowContainsColumnNames() {
    try {
      java.lang.Boolean res = javonetHandle.get("FirstRowContainsColumnNames");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public ReadOnlyCollection<java.lang.String> getSheetNames() {
    try {
      Object res = javonetHandle.<NObject>get("SheetNames");
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public GoogleSpreadsheetsDataProvider(
      java.lang.String tableId, java.lang.Boolean firstRowAreColumnNames) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.GoogleSpreadsheetsDataProvider",
              tableId,
              firstRowAreColumnNames);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GoogleSpreadsheetsDataProvider(
      java.lang.String tableId,
      java.lang.Boolean firstRowAreColumnNames,
      ReadOnlyCollection<java.lang.String> sheetNames) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.GoogleSpreadsheetsDataProvider",
              tableId,
              firstRowAreColumnNames,
              sheetNames);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GoogleSpreadsheetsDataProvider(
      java.lang.String tableId,
      java.lang.Boolean firstRowAreColumnNames,
      java.lang.String refreshToken,
      java.lang.String clientId,
      java.lang.String clientSecret) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.GoogleSpreadsheetsDataProvider",
              tableId,
              firstRowAreColumnNames,
              refreshToken,
              clientId,
              clientSecret);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GoogleSpreadsheetsDataProvider(
      java.lang.String tableId,
      java.lang.Boolean firstRowAreColumnNames,
      ReadOnlyCollection<java.lang.String> sheetNames,
      java.lang.String refreshToken,
      java.lang.String clientId,
      java.lang.String clientSecret) {
    try {
      javonetHandle =
          Javonet.New(
              "combit.ListLabel24.DataProviders.GoogleSpreadsheetsDataProvider",
              tableId,
              firstRowAreColumnNames,
              sheetNames,
              refreshToken,
              clientId,
              clientSecret);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GoogleSpreadsheetsDataProvider(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Init() {
    try {
      javonetHandle.invoke("Init");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
