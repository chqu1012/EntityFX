/**
 */
package de.dc.entity.model.impl;

import de.dc.entity.model.AbstractModel;
import de.dc.entity.model.Binding;
import de.dc.entity.model.Entity;
import de.dc.entity.model.FXControl;
import de.dc.entity.model.Field;
import de.dc.entity.model.FxmlPage;
import de.dc.entity.model.Metro;
import de.dc.entity.model.ModelFactory;
import de.dc.entity.model.ModelPackage;
import de.dc.entity.model.NavigationItem;
import de.dc.entity.model.Page;
import de.dc.entity.model.PageContainer;
import de.dc.entity.model.ProjectFX;
import de.dc.entity.model.Repository;
import de.dc.entity.model.SQLStatement;
import de.dc.entity.model.SpringMetro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectFXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass springMetroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxmlPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingEEnum = null;

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
	 * @see de.dc.entity.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited)
			return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl
				? (ModelPackageImpl) registeredModelPackage
				: new ModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectFX() {
		return projectFXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectFX_Elements() {
		return (EReference) projectFXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractModel() {
		return abstractModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractModel_PackagePath() {
		return (EAttribute) abstractModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpringMetro() {
		return springMetroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpringMetro_Name() {
		return (EAttribute) springMetroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpringMetro_Title() {
		return (EAttribute) springMetroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpringMetro_Subtitle() {
		return (EAttribute) springMetroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpringMetro_Elements() {
		return (EReference) springMetroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetro() {
		return metroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetro_Name() {
		return (EAttribute) metroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetro_Title() {
		return (EAttribute) metroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetro_Subtitle() {
		return (EAttribute) metroEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetro_MainNavigationItem() {
		return (EReference) metroEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetro_NavigationItems() {
		return (EReference) metroEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationItem() {
		return navigationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNavigationItem_Name() {
		return (EAttribute) navigationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageContainer() {
		return pageContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPageContainer_Pages() {
		return (EReference) pageContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPage_Controller() {
		return (EReference) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFxmlPage() {
		return fxmlPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFxmlPage_Fxml() {
		return (EAttribute) fxmlPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_UseSpring() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_UseHistory() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_UseFormular() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_UseTableView() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_ShowDetailsPanel() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_ShowSearchPanel() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_GenerateDemo() {
		return (EAttribute) entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Field() {
		return (EReference) entityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntity_Repository() {
		return (EReference) entityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepository_JdbcUrl() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepository_GenerateDummyInsert() {
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Statement() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSQLStatement() {
		return sqlStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSQLStatement_Name() {
		return (EAttribute) sqlStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSQLStatement_Query() {
		return (EAttribute) sqlStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSQLStatement_ReturnValue() {
		return (EReference) sqlStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Name() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_Required() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_UseByTableView() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_UseByRepository() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getField_IsClob() {
		return (EAttribute) fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Datatype() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getField_Control() {
		return (EReference) fieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFXControl() {
		return fxControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXControl_Name() {
		return (EAttribute) fxControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXControl_Tooltip() {
		return (EAttribute) fxControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXControl_Description() {
		return (EAttribute) fxControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXControl_Binding() {
		return (EAttribute) fxControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFXControl_ColumnWidth() {
		return (EAttribute) fxControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFXControl_Control() {
		return (EReference) fxControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinding() {
		return bindingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelFactory getModelFactory() {
		return (ModelFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		projectFXEClass = createEClass(PROJECT_FX);
		createEReference(projectFXEClass, PROJECT_FX__ELEMENTS);

		abstractModelEClass = createEClass(ABSTRACT_MODEL);
		createEAttribute(abstractModelEClass, ABSTRACT_MODEL__PACKAGE_PATH);

		springMetroEClass = createEClass(SPRING_METRO);
		createEAttribute(springMetroEClass, SPRING_METRO__NAME);
		createEAttribute(springMetroEClass, SPRING_METRO__TITLE);
		createEAttribute(springMetroEClass, SPRING_METRO__SUBTITLE);
		createEReference(springMetroEClass, SPRING_METRO__ELEMENTS);

		metroEClass = createEClass(METRO);
		createEAttribute(metroEClass, METRO__NAME);
		createEAttribute(metroEClass, METRO__TITLE);
		createEAttribute(metroEClass, METRO__SUBTITLE);
		createEReference(metroEClass, METRO__MAIN_NAVIGATION_ITEM);
		createEReference(metroEClass, METRO__NAVIGATION_ITEMS);

		navigationItemEClass = createEClass(NAVIGATION_ITEM);
		createEAttribute(navigationItemEClass, NAVIGATION_ITEM__NAME);

		pageContainerEClass = createEClass(PAGE_CONTAINER);
		createEReference(pageContainerEClass, PAGE_CONTAINER__PAGES);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__CONTROLLER);

		fxmlPageEClass = createEClass(FXML_PAGE);
		createEAttribute(fxmlPageEClass, FXML_PAGE__FXML);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__USE_SPRING);
		createEAttribute(entityEClass, ENTITY__USE_HISTORY);
		createEAttribute(entityEClass, ENTITY__USE_FORMULAR);
		createEAttribute(entityEClass, ENTITY__USE_TABLE_VIEW);
		createEAttribute(entityEClass, ENTITY__SHOW_DETAILS_PANEL);
		createEAttribute(entityEClass, ENTITY__SHOW_SEARCH_PANEL);
		createEAttribute(entityEClass, ENTITY__GENERATE_DEMO);
		createEReference(entityEClass, ENTITY__FIELD);
		createEReference(entityEClass, ENTITY__REPOSITORY);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__JDBC_URL);
		createEAttribute(repositoryEClass, REPOSITORY__GENERATE_DUMMY_INSERT);
		createEReference(repositoryEClass, REPOSITORY__STATEMENT);

		sqlStatementEClass = createEClass(SQL_STATEMENT);
		createEAttribute(sqlStatementEClass, SQL_STATEMENT__NAME);
		createEAttribute(sqlStatementEClass, SQL_STATEMENT__QUERY);
		createEReference(sqlStatementEClass, SQL_STATEMENT__RETURN_VALUE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__REQUIRED);
		createEAttribute(fieldEClass, FIELD__USE_BY_TABLE_VIEW);
		createEAttribute(fieldEClass, FIELD__USE_BY_REPOSITORY);
		createEAttribute(fieldEClass, FIELD__IS_CLOB);
		createEReference(fieldEClass, FIELD__DATATYPE);
		createEReference(fieldEClass, FIELD__CONTROL);

		fxControlEClass = createEClass(FX_CONTROL);
		createEAttribute(fxControlEClass, FX_CONTROL__NAME);
		createEAttribute(fxControlEClass, FX_CONTROL__TOOLTIP);
		createEAttribute(fxControlEClass, FX_CONTROL__DESCRIPTION);
		createEAttribute(fxControlEClass, FX_CONTROL__BINDING);
		createEAttribute(fxControlEClass, FX_CONTROL__COLUMN_WIDTH);
		createEReference(fxControlEClass, FX_CONTROL__CONTROL);

		// Create enums
		bindingEEnum = createEEnum(BINDING);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		springMetroEClass.getESuperTypes().add(this.getAbstractModel());
		metroEClass.getESuperTypes().add(this.getAbstractModel());
		pageContainerEClass.getESuperTypes().add(this.getAbstractModel());
		pageContainerEClass.getESuperTypes().add(this.getNavigationItem());
		pageEClass.getESuperTypes().add(this.getAbstractModel());
		pageEClass.getESuperTypes().add(this.getNavigationItem());
		fxmlPageEClass.getESuperTypes().add(this.getPage());
		entityEClass.getESuperTypes().add(this.getAbstractModel());
		entityEClass.getESuperTypes().add(this.getNavigationItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectFXEClass, ProjectFX.class, "ProjectFX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProjectFX_Elements(), this.getAbstractModel(), null, "elements", null, 0, 1, ProjectFX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractModelEClass, AbstractModel.class, "AbstractModel", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractModel_PackagePath(), theEcorePackage.getEString(), "packagePath", null, 0, 1,
				AbstractModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(springMetroEClass, SpringMetro.class, "SpringMetro", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpringMetro_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SpringMetro.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpringMetro_Title(), theEcorePackage.getEString(), "title", null, 0, 1, SpringMetro.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpringMetro_Subtitle(), theEcorePackage.getEString(), "subtitle", null, 0, 1,
				SpringMetro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSpringMetro_Elements(), this.getNavigationItem(), null, "elements", null, 0, -1,
				SpringMetro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroEClass, Metro.class, "Metro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetro_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Metro.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetro_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Metro.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetro_Subtitle(), theEcorePackage.getEString(), "subtitle", null, 0, 1, Metro.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMetro_MainNavigationItem(), this.getNavigationItem(), null, "mainNavigationItem", null, 0, 1,
				Metro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetro_NavigationItems(), this.getNavigationItem(), null, "navigationItems", null, 0, -1,
				Metro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationItemEClass, NavigationItem.class, "NavigationItem", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationItem_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NavigationItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(pageContainerEClass, PageContainer.class, "PageContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageContainer_Pages(), this.getPage(), null, "pages", null, 0, -1, PageContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Controller(), theTypesPackage.getJvmTypeReference(), null, "controller", null, 0, 1,
				Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxmlPageEClass, FxmlPage.class, "FxmlPage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFxmlPage_Fxml(), theEcorePackage.getEString(), "fxml", null, 0, 1, FxmlPage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_UseSpring(), theEcorePackage.getEBoolean(), "useSpring", "true", 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEntity_UseHistory(), theEcorePackage.getEBoolean(), "useHistory", "true", 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEntity_UseFormular(), theEcorePackage.getEBoolean(), "useFormular", "true", 0, 1,
				Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_UseTableView(), theEcorePackage.getEBoolean(), "useTableView", "true", 0, 1,
				Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_ShowDetailsPanel(), theEcorePackage.getEBoolean(), "showDetailsPanel", "true", 0, 1,
				Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_ShowSearchPanel(), theEcorePackage.getEBoolean(), "showSearchPanel", "true", 0, 1,
				Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_GenerateDemo(), theEcorePackage.getEBoolean(), "generateDemo", "true", 0, 1,
				Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Field(), this.getField(), null, "field", null, 0, -1, Entity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEntity_Repository(), this.getRepository(), null, "repository", null, 0, 1, Entity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_JdbcUrl(), theEcorePackage.getEString(), "jdbcUrl", null, 0, 1, Repository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepository_GenerateDummyInsert(), theEcorePackage.getEBoolean(), "generateDummyInsert",
				"false", 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Statement(), this.getSQLStatement(), null, "statement", null, 0, -1,
				Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlStatementEClass, SQLStatement.class, "SQLStatement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSQLStatement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SQLStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSQLStatement_Query(), theEcorePackage.getEString(), "query", null, 0, 1, SQLStatement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSQLStatement_ReturnValue(), theTypesPackage.getJvmTypeReference(), null, "returnValue", null,
				0, 1, SQLStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Required(), theEcorePackage.getEBoolean(), "required", "false", 0, 1, Field.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getField_UseByTableView(), theEcorePackage.getEBoolean(), "useByTableView", "true", 0, 1,
				Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_UseByRepository(), theEcorePackage.getEBoolean(), "useByRepository", "true", 0, 1,
				Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_IsClob(), theEcorePackage.getEBoolean(), "isClob", "false", 0, 1, Field.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getField_Datatype(), theTypesPackage.getJvmTypeReference(), null, "datatype", null, 0, 1,
				Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Control(), this.getFXControl(), null, "control", null, 0, 1, Field.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fxControlEClass, FXControl.class, "FXControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXControl_Name(), theEcorePackage.getEString(), "name", null, 0, 1, FXControl.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXControl_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, FXControl.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFXControl_Description(), theEcorePackage.getEString(), "description", null, 0, 1,
				FXControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXControl_Binding(), this.getBinding(), "binding", null, 0, 1, FXControl.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXControl_ColumnWidth(), theEcorePackage.getEDouble(), "columnWidth", "100.0", 0, 1,
				FXControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFXControl_Control(), theTypesPackage.getJvmTypeReference(), null, "control", null, 0, 1,
				FXControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingEEnum, Binding.class, "Binding");
		addEEnumLiteral(bindingEEnum, Binding.TEXT_PROPERTY);
		addEEnumLiteral(bindingEEnum, Binding.VALUE_PROPERTY);
		addEEnumLiteral(bindingEEnum, Binding.LOCAL_DATE_TIME_PROPERTY);
		addEEnumLiteral(bindingEEnum, Binding.LOCAL_DATE_PROPERTY);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
