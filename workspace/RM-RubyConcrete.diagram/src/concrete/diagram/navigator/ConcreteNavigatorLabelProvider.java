/*
* 
*/
package concrete.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import concrete.MAssociation;
import concrete.MClassDiagram;
import concrete.MContainment;
import concrete.diagram.edit.parts.MAssociationEditPart;
import concrete.diagram.edit.parts.MAttributeEditPart;
import concrete.diagram.edit.parts.MAttributeNameEditPart;
import concrete.diagram.edit.parts.MClassDiagramEditPart;
import concrete.diagram.edit.parts.MClassEditPart;
import concrete.diagram.edit.parts.MClassNameEditPart;
import concrete.diagram.edit.parts.MContainmentEditPart;
import concrete.diagram.edit.parts.MFunctionEditPart;
import concrete.diagram.edit.parts.MFunctionNameParametersEditPart;
import concrete.diagram.edit.parts.MInheritanceEditPart;
import concrete.diagram.edit.parts.MPackageEditPart;
import concrete.diagram.edit.parts.MPackageNameEditPart;
import concrete.diagram.part.ConcreteDiagramEditorPlugin;
import concrete.diagram.part.ConcreteVisualIDRegistry;
import concrete.diagram.providers.ConcreteElementTypes;
import concrete.diagram.providers.ConcreteParserProvider;

/**
 * @generated
 */
public class ConcreteNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ConcreteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ConcreteDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ConcreteNavigatorItem && !isOwnView(((ConcreteNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ConcreteNavigatorGroup) {
			ConcreteNavigatorGroup group = (ConcreteNavigatorGroup) element;
			return ConcreteDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ConcreteNavigatorItem) {
			ConcreteNavigatorItem navigatorItem = (ConcreteNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case MClassDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?concrete?MClassDiagram", ConcreteElementTypes.MClassDiagram_1000); //$NON-NLS-1$
		case MPackageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concrete?MPackage", ConcreteElementTypes.MPackage_2001); //$NON-NLS-1$
		case MClassEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?concrete?MClass", ConcreteElementTypes.MClass_2002); //$NON-NLS-1$
		case MAttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concrete?MAttribute", ConcreteElementTypes.MAttribute_3001); //$NON-NLS-1$
		case MFunctionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?concrete?MFunction", ConcreteElementTypes.MFunction_3002); //$NON-NLS-1$
		case MAssociationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?MAssociation", ConcreteElementTypes.MAssociation_4001); //$NON-NLS-1$
		case MInheritanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?MInheritance", ConcreteElementTypes.MInheritance_4002); //$NON-NLS-1$
		case MContainmentEditPart.VISUAL_ID:
			return getImage("Navigator?Link?concrete?MContainment", ConcreteElementTypes.MContainment_4003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ConcreteDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ConcreteElementTypes.isKnownElementType(elementType)) {
			image = ConcreteElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ConcreteNavigatorGroup) {
			ConcreteNavigatorGroup group = (ConcreteNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ConcreteNavigatorItem) {
			ConcreteNavigatorItem navigatorItem = (ConcreteNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case MClassDiagramEditPart.VISUAL_ID:
			return getMClassDiagram_1000Text(view);
		case MPackageEditPart.VISUAL_ID:
			return getMPackage_2001Text(view);
		case MClassEditPart.VISUAL_ID:
			return getMClass_2002Text(view);
		case MAttributeEditPart.VISUAL_ID:
			return getMAttribute_3001Text(view);
		case MFunctionEditPart.VISUAL_ID:
			return getMFunction_3002Text(view);
		case MAssociationEditPart.VISUAL_ID:
			return getMAssociation_4001Text(view);
		case MInheritanceEditPart.VISUAL_ID:
			return getMInheritance_4002Text(view);
		case MContainmentEditPart.VISUAL_ID:
			return getMContainment_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getMClassDiagram_1000Text(View view) {
		MClassDiagram domainModelElement = (MClassDiagram) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMPackage_2001Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.MPackage_2001,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(MPackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMClass_2002Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.MClass_2002,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(MClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMAttribute_3001Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.MAttribute_3001,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(MAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMFunction_3002Text(View view) {
		IParser parser = ConcreteParserProvider.getParser(ConcreteElementTypes.MFunction_3002,
				view.getElement() != null ? view.getElement() : view,
				ConcreteVisualIDRegistry.getType(MFunctionNameParametersEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMAssociation_4001Text(View view) {
		MAssociation domainModelElement = (MAssociation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getMultiplicitySource();
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMInheritance_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getMContainment_4003Text(View view) {
		MContainment domainModelElement = (MContainment) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getMultiplicityTarget();
		} else {
			ConcreteDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return MClassDiagramEditPart.MODEL_ID.equals(ConcreteVisualIDRegistry.getModelID(view));
	}

}
