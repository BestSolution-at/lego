package at.bestsolution.lego.generator;

import at.bestsolution.lego.generator.Util;
import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.AssemblyItem;
import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.Door;
import at.bestsolution.lego.lego.DoorBrick;
import at.bestsolution.lego.lego.Item;
import at.bestsolution.lego.lego.ItemRepository;
import at.bestsolution.lego.lego.LegoElement;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.lego.RoundBrick;
import at.bestsolution.lego.lego.XUnit;
import at.bestsolution.lego.lego.YUnit;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
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
    _builder.append("<rect id=\"");
    String _name = brick.getName();
    _builder.append(_name, "");
    _builder.append("\" width=\"");
    XUnit _xUnits = brick.getXUnits();
    int _pixel = this.util.toPixel(_xUnits);
    _builder.append(_pixel, "");
    _builder.append("\" height=\"");
    YUnit _yUnits = brick.getYUnits();
    int _pixel_1 = this.util.toPixel(_yUnits);
    _builder.append(_pixel_1, "");
    _builder.append("\" fill=\"");
    Color _fill = brick.getFill();
    String _hex = this.util.toHex(_fill);
    _builder.append(_hex, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementEnd(final Brick brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementStart(final RoundBrick brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<path id=\"");
    String _name = brick.getName();
    _builder.append(_name, "");
    _builder.append("\" fill=\"");
    Color _fill = brick.getFill();
    String _hex = this.util.toHex(_fill);
    _builder.append(_hex, "");
    _builder.append("\" stroke-width=\"0\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("d=\"M 0 0 L ");
    XUnit _xUnits = brick.getXUnits();
    int _pixel = this.util.toPixel(_xUnits);
    _builder.append(_pixel, "\t");
    _builder.append(" 0 L ");
    XUnit _xUnits_1 = brick.getXUnits();
    int _pixel_1 = this.util.toPixel(_xUnits_1);
    int _xPixel = this.util.toXPixel(1);
    int _plus = (_pixel_1 + _xPixel);
    _builder.append(_plus, "\t");
    _builder.append(" ");
    YUnit _yUnits = brick.getYUnits();
    int _pixel_2 = this.util.toPixel(_yUnits);
    _builder.append(_pixel_2, "\t");
    _builder.append(" L 0 ");
    YUnit _yUnits_1 = brick.getYUnits();
    int _pixel_3 = this.util.toPixel(_yUnits_1);
    _builder.append(_pixel_3, "\t");
    _builder.append(" z\"");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementEnd(final RoundBrick brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementStart(final DoorBrick brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<g id=\"");
    String _name = brick.getName();
    _builder.append(_name, "");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handleLegoElementEnd(final DoorBrick brick) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<rect y=\"0\" width=\"");
    XUnit _xUnits = brick.getXUnits();
    int _pixel = this.util.toPixel(_xUnits);
    _builder.append(_pixel, "\t");
    _builder.append("\" height=\"5\" fill=\"");
    Color _fill = brick.getFill();
    String _hex = this.util.toHex(_fill);
    _builder.append(_hex, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<rect y=\"");
    YUnit _yUnits = brick.getYUnits();
    int _pixel_1 = this.util.toPixel(_yUnits);
    int _minus = (_pixel_1 - 5);
    _builder.append(_minus, "\t");
    _builder.append("\" width=\"");
    XUnit _xUnits_1 = brick.getXUnits();
    int _pixel_2 = this.util.toPixel(_xUnits_1);
    _builder.append(_pixel_2, "\t");
    _builder.append("\" height=\"5\" fill=\"");
    Color _fill_1 = brick.getFill();
    String _hex_1 = this.util.toHex(_fill_1);
    _builder.append(_hex_1, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<rect x=\"0\" height=\"");
    YUnit _yUnits_1 = brick.getYUnits();
    int _pixel_3 = this.util.toPixel(_yUnits_1);
    _builder.append(_pixel_3, "\t");
    _builder.append("\" width=\"5\" fill=\"");
    Color _fill_2 = brick.getFill();
    String _hex_2 = this.util.toHex(_fill_2);
    _builder.append(_hex_2, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<rect x=\"");
    XUnit _xUnits_2 = brick.getXUnits();
    int _pixel_4 = this.util.toPixel(_xUnits_2);
    int _minus_1 = (_pixel_4 - 5);
    _builder.append(_minus_1, "\t");
    _builder.append("\" height=\"");
    YUnit _yUnits_2 = brick.getYUnits();
    int _pixel_5 = this.util.toPixel(_yUnits_2);
    _builder.append(_pixel_5, "\t");
    _builder.append("\" width=\"5\" fill=\"");
    Color _fill_3 = brick.getFill();
    String _hex_3 = this.util.toHex(_fill_3);
    _builder.append(_hex_3, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("</g>");
    _builder.newLine();
    return _builder;
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
    } else if (brick instanceof DoorBrick) {
      return _handleLegoElementStart((DoorBrick)brick);
    } else if (brick instanceof RoundBrick) {
      return _handleLegoElementStart((RoundBrick)brick);
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
    } else if (brick instanceof DoorBrick) {
      return _handleLegoElementEnd((DoorBrick)brick);
    } else if (brick instanceof RoundBrick) {
      return _handleLegoElementEnd((RoundBrick)brick);
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
