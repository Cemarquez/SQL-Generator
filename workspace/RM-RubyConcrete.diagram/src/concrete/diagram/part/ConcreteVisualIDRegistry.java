/*
* 
*/
package concrete.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import concrete.ConcretePackage;
import concrete.MClassDiagram;
import concrete.diagram.edit.parts.MAssociationEditPart;
import concrete.diagram.edit.parts.MAttributeEditPart;
import concrete.diagram.edit.parts.MAttributeNameEditPart;
import concrete.diagram.edit.parts.MClassDiagramEditPart;
import concrete.diagram.edit.parts.MClassEditPart;
import concrete.diagram.edit.parts.MClassMClassLstMAttributeCompartmentEditPart;
import concrete.diagram.edit.parts.MClassMClassLstMFunctionCompartmentEditPart;
import concrete.diagram.edit.parts.MClassNameEditPart;
import concrete.diagram.edit.parts.MContainmentEditPart;
import concrete.diagram.edit.parts.MFunctionEditPart;
import concrete.diagram.edit.parts.MFunctionNameParametersEditPart;
import concrete.diagram.edit.parts.MInheritanceEditPart;
import concrete.diagram.edit.parts.MPackageEditPart;
import concrete.diagram.edit.parts.MPackageNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ConcreteVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "RM-RubyConcrete.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MClassDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return MClassDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ConcreteDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretePackage.eINSTANCE.getMClassDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((MClassDiagram) domainElement)) {
			return MClassDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = concrete.diagram.part.ConcreteVisualIDRegistry.getModelID(containerView);
		if (!MClassDiagramEditPart.MODEL_ID.equals(containerModelID) && !"concrete".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MClassDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MClassDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MClassDiagramEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getMPackage().isSuperTypeOf(domainElement.eClass())) {
				return MPackageEditPart.VISUAL_ID;
			}
			if (ConcretePackage.eINSTANCE.getMClass().isSuperTypeOf(domainElement.eClass())) {
				return MClassEditPart.VISUAL_ID;
			}
			break;
		case MClassMClassLstMAttributeCompartmentEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getMAttribute().isSuperTypeOf(domainElement.eClass())) {
				return MAttributeEditPart.VISUAL_ID;
			}
			break;
		case MClassMClassLstMFunctionCompartmentEditPart.VISUAL_ID:
			if (ConcretePackage.eINSTANCE.getMFunction().isSuperTypeOf(domainElement.eClass())) {
				return MFunctionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = concrete.diagram.part.ConcreteVisualIDRegistry.getModelID(containerView);
		if (!MClassDiagramEditPart.MODEL_ID.equals(containerModelID) && !"concrete".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MClassDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MClassDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MClassDiagramEditPart.VISUAL_ID:
			if (MPackageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MPackageEditPart.VISUAL_ID:
			if (MPackageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MClassEditPart.VISUAL_ID:
			if (MClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MClassMClassLstMAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MClassMClassLstMFunctionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MAttributeEditPart.VISUAL_ID:
			if (MAttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MFunctionEditPart.VISUAL_ID:
			if (MFunctionNameParametersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MClassMClassLstMAttributeCompartmentEditPart.VISUAL_ID:
			if (MAttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MClassMClassLstMFunctionCompartmentEditPart.VISUAL_ID:
			if (MFunctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ConcretePackage.eINSTANCE.getMAssociation().isSuperTypeOf(domainElement.eClass())) {
			return MAssociationEditPart.VISUAL_ID;
		}
		if (ConcretePackage.eINSTANCE.getMInheritance().isSuperTypeOf(domainElement.eClass())) {
			return MInheritanceEditPart.VISUAL_ID;
		}
		if (ConcretePackage.eINSTANCE.getMContainment().isSuperTypeOf(domainElement.eClass())) {
			return MContainmentEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(MClassDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case MClassMClassLstMAttributeCompartmentEditPart.VISUAL_ID:
		case MClassMClassLstMFunctionCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MClassDiagramEditPart.VISUAL_ID:
			return false;
		case MPackageEditPart.VISUAL_ID:
		case MAttributeEditPart.VISUAL_ID:
		case MFunctionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return concrete.diagram.part.ConcreteVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
