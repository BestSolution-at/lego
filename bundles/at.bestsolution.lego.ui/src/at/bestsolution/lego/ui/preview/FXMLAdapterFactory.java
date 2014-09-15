package at.bestsolution.lego.ui.preview;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.fx.ide.ui.editor.IFXMLProviderAdapter;
import org.eclipse.fx.ide.ui.editor.IFXPreviewAdapter;
import org.eclipse.xtext.ui.editor.XtextEditor;

public class FXMLAdapterFactory implements IAdapterFactory {

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		System.err.println("THE ADAPTER: " + adaptableObject + "; " + adapterType);
		if((adapterType == IFXMLProviderAdapter.class || adapterType == IFXPreviewAdapter.class) && adaptableObject instanceof XtextEditor ) {
			XtextEditor editor = (XtextEditor) adaptableObject;
			System.err.println("=====>" + editor.getLanguageName());
			if( "at.bestsolution.lego.Lego".equals(editor.getLanguageName()) ) {
				return new FXMLProviderAdapter(editor);
			}
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[]{IFXMLProviderAdapter.class, IFXPreviewAdapter.class};
	}

}
