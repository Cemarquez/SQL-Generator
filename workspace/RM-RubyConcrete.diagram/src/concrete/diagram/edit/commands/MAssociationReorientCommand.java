/*
 * 
 */
package concrete.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import concrete.MAssociation;
import concrete.MClass;
import concrete.MClassDiagram;
import concrete.diagram.edit.policies.ConcreteBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class MAssociationReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public MAssociationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MAssociation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof MClass && newEnd instanceof MClass)) {
			return false;
		}
		MClass target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof MClassDiagram)) {
			return false;
		}
		MClassDiagram container = (MClassDiagram) getLink().eContainer();
		return ConcreteBaseItemSemanticEditPolicy.getLinkConstraints().canExistMAssociation_4001(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MClass && newEnd instanceof MClass)) {
			return false;
		}
		MClass source = getLink().getSource();
		if (!(getLink().eContainer() instanceof MClassDiagram)) {
			return false;
		}
		MClassDiagram container = (MClassDiagram) getLink().eContainer();
		return ConcreteBaseItemSemanticEditPolicy.getLinkConstraints().canExistMAssociation_4001(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected MAssociation getLink() {
		return (MAssociation) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected MClass getOldSource() {
		return (MClass) oldEnd;
	}

	/**
	* @generated
	*/
	protected MClass getNewSource() {
		return (MClass) newEnd;
	}

	/**
	* @generated
	*/
	protected MClass getOldTarget() {
		return (MClass) oldEnd;
	}

	/**
	* @generated
	*/
	protected MClass getNewTarget() {
		return (MClass) newEnd;
	}
}
