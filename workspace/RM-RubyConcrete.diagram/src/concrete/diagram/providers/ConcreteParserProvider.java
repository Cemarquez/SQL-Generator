/*
 * 
 */
package concrete.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import concrete.ConcretePackage;
import concrete.diagram.edit.parts.MAttributeNameEditPart;
import concrete.diagram.edit.parts.MClassNameEditPart;
import concrete.diagram.edit.parts.MFunctionNameParametersEditPart;
import concrete.diagram.edit.parts.MPackageNameEditPart;
import concrete.diagram.parsers.MessageFormatParser;
import concrete.diagram.part.ConcreteVisualIDRegistry;

/**
 * @generated
 */
public class ConcreteParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser mPackageName_5001Parser;

	/**
	* @generated
	*/
	private IParser getMPackageName_5001Parser() {
		if (mPackageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getMPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mPackageName_5001Parser = parser;
		}
		return mPackageName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser mClassName_5004Parser;

	/**
	* @generated
	*/
	private IParser getMClassName_5004Parser() {
		if (mClassName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getMClass_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mClassName_5004Parser = parser;
		}
		return mClassName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser mAttributeName_5002Parser;

	/**
	* @generated
	*/
	private IParser getMAttributeName_5002Parser() {
		if (mAttributeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getMAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			mAttributeName_5002Parser = parser;
		}
		return mAttributeName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser mFunctionNameParameters_5003Parser;

	/**
	* @generated
	*/
	private IParser getMFunctionNameParameters_5003Parser() {
		if (mFunctionNameParameters_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ConcretePackage.eINSTANCE.getMFunction_Name(),
					ConcretePackage.eINSTANCE.getMFunction_Parameters() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}({1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0}({1})"); //$NON-NLS-1$
			parser.setEditPattern("{0}({1})"); //$NON-NLS-1$
			mFunctionNameParameters_5003Parser = parser;
		}
		return mFunctionNameParameters_5003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MPackageNameEditPart.VISUAL_ID:
			return getMPackageName_5001Parser();
		case MClassNameEditPart.VISUAL_ID:
			return getMClassName_5004Parser();
		case MAttributeNameEditPart.VISUAL_ID:
			return getMAttributeName_5002Parser();
		case MFunctionNameParametersEditPart.VISUAL_ID:
			return getMFunctionNameParameters_5003Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ConcreteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ConcreteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ConcreteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
