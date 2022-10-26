/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concrete.diagram.edit.commands.MAttributeCreateCommand;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class MClassMClassLstMAttributeCompartmentItemSemanticEditPolicy extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MClassMClassLstMAttributeCompartmentItemSemanticEditPolicy() {
		super(ConcreteElementTypes.MClass_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcreteElementTypes.MAttribute_3001 == req.getElementType()) {
			return getGEFWrapper(new MAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
