/**
 */
package abstracts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see abstracts.AbstractsFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface AbstractsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstracts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "abstract";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstract";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractsPackage eINSTANCE = abstracts.impl.AbstractsPackageImpl.init();

	/**
	 * The meta object id for the '{@link abstracts.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.ModelFactoryImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Ruta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__RUTA = 1;

	/**
	 * The feature id for the '<em><b>Lst Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_PACKAGES = 2;

	/**
	 * The feature id for the '<em><b>Lst All Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_ALL_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Lst All Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_ALL_PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracts.impl.MPackageImpl <em>MPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MPackageImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMPackage()
	 * @generated
	 */
	int MPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__LST_MCLASS = 2;

	/**
	 * The feature id for the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE__LST_MPACKAGE = 3;

	/**
	 * The number of structural features of the '<em>MPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link abstracts.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MClassDiagramImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMClassDiagram()
	 * @generated
	 */
	int MCLASS_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MPACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MCLASS = 2;

	/**
	 * The number of structural features of the '<em>MClass Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link abstracts.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MClassImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMClass()
	 * @generated
	 */
	int MCLASS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__ACCESS_MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__COMMENTS = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__PATH = 3;

	/**
	 * The feature id for the '<em><b>Lst MAssoctiation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MASSOCTIATION = 4;

	/**
	 * The feature id for the '<em><b>Lst MInheritance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MINHERITANCE = 5;

	/**
	 * The feature id for the '<em><b>Lst MContainment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MCONTAINMENT = 6;

	/**
	 * The feature id for the '<em><b>Lst Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_ATTRIBUTES = 7;

	/**
	 * The feature id for the '<em><b>Lst Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_FUNCTION = 8;

	/**
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link abstracts.impl.MAssociationImpl <em>MAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MAssociationImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMAssociation()
	 * @generated
	 */
	int MASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__RELATIONSHIP_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__MULTIPLICITY_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__MULTIPLICITY_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__SOURCE_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__TARGET_ROLE = 6;

	/**
	 * The number of structural features of the '<em>MAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link abstracts.impl.MInheritanceImpl <em>MInheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MInheritanceImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMInheritance()
	 * @generated
	 */
	int MINHERITANCE = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINHERITANCE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINHERITANCE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>MInheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINHERITANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link abstracts.impl.MContainmentImpl <em>MContainment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MContainmentImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMContainment()
	 * @generated
	 */
	int MCONTAINMENT = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTAINMENT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTAINMENT__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTAINMENT__MULTIPLICITY_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTAINMENT__SOURCE_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTAINMENT__TARGET_ROLE = 4;

	/**
	 * The number of structural features of the '<em>MContainment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTAINMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link abstracts.impl.MAttributeImpl <em>MAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MAttributeImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMAttribute()
	 * @generated
	 */
	int MATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__COMMENTS = 2;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__CONSTANT = 3;

	/**
	 * The feature id for the '<em><b>Remove To Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__REMOVE_TO_INIT = 4;

	/**
	 * The feature id for the '<em><b>Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__PRIMARY_KEY = 5;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__NULLABLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__SIZE = 8;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__FOREIGN_KEY = 9;

	/**
	 * The number of structural features of the '<em>MAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link abstracts.impl.MFunctionImpl <em>MFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.impl.MFunctionImpl
	 * @see abstracts.impl.AbstractsPackageImpl#getMFunction()
	 * @generated
	 */
	int MFUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__ACCESS_MODIFIER = 1;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__SEMANTICS = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__COMMENTS = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION__PARAMETERS = 4;

	/**
	 * The number of structural features of the '<em>MFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MFUNCTION_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link abstracts.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see abstracts.Type
	 * @see abstracts.impl.AbstractsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;


	/**
	 * Returns the meta object for class '{@link abstracts.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see abstracts.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see abstracts.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see abstracts.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.ModelFactory#getLstPackages <em>Lst Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Packages</em>'.
	 * @see abstracts.ModelFactory#getLstPackages()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstPackages();

	/**
	 * Returns the meta object for the reference list '{@link abstracts.ModelFactory#getLstAllClass <em>Lst All Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst All Class</em>'.
	 * @see abstracts.ModelFactory#getLstAllClass()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstAllClass();

	/**
	 * Returns the meta object for the reference list '{@link abstracts.ModelFactory#getLstAllPackage <em>Lst All Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lst All Package</em>'.
	 * @see abstracts.ModelFactory#getLstAllPackage()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstAllPackage();

	/**
	 * Returns the meta object for class '{@link abstracts.MPackage <em>MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPackage</em>'.
	 * @see abstracts.MPackage
	 * @generated
	 */
	EClass getMPackage();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MPackage#getName()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracts.MPackage#getPath()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MPackage#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see abstracts.MPackage#getLstMClass()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_LstMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MPackage#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see abstracts.MPackage#getLstMPackage()
	 * @see #getMPackage()
	 * @generated
	 */
	EReference getMPackage_LstMPackage();

	/**
	 * Returns the meta object for class '{@link abstracts.MClassDiagram <em>MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass Diagram</em>'.
	 * @see abstracts.MClassDiagram
	 * @generated
	 */
	EClass getMClassDiagram();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClassDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MClassDiagram#getName()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EAttribute getMClassDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see abstracts.MClassDiagram#getLstMPackage()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see abstracts.MClassDiagram#getLstMClass()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMClass();

	/**
	 * Returns the meta object for class '{@link abstracts.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see abstracts.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MClass#getName()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see abstracts.MClass#getAccessModifier()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see abstracts.MClass#getComments()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Comments();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MClass#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see abstracts.MClass#getPath()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClass#getLstMAssoctiation <em>Lst MAssoctiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MAssoctiation</em>'.
	 * @see abstracts.MClass#getLstMAssoctiation()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMAssoctiation();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClass#getLstMInheritance <em>Lst MInheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MInheritance</em>'.
	 * @see abstracts.MClass#getLstMInheritance()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMInheritance();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClass#getLstMContainment <em>Lst MContainment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MContainment</em>'.
	 * @see abstracts.MClass#getLstMContainment()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMContainment();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClass#getLstAttributes <em>Lst Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Attributes</em>'.
	 * @see abstracts.MClass#getLstAttributes()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link abstracts.MClass#getLstFunction <em>Lst Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Function</em>'.
	 * @see abstracts.MClass#getLstFunction()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstFunction();

	/**
	 * Returns the meta object for class '{@link abstracts.MAssociation <em>MAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAssociation</em>'.
	 * @see abstracts.MAssociation
	 * @generated
	 */
	EClass getMAssociation();

	/**
	 * Returns the meta object for the reference '{@link abstracts.MAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracts.MAssociation#getSource()
	 * @see #getMAssociation()
	 * @generated
	 */
	EReference getMAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracts.MAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracts.MAssociation#getTarget()
	 * @see #getMAssociation()
	 * @generated
	 */
	EReference getMAssociation_Target();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAssociation#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see abstracts.MAssociation#getRelationshipType()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAssociation#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see abstracts.MAssociation#getMultiplicitySource()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAssociation#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see abstracts.MAssociation#getMultiplicityTarget()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAssociation#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see abstracts.MAssociation#getSourceRole()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAssociation#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see abstracts.MAssociation#getTargetRole()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_TargetRole();

	/**
	 * Returns the meta object for class '{@link abstracts.MInheritance <em>MInheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MInheritance</em>'.
	 * @see abstracts.MInheritance
	 * @generated
	 */
	EClass getMInheritance();

	/**
	 * Returns the meta object for the reference '{@link abstracts.MInheritance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracts.MInheritance#getSource()
	 * @see #getMInheritance()
	 * @generated
	 */
	EReference getMInheritance_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracts.MInheritance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracts.MInheritance#getTarget()
	 * @see #getMInheritance()
	 * @generated
	 */
	EReference getMInheritance_Target();

	/**
	 * Returns the meta object for class '{@link abstracts.MContainment <em>MContainment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MContainment</em>'.
	 * @see abstracts.MContainment
	 * @generated
	 */
	EClass getMContainment();

	/**
	 * Returns the meta object for the reference '{@link abstracts.MContainment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see abstracts.MContainment#getSource()
	 * @see #getMContainment()
	 * @generated
	 */
	EReference getMContainment_Source();

	/**
	 * Returns the meta object for the reference '{@link abstracts.MContainment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see abstracts.MContainment#getTarget()
	 * @see #getMContainment()
	 * @generated
	 */
	EReference getMContainment_Target();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MContainment#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see abstracts.MContainment#getMultiplicityTarget()
	 * @see #getMContainment()
	 * @generated
	 */
	EAttribute getMContainment_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MContainment#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see abstracts.MContainment#getSourceRole()
	 * @see #getMContainment()
	 * @generated
	 */
	EAttribute getMContainment_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MContainment#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see abstracts.MContainment#getTargetRole()
	 * @see #getMContainment()
	 * @generated
	 */
	EAttribute getMContainment_TargetRole();

	/**
	 * Returns the meta object for class '{@link abstracts.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAttribute</em>'.
	 * @see abstracts.MAttribute
	 * @generated
	 */
	EClass getMAttribute();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MAttribute#getName()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see abstracts.MAttribute#getDefaultValue()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see abstracts.MAttribute#getComments()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Comments();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see abstracts.MAttribute#isConstant()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Constant();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#isRemoveToInit <em>Remove To Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove To Init</em>'.
	 * @see abstracts.MAttribute#isRemoveToInit()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_RemoveToInit();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see abstracts.MAttribute#isPrimaryKey()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see abstracts.MAttribute#isNullable()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see abstracts.MAttribute#getType()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see abstracts.MAttribute#getSize()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Size();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MAttribute#isForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see abstracts.MAttribute#isForeignKey()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_ForeignKey();

	/**
	 * Returns the meta object for class '{@link abstracts.MFunction <em>MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFunction</em>'.
	 * @see abstracts.MFunction
	 * @generated
	 */
	EClass getMFunction();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see abstracts.MFunction#getName()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MFunction#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see abstracts.MFunction#getAccessModifier()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MFunction#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see abstracts.MFunction#getSemantics()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Semantics();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MFunction#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see abstracts.MFunction#getComments()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Comments();

	/**
	 * Returns the meta object for the attribute '{@link abstracts.MFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see abstracts.MFunction#getParameters()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Parameters();

	/**
	 * Returns the meta object for enum '{@link abstracts.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see abstracts.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractsFactory getAbstractsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link abstracts.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.ModelFactoryImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__NOMBRE = eINSTANCE.getModelFactory_Nombre();

		/**
		 * The meta object literal for the '<em><b>Ruta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_FACTORY__RUTA = eINSTANCE.getModelFactory_Ruta();

		/**
		 * The meta object literal for the '<em><b>Lst Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_PACKAGES = eINSTANCE.getModelFactory_LstPackages();

		/**
		 * The meta object literal for the '<em><b>Lst All Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_ALL_CLASS = eINSTANCE.getModelFactory_LstAllClass();

		/**
		 * The meta object literal for the '<em><b>Lst All Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_ALL_PACKAGE = eINSTANCE.getModelFactory_LstAllPackage();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MPackageImpl <em>MPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MPackageImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMPackage()
		 * @generated
		 */
		EClass MPACKAGE = eINSTANCE.getMPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPACKAGE__NAME = eINSTANCE.getMPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPACKAGE__PATH = eINSTANCE.getMPackage_Path();

		/**
		 * The meta object literal for the '<em><b>Lst MClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPACKAGE__LST_MCLASS = eINSTANCE.getMPackage_LstMClass();

		/**
		 * The meta object literal for the '<em><b>Lst MPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MPACKAGE__LST_MPACKAGE = eINSTANCE.getMPackage_LstMPackage();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MClassDiagramImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMClassDiagram()
		 * @generated
		 */
		EClass MCLASS_DIAGRAM = eINSTANCE.getMClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS_DIAGRAM__NAME = eINSTANCE.getMClassDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Lst MPackage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MPACKAGE = eINSTANCE.getMClassDiagram_LstMPackage();

		/**
		 * The meta object literal for the '<em><b>Lst MClass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MCLASS = eINSTANCE.getMClassDiagram_LstMClass();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MClassImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMClass()
		 * @generated
		 */
		EClass MCLASS = eINSTANCE.getMClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__NAME = eINSTANCE.getMClass_Name();

		/**
		 * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__ACCESS_MODIFIER = eINSTANCE.getMClass_AccessModifier();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__COMMENTS = eINSTANCE.getMClass_Comments();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__PATH = eINSTANCE.getMClass_Path();

		/**
		 * The meta object literal for the '<em><b>Lst MAssoctiation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MASSOCTIATION = eINSTANCE.getMClass_LstMAssoctiation();

		/**
		 * The meta object literal for the '<em><b>Lst MInheritance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MINHERITANCE = eINSTANCE.getMClass_LstMInheritance();

		/**
		 * The meta object literal for the '<em><b>Lst MContainment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MCONTAINMENT = eINSTANCE.getMClass_LstMContainment();

		/**
		 * The meta object literal for the '<em><b>Lst Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_ATTRIBUTES = eINSTANCE.getMClass_LstAttributes();

		/**
		 * The meta object literal for the '<em><b>Lst Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_FUNCTION = eINSTANCE.getMClass_LstFunction();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MAssociationImpl <em>MAssociation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MAssociationImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMAssociation()
		 * @generated
		 */
		EClass MASSOCIATION = eINSTANCE.getMAssociation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASSOCIATION__SOURCE = eINSTANCE.getMAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASSOCIATION__TARGET = eINSTANCE.getMAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSOCIATION__RELATIONSHIP_TYPE = eINSTANCE.getMAssociation_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSOCIATION__MULTIPLICITY_SOURCE = eINSTANCE.getMAssociation_MultiplicitySource();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSOCIATION__MULTIPLICITY_TARGET = eINSTANCE.getMAssociation_MultiplicityTarget();

		/**
		 * The meta object literal for the '<em><b>Source Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSOCIATION__SOURCE_ROLE = eINSTANCE.getMAssociation_SourceRole();

		/**
		 * The meta object literal for the '<em><b>Target Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSOCIATION__TARGET_ROLE = eINSTANCE.getMAssociation_TargetRole();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MInheritanceImpl <em>MInheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MInheritanceImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMInheritance()
		 * @generated
		 */
		EClass MINHERITANCE = eINSTANCE.getMInheritance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINHERITANCE__SOURCE = eINSTANCE.getMInheritance_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINHERITANCE__TARGET = eINSTANCE.getMInheritance_Target();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MContainmentImpl <em>MContainment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MContainmentImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMContainment()
		 * @generated
		 */
		EClass MCONTAINMENT = eINSTANCE.getMContainment();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONTAINMENT__SOURCE = eINSTANCE.getMContainment_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONTAINMENT__TARGET = eINSTANCE.getMContainment_Target();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCONTAINMENT__MULTIPLICITY_TARGET = eINSTANCE.getMContainment_MultiplicityTarget();

		/**
		 * The meta object literal for the '<em><b>Source Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCONTAINMENT__SOURCE_ROLE = eINSTANCE.getMContainment_SourceRole();

		/**
		 * The meta object literal for the '<em><b>Target Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCONTAINMENT__TARGET_ROLE = eINSTANCE.getMContainment_TargetRole();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MAttributeImpl <em>MAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MAttributeImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMAttribute()
		 * @generated
		 */
		EClass MATTRIBUTE = eINSTANCE.getMAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__NAME = eINSTANCE.getMAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getMAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__COMMENTS = eINSTANCE.getMAttribute_Comments();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__CONSTANT = eINSTANCE.getMAttribute_Constant();

		/**
		 * The meta object literal for the '<em><b>Remove To Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__REMOVE_TO_INIT = eINSTANCE.getMAttribute_RemoveToInit();

		/**
		 * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__PRIMARY_KEY = eINSTANCE.getMAttribute_PrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__NULLABLE = eINSTANCE.getMAttribute_Nullable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__TYPE = eINSTANCE.getMAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__SIZE = eINSTANCE.getMAttribute_Size();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__FOREIGN_KEY = eINSTANCE.getMAttribute_ForeignKey();

		/**
		 * The meta object literal for the '{@link abstracts.impl.MFunctionImpl <em>MFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.impl.MFunctionImpl
		 * @see abstracts.impl.AbstractsPackageImpl#getMFunction()
		 * @generated
		 */
		EClass MFUNCTION = eINSTANCE.getMFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__NAME = eINSTANCE.getMFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__ACCESS_MODIFIER = eINSTANCE.getMFunction_AccessModifier();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__SEMANTICS = eINSTANCE.getMFunction_Semantics();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__COMMENTS = eINSTANCE.getMFunction_Comments();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MFUNCTION__PARAMETERS = eINSTANCE.getMFunction_Parameters();

		/**
		 * The meta object literal for the '{@link abstracts.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see abstracts.Type
		 * @see abstracts.impl.AbstractsPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //AbstractsPackage
