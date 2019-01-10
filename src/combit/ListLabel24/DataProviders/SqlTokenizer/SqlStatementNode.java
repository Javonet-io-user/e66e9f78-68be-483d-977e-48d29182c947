package combit.ListLabel24.DataProviders.SqlTokenizer;

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
import combit.ListLabel24.DataProviders.SqlTokenizer.*;
import Irony.Ast.*;
import Irony.Parsing.*;
import jio.System.*;

public class SqlStatementNode extends SqlNodeBase implements IAstNodeInit {
  protected NObject javonetHandle;
  /** GetProperty */
  public SelectNode getSelect() {
    try {
      Object res = javonetHandle.<NObject>get("Select");
      if (res == null) return null;
      return new SelectNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public FromNode getFrom() {
    try {
      Object res = javonetHandle.<NObject>get("From");
      if (res == null) return null;
      return new FromNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public JoinNode getJoin() {
    try {
      Object res = javonetHandle.<NObject>get("Join");
      if (res == null) return null;
      return new JoinNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public WhereNode getWhere() {
    try {
      Object res = javonetHandle.<NObject>get("Where");
      if (res == null) return null;
      return new WhereNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public GroupByNode getGroupBy() {
    try {
      Object res = javonetHandle.<NObject>get("GroupBy");
      if (res == null) return null;
      return new GroupByNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public HavingNode getHaving() {
    try {
      Object res = javonetHandle.<NObject>get("Having");
      if (res == null) return null;
      return new HavingNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public OrderByNode getOrderBy() {
    try {
      Object res = javonetHandle.<NObject>get("OrderBy");
      if (res == null) return null;
      return new OrderByNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public UnionNode getUnion() {
    try {
      Object res = javonetHandle.<NObject>get("Union");
      if (res == null) return null;
      return new UnionNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Nullable<java.lang.Integer> getTopOrLimit() {
    try {
      Object res = javonetHandle.<NObject>get("TopOrLimit");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SqlStatementNode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("combit.ListLabel24.DataProviders.SqlTokenizer.SqlStatementNode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SqlStatementNode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Init(AstContext context, ParseTreeNode treeNode) {
    try {
      javonetHandle.explicitInterface("Irony.Ast.IAstNodeInit").invoke("Init", context, treeNode);
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
