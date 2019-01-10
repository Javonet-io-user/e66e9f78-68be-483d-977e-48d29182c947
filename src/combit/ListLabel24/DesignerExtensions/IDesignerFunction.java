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

public interface IDesignerFunction {
  public java.lang.Integer SetLLJob(java.lang.Integer hLLJob, java.lang.Integer pLLBase);

  public java.lang.Integer SetOption(java.lang.Integer nOption, java.lang.Integer nValue);

  public java.lang.Integer GetOption(
      java.lang.Integer nOption, AtomicReference<java.lang.Integer> pnValue);

  public java.lang.Integer GetName(AtomicReference<java.lang.String> pbsName);

  public java.lang.Integer GetDescr(AtomicReference<java.lang.String> pbsDescr);

  public java.lang.Integer GetGroups(AtomicReference<java.lang.String> pbsGroups);

  public java.lang.Integer GetGroupDescr(
      java.lang.String bsGroup, AtomicReference<java.lang.String> pbsDescr);

  public java.lang.Integer GetParaCount(
      AtomicReference<java.lang.Integer> pnMinParas, AtomicReference<java.lang.Integer> pnMaxParas);

  public java.lang.Integer GetParaTypes(
      AtomicReference<java.lang.Integer> pnTypeRes,
      AtomicReference<java.lang.Integer> pnTypeArg1,
      AtomicReference<java.lang.Integer> pnTypeArg2,
      AtomicReference<java.lang.Integer> pnTypeArg3,
      AtomicReference<java.lang.Integer> pnTypeArg4);

  public java.lang.Integer CheckSyntax(
      AtomicReference<java.lang.String> pbsError,
      AtomicReference<java.lang.Integer> pnTypeRes,
      AtomicReference<java.lang.Integer> pnTypeResLL,
      AtomicReference<java.lang.Integer> pnDecs,
      java.lang.Integer nArgs,
      Object VarArg1,
      Object VarArg2,
      Object VarArg3,
      Object VarArg4);

  public java.lang.Integer Execute(
      Object pVarRes,
      AtomicReference<java.lang.Integer> pnTypeRes,
      AtomicReference<java.lang.Integer> pnTypeResLL,
      AtomicReference<java.lang.Integer> pnDecs,
      java.lang.Integer nArgs,
      Object VarArg1,
      Object VarArg2,
      Object VarArg3,
      Object VarArg4);

  public java.lang.Integer GetVisibleFlag(AtomicReference<java.lang.Boolean> pbVisible);

  public java.lang.Integer GetParaValueHint(
      java.lang.Integer nPara,
      AtomicReference<java.lang.String> pbsHint,
      AtomicReference<java.lang.String> pbsTabbedList);
}
