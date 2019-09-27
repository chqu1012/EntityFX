/**
 */
package de.dc.entity.model;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.entity.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.frateranatis.org/entity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = de.dc.entity.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.ProjectFXImpl <em>Project FX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.ProjectFXImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getProjectFX()
	 * @generated
	 */
	int PROJECT_FX = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Project FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Project FX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.AbstractModelImpl <em>Abstract Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.AbstractModelImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getAbstractModel()
	 * @generated
	 */
	int ABSTRACT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL__PACKAGE_PATH = 0;

	/**
	 * The number of structural features of the '<em>Abstract Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.SpringMetroImpl <em>Spring Metro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.SpringMetroImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getSpringMetro()
	 * @generated
	 */
	int SPRING_METRO = 2;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_METRO__PACKAGE_PATH = ABSTRACT_MODEL__PACKAGE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_METRO__NAME = ABSTRACT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_METRO__TITLE = ABSTRACT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_METRO__SUBTITLE = ABSTRACT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_METRO__ELEMENTS = ABSTRACT_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Spring Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_METRO_FEATURE_COUNT = ABSTRACT_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Spring Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPRING_METRO_OPERATION_COUNT = ABSTRACT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.MetroImpl <em>Metro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.MetroImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getMetro()
	 * @generated
	 */
	int METRO = 3;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO__PACKAGE_PATH = ABSTRACT_MODEL__PACKAGE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO__NAME = ABSTRACT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO__TITLE = ABSTRACT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO__SUBTITLE = ABSTRACT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Navigation Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO__MAIN_NAVIGATION_ITEM = ABSTRACT_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Navigation Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO__NAVIGATION_ITEMS = ABSTRACT_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_FEATURE_COUNT = ABSTRACT_MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Metro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_OPERATION_COUNT = ABSTRACT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.NavigationItemImpl <em>Navigation Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.NavigationItemImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getNavigationItem()
	 * @generated
	 */
	int NAVIGATION_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Navigation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Navigation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.PageContainerImpl <em>Page Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.PageContainerImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getPageContainer()
	 * @generated
	 */
	int PAGE_CONTAINER = 5;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__PACKAGE_PATH = ABSTRACT_MODEL__PACKAGE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__NAME = ABSTRACT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER__PAGES = ABSTRACT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER_FEATURE_COUNT = ABSTRACT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Page Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTAINER_OPERATION_COUNT = ABSTRACT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.PageImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 6;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PACKAGE_PATH = ABSTRACT_MODEL__PACKAGE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = ABSTRACT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTROLLER = ABSTRACT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = ABSTRACT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = ABSTRACT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.FxmlPageImpl <em>Fxml Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.FxmlPageImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getFxmlPage()
	 * @generated
	 */
	int FXML_PAGE = 7;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXML_PAGE__PACKAGE_PATH = PAGE__PACKAGE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXML_PAGE__NAME = PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXML_PAGE__CONTROLLER = PAGE__CONTROLLER;

	/**
	 * The feature id for the '<em><b>Fxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXML_PAGE__FXML = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fxml Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXML_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fxml Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXML_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.EntityImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 8;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PACKAGE_PATH = ABSTRACT_MODEL__PACKAGE_PATH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ABSTRACT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_SPRING = ABSTRACT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_HISTORY = ABSTRACT_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Formular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_FORMULAR = ABSTRACT_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Table View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_TABLE_VIEW = ABSTRACT_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Details Panel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SHOW_DETAILS_PANEL = ABSTRACT_MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Show Search Panel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SHOW_SEARCH_PANEL = ABSTRACT_MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Generate Demo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__GENERATE_DEMO = ABSTRACT_MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELD = ABSTRACT_MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REPOSITORY = ABSTRACT_MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ABSTRACT_MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ABSTRACT_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.RepositoryImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 9;

	/**
	 * The feature id for the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__JDBC_URL = 0;

	/**
	 * The feature id for the '<em><b>Generate Dummy Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GENERATE_DUMMY_INSERT = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.SQLStatementImpl <em>SQL Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.SQLStatementImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getSQLStatement()
	 * @generated
	 */
	int SQL_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT__RETURN_VALUE = 2;

	/**
	 * The number of structural features of the '<em>SQL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>SQL Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.FieldImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Use By Table View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__USE_BY_TABLE_VIEW = 2;

	/**
	 * The feature id for the '<em><b>Use By Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__USE_BY_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Is Clob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__IS_CLOB = 4;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATATYPE = 5;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTROL = 6;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.FXControlImpl <em>FX Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.FXControlImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getFXControl()
	 * @generated
	 */
	int FX_CONTROL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__TOOLTIP = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__BINDING = 3;

	/**
	 * The feature id for the '<em><b>Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__COLUMN_WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__CONTROL = 5;

	/**
	 * The number of structural features of the '<em>FX Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>FX Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.Binding <em>Binding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.Binding
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 13;

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.ProjectFX <em>Project FX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project FX</em>'.
	 * @see de.dc.entity.model.ProjectFX
	 * @generated
	 */
	EClass getProjectFX();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.entity.model.ProjectFX#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elements</em>'.
	 * @see de.dc.entity.model.ProjectFX#getElements()
	 * @see #getProjectFX()
	 * @generated
	 */
	EReference getProjectFX_Elements();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.AbstractModel <em>Abstract Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Model</em>'.
	 * @see de.dc.entity.model.AbstractModel
	 * @generated
	 */
	EClass getAbstractModel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.AbstractModel#getPackagePath <em>Package Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Path</em>'.
	 * @see de.dc.entity.model.AbstractModel#getPackagePath()
	 * @see #getAbstractModel()
	 * @generated
	 */
	EAttribute getAbstractModel_PackagePath();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.SpringMetro <em>Spring Metro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spring Metro</em>'.
	 * @see de.dc.entity.model.SpringMetro
	 * @generated
	 */
	EClass getSpringMetro();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.SpringMetro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.entity.model.SpringMetro#getName()
	 * @see #getSpringMetro()
	 * @generated
	 */
	EAttribute getSpringMetro_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.SpringMetro#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dc.entity.model.SpringMetro#getTitle()
	 * @see #getSpringMetro()
	 * @generated
	 */
	EAttribute getSpringMetro_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.SpringMetro#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see de.dc.entity.model.SpringMetro#getSubtitle()
	 * @see #getSpringMetro()
	 * @generated
	 */
	EAttribute getSpringMetro_Subtitle();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.entity.model.SpringMetro#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see de.dc.entity.model.SpringMetro#getElements()
	 * @see #getSpringMetro()
	 * @generated
	 */
	EReference getSpringMetro_Elements();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.Metro <em>Metro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metro</em>'.
	 * @see de.dc.entity.model.Metro
	 * @generated
	 */
	EClass getMetro();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Metro#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.entity.model.Metro#getName()
	 * @see #getMetro()
	 * @generated
	 */
	EAttribute getMetro_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Metro#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.dc.entity.model.Metro#getTitle()
	 * @see #getMetro()
	 * @generated
	 */
	EAttribute getMetro_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Metro#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see de.dc.entity.model.Metro#getSubtitle()
	 * @see #getMetro()
	 * @generated
	 */
	EAttribute getMetro_Subtitle();

	/**
	 * Returns the meta object for the reference '{@link de.dc.entity.model.Metro#getMainNavigationItem <em>Main Navigation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Navigation Item</em>'.
	 * @see de.dc.entity.model.Metro#getMainNavigationItem()
	 * @see #getMetro()
	 * @generated
	 */
	EReference getMetro_MainNavigationItem();

	/**
	 * Returns the meta object for the reference list '{@link de.dc.entity.model.Metro#getNavigationItems <em>Navigation Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Navigation Items</em>'.
	 * @see de.dc.entity.model.Metro#getNavigationItems()
	 * @see #getMetro()
	 * @generated
	 */
	EReference getMetro_NavigationItems();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.NavigationItem <em>Navigation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Item</em>'.
	 * @see de.dc.entity.model.NavigationItem
	 * @generated
	 */
	EClass getNavigationItem();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.NavigationItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.entity.model.NavigationItem#getName()
	 * @see #getNavigationItem()
	 * @generated
	 */
	EAttribute getNavigationItem_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.PageContainer <em>Page Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Container</em>'.
	 * @see de.dc.entity.model.PageContainer
	 * @generated
	 */
	EClass getPageContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.entity.model.PageContainer#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see de.dc.entity.model.PageContainer#getPages()
	 * @see #getPageContainer()
	 * @generated
	 */
	EReference getPageContainer_Pages();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see de.dc.entity.model.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.entity.model.Page#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Controller</em>'.
	 * @see de.dc.entity.model.Page#getController()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Controller();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.FxmlPage <em>Fxml Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fxml Page</em>'.
	 * @see de.dc.entity.model.FxmlPage
	 * @generated
	 */
	EClass getFxmlPage();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.FxmlPage#getFxml <em>Fxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fxml</em>'.
	 * @see de.dc.entity.model.FxmlPage#getFxml()
	 * @see #getFxmlPage()
	 * @generated
	 */
	EAttribute getFxmlPage_Fxml();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see de.dc.entity.model.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#isUseSpring <em>Use Spring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Spring</em>'.
	 * @see de.dc.entity.model.Entity#isUseSpring()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_UseSpring();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#isUseHistory <em>Use History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use History</em>'.
	 * @see de.dc.entity.model.Entity#isUseHistory()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_UseHistory();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#isUseFormular <em>Use Formular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Formular</em>'.
	 * @see de.dc.entity.model.Entity#isUseFormular()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_UseFormular();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#isUseTableView <em>Use Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Table View</em>'.
	 * @see de.dc.entity.model.Entity#isUseTableView()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_UseTableView();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#isShowDetailsPanel <em>Show Details Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Details Panel</em>'.
	 * @see de.dc.entity.model.Entity#isShowDetailsPanel()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_ShowDetailsPanel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#isShowSearchPanel <em>Show Search Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Search Panel</em>'.
	 * @see de.dc.entity.model.Entity#isShowSearchPanel()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_ShowSearchPanel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#isGenerateDemo <em>Generate Demo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Demo</em>'.
	 * @see de.dc.entity.model.Entity#isGenerateDemo()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_GenerateDemo();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.entity.model.Entity#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see de.dc.entity.model.Entity#getField()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Field();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.entity.model.Entity#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see de.dc.entity.model.Entity#getRepository()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Repository();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see de.dc.entity.model.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Repository#getJdbcUrl <em>Jdbc Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Url</em>'.
	 * @see de.dc.entity.model.Repository#getJdbcUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_JdbcUrl();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Repository#isGenerateDummyInsert <em>Generate Dummy Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Dummy Insert</em>'.
	 * @see de.dc.entity.model.Repository#isGenerateDummyInsert()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_GenerateDummyInsert();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.entity.model.Repository#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see de.dc.entity.model.Repository#getStatement()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Statement();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.SQLStatement <em>SQL Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Statement</em>'.
	 * @see de.dc.entity.model.SQLStatement
	 * @generated
	 */
	EClass getSQLStatement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.SQLStatement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.entity.model.SQLStatement#getName()
	 * @see #getSQLStatement()
	 * @generated
	 */
	EAttribute getSQLStatement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.SQLStatement#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see de.dc.entity.model.SQLStatement#getQuery()
	 * @see #getSQLStatement()
	 * @generated
	 */
	EAttribute getSQLStatement_Query();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.entity.model.SQLStatement#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see de.dc.entity.model.SQLStatement#getReturnValue()
	 * @see #getSQLStatement()
	 * @generated
	 */
	EReference getSQLStatement_ReturnValue();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see de.dc.entity.model.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.entity.model.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Field#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.dc.entity.model.Field#isRequired()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Field#isUseByTableView <em>Use By Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use By Table View</em>'.
	 * @see de.dc.entity.model.Field#isUseByTableView()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_UseByTableView();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Field#isUseByRepository <em>Use By Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use By Repository</em>'.
	 * @see de.dc.entity.model.Field#isUseByRepository()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_UseByRepository();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Field#isIsClob <em>Is Clob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Clob</em>'.
	 * @see de.dc.entity.model.Field#isIsClob()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_IsClob();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.entity.model.Field#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datatype</em>'.
	 * @see de.dc.entity.model.Field#getDatatype()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Datatype();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.entity.model.Field#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see de.dc.entity.model.Field#getControl()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Control();

	/**
	 * Returns the meta object for class '{@link de.dc.entity.model.FXControl <em>FX Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Control</em>'.
	 * @see de.dc.entity.model.FXControl
	 * @generated
	 */
	EClass getFXControl();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.FXControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.entity.model.FXControl#getName()
	 * @see #getFXControl()
	 * @generated
	 */
	EAttribute getFXControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.FXControl#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see de.dc.entity.model.FXControl#getTooltip()
	 * @see #getFXControl()
	 * @generated
	 */
	EAttribute getFXControl_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.FXControl#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dc.entity.model.FXControl#getDescription()
	 * @see #getFXControl()
	 * @generated
	 */
	EAttribute getFXControl_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.FXControl#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding</em>'.
	 * @see de.dc.entity.model.FXControl#getBinding()
	 * @see #getFXControl()
	 * @generated
	 */
	EAttribute getFXControl_Binding();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.FXControl#getColumnWidth <em>Column Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Width</em>'.
	 * @see de.dc.entity.model.FXControl#getColumnWidth()
	 * @see #getFXControl()
	 * @generated
	 */
	EAttribute getFXControl_ColumnWidth();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.entity.model.FXControl#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see de.dc.entity.model.FXControl#getControl()
	 * @see #getFXControl()
	 * @generated
	 */
	EReference getFXControl_Control();

	/**
	 * Returns the meta object for enum '{@link de.dc.entity.model.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding</em>'.
	 * @see de.dc.entity.model.Binding
	 * @generated
	 */
	EEnum getBinding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.ProjectFXImpl <em>Project FX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.ProjectFXImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getProjectFX()
		 * @generated
		 */
		EClass PROJECT_FX = eINSTANCE.getProjectFX();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_FX__ELEMENTS = eINSTANCE.getProjectFX_Elements();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.AbstractModelImpl <em>Abstract Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.AbstractModelImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getAbstractModel()
		 * @generated
		 */
		EClass ABSTRACT_MODEL = eINSTANCE.getAbstractModel();

		/**
		 * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MODEL__PACKAGE_PATH = eINSTANCE.getAbstractModel_PackagePath();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.SpringMetroImpl <em>Spring Metro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.SpringMetroImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getSpringMetro()
		 * @generated
		 */
		EClass SPRING_METRO = eINSTANCE.getSpringMetro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_METRO__NAME = eINSTANCE.getSpringMetro_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_METRO__TITLE = eINSTANCE.getSpringMetro_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPRING_METRO__SUBTITLE = eINSTANCE.getSpringMetro_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPRING_METRO__ELEMENTS = eINSTANCE.getSpringMetro_Elements();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.MetroImpl <em>Metro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.MetroImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getMetro()
		 * @generated
		 */
		EClass METRO = eINSTANCE.getMetro();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO__NAME = eINSTANCE.getMetro_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO__TITLE = eINSTANCE.getMetro_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO__SUBTITLE = eINSTANCE.getMetro_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Main Navigation Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO__MAIN_NAVIGATION_ITEM = eINSTANCE.getMetro_MainNavigationItem();

		/**
		 * The meta object literal for the '<em><b>Navigation Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO__NAVIGATION_ITEMS = eINSTANCE.getMetro_NavigationItems();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.NavigationItemImpl <em>Navigation Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.NavigationItemImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getNavigationItem()
		 * @generated
		 */
		EClass NAVIGATION_ITEM = eINSTANCE.getNavigationItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_ITEM__NAME = eINSTANCE.getNavigationItem_Name();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.PageContainerImpl <em>Page Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.PageContainerImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getPageContainer()
		 * @generated
		 */
		EClass PAGE_CONTAINER = eINSTANCE.getPageContainer();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTAINER__PAGES = eINSTANCE.getPageContainer_Pages();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.PageImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONTROLLER = eINSTANCE.getPage_Controller();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.FxmlPageImpl <em>Fxml Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.FxmlPageImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getFxmlPage()
		 * @generated
		 */
		EClass FXML_PAGE = eINSTANCE.getFxmlPage();

		/**
		 * The meta object literal for the '<em><b>Fxml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FXML_PAGE__FXML = eINSTANCE.getFxmlPage_Fxml();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.EntityImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Use Spring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__USE_SPRING = eINSTANCE.getEntity_UseSpring();

		/**
		 * The meta object literal for the '<em><b>Use History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__USE_HISTORY = eINSTANCE.getEntity_UseHistory();

		/**
		 * The meta object literal for the '<em><b>Use Formular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__USE_FORMULAR = eINSTANCE.getEntity_UseFormular();

		/**
		 * The meta object literal for the '<em><b>Use Table View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__USE_TABLE_VIEW = eINSTANCE.getEntity_UseTableView();

		/**
		 * The meta object literal for the '<em><b>Show Details Panel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__SHOW_DETAILS_PANEL = eINSTANCE.getEntity_ShowDetailsPanel();

		/**
		 * The meta object literal for the '<em><b>Show Search Panel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__SHOW_SEARCH_PANEL = eINSTANCE.getEntity_ShowSearchPanel();

		/**
		 * The meta object literal for the '<em><b>Generate Demo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__GENERATE_DEMO = eINSTANCE.getEntity_GenerateDemo();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELD = eINSTANCE.getEntity_Field();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REPOSITORY = eINSTANCE.getEntity_Repository();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.RepositoryImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Jdbc Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__JDBC_URL = eINSTANCE.getRepository_JdbcUrl();

		/**
		 * The meta object literal for the '<em><b>Generate Dummy Insert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__GENERATE_DUMMY_INSERT = eINSTANCE.getRepository_GenerateDummyInsert();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__STATEMENT = eINSTANCE.getRepository_Statement();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.SQLStatementImpl <em>SQL Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.SQLStatementImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getSQLStatement()
		 * @generated
		 */
		EClass SQL_STATEMENT = eINSTANCE.getSQLStatement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_STATEMENT__NAME = eINSTANCE.getSQLStatement_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_STATEMENT__QUERY = eINSTANCE.getSQLStatement_Query();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_STATEMENT__RETURN_VALUE = eINSTANCE.getSQLStatement_ReturnValue();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.FieldImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__REQUIRED = eINSTANCE.getField_Required();

		/**
		 * The meta object literal for the '<em><b>Use By Table View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__USE_BY_TABLE_VIEW = eINSTANCE.getField_UseByTableView();

		/**
		 * The meta object literal for the '<em><b>Use By Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__USE_BY_REPOSITORY = eINSTANCE.getField_UseByRepository();

		/**
		 * The meta object literal for the '<em><b>Is Clob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__IS_CLOB = eINSTANCE.getField_IsClob();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__DATATYPE = eINSTANCE.getField_Datatype();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__CONTROL = eINSTANCE.getField_Control();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.impl.FXControlImpl <em>FX Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.FXControlImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getFXControl()
		 * @generated
		 */
		EClass FX_CONTROL = eINSTANCE.getFXControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_CONTROL__NAME = eINSTANCE.getFXControl_Name();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_CONTROL__TOOLTIP = eINSTANCE.getFXControl_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_CONTROL__DESCRIPTION = eINSTANCE.getFXControl_Description();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_CONTROL__BINDING = eINSTANCE.getFXControl_Binding();

		/**
		 * The meta object literal for the '<em><b>Column Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_CONTROL__COLUMN_WIDTH = eINSTANCE.getFXControl_ColumnWidth();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_CONTROL__CONTROL = eINSTANCE.getFXControl_Control();

		/**
		 * The meta object literal for the '{@link de.dc.entity.model.Binding <em>Binding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.Binding
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getBinding()
		 * @generated
		 */
		EEnum BINDING = eINSTANCE.getBinding();

	}

} //ModelPackage
