/*
* 
*/
package concrete.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import concrete.ConcretePackage;
import concrete.MAssociation;
import concrete.MAttribute;
import concrete.MClass;
import concrete.MClassDiagram;
import concrete.MContainment;
import concrete.MFunction;
import concrete.MInheritance;
import concrete.MPackage;
import concrete.diagram.edit.parts.MAssociationEditPart;
import concrete.diagram.edit.parts.MAttributeEditPart;
import concrete.diagram.edit.parts.MClassDiagramEditPart;
import concrete.diagram.edit.parts.MClassEditPart;
import concrete.diagram.edit.parts.MClassMClassLstMAttributeCompartmentEditPart;
import concrete.diagram.edit.parts.MClassMClassLstMFunctionCompartmentEditPart;
import concrete.diagram.edit.parts.MContainmentEditPart;
import concrete.diagram.edit.parts.MFunctionEditPart;
import concrete.diagram.edit.parts.MInheritanceEditPart;
import concrete.diagram.edit.parts.MPackageEditPart;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class ConcreteDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getSemanticChildren(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case MClassDiagramEditPart.VISUAL_ID:
			return getMClassDiagram_1000SemanticChildren(view);
		case MClassMClassLstMAttributeCompartmentEditPart.VISUAL_ID:
			return getMClassMClassLstMAttributeCompartment_7001SemanticChildren(view);
		case MClassMClassLstMFunctionCompartmentEditPart.VISUAL_ID:
			return getMClassMClassLstMFunctionCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getMClassDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MClassDiagram modelElement = (MClassDiagram) view.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMPackage().iterator(); it.hasNext();) {
			MPackage childElement = (MPackage) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MPackageEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLstMClass().iterator(); it.hasNext();) {
			MClass childElement = (MClass) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MClassEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getMClassMClassLstMAttributeCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MClass modelElement = (MClass) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMAttribute().iterator(); it.hasNext();) {
			MAttribute childElement = (MAttribute) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MAttributeEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteNodeDescriptor> getMClassMClassLstMFunctionCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MClass modelElement = (MClass) containerView.getElement();
		LinkedList<ConcreteNodeDescriptor> result = new LinkedList<ConcreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstMFunction().iterator(); it.hasNext();) {
			MFunction childElement = (MFunction) it.next();
			int visualID = ConcreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == MFunctionEditPart.VISUAL_ID) {
				result.add(new ConcreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ConcreteLinkDescriptor> getContainedLinks(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case MClassDiagramEditPart.VISUAL_ID:
			return getMClassDiagram_1000ContainedLinks(view);
		case MPackageEditPart.VISUAL_ID:
			return getMPackage_2001ContainedLinks(view);
		case MClassEditPart.VISUAL_ID:
			return getMClass_2002ContainedLinks(view);
		case MAttributeEditPart.VISUAL_ID:
			return getMAttribute_3001ContainedLinks(view);
		case MFunctionEditPart.VISUAL_ID:
			return getMFunction_3002ContainedLinks(view);
		case MAssociationEditPart.VISUAL_ID:
			return getMAssociation_4001ContainedLinks(view);
		case MInheritanceEditPart.VISUAL_ID:
			return getMInheritance_4002ContainedLinks(view);
		case MContainmentEditPart.VISUAL_ID:
			return getMContainment_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcreteLinkDescriptor> getIncomingLinks(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case MPackageEditPart.VISUAL_ID:
			return getMPackage_2001IncomingLinks(view);
		case MClassEditPart.VISUAL_ID:
			return getMClass_2002IncomingLinks(view);
		case MAttributeEditPart.VISUAL_ID:
			return getMAttribute_3001IncomingLinks(view);
		case MFunctionEditPart.VISUAL_ID:
			return getMFunction_3002IncomingLinks(view);
		case MAssociationEditPart.VISUAL_ID:
			return getMAssociation_4001IncomingLinks(view);
		case MInheritanceEditPart.VISUAL_ID:
			return getMInheritance_4002IncomingLinks(view);
		case MContainmentEditPart.VISUAL_ID:
			return getMContainment_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ConcreteLinkDescriptor> getOutgoingLinks(View view) {
		switch (ConcreteVisualIDRegistry.getVisualID(view)) {
		case MPackageEditPart.VISUAL_ID:
			return getMPackage_2001OutgoingLinks(view);
		case MClassEditPart.VISUAL_ID:
			return getMClass_2002OutgoingLinks(view);
		case MAttributeEditPart.VISUAL_ID:
			return getMAttribute_3001OutgoingLinks(view);
		case MFunctionEditPart.VISUAL_ID:
			return getMFunction_3002OutgoingLinks(view);
		case MAssociationEditPart.VISUAL_ID:
			return getMAssociation_4001OutgoingLinks(view);
		case MInheritanceEditPart.VISUAL_ID:
			return getMInheritance_4002OutgoingLinks(view);
		case MContainmentEditPart.VISUAL_ID:
			return getMContainment_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMClassDiagram_1000ContainedLinks(View view) {
		MClassDiagram modelElement = (MClassDiagram) view.getElement();
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_MAssociation_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MInheritance_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MContainment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMPackage_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMClass_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMAttribute_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMFunction_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMAssociation_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMInheritance_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMContainment_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMPackage_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMClass_2002IncomingLinks(View view) {
		MClass modelElement = (MClass) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MAssociation_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MInheritance_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MContainment_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMAttribute_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMFunction_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMAssociation_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMInheritance_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMContainment_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMPackage_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMClass_2002OutgoingLinks(View view) {
		MClass modelElement = (MClass) view.getElement();
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MAssociation_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MInheritance_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MContainment_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMAttribute_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMFunction_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMAssociation_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMInheritance_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ConcreteLinkDescriptor> getMContainment_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_MAssociation_4001(
			MClassDiagram container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getLstMAssoctiation().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MAssociation) {
				continue;
			}
			MAssociation link = (MAssociation) linkObject;
			if (MAssociationEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass dst = link.getTarget();
			MClass src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.MAssociation_4001,
					MAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_MInheritance_4002(
			MClassDiagram container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getLstMInheritance().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MInheritance) {
				continue;
			}
			MInheritance link = (MInheritance) linkObject;
			if (MInheritanceEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass dst = link.getTarget();
			MClass src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.MInheritance_4002,
					MInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getContainedTypeModelFacetLinks_MContainment_4003(
			MClassDiagram container) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getLstMContainment().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MContainment) {
				continue;
			}
			MContainment link = (MContainment) linkObject;
			if (MContainmentEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass dst = link.getTarget();
			MClass src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.MContainment_4003,
					MContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_MAssociation_4001(MClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getMAssociation_Target()
					|| false == setting.getEObject() instanceof MAssociation) {
				continue;
			}
			MAssociation link = (MAssociation) setting.getEObject();
			if (MAssociationEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.MAssociation_4001,
					MAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_MInheritance_4002(MClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getMInheritance_Target()
					|| false == setting.getEObject() instanceof MInheritance) {
				continue;
			}
			MInheritance link = (MInheritance) setting.getEObject();
			if (MInheritanceEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.MInheritance_4002,
					MInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ConcreteLinkDescriptor> getIncomingTypeModelFacetLinks_MContainment_4003(MClass target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ConcretePackage.eINSTANCE.getMContainment_Target()
					|| false == setting.getEObject() instanceof MContainment) {
				continue;
			}
			MContainment link = (MContainment) setting.getEObject();
			if (MContainmentEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass src = link.getSource();
			result.add(new ConcreteLinkDescriptor(src, target, link, ConcreteElementTypes.MContainment_4003,
					MContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_MAssociation_4001(MClass source) {
		MClassDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MClassDiagram) {
				container = (MClassDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getLstMAssoctiation().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MAssociation) {
				continue;
			}
			MAssociation link = (MAssociation) linkObject;
			if (MAssociationEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass dst = link.getTarget();
			MClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.MAssociation_4001,
					MAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_MInheritance_4002(MClass source) {
		MClassDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MClassDiagram) {
				container = (MClassDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getLstMInheritance().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MInheritance) {
				continue;
			}
			MInheritance link = (MInheritance) linkObject;
			if (MInheritanceEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass dst = link.getTarget();
			MClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.MInheritance_4002,
					MInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ConcreteLinkDescriptor> getOutgoingTypeModelFacetLinks_MContainment_4003(MClass source) {
		MClassDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MClassDiagram) {
				container = (MClassDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ConcreteLinkDescriptor> result = new LinkedList<ConcreteLinkDescriptor>();
		for (Iterator<?> links = container.getLstMContainment().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MContainment) {
				continue;
			}
			MContainment link = (MContainment) linkObject;
			if (MContainmentEditPart.VISUAL_ID != ConcreteVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			MClass dst = link.getTarget();
			MClass src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ConcreteLinkDescriptor(src, dst, link, ConcreteElementTypes.MContainment_4003,
					MContainmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ConcreteNodeDescriptor> getSemanticChildren(View view) {
			return ConcreteDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcreteLinkDescriptor> getContainedLinks(View view) {
			return ConcreteDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcreteLinkDescriptor> getIncomingLinks(View view) {
			return ConcreteDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ConcreteLinkDescriptor> getOutgoingLinks(View view) {
			return ConcreteDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
