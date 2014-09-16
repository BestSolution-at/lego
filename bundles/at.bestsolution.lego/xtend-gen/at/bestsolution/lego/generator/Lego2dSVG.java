package at.bestsolution.lego.generator;

import at.bestsolution.lego.generator.Util;
import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.AssemblyItem;
import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.Door;
import at.bestsolution.lego.lego.FxmlInclude;
import at.bestsolution.lego.lego.Item;
import at.bestsolution.lego.lego.ItemRepository;
import at.bestsolution.lego.lego.LegoElement;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.lego.Source;
import at.bestsolution.lego.lego.XUnit;
import at.bestsolution.lego.lego.YUnit;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.FileReader;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Lego2dSVG implements IGenerator {
  @Inject
  @Extension
  private Util util;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model m = ((Model) _head);
    Assembly _assembly = m.getAssembly();
    boolean _notEquals = (!Objects.equal(_assembly, null));
    if (_notEquals) {
      Assembly _assembly_1 = m.getAssembly();
      String _name = _assembly_1.getName();
      String _plus = ("2d/" + _name);
      String _plus_1 = (_plus + ".svg");
      Assembly _assembly_2 = m.getAssembly();
      CharSequence _generateSVG = this.generateSVG(_assembly_2);
      fsa.generateFile(_plus_1, _generateSVG);
    } else {
      ItemRepository _repo = m.getRepo();
      EList<Item> _elementList = _repo.getElementList();
      final Consumer<Item> _function = new Consumer<Item>() {
        public void accept(final Item it) {
          String _name = it.getName();
          String _plus = ("2d/" + _name);
          String _plus_1 = (_plus + ".svg");
          CharSequence _generateSVG = Lego2dSVG.this.generateSVG(it);
          fsa.generateFile(_plus_1, _generateSVG);
        }
      };
      _elementList.forEach(_function);
    }
  }
  
  public CharSequence generateSVG(final Assembly assembly) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\"?>");
    _builder.newLine();
    _builder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">");
    _builder.newLine();
    CharSequence _handleLegoElementStart = this.handleLegoElementStart(assembly);
    _builder.append(_handleLegoElementStart, "");
    _builder.newLineIfNotEmpty();
    CharSequence _handleLegoElementEnd = this.handleLegoElementEnd(assembly);
    _builder.append(_handleLegoElementEnd, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</svg>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateSVG(final Item item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\"?>");
    _builder.newLine();
    _builder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">");
    _builder.newLine();
    CharSequence _handleLegoElementStart = this.handleLegoElementStart(item);
    _builder.append(_handleLegoElementStart, "");
    _builder.newLineIfNotEmpty();
    CharSequence _handleLegoElementEnd = this.handleLegoElementEnd(item);
    _builder.append(_handleLegoElementEnd, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</svg>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementStart(final LegoElement brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!--");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementEnd(final LegoElement brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-->");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementStart(final Brick brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<g id=\"");
    String _name = brick.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementEnd(final Brick brick) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(">");
      _builder.newLine();
      {
        Source _source = brick.getSource();
        if ((_source instanceof FxmlInclude)) {
          _builder.append("\t");
          Source _source_1 = brick.getSource();
          Source _source_2 = brick.getSource();
          String _source2d = ((FxmlInclude) _source_2).getSource2d();
          String _replace = _source2d.replace(".fxml", ".svg");
          FileReader _fileReader = new FileReader(_replace);
          String _load = this.util.load(((FxmlInclude) _source_1), _fileReader);
          _builder.append(_load, "\t");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          _builder.append("<rect width=\"");
          XUnit _xUnits = brick.getXUnits();
          int _pixel = this.util.toPixel(_xUnits);
          _builder.append(_pixel, "\t");
          _builder.append("\" height=\"");
          YUnit _yUnits = brick.getYUnits();
          int _pixel_1 = this.util.toPixel(_yUnits);
          _builder.append(_pixel_1, "\t");
          _builder.append("\" fill=\"");
          Color _fill = brick.getFill();
          String _hex = this.util.toHex(_fill);
          _builder.append(_hex, "\t");
          _builder.append("\" />");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("</g>");
      _builder.newLine();
      return _builder;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected CharSequence _handleLegoElementStart(final Door brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<g id=\"");
    String _name = brick.getName();
    _builder.append(_name, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementEnd(final Door brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<rect x=\"3\" y=\"3\" width=\"");
    XUnit _xUnits = brick.getXUnits();
    int _pixel = this.util.toPixel(_xUnits);
    int _minus = (_pixel - (2 * 3));
    _builder.append(_minus, "\t");
    _builder.append("\" height=\"");
    YUnit _yUnits = brick.getYUnits();
    int _pixel_1 = this.util.toPixel(_yUnits);
    int _minus_1 = (_pixel_1 - (2 * 3));
    _builder.append(_minus_1, "\t");
    _builder.append("\" fill=\"");
    Color _fill = brick.getFill();
    String _hex = this.util.toHex(_fill);
    _builder.append(_hex, "\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("</g>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementStart(final Assembly assembly) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<g id=\"");
    String _name = assembly.getName();
    _builder.append(_name, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementEnd(final Assembly assembly) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(">");
    _builder.newLine();
    {
      EList<AssemblyItem> _items = assembly.getItems();
      for(final AssemblyItem i : _items) {
        {
          String _transform = i.getTransform();
          boolean _notEquals = (!Objects.equal(_transform, null));
          if (_notEquals) {
            _builder.append("\t");
            _builder.append("<g transform=\"matrix(-1 0 0 1 ");
            LegoElement _element = i.getElement();
            int _width = this.util.width(_element);
            _builder.append(_width, "\t");
            _builder.append(" 0)\">");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        LegoElement _element_1 = i.getElement();
        CharSequence _handleLegoElementStart = this.handleLegoElementStart(_element_1);
        _builder.append(_handleLegoElementStart, "\t\t");
        _builder.append(" transform=\"translate(");
        XUnit _xUnits = i.getXUnits();
        int _pixel = this.util.toPixel(_xUnits);
        _builder.append(_pixel, "\t\t");
        _builder.append(", ");
        YUnit _yUnits = i.getYUnits();
        int _pixel_1 = this.util.toPixel(_yUnits);
        _builder.append(_pixel_1, "\t\t");
        _builder.append(")\"");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        LegoElement _element_2 = i.getElement();
        CharSequence _handleLegoElementEnd = this.handleLegoElementEnd(_element_2);
        _builder.append(_handleLegoElementEnd, "\t\t");
        _builder.newLineIfNotEmpty();
        {
          String _transform_1 = i.getTransform();
          boolean _notEquals_1 = (!Objects.equal(_transform_1, null));
          if (_notEquals_1) {
            _builder.append("\t");
            _builder.append("</g>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("</g>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleLegoElementStart(final LegoElement brick) {
    if (brick instanceof Brick) {
      return _handleLegoElementStart((Brick)brick);
    } else if (brick instanceof Door) {
      return _handleLegoElementStart((Door)brick);
    } else if (brick instanceof Assembly) {
      return _handleLegoElementStart((Assembly)brick);
    } else if (brick != null) {
      return _handleLegoElementStart(brick);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(brick).toString());
    }
  }
  
  public CharSequence handleLegoElementEnd(final LegoElement brick) {
    if (brick instanceof Brick) {
      return _handleLegoElementEnd((Brick)brick);
    } else if (brick instanceof Door) {
      return _handleLegoElementEnd((Door)brick);
    } else if (brick instanceof Assembly) {
      return _handleLegoElementEnd((Assembly)brick);
    } else if (brick != null) {
      return _handleLegoElementEnd(brick);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(brick).toString());
    }
  }
}
