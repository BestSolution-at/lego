package at.bestsolution.lego.ui.preview;

import at.bestsolution.lego.generator.Lego2dFXML;
import at.bestsolution.lego.generator.Lego3dFXML;
import at.bestsolution.lego.lego.Model;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PreviewGenerator {
  @Inject
  private Lego3dFXML lego3d;
  
  @Inject
  private Lego2dFXML lego2;
  
  public CharSequence generatePreview(final Model model) {
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
    _builder.append("<?import javafx.scene.control.*?>");
    _builder.newLine();
    _builder.append("<TabPane xmlns:fx=\"http://javafx.com/fxml/1\" side=\"BOTTOM\" tabClosingPolicy=\"UNAVAILABLE\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<Tab text=\"3d\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<content>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<ScrollPane>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    CharSequence _generatePreview = this.lego3d.generatePreview(model);
    _builder.append(_generatePreview, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</ScrollPane>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</content>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</Tab>");
    _builder.newLine();
    _builder.append("</TabPane>");
    _builder.newLine();
    return _builder;
  }
}
