/*
 * 
 */
package concrete.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import concrete.diagram.part.ConcreteVisualIDRegistry;

/**
 * @generated
 */
public class ConcreteEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ConcreteVisualIDRegistry.getVisualID(view)) {

			case MClassDiagramEditPart.VISUAL_ID:
				return new MClassDiagramEditPart(view);

			case MPackageEditPart.VISUAL_ID:
				return new MPackageEditPart(view);

			case MPackageNameEditPart.VISUAL_ID:
				return new MPackageNameEditPart(view);

			case MClassEditPart.VISUAL_ID:
				return new MClassEditPart(view);

			case MClassNameEditPart.VISUAL_ID:
				return new MClassNameEditPart(view);

			case MAttributeEditPart.VISUAL_ID:
				return new MAttributeEditPart(view);

			case MAttributeNameEditPart.VISUAL_ID:
				return new MAttributeNameEditPart(view);

			case MFunctionEditPart.VISUAL_ID:
				return new MFunctionEditPart(view);

			case MFunctionNameParametersEditPart.VISUAL_ID:
				return new MFunctionNameParametersEditPart(view);

			case MClassMClassLstMAttributeCompartmentEditPart.VISUAL_ID:
				return new MClassMClassLstMAttributeCompartmentEditPart(view);

			case MClassMClassLstMFunctionCompartmentEditPart.VISUAL_ID:
				return new MClassMClassLstMFunctionCompartmentEditPart(view);

			case MAssociationEditPart.VISUAL_ID:
				return new MAssociationEditPart(view);

			case MInheritanceEditPart.VISUAL_ID:
				return new MInheritanceEditPart(view);

			case MContainmentEditPart.VISUAL_ID:
				return new MContainmentEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
