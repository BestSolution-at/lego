package at.bestsolution.lego.ui.preview;

import java.net.URL;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.fx.ide.ui.editor.IFXMLProviderAdapter;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Injector;

import at.bestsolution.lego.generator.Lego2dFXML;
import at.bestsolution.lego.lego.Model;
import at.bestsolution.lego.ui.LegoUiModule;
import at.bestsolution.lego.ui.internal.LegoActivator;

public class FXMLProviderAdapter implements IFXMLProviderAdapter {
	private XtextEditor editor;
	
	public FXMLProviderAdapter(XtextEditor editor) {
		this.editor = editor;
	}

	@Override
	public IEditorPart getEditorPart() {
		return editor;
	}
	
	@Override
	public String getPreviewFXML() {
		return editor.getDocument().readOnly(new IUnitOfWork<String, XtextResource>() {

			@Override
			public String exec(XtextResource resource) throws Exception {
				System.err.println("GENERATING");
				Injector injector = LegoActivator.getInstance().getInjector("at.bestsolution.lego.Lego");
				Lego2dFXML generator = injector.getInstance(Lego2dFXML.class);
				return generator.generatePreview((Model) resource.getContents().get(0)).toString();
			}
			 
		});
	}
		
	@Override
	public String getPreviewSceneFXML() {
		return null;
	}

	@Override
	public List<String> getPreviewCSSFiles() {
		return Collections.emptyList();
	}

	@Override
	public String getPreviewResourceBundle() {
		return null;
	}

	@Override
	public List<URL> getPreviewClasspath() {
		return Collections.emptyList();
	}

	@Override
	public IFile getFile() {
		return editor.getDocument().readOnly(new IUnitOfWork<IFile, XtextResource>() {

			@Override
			public IFile exec(XtextResource resource) throws Exception {
				URI uri = resource.getURI();
				Path structureFilePath = new Path(uri.toPlatformString(true));
				IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(structureFilePath);
				if( f.exists() ) {
					return f;
				}
				return null;
			}
			
		});
	}
}
