package at.bestsolution.lego.generator;

import at.bestsolution.lego.lego.Action;
import at.bestsolution.lego.lego.Assembly;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.lego.MountedAssemblyItem;
import at.bestsolution.lego.lego.MountedPart;
import at.bestsolution.lego.lego.RasterAssemblyItem;
import at.bestsolution.lego.lego.RasterItem;
import com.google.common.base.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Lego3dJavaScript implements IGenerator {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    EList<EObject> _contents = input.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Model m = ((Model) _head);
    Assembly _assembly = m.getAssembly();
    boolean _notEquals = (!Objects.equal(_assembly, null));
    if (_notEquals) {
      final LinkedHashSet<Action> actions = new LinkedHashSet<Action>();
      Assembly _assembly_1 = m.getAssembly();
      this.collectActions(_assembly_1, actions);
      boolean _isEmpty = actions.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final LinkedHashSet<MountedAssemblyItem> items = new LinkedHashSet<MountedAssemblyItem>();
        Assembly _assembly_2 = m.getAssembly();
        this.collectItems(_assembly_2, items);
        Assembly _assembly_3 = m.getAssembly();
        String _name = _assembly_3.getName();
        String _plus = ("3d/" + _name);
        String _plus_1 = (_plus + ".js");
        CharSequence _generateJS = this.generateJS(actions, items);
        fsa.generateFile(_plus_1, _generateJS);
      }
    }
  }
  
  public void collectActions(final Assembly a, final Set<Action> items) {
    TreeIterator<EObject> _eAllContents = a.eAllContents();
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject e) {
        return Boolean.valueOf((e instanceof MountedAssemblyItem));
      }
    };
    Iterator<EObject> _filter = IteratorExtensions.<EObject>filter(_eAllContents, _function);
    final Function1<EObject, MountedAssemblyItem> _function_1 = new Function1<EObject, MountedAssemblyItem>() {
      public MountedAssemblyItem apply(final EObject e) {
        return ((MountedAssemblyItem) e);
      }
    };
    Iterator<MountedAssemblyItem> _map = IteratorExtensions.<EObject, MountedAssemblyItem>map(_filter, _function_1);
    final Procedure1<MountedAssemblyItem> _function_2 = new Procedure1<MountedAssemblyItem>() {
      public void apply(final MountedAssemblyItem e) {
        EList<Action> _actions = e.getActions();
        items.addAll(_actions);
      }
    };
    IteratorExtensions.<MountedAssemblyItem>forEach(_map, _function_2);
    TreeIterator<EObject> _eAllContents_1 = a.eAllContents();
    final Function1<EObject, Boolean> _function_3 = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject e) {
        boolean _and = false;
        if (!(e instanceof RasterAssemblyItem)) {
          _and = false;
        } else {
          RasterItem _element = ((RasterAssemblyItem) e).getElement();
          _and = (_element instanceof Assembly);
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterator<EObject> _filter_1 = IteratorExtensions.<EObject>filter(_eAllContents_1, _function_3);
    final Procedure1<EObject> _function_4 = new Procedure1<EObject>() {
      public void apply(final EObject e) {
        RasterItem _element = ((RasterAssemblyItem) e).getElement();
        Lego3dJavaScript.this.collectActions(((Assembly) _element), items);
      }
    };
    IteratorExtensions.<EObject>forEach(_filter_1, _function_4);
  }
  
  public void collectItems(final Assembly a, final Set<MountedAssemblyItem> items) {
    TreeIterator<EObject> _eAllContents = a.eAllContents();
    final Function1<EObject, Boolean> _function = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject e) {
        return Boolean.valueOf((e instanceof MountedAssemblyItem));
      }
    };
    Iterator<EObject> _filter = IteratorExtensions.<EObject>filter(_eAllContents, _function);
    final Function1<EObject, MountedAssemblyItem> _function_1 = new Function1<EObject, MountedAssemblyItem>() {
      public MountedAssemblyItem apply(final EObject e) {
        return ((MountedAssemblyItem) e);
      }
    };
    Iterator<MountedAssemblyItem> _map = IteratorExtensions.<EObject, MountedAssemblyItem>map(_filter, _function_1);
    List<MountedAssemblyItem> _list = IteratorExtensions.<MountedAssemblyItem>toList(_map);
    items.addAll(_list);
    TreeIterator<EObject> _eAllContents_1 = a.eAllContents();
    final Function1<EObject, Boolean> _function_2 = new Function1<EObject, Boolean>() {
      public Boolean apply(final EObject e) {
        boolean _and = false;
        if (!(e instanceof RasterAssemblyItem)) {
          _and = false;
        } else {
          RasterItem _element = ((RasterAssemblyItem) e).getElement();
          _and = (_element instanceof Assembly);
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterator<EObject> _filter_1 = IteratorExtensions.<EObject>filter(_eAllContents_1, _function_2);
    final Procedure1<EObject> _function_3 = new Procedure1<EObject>() {
      public void apply(final EObject e) {
        RasterItem _element = ((RasterAssemblyItem) e).getElement();
        Lego3dJavaScript.this.collectItems(((Assembly) _element), items);
      }
    };
    IteratorExtensions.<EObject>forEach(_filter_1, _function_3);
  }
  
  public CharSequence generateJS(final HashSet<Action> actions, final HashSet<MountedAssemblyItem> items) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var Media \t\t= Java.type(\"javafx.scene.media.Media\");");
    _builder.newLine();
    _builder.append("var MediaPlayer = Java.type(\"javafx.scene.media.MediaPlayer\");");
    _builder.newLine();
    _builder.append("var Transition \t= Java.type(\"org.eclipse.fx.ui.animation.BaseTransition\");");
    _builder.newLine();
    _builder.append("var BiConsumer \t= Java.type(\"java.util.function.BiConsumer\");");
    _builder.newLine();
    _builder.append("var Duration \t= Java.type(\"javafx.util.Duration\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("var PropertyTransition = Java.extend(Transition);");
    _builder.newLine();
    _builder.append("var basePath;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("function getRotateNode(node) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return node.getParent().getParent();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("function getTransform(node,x,y,z) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for( var i = 0; i < node.getTransforms().size(); i++ ) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var t = node.getTransforms().get(i);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if( t.getClass().getSimpleName().equals(\"Rotate\") ) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if( t.getAxis().getX() == x ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("&& t.getAxis().getY() == y");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("&& t.getAxis().getZ() == z ) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("return t;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function rotate(r, targetAngle, soundFile, duration) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if( r != null ) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var start = r.getAngle();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var delta = start - targetAngle;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var transition = new PropertyTransition(Duration.millis(duration)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("interpolate: function(frac) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("r.setAngle(start - frac * delta);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("transition.play();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if( soundFile != null ) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("var m = new Media(soundFile);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("var mediaPlayer = new MediaPlayer(m);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("mediaPlayer.play();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      for(final Action ac : actions) {
        _builder.append("function ");
        String _name = ac.getName();
        _builder.append(_name, "");
        _builder.append("(event) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("var node = getRotateNode(event.target);");
        _builder.newLine();
        {
          String _axis = ac.getAxis();
          boolean _equals = Objects.equal(_axis, "x");
          if (_equals) {
            _builder.append("\t");
            _builder.append("rotate(getTransform(node, 1, 0, 0),");
            float _angle = ac.getAngle();
            _builder.append(_angle, "\t");
            _builder.append(", ");
            {
              String _soundfile = ac.getSoundfile();
              boolean _notEquals = (!Objects.equal(_soundfile, null));
              if (_notEquals) {
                _builder.append("basePath +\"/");
                String _soundfile_1 = ac.getSoundfile();
                _builder.append(_soundfile_1, "\t");
                _builder.append("\"");
              } else {
                _builder.append("null");
              }
            }
            _builder.append(",");
            int _duration = ac.getDuration();
            _builder.append(_duration, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            String _axis_1 = ac.getAxis();
            boolean _equals_1 = Objects.equal(_axis_1, "y");
            if (_equals_1) {
              _builder.append("\t");
              _builder.append("rotate(getTransform(node, 0, 1, 0),");
              float _angle_1 = ac.getAngle();
              _builder.append(_angle_1, "\t");
              _builder.append(", ");
              {
                String _soundfile_2 = ac.getSoundfile();
                boolean _notEquals_1 = (!Objects.equal(_soundfile_2, null));
                if (_notEquals_1) {
                  _builder.append("basePath +\"/");
                  String _soundfile_3 = ac.getSoundfile();
                  _builder.append(_soundfile_3, "\t");
                  _builder.append("\"");
                } else {
                  _builder.append("null");
                }
              }
              _builder.append(",");
              int _duration_1 = ac.getDuration();
              _builder.append(_duration_1, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append("rotate(getTransform(node, 0, 0, 1),");
              float _angle_2 = ac.getAngle();
              _builder.append(_angle_2, "\t");
              _builder.append(", ");
              {
                String _soundfile_4 = ac.getSoundfile();
                boolean _notEquals_2 = (!Objects.equal(_soundfile_4, null));
                if (_notEquals_2) {
                  _builder.append("basePath +\"/");
                  String _soundfile_5 = ac.getSoundfile();
                  _builder.append(_soundfile_5, "\t");
                  _builder.append("\"");
                } else {
                  _builder.append("null");
                }
              }
              _builder.append(",");
              int _duration_2 = ac.getDuration();
              _builder.append(_duration_2, "\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("function init() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var InitComsumer = Java.extend(BiConsumer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return new InitComsumer() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("accept : function(n,l) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("basePath = l;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      for(final MountedAssemblyItem mi : items) {
        _builder.append("\t\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("var dynamicNode = n.lookup(\"#dynamic_");
        MountedPart _element = mi.getElement();
        String _name_1 = _element.getName();
        _builder.append(_name_1, "\t\t\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("if( dynamicNode != null ) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("var c_");
        MountedPart _element_1 = mi.getElement();
        String _name_2 = _element_1.getName();
        _builder.append(_name_2, "\t\t\t\t\t");
        _builder.append(" = 0;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("dynamicNode.setOnMousePressed(function(event) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t\t");
        int count = 0;
        _builder.newLineIfNotEmpty();
        {
          for(final Action a : actions) {
            _builder.append("\t\t\t");
            _builder.append("\t\t\t");
            _builder.append("if( c_");
            MountedPart _element_2 = mi.getElement();
            String _name_3 = _element_2.getName();
            _builder.append(_name_3, "\t\t\t\t\t\t");
            _builder.append(" % ");
            int _length = ((Object[])Conversions.unwrapArray(actions, Object.class)).length;
            _builder.append(_length, "\t\t\t\t\t\t");
            _builder.append(" == ");
            int _plusPlus = count++;
            _builder.append(_plusPlus, "\t\t\t\t\t\t");
            _builder.append(" ) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t\t\t");
            _builder.append("\t");
            String _name_4 = a.getName();
            _builder.append(_name_4, "\t\t\t\t\t\t\t");
            _builder.append("(event);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t\t\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("\t\t\t");
        _builder.append("c_");
        MountedPart _element_3 = mi.getElement();
        String _name_5 = _element_3.getName();
        _builder.append(_name_5, "\t\t\t\t\t\t");
        _builder.append("++;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("});");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("init();");
    _builder.newLine();
    return _builder;
  }
}
