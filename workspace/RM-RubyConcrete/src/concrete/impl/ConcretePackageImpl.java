/**
 */
package concrete.impl;

import concrete.ConcreteFactory;
import concrete.ConcretePackage;
import concrete.MAssociation;
import concrete.MAttribute;
import concrete.MClass;
import concrete.MClassDiagram;
import concrete.MContainment;
import concrete.MFunction;
import concrete.MInheritance;
import concrete.MPackage;
import concrete.ModelFactory;

import concrete.Type;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcretePackageImpl extends EPackageImpl implements ConcretePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mClassDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mInheritanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see concrete.ConcretePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcretePackageImpl() {
		super(eNS_URI, ConcreteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConcretePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcretePackage init() {
		if (isInited) return (ConcretePackage)EPackage.Registry.INSTANCE.getEPackage(ConcretePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConcretePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConcretePackageImpl theConcretePackage = registeredConcretePackage instanceof ConcretePackageImpl ? (ConcretePackageImpl)registeredConcretePackage : new ConcretePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConcretePackage.createPackageContents();

		// Initialize created meta-data
		theConcretePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcretePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcretePackage.eNS_URI, theConcretePackage);
		return theConcretePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelFactory_Nombre() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelFactory_Ruta() {
		return (EAttribute)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelFactory_LstMDiagrams() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMClassDiagram() {
		return mClassDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClassDiagram_Name() {
		return (EAttribute)mClassDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClassDiagram_Description() {
		return (EAttribute)mClassDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMPackage() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMClass() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMAssoctiation() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMInheritance() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClassDiagram_LstMContainment() {
		return (EReference)mClassDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMPackage() {
		return mPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMPackage_Name() {
		return (EAttribute)mPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMPackage_Path() {
		return (EAttribute)mPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMClass() {
		return mClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_Name() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_AccessModifier() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_Comments() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMClass_Path() {
		return (EAttribute)mClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClass_LstMAttribute() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMClass_LstMFunction() {
		return (EReference)mClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMAttribute() {
		return mAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Name() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_DefaultValue() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Comments() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Constant() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_RemoveToInit() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_PrimaryKey() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Nullable() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Type() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_Size() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAttribute_ForeignKey() {
		return (EAttribute)mAttributeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMAssociation() {
		return mAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMAssociation_Source() {
		return (EReference)mAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMAssociation_Target() {
		return (EReference)mAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAssociation_MultiplicitySource() {
		return (EAttribute)mAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAssociation_MultiplicityTarget() {
		return (EAttribute)mAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAssociation_SourceRole() {
		return (EAttribute)mAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAssociation_TargetRole() {
		return (EAttribute)mAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAssociation_Bidirectional() {
		return (EAttribute)mAssociationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMInheritance() {
		return mInheritanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMInheritance_Source() {
		return (EReference)mInheritanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMInheritance_Target() {
		return (EReference)mInheritanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMContainment() {
		return mContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMContainment_Source() {
		return (EReference)mContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMContainment_Target() {
		return (EReference)mContainmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMContainment_MultiplicityTarget() {
		return (EAttribute)mContainmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMContainment_SourceRole() {
		return (EAttribute)mContainmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMContainment_TargetRole() {
		return (EAttribute)mContainmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMFunction() {
		return mFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_Name() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_AccessModifier() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_Semantics() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_Comments() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMFunction_Parameters() {
		return (EAttribute)mFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcreteFactory getConcreteFactory() {
		return (ConcreteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__NOMBRE);
		createEAttribute(modelFactoryEClass, MODEL_FACTORY__RUTA);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LST_MDIAGRAMS);

		mClassDiagramEClass = createEClass(MCLASS_DIAGRAM);
		createEAttribute(mClassDiagramEClass, MCLASS_DIAGRAM__NAME);
		createEAttribute(mClassDiagramEClass, MCLASS_DIAGRAM__DESCRIPTION);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MPACKAGE);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MCLASS);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MASSOCTIATION);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MINHERITANCE);
		createEReference(mClassDiagramEClass, MCLASS_DIAGRAM__LST_MCONTAINMENT);

		mPackageEClass = createEClass(MPACKAGE);
		createEAttribute(mPackageEClass, MPACKAGE__NAME);
		createEAttribute(mPackageEClass, MPACKAGE__PATH);

		mClassEClass = createEClass(MCLASS);
		createEAttribute(mClassEClass, MCLASS__NAME);
		createEAttribute(mClassEClass, MCLASS__ACCESS_MODIFIER);
		createEAttribute(mClassEClass, MCLASS__COMMENTS);
		createEAttribute(mClassEClass, MCLASS__PATH);
		createEReference(mClassEClass, MCLASS__LST_MATTRIBUTE);
		createEReference(mClassEClass, MCLASS__LST_MFUNCTION);

		mAttributeEClass = createEClass(MATTRIBUTE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__NAME);
		createEAttribute(mAttributeEClass, MATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__COMMENTS);
		createEAttribute(mAttributeEClass, MATTRIBUTE__CONSTANT);
		createEAttribute(mAttributeEClass, MATTRIBUTE__REMOVE_TO_INIT);
		createEAttribute(mAttributeEClass, MATTRIBUTE__PRIMARY_KEY);
		createEAttribute(mAttributeEClass, MATTRIBUTE__NULLABLE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__TYPE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__SIZE);
		createEAttribute(mAttributeEClass, MATTRIBUTE__FOREIGN_KEY);

		mAssociationEClass = createEClass(MASSOCIATION);
		createEReference(mAssociationEClass, MASSOCIATION__SOURCE);
		createEReference(mAssociationEClass, MASSOCIATION__TARGET);
		createEAttribute(mAssociationEClass, MASSOCIATION__MULTIPLICITY_SOURCE);
		createEAttribute(mAssociationEClass, MASSOCIATION__MULTIPLICITY_TARGET);
		createEAttribute(mAssociationEClass, MASSOCIATION__SOURCE_ROLE);
		createEAttribute(mAssociationEClass, MASSOCIATION__TARGET_ROLE);
		createEAttribute(mAssociationEClass, MASSOCIATION__BIDIRECTIONAL);

		mInheritanceEClass = createEClass(MINHERITANCE);
		createEReference(mInheritanceEClass, MINHERITANCE__SOURCE);
		createEReference(mInheritanceEClass, MINHERITANCE__TARGET);

		mContainmentEClass = createEClass(MCONTAINMENT);
		createEReference(mContainmentEClass, MCONTAINMENT__SOURCE);
		createEReference(mContainmentEClass, MCONTAINMENT__TARGET);
		createEAttribute(mContainmentEClass, MCONTAINMENT__MULTIPLICITY_TARGET);
		createEAttribute(mContainmentEClass, MCONTAINMENT__SOURCE_ROLE);
		createEAttribute(mContainmentEClass, MCONTAINMENT__TARGET_ROLE);

		mFunctionEClass = createEClass(MFUNCTION);
		createEAttribute(mFunctionEClass, MFUNCTION__NAME);
		createEAttribute(mFunctionEClass, MFUNCTION__ACCESS_MODIFIER);
		createEAttribute(mFunctionEClass, MFUNCTION__SEMANTICS);
		createEAttribute(mFunctionEClass, MFUNCTION__COMMENTS);
		createEAttribute(mFunctionEClass, MFUNCTION__PARAMETERS);

		// Create enums
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelFactory_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelFactory_Ruta(), ecorePackage.getEString(), "ruta", null, 0, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_LstMDiagrams(), this.getMClassDiagram(), null, "lstMDiagrams", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mClassDiagramEClass, MClassDiagram.class, "MClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMClassDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClassDiagram_Description(), ecorePackage.getEString(), "description", null, 0, 1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMPackage(), this.getMPackage(), null, "lstMPackage", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMClass(), this.getMClass(), null, "lstMClass", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMAssoctiation(), this.getMAssociation(), null, "lstMAssoctiation", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMInheritance(), this.getMInheritance(), null, "lstMInheritance", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClassDiagram_LstMContainment(), this.getMContainment(), null, "lstMContainment", null, 0, -1, MClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPackageEClass, MPackage.class, "MPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPackage_Path(), ecorePackage.getEString(), "path", null, 0, 1, MPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mClassEClass, MClass.class, "MClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_AccessModifier(), ecorePackage.getEString(), "accessModifier", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMClass_Path(), ecorePackage.getEString(), "path", null, 0, 1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMAttribute(), this.getMAttribute(), null, "lstMAttribute", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMClass_LstMFunction(), this.getMFunction(), null, "lstMFunction", null, 0, -1, MClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAttributeEClass, MAttribute.class, "MAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_Constant(), ecorePackage.getEBoolean(), "constant", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_RemoveToInit(), ecorePackage.getEBoolean(), "removeToInit", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_Type(), this.getType(), "type", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_Size(), ecorePackage.getEString(), "size", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAttribute_ForeignKey(), ecorePackage.getEBoolean(), "foreignKey", null, 0, 1, MAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mAssociationEClass, MAssociation.class, "MAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMAssociation_Source(), this.getMClass(), null, "source", null, 0, 1, MAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMAssociation_Target(), this.getMClass(), null, "target", null, 0, 1, MAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAssociation_MultiplicitySource(), ecorePackage.getEString(), "multiplicitySource", null, 0, 1, MAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAssociation_MultiplicityTarget(), ecorePackage.getEString(), "multiplicityTarget", null, 0, 1, MAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAssociation_SourceRole(), ecorePackage.getEString(), "sourceRole", null, 0, 1, MAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAssociation_TargetRole(), ecorePackage.getEString(), "targetRole", null, 0, 1, MAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMAssociation_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", null, 0, 1, MAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mInheritanceEClass, MInheritance.class, "MInheritance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMInheritance_Source(), this.getMClass(), null, "source", null, 0, 1, MInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMInheritance_Target(), this.getMClass(), null, "target", null, 0, 1, MInheritance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mContainmentEClass, MContainment.class, "MContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMContainment_Source(), this.getMClass(), null, "source", null, 0, 1, MContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMContainment_Target(), this.getMClass(), null, "target", null, 0, 1, MContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMContainment_MultiplicityTarget(), ecorePackage.getEString(), "multiplicityTarget", null, 0, 1, MContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMContainment_SourceRole(), ecorePackage.getEString(), "sourceRole", null, 0, 1, MContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMContainment_TargetRole(), ecorePackage.getEString(), "targetRole", null, 0, 1, MContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mFunctionEClass, MFunction.class, "MFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_AccessModifier(), ecorePackage.getEString(), "accessModifier", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Semantics(), ecorePackage.getEString(), "semantics", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Comments(), ecorePackage.getEString(), "comments", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMFunction_Parameters(), ecorePackage.getEString(), "parameters", null, 0, 1, MFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.NUMERIC);
		addEEnumLiteral(typeEEnum, Type.VARCHAR);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.INTEGER);
		addEEnumLiteral(typeEEnum, Type.DATE);
		addEEnumLiteral(typeEEnum, Type.YEAR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (mClassDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (mPackageEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "color", "255,240,237"
		   });
		addAnnotation
		  (mClassEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rounded",
			   "label.layout", "center",
			   "color", "255,216,208",
			   "tool.description", "A\u00f1ade una clase al diagrama"
		   });
		addAnnotation
		  (mAttributeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "label.icon", "false",
			   "label.pattern", "{0}",
			   "color", "255,216,208",
			   "tool.description", "A\u00f1ade un atributo a una clase"
		   });
		addAnnotation
		  (mFunctionEClass,
		   source,
		   new String[] {
			   "label", "name,parameters",
			   "figure", "rectangle",
			   "label.icon", "false",
			   "label.pattern", "{0}({1})",
			   "color", "255,216,208",
			   "tool.description", "A\u00f1ade una funci\u00f3n a una clase"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getMClass_LstMAttribute(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getMClass_LstMFunction(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (mAssociationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "color", "255,0,0"
		   });
		addAnnotation
		  (mInheritanceEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "target.decoration", "closedarrow",
			   "color", "255,0,0"
		   });
		addAnnotation
		  (mContainmentEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "1",
			   "target.decoration", "filledrhomb",
			   "color", "255,0,0"
		   });
	}

} //ConcretePackageImpl
