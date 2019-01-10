package jio.System.Drawing.Imaging;

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
import jio.System.Drawing.*;
import jio.System.Drawing.Imaging.*;
import jio.System.*;
import jio.System.IO.*;
import jio.System.Runtime.Serialization.*;

public class Metafile extends Image implements ISerializable, ICloneable, IDisposable {
  protected NObject javonetHandle;

  public Metafile(java.lang.Integer hmetafile, WmfPlaceableFileHeader wmfHeader) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", hmetafile, wmfHeader);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.Integer hmetafile, WmfPlaceableFileHeader wmfHeader, java.lang.Boolean deleteWmf) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Drawing.Imaging.Metafile", hmetafile, wmfHeader, deleteWmf);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.Integer henhmetafile, java.lang.Boolean deleteEmf) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", henhmetafile, deleteEmf);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.String filename) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", filename);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(Stream stream) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", stream);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.Integer referenceHdc, EmfType emfType) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Drawing.Imaging.Metafile", referenceHdc, NEnum.fromJavaEnum(emfType));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.Integer referenceHdc, EmfType emfType, java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              referenceHdc,
              NEnum.fromJavaEnum(emfType),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.Integer referenceHdc, RectangleF frameRect) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", referenceHdc, frameRect);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.Integer referenceHdc, RectangleF frameRect, MetafileFrameUnit frameUnit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.Integer referenceHdc, Rectangle frameRect) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", referenceHdc, frameRect);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.Integer referenceHdc, Rectangle frameRect, MetafileFrameUnit frameUnit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type,
      java.lang.String desc) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type),
              desc);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.String fileName, java.lang.Integer referenceHdc) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", fileName, referenceHdc);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.String fileName, java.lang.Integer referenceHdc, EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile", fileName, referenceHdc, NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      EmfType type,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              NEnum.fromJavaEnum(type),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.String fileName, java.lang.Integer referenceHdc, RectangleF frameRect) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Drawing.Imaging.Metafile", fileName, referenceHdc, frameRect);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit,
      java.lang.String desc) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              desc);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(java.lang.String fileName, java.lang.Integer referenceHdc, Rectangle frameRect) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Drawing.Imaging.Metafile", fileName, referenceHdc, frameRect);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      java.lang.String fileName,
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              fileName,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(Stream stream, java.lang.Integer referenceHdc) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Drawing.Imaging.Metafile", stream, referenceHdc);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(Stream stream, java.lang.Integer referenceHdc, EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile", stream, referenceHdc, NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      Stream stream, java.lang.Integer referenceHdc, EmfType type, java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              stream,
              referenceHdc,
              NEnum.fromJavaEnum(type),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(Stream stream, java.lang.Integer referenceHdc, RectangleF frameRect) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Drawing.Imaging.Metafile", stream, referenceHdc, frameRect);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      Stream stream,
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              stream,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      Stream stream,
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              stream,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      Stream stream,
      java.lang.Integer referenceHdc,
      RectangleF frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              stream,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(Stream stream, java.lang.Integer referenceHdc, Rectangle frameRect) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Drawing.Imaging.Metafile", stream, referenceHdc, frameRect);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      Stream stream,
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              stream,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      Stream stream,
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              stream,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(
      Stream stream,
      java.lang.Integer referenceHdc,
      Rectangle frameRect,
      MetafileFrameUnit frameUnit,
      EmfType type,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Drawing.Imaging.Metafile",
              stream,
              referenceHdc,
              frameRect,
              NEnum.fromJavaEnum(frameUnit),
              NEnum.fromJavaEnum(type),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Metafile(NObject handle) {
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
