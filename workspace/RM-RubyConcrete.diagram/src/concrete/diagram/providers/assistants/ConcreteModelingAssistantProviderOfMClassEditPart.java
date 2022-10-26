/*
 * 
 */
package concrete.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import concrete.diagram.edit.parts.MClassEditPart;
import concrete.diagram.providers.ConcreteElementTypes;
import concrete.diagram.providers.ConcreteModelingAssistantProvider;

/**
 * @generated
 */
public class ConcreteModelingAssistantProviderOfMClassEditPart extends ConcreteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ConcreteElementTypes.MAttribute_3001);
		types.add(ConcreteElementTypes.MFunction_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MClassEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(MClassEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ConcreteElementTypes.MAssociation_4001);
		types.add(ConcreteElementTypes.MInheritance_4002);
		types.add(ConcreteElementTypes.MContainment_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((MClassEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(MClassEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MClassEditPart) {
			types.add(ConcreteElementTypes.MAssociation_4001);
		}
		if (targetEditPart instanceof MClassEditPart) {
			types.add(ConcreteElementTypes.MInheritance_4002);
		}
		if (targetEditPart instanceof MClassEditPart) {
			types.add(ConcreteElementTypes.MContainment_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((MClassEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(MClassEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcreteElementTypes.MAssociation_4001) {
			types.add(ConcreteElementTypes.MClass_2002);
		} else if (relationshipType == ConcreteElementTypes.MInheritance_4002) {
			types.add(ConcreteElementTypes.MClass_2002);
		} else if (relationshipType == ConcreteElementTypes.MContainment_4003) {
			types.add(ConcreteElementTypes.MClass_2002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MClassEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(MClassEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ConcreteElementTypes.MAssociation_4001);
		types.add(ConcreteElementTypes.MInheritance_4002);
		types.add(ConcreteElementTypes.MContainment_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((MClassEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(MClassEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ConcreteElementTypes.MAssociation_4001) {
			types.add(ConcreteElementTypes.MClass_2002);
		} else if (relationshipType == ConcreteElementTypes.MInheritance_4002) {
			types.add(ConcreteElementTypes.MClass_2002);
		} else if (relationshipType == ConcreteElementTypes.MContainment_4003) {
			types.add(ConcreteElementTypes.MClass_2002);
		}
		return types;
	}

}
