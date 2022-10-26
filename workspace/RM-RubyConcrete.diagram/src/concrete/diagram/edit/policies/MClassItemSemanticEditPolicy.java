/*
* 
*/
package concrete.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import concrete.diagram.edit.commands.MAssociationCreateCommand;
import concrete.diagram.edit.commands.MAssociationReorientCommand;
import concrete.diagram.edit.commands.MContainmentCreateCommand;
import concrete.diagram.edit.commands.MContainmentReorientCommand;
import concrete.diagram.edit.commands.MInheritanceCreateCommand;
import concrete.diagram.edit.commands.MInheritanceReorientCommand;
import concrete.diagram.edit.parts.MAssociationEditPart;
import concrete.diagram.edit.parts.MAttributeEditPart;
import concrete.diagram.edit.parts.MClassMClassLstMAttributeCompartmentEditPart;
import concrete.diagram.edit.parts.MClassMClassLstMFunctionCompartmentEditPart;
import concrete.diagram.edit.parts.MContainmentEditPart;
import concrete.diagram.edit.parts.MFunctionEditPart;
import concrete.diagram.edit.parts.MInheritanceEditPart;
import concrete.diagram.part.ConcreteVisualIDRegistry;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class MClassItemSemanticEditPolicy extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MClassItemSemanticEditPolicy() {
		super(ConcreteElementTypes.MClass_2002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == MAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == MInheritanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(incomingLink) == MContainmentEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == MAssociationEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == MInheritanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ConcreteVisualIDRegistry.getVisualID(outgoingLink) == MContainmentEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ConcreteVisualIDRegistry.getVisualID(node)) {
			case MClassMClassLstMAttributeCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcreteVisualIDRegistry.getVisualID(cnode)) {
					case MAttributeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case MClassMClassLstMFunctionCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ConcreteVisualIDRegistry.getVisualID(cnode)) {
					case MFunctionEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcreteElementTypes.MAssociation_4001 == req.getElementType()) {
			return getGEFWrapper(new MAssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.MInheritance_4002 == req.getElementType()) {
			return getGEFWrapper(new MInheritanceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.MContainment_4003 == req.getElementType()) {
			return getGEFWrapper(new MContainmentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ConcreteElementTypes.MAssociation_4001 == req.getElementType()) {
			return getGEFWrapper(new MAssociationCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.MInheritance_4002 == req.getElementType()) {
			return getGEFWrapper(new MInheritanceCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ConcreteElementTypes.MContainment_4003 == req.getElementType()) {
			return getGEFWrapper(new MContainmentCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MAssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new MAssociationReorientCommand(req));
		case MInheritanceEditPart.VISUAL_ID:
			return getGEFWrapper(new MInheritanceReorientCommand(req));
		case MContainmentEditPart.VISUAL_ID:
			return getGEFWrapper(new MContainmentReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
