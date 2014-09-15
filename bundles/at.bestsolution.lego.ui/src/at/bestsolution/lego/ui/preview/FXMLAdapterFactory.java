/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GPL v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
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
