/**
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GPL v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * 
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 */
package at.bestsolution.lego.generator;

import at.bestsolution.lego.generator.Util;
import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.AssemblyItem;
import at.bestsolution.lego.lego.Brick;
import at.bestsolution.lego.lego.Color;
import at.bestsolution.lego.lego.FxmlInclude;
import at.bestsolution.lego.lego.ItemRepository;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.lego.RasterAssemblyItem;
import at.bestsolution.lego.lego.RasterItem;
import at.bestsolution.lego.lego.RepostoryItem;
import at.bestsolution.lego.lego.Source;
import at.bestsolution.lego.lego.XUnit;
import at.bestsolution.lego.lego.YUnit;
import at.bestsolution.lego.lego.ZUnit;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.FileReader;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Lego3dFXML implements IGenerator {
  @Inject
  @Extension
  private Util util;
  
  private final boolean showAxis = false;
  
  private final boolean showOrigin = true;
  
  private final int P = 16;
  
  private final double off = 0.2;
  
  private final double r = 4.8;
  
  private final double rh = 3.4;
  
  private final double H = 9.6;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model m = ((Model) _head);
    Assembly _assembly = m.getAssembly();
    boolean _notEquals = (!Objects.equal(_assembly, null));
    if (_notEquals) {
      Assembly _assembly_1 = m.getAssembly();
      String _name = _assembly_1.getName();
      String _plus = ("3d/" + _name);
      String _plus_1 = (_plus + ".fxml");
      Assembly _assembly_2 = m.getAssembly();
      CharSequence _generateFXML = this.generateFXML(_assembly_2);
      fsa.generateFile(_plus_1, _generateFXML);
    } else {
      ItemRepository _repo = m.getRepo();
      EList<RepostoryItem> _elementList = _repo.getElementList();
      final Consumer<RepostoryItem> _function = new Consumer<RepostoryItem>() {
        public void accept(final RepostoryItem it) {
          String _name = it.getName();
          String _plus = ("3d/" + _name);
          String _plus_1 = (_plus + ".fxml");
          CharSequence _generateFXML = Lego3dFXML.this.generateFXML(it);
          fsa.generateFile(_plus_1, _generateFXML);
        }
      };
      _elementList.forEach(_function);
    }
  }
  
  public int rowIndex(final int idx) {
    return (idx / 4);
  }
  
  public int colIndex(final int idx) {
    return (idx % 4);
  }
  
  public CharSequence toColor(final RepostoryItem item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rgb(");
    Color _fill = item.getFill();
    int _r = _fill.getR();
    _builder.append(_r, "");
    _builder.append(", ");
    Color _fill_1 = item.getFill();
    int _g = _fill_1.getG();
    _builder.append(_g, "");
    _builder.append(", ");
    Color _fill_2 = item.getFill();
    int _b = _fill_2.getB();
    _builder.append(_b, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public double width(final Brick brick) {
    XUnit _xUnits = brick.getXUnits();
    int _units = _xUnits.getUnits();
    int _multiply = (_units * this.P);
    return (_multiply - (2 * this.off));
  }
  
  public double height(final Brick brick) {
    YUnit _yUnits = brick.getYUnits();
    int _units = _yUnits.getUnits();
    return (_units * this.H);
  }
  
  public double depth(final Brick brick) {
    ZUnit _zUnits = brick.getZUnits();
    int _units = _zUnits.getUnits();
    int _multiply = (_units * this.P);
    return (_multiply - (2 * this.off));
  }
  
  public CharSequence generatedAssembly(final Assembly a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group>");
    _builder.newLine();
    {
      EList<AssemblyItem> _items = a.getItems();
      for(final AssemblyItem x : _items) {
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        {
          RasterItem _element = x.getElement();
          if ((_element instanceof Brick)) {
            _builder.append("\t");
            _builder.append("\t");
            RasterItem _element_1 = x.getElement();
            CharSequence _createBrick = this.createBrick(((Brick) _element_1));
            _builder.append(_createBrick, "\t\t");
            _builder.newLineIfNotEmpty();
          } else {
            RasterItem _element_2 = x.getElement();
            if ((_element_2 instanceof Assembly)) {
              _builder.append("\t");
              _builder.append("\t");
              RasterItem _element_3 = x.getElement();
              Object _generatedAssembly = this.generatedAssembly(((Assembly) _element_3));
              _builder.append(_generatedAssembly, "\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        {
          if ((x instanceof RasterAssemblyItem)) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<Translate x=\"");
            XUnit _xUnits = ((RasterAssemblyItem)x).getXUnits();
            int _units = _xUnits.getUnits();
            int _multiply = (_units * this.P);
            _builder.append(_multiply, "\t\t\t");
            _builder.append("\" y=\"");
            YUnit _yUnits = ((RasterAssemblyItem)x).getYUnits();
            int _units_1 = _yUnits.getUnits();
            double _multiply_1 = (_units_1 * this.H);
            _builder.append(_multiply_1, "\t\t\t");
            _builder.append("\" z=\"");
            ZUnit _zUnits = ((RasterAssemblyItem)x).getZUnits();
            int _units_2 = _zUnits.getUnits();
            int _multiply_2 = (_units_2 * this.P);
            _builder.append(_multiply_2, "\t\t\t");
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
            {
              String _transform = ((RasterAssemblyItem)x).getTransform();
              boolean _equals = Objects.equal(_transform, "rotate180");
              if (_equals) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<Rotate angle=\"180\" >");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append(" ");
                _builder.append("<axis><Point3D x=\"0\" y=\"1\" z=\"0\"/></axis>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("</Rotate>");
                _builder.newLine();
              } else {
                String _transform_1 = ((RasterAssemblyItem)x).getTransform();
                boolean _equals_1 = Objects.equal(_transform_1, "rotate90");
                if (_equals_1) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<Rotate angle=\"90\" >");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append(" ");
                  _builder.append("<axis><Point3D x=\"0\" y=\"1\" z=\"0\"/></axis>");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("</Rotate>");
                  _builder.newLine();
                } else {
                  String _transform_2 = ((RasterAssemblyItem)x).getTransform();
                  boolean _equals_2 = Objects.equal(_transform_2, "rotate270");
                  if (_equals_2) {
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("<Rotate angle=\"270\" >");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append(" ");
                    _builder.append("<axis><Point3D x=\"0\" y=\"1\" z=\"0\"/></axis>");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("</Rotate>");
                    _builder.newLine();
                  }
                }
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateAssemblyPreview(final Assembly a) {
    StringConcatenation _builder = new StringConcatenation();
    int scale = 2;
    _builder.newLineIfNotEmpty();
    _builder.append("<BorderPane>");
    _builder.newLine();
    _builder.append("<center>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<SubScene width=\"400\" height=\"400\" depthBuffer=\"true\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<antiAliasing>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<SceneAntialiasing fx:constant=\"BALANCED\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</antiAliasing>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<camera>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<ParallelCamera>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("<Rotate angle=\"45\" >");
    _builder.newLine();
    _builder.append("\t\t\t\t\t ");
    _builder.append("<axis><Point3D x=\"0\" y=\"1\" z=\"0\"/></axis>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</Rotate>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<Rotate angle=\"-45\" >");
    _builder.newLine();
    _builder.append("\t\t\t\t\t ");
    _builder.append("<axis><Point3D x=\"1\" y=\"0\" z=\"0\"/></axis>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</Rotate>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<Rotate angle=\"0\" >");
    _builder.newLine();
    _builder.append("\t\t\t\t\t ");
    _builder.append("<axis><Point3D x=\"0\" y=\"0\" z=\"1\"/></axis>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</Rotate>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
    _builder.append("<Translate x=\"-200\" y=\"-200\" z=\"00\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</ParallelCamera>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</camera>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<root>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<Scale x=\"");
    _builder.append(scale, "\t\t\t\t\t");
    _builder.append("\" y=\"");
    _builder.append(scale, "\t\t\t\t\t");
    _builder.append("\" z=\"");
    _builder.append(scale, "\t\t\t\t\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    CharSequence _generatedAssembly = this.generatedAssembly(a);
    _builder.append(_generatedAssembly, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</root>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</SubScene>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</center>");
    _builder.newLine();
    _builder.append("</BorderPane>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generatePreview(final Model m) {
    Assembly _assembly = m.getAssembly();
    boolean _notEquals = (!Objects.equal(_assembly, null));
    if (_notEquals) {
      Assembly _assembly_1 = m.getAssembly();
      return this.generateAssemblyPreview(_assembly_1);
    } else {
      ItemRepository _repo = m.getRepo();
      return this.generateRepo(_repo);
    }
  }
  
  public CharSequence generateRepo(final ItemRepository m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<BorderPane>");
    _builder.newLine();
    _builder.append("<center>");
    _builder.newLine();
    _builder.append("<GridPane vgap=\"10\" hgap=\"10\" >");
    _builder.newLine();
    int scale = 2;
    _builder.newLineIfNotEmpty();
    int index = 0;
    _builder.newLineIfNotEmpty();
    {
      EList<RepostoryItem> _elementList = m.getElementList();
      for(final RepostoryItem item : _elementList) {
        {
          if ((item instanceof Brick)) {
            final Brick brick = ((Brick) item);
            _builder.newLineIfNotEmpty();
            _builder.append("<children>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("<SubScene width=\"200\" height=\"200\" GridPane.columnIndex=\"");
            int _colIndex = this.colIndex(index);
            _builder.append(_colIndex, "\t");
            _builder.append("\" GridPane.rowIndex=\"");
            int _plusPlus = index++;
            int _rowIndex = this.rowIndex(_plusPlus);
            _builder.append(_rowIndex, "\t");
            _builder.append("\" depthBuffer=\"true\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("<antiAliasing>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<SceneAntialiasing fx:constant=\"BALANCED\" />");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("</antiAliasing>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<camera>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<ParallelCamera>");
            _builder.newLine();
            _builder.append("\t\t\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
            _builder.append("<Translate x=\"");
            double _width = this.width(brick);
            double _divide = (_width / 2.0);
            double _multiply = (_divide * scale);
            _builder.append(_multiply, "\t\t\t\t\t\t\t\t\t\t\t\t");
            _builder.append("\" y=\"");
            double _height = this.height(brick);
            double _minus = (-_height);
            double _divide_1 = (_minus / 2.0);
            double _multiply_1 = (_divide_1 * scale);
            _builder.append(_multiply_1, "\t\t\t\t\t\t\t\t\t\t\t\t");
            _builder.append("\" z=\"");
            double _depth = this.depth(brick);
            double _divide_2 = (_depth / 2.0);
            double _multiply_2 = (_divide_2 * scale);
            _builder.append(_multiply_2, "\t\t\t\t\t\t\t\t\t\t\t\t");
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
            _builder.append("<Rotate angle=\"45\" >");
            _builder.newLine();
            _builder.append("\t\t\t\t\t ");
            _builder.append("<axis><Point3D x=\"0\" y=\"1\" z=\"0\"/></axis>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("</Rotate>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("<Rotate angle=\"-45\" >");
            _builder.newLine();
            _builder.append("\t\t\t\t\t ");
            _builder.append("<axis><Point3D x=\"1\" y=\"0\" z=\"0\"/></axis>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("</Rotate>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("<Rotate angle=\"0\" >");
            _builder.newLine();
            _builder.append("\t\t\t\t\t ");
            _builder.append("<axis><Point3D x=\"0\" y=\"0\" z=\"1\"/></axis>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("</Rotate>");
            _builder.newLine();
            _builder.append("\t\t\t\t");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t");
            _builder.append("<Translate x=\"-100\" y=\"-100\" z=\"00\" />");
            _builder.newLine();
            _builder.append("\t\t\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("</ParallelCamera>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("</camera>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("<root>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("<Group>");
            _builder.newLine();
            _builder.append("\t\t\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("<Scale x=\"");
            _builder.append(scale, "\t\t\t\t\t");
            _builder.append("\" y=\"");
            _builder.append(scale, "\t\t\t\t\t");
            _builder.append("\" z=\"");
            _builder.append(scale, "\t\t\t\t\t");
            _builder.append("\" />");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
            {
              if (this.showAxis) {
                _builder.append("\t\t\t\t");
                CharSequence _createAxis = this.createAxis();
                _builder.append(_createAxis, "\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              if (this.showOrigin) {
                _builder.append("\t\t\t\t");
                CharSequence _createOrigin = this.createOrigin();
                _builder.append(_createOrigin, "\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t\t\t");
            CharSequence _createBrick = this.createBrick(((Brick) item));
            _builder.append(_createBrick, "\t\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("</Group>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("</root>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("</SubScene>");
            _builder.newLine();
            _builder.append("</children>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("</GridPane>");
    _builder.newLine();
    _builder.append("</center>");
    _builder.newLine();
    _builder.append("</BorderPane>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createAxis() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<Box width=\"100\" depth=\"1\" height=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<PhongMaterial diffuseColor=\"red\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<Translate x=\"50\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</Box>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<Box width=\"1\" depth=\"1\" height=\"100\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<PhongMaterial diffuseColor=\"lightgreen\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<Translate y=\"50\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</Box>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<Box width=\"1\" depth=\"100\" height=\"1\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<PhongMaterial diffuseColor=\"blue\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<Translate z=\"50\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</Box>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createOrigin() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<Box width=\"0.5\" depth=\"0.5\" height=\"150\">");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<PhongMaterial diffuseColor=\"lightgray\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</material>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("<transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t\t");
    _builder.append("<Translate y=\"-75\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("</transforms>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("</Box>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createBrick(final Brick brick) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      {
        Source _source = brick.getSource();
        if ((_source instanceof FxmlInclude)) {
          Source _source_1 = brick.getSource();
          final FxmlInclude fxml = ((FxmlInclude) _source_1);
          _builder.newLineIfNotEmpty();
          _builder.append("<Group id=\"");
          String _name = brick.getName();
          _builder.append(_name, "");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          String _source3d = fxml.getSource3d();
          FileReader _fileReader = new FileReader(_source3d);
          String _load = this.util.load(fxml, _fileReader);
          _builder.append(_load, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("<transforms>");
          _builder.newLine();
          _builder.append("\t\t\t\t\t");
          _builder.append("<Translate x=\"");
          float _originX = fxml.getOriginX();
          _builder.append(_originX, "\t\t\t\t\t");
          _builder.append("\" y=\"");
          float _originY = fxml.getOriginY();
          _builder.append(_originY, "\t\t\t\t\t");
          _builder.append("\" z=\"");
          float _originZ = fxml.getOriginZ();
          _builder.append(_originZ, "\t\t\t\t\t");
          _builder.append("\" />");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("</transforms>");
          _builder.newLine();
          _builder.append("</Group>");
          _builder.newLine();
        } else {
          _builder.append("<Group id=\"");
          String _name_1 = brick.getName();
          _builder.append(_name_1, "");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("<Box width=\"");
          double _width = this.width(brick);
          _builder.append(_width, "\t");
          _builder.append("\" depth=\"");
          double _depth = this.depth(brick);
          _builder.append(_depth, "\t");
          _builder.append("\" height=\"");
          double _height = this.height(brick);
          _builder.append(_height, "\t");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("<material>");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("<PhongMaterial diffuseColor=\"");
          CharSequence _color = this.toColor(brick);
          _builder.append(_color, "\t\t\t");
          _builder.append("\"/>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("</material>");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("<transforms>");
          _builder.newLine();
          _builder.append("\t\t\t\t\t\t\t");
          _builder.append("<Translate x=\"");
          double _width_1 = this.width(brick);
          double _divide = (_width_1 / 2.0);
          _builder.append(_divide, "\t\t\t\t\t\t\t");
          _builder.append("\" y=\"");
          double _height_1 = this.height(brick);
          double _minus = (-_height_1);
          double _divide_1 = (_minus / 2.0);
          _builder.append(_divide_1, "\t\t\t\t\t\t\t");
          _builder.append("\" z=\"");
          double _depth_1 = this.depth(brick);
          double _divide_2 = (_depth_1 / 2.0);
          _builder.append(_divide_2, "\t\t\t\t\t\t\t");
          _builder.append("\" />");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t\t");
          _builder.append("<Translate x=\"");
          _builder.append((-((this.P / 2.0) - this.off)), "\t\t\t\t\t\t\t");
          _builder.append("\" z=\"");
          _builder.append((-((this.P / 2.0) - this.off)), "\t\t\t\t\t\t\t");
          _builder.append("\" />");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("</transforms>");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("</Box>");
          _builder.newLine();
          {
            XUnit _xUnits = brick.getXUnits();
            int _units = _xUnits.getUnits();
            IntegerRange _upTo = new IntegerRange(1, _units);
            for(final Integer iX : _upTo) {
              {
                ZUnit _zUnits = brick.getZUnits();
                int _units_1 = _zUnits.getUnits();
                IntegerRange _upTo_1 = new IntegerRange(1, _units_1);
                for(final Integer iZ : _upTo_1) {
                  _builder.append("\t");
                  _builder.append("<Cylinder radius=\"");
                  _builder.append(this.r, "\t");
                  _builder.append("\" height=\"");
                  _builder.append(this.rh, "\t");
                  _builder.append("\">");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<material>");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("<PhongMaterial diffuseColor=\"");
                  CharSequence _color_1 = this.toColor(brick);
                  _builder.append(_color_1, "\t\t\t");
                  _builder.append("\"/>");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("</material>");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<transforms>");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("\t\t");
                  _builder.append("<Translate x=\"");
                  _builder.append((((this.P / 2.0) + (((iX).intValue() - 1) * this.P)) - this.off), "\t\t\t");
                  _builder.append("\" y=\"");
                  double _height_2 = this.height(brick);
                  double _minus_1 = (-_height_2);
                  double _minus_2 = (_minus_1 - (this.rh / 2));
                  _builder.append(_minus_2, "\t\t\t");
                  _builder.append("\" z=\"");
                  _builder.append((((this.P / 2.0) + (((iZ).intValue() - 1) * 16)) - this.off), "\t\t\t");
                  _builder.append("\" />");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t\t\t\t\t\t\t\t");
                  _builder.append("<Translate x=\"");
                  _builder.append((-((this.P / 2.0) - this.off)), "\t\t\t\t\t\t\t\t\t");
                  _builder.append("\" z=\"");
                  _builder.append((-((this.P / 2.0) - this.off)), "\t\t\t\t\t\t\t\t\t");
                  _builder.append("\" />");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("</transforms>");
                  _builder.newLine();
                  _builder.append("\t");
                  _builder.append("</Cylinder>");
                  _builder.newLine();
                }
              }
            }
          }
          _builder.append("</Group>");
          _builder.newLine();
        }
      }
      return _builder;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence generateFXML(final Assembly a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.shape.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.transform.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.geometry.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.paint.*?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<Group xmlns:fx=\"http://javafx.com/fxml/1\">");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generatedAssembly = this.generatedAssembly(a);
    _builder.append(_generatedAssembly, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateFXML(final RepostoryItem item) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.shape.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.transform.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.geometry.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.paint.*?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<Group xmlns:fx=\"http://javafx.com/fxml/1\">");
    _builder.newLine();
    {
      if ((item instanceof Brick)) {
        CharSequence _createBrick = this.createBrick(((Brick) item));
        _builder.append(_createBrick, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
}
