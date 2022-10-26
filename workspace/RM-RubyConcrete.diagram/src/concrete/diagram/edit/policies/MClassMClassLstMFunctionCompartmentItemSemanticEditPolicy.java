/*
* 
*/
package concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import concrete.diagram.edit.commands.MFunctionCreateCommand;
import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class MClassMClassLstMFunctionCompartmentItemSemanticEditPolicy extends ConcreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MClassMClassLstMFunctionCompartmentItemSemanticEditPolicy() {
		super(ConcreteElementTypes.MClass_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ConcreteElementTypes.MFunction_3002 == req.getElementType()) {
			return getGEFWrapper(new MFunctionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
