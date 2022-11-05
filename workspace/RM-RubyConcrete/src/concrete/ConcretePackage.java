/**
 */
package concrete;

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
 * @see concrete.ConcreteFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface ConcretePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concrete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "concrete";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concrete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConcretePackage eINSTANCE = concrete.impl.ConcretePackageImpl.init();

	/**
	 * The meta object id for the '{@link concrete.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.ModelFactoryImpl
	 * @see concrete.impl.ConcretePackageImpl#getModelFactory()
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
	 * The feature id for the '<em><b>Lst MDiagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_MDIAGRAMS = 2;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link concrete.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MClassDiagramImpl
	 * @see concrete.impl.ConcretePackageImpl#getMClassDiagram()
	 * @generated
	 */
	int MCLASS_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Lst MPackage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MPACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Lst MClass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MCLASS = 3;

	/**
	 * The feature id for the '<em><b>Lst MAssoctiation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MASSOCTIATION = 4;

	/**
	 * The feature id for the '<em><b>Lst MInheritance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MINHERITANCE = 5;

	/**
	 * The feature id for the '<em><b>Lst MContainment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM__LST_MCONTAINMENT = 6;

	/**
	 * The number of structural features of the '<em>MClass Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_DIAGRAM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link concrete.impl.MPackageImpl <em>MPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MPackageImpl
	 * @see concrete.impl.ConcretePackageImpl#getMPackage()
	 * @generated
	 */
	int MPACKAGE = 2;

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
	 * The number of structural features of the '<em>MPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPACKAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link concrete.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MClassImpl
	 * @see concrete.impl.ConcretePackageImpl#getMClass()
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
	 * The feature id for the '<em><b>Lst MAttribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Lst MFunction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LST_MFUNCTION = 5;

	/**
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link concrete.impl.MAttributeImpl <em>MAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MAttributeImpl
	 * @see concrete.impl.ConcretePackageImpl#getMAttribute()
	 * @generated
	 */
	int MATTRIBUTE = 4;

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
	 * The meta object id for the '{@link concrete.impl.MAssociationImpl <em>MAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MAssociationImpl
	 * @see concrete.impl.ConcretePackageImpl#getMAssociation()
	 * @generated
	 */
	int MASSOCIATION = 5;

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
	 * The feature id for the '<em><b>Multiplicity Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__MULTIPLICITY_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Multiplicity Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__MULTIPLICITY_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Source Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__SOURCE_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Target Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__TARGET_ROLE = 5;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION__BIDIRECTIONAL = 6;

	/**
	 * The number of structural features of the '<em>MAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASSOCIATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link concrete.impl.MInheritanceImpl <em>MInheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MInheritanceImpl
	 * @see concrete.impl.ConcretePackageImpl#getMInheritance()
	 * @generated
	 */
	int MINHERITANCE = 6;

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
	 * The meta object id for the '{@link concrete.impl.MContainmentImpl <em>MContainment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MContainmentImpl
	 * @see concrete.impl.ConcretePackageImpl#getMContainment()
	 * @generated
	 */
	int MCONTAINMENT = 7;

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
	 * The meta object id for the '{@link concrete.impl.MFunctionImpl <em>MFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.impl.MFunctionImpl
	 * @see concrete.impl.ConcretePackageImpl#getMFunction()
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
	 * The meta object id for the '{@link concrete.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see concrete.Type
	 * @see concrete.impl.ConcretePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 9;


	/**
	 * Returns the meta object for class '{@link concrete.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see concrete.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link concrete.ModelFactory#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see concrete.ModelFactory#getNombre()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link concrete.ModelFactory#getRuta <em>Ruta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruta</em>'.
	 * @see concrete.ModelFactory#getRuta()
	 * @see #getModelFactory()
	 * @generated
	 */
	EAttribute getModelFactory_Ruta();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.ModelFactory#getLstMDiagrams <em>Lst MDiagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MDiagrams</em>'.
	 * @see concrete.ModelFactory#getLstMDiagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstMDiagrams();

	/**
	 * Returns the meta object for class '{@link concrete.MClassDiagram <em>MClass Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass Diagram</em>'.
	 * @see concrete.MClassDiagram
	 * @generated
	 */
	EClass getMClassDiagram();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClassDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MClassDiagram#getName()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EAttribute getMClassDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClassDiagram#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see concrete.MClassDiagram#getDescription()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EAttribute getMClassDiagram_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMPackage <em>Lst MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MPackage</em>'.
	 * @see concrete.MClassDiagram#getLstMPackage()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMClass <em>Lst MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MClass</em>'.
	 * @see concrete.MClassDiagram#getLstMClass()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMClass();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMAssoctiation <em>Lst MAssoctiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MAssoctiation</em>'.
	 * @see concrete.MClassDiagram#getLstMAssoctiation()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMAssoctiation();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMInheritance <em>Lst MInheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MInheritance</em>'.
	 * @see concrete.MClassDiagram#getLstMInheritance()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMInheritance();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClassDiagram#getLstMContainment <em>Lst MContainment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MContainment</em>'.
	 * @see concrete.MClassDiagram#getLstMContainment()
	 * @see #getMClassDiagram()
	 * @generated
	 */
	EReference getMClassDiagram_LstMContainment();

	/**
	 * Returns the meta object for class '{@link concrete.MPackage <em>MPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPackage</em>'.
	 * @see concrete.MPackage
	 * @generated
	 */
	EClass getMPackage();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MPackage#getName()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concrete.MPackage#getPath()
	 * @see #getMPackage()
	 * @generated
	 */
	EAttribute getMPackage_Path();

	/**
	 * Returns the meta object for class '{@link concrete.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see concrete.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MClass#getName()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see concrete.MClass#getAccessModifier()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see concrete.MClass#getComments()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Comments();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MClass#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see concrete.MClass#getPath()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClass#getLstMAttribute <em>Lst MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MAttribute</em>'.
	 * @see concrete.MClass#getLstMAttribute()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link concrete.MClass#getLstMFunction <em>Lst MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst MFunction</em>'.
	 * @see concrete.MClass#getLstMFunction()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_LstMFunction();

	/**
	 * Returns the meta object for class '{@link concrete.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAttribute</em>'.
	 * @see concrete.MAttribute
	 * @generated
	 */
	EClass getMAttribute();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MAttribute#getName()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see concrete.MAttribute#getDefaultValue()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see concrete.MAttribute#getComments()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Comments();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see concrete.MAttribute#isConstant()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Constant();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#isRemoveToInit <em>Remove To Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove To Init</em>'.
	 * @see concrete.MAttribute#isRemoveToInit()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_RemoveToInit();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#isPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key</em>'.
	 * @see concrete.MAttribute#isPrimaryKey()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_PrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see concrete.MAttribute#isNullable()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see concrete.MAttribute#getType()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see concrete.MAttribute#getSize()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Size();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAttribute#isForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreign Key</em>'.
	 * @see concrete.MAttribute#isForeignKey()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_ForeignKey();

	/**
	 * Returns the meta object for class '{@link concrete.MAssociation <em>MAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAssociation</em>'.
	 * @see concrete.MAssociation
	 * @generated
	 */
	EClass getMAssociation();

	/**
	 * Returns the meta object for the reference '{@link concrete.MAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concrete.MAssociation#getSource()
	 * @see #getMAssociation()
	 * @generated
	 */
	EReference getMAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link concrete.MAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concrete.MAssociation#getTarget()
	 * @see #getMAssociation()
	 * @generated
	 */
	EReference getMAssociation_Target();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAssociation#getMultiplicitySource <em>Multiplicity Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Source</em>'.
	 * @see concrete.MAssociation#getMultiplicitySource()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_MultiplicitySource();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAssociation#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see concrete.MAssociation#getMultiplicityTarget()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAssociation#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see concrete.MAssociation#getSourceRole()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAssociation#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see concrete.MAssociation#getTargetRole()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_TargetRole();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MAssociation#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see concrete.MAssociation#isBidirectional()
	 * @see #getMAssociation()
	 * @generated
	 */
	EAttribute getMAssociation_Bidirectional();

	/**
	 * Returns the meta object for class '{@link concrete.MInheritance <em>MInheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MInheritance</em>'.
	 * @see concrete.MInheritance
	 * @generated
	 */
	EClass getMInheritance();

	/**
	 * Returns the meta object for the reference '{@link concrete.MInheritance#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concrete.MInheritance#getSource()
	 * @see #getMInheritance()
	 * @generated
	 */
	EReference getMInheritance_Source();

	/**
	 * Returns the meta object for the reference '{@link concrete.MInheritance#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concrete.MInheritance#getTarget()
	 * @see #getMInheritance()
	 * @generated
	 */
	EReference getMInheritance_Target();

	/**
	 * Returns the meta object for class '{@link concrete.MContainment <em>MContainment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MContainment</em>'.
	 * @see concrete.MContainment
	 * @generated
	 */
	EClass getMContainment();

	/**
	 * Returns the meta object for the reference '{@link concrete.MContainment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see concrete.MContainment#getSource()
	 * @see #getMContainment()
	 * @generated
	 */
	EReference getMContainment_Source();

	/**
	 * Returns the meta object for the reference '{@link concrete.MContainment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see concrete.MContainment#getTarget()
	 * @see #getMContainment()
	 * @generated
	 */
	EReference getMContainment_Target();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MContainment#getMultiplicityTarget <em>Multiplicity Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity Target</em>'.
	 * @see concrete.MContainment#getMultiplicityTarget()
	 * @see #getMContainment()
	 * @generated
	 */
	EAttribute getMContainment_MultiplicityTarget();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MContainment#getSourceRole <em>Source Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Role</em>'.
	 * @see concrete.MContainment#getSourceRole()
	 * @see #getMContainment()
	 * @generated
	 */
	EAttribute getMContainment_SourceRole();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MContainment#getTargetRole <em>Target Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Role</em>'.
	 * @see concrete.MContainment#getTargetRole()
	 * @see #getMContainment()
	 * @generated
	 */
	EAttribute getMContainment_TargetRole();

	/**
	 * Returns the meta object for class '{@link concrete.MFunction <em>MFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MFunction</em>'.
	 * @see concrete.MFunction
	 * @generated
	 */
	EClass getMFunction();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see concrete.MFunction#getName()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Name();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getAccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Modifier</em>'.
	 * @see concrete.MFunction#getAccessModifier()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_AccessModifier();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see concrete.MFunction#getSemantics()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Semantics();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see concrete.MFunction#getComments()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Comments();

	/**
	 * Returns the meta object for the attribute '{@link concrete.MFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see concrete.MFunction#getParameters()
	 * @see #getMFunction()
	 * @generated
	 */
	EAttribute getMFunction_Parameters();

	/**
	 * Returns the meta object for enum '{@link concrete.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see concrete.Type
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
	ConcreteFactory getConcreteFactory();

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
		 * The meta object literal for the '{@link concrete.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.ModelFactoryImpl
		 * @see concrete.impl.ConcretePackageImpl#getModelFactory()
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
		 * The meta object literal for the '<em><b>Lst MDiagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_MDIAGRAMS = eINSTANCE.getModelFactory_LstMDiagrams();

		/**
		 * The meta object literal for the '{@link concrete.impl.MClassDiagramImpl <em>MClass Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MClassDiagramImpl
		 * @see concrete.impl.ConcretePackageImpl#getMClassDiagram()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS_DIAGRAM__DESCRIPTION = eINSTANCE.getMClassDiagram_Description();

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
		 * The meta object literal for the '<em><b>Lst MAssoctiation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MASSOCTIATION = eINSTANCE.getMClassDiagram_LstMAssoctiation();

		/**
		 * The meta object literal for the '<em><b>Lst MInheritance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MINHERITANCE = eINSTANCE.getMClassDiagram_LstMInheritance();

		/**
		 * The meta object literal for the '<em><b>Lst MContainment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS_DIAGRAM__LST_MCONTAINMENT = eINSTANCE.getMClassDiagram_LstMContainment();

		/**
		 * The meta object literal for the '{@link concrete.impl.MPackageImpl <em>MPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MPackageImpl
		 * @see concrete.impl.ConcretePackageImpl#getMPackage()
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
		 * The meta object literal for the '{@link concrete.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MClassImpl
		 * @see concrete.impl.ConcretePackageImpl#getMClass()
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
		 * The meta object literal for the '<em><b>Lst MAttribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MATTRIBUTE = eINSTANCE.getMClass_LstMAttribute();

		/**
		 * The meta object literal for the '<em><b>Lst MFunction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__LST_MFUNCTION = eINSTANCE.getMClass_LstMFunction();

		/**
		 * The meta object literal for the '{@link concrete.impl.MAttributeImpl <em>MAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MAttributeImpl
		 * @see concrete.impl.ConcretePackageImpl#getMAttribute()
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
		 * The meta object literal for the '{@link concrete.impl.MAssociationImpl <em>MAssociation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MAssociationImpl
		 * @see concrete.impl.ConcretePackageImpl#getMAssociation()
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
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASSOCIATION__BIDIRECTIONAL = eINSTANCE.getMAssociation_Bidirectional();

		/**
		 * The meta object literal for the '{@link concrete.impl.MInheritanceImpl <em>MInheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MInheritanceImpl
		 * @see concrete.impl.ConcretePackageImpl#getMInheritance()
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
		 * The meta object literal for the '{@link concrete.impl.MContainmentImpl <em>MContainment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MContainmentImpl
		 * @see concrete.impl.ConcretePackageImpl#getMContainment()
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
		 * The meta object literal for the '{@link concrete.impl.MFunctionImpl <em>MFunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.impl.MFunctionImpl
		 * @see concrete.impl.ConcretePackageImpl#getMFunction()
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
		 * The meta object literal for the '{@link concrete.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see concrete.Type
		 * @see concrete.impl.ConcretePackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //ConcretePackage
