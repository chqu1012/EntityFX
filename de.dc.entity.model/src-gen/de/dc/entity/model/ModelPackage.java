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
 *        annotation="http://www.eclipse.org/emf/2002/GenModel multipleEditorPages='false' creationIcons='false' editDirectory='/de.dc.entity.model.edit/src-gen' editorDirectory='/de.dc.entity.model.editor/src-gen' richClientPlatform='true' codeFormatting='true' importerID='org.eclipse.emf.importer.ecore' runtimePlatform='RCP' fileExtensions='entity' tableProviders='true' dataTypeConverters='true' basePackage='de.dc.entity'"
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
	 * The meta object id for the '{@link de.dc.entity.model.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.EntityImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PACKAGE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Use Spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_SPRING = 2;

	/**
	 * The feature id for the '<em><b>Use History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_HISTORY = 3;

	/**
	 * The feature id for the '<em><b>Use Formular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_FORMULAR = 4;

	/**
	 * The feature id for the '<em><b>Use Table View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__USE_TABLE_VIEW = 5;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELD = 6;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REPOSITORY = 7;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.entity.model.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.entity.model.impl.RepositoryImpl
	 * @see de.dc.entity.model.impl.ModelPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 1;

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
	int SQL_STATEMENT = 2;

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
	int FIELD = 3;

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
	 * The feature id for the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATATYPE = 4;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__CONTROL = 5;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 6;

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
	int FX_CONTROL = 4;

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
	int BINDING = 5;

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
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#getPackagePath <em>Package Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Path</em>'.
	 * @see de.dc.entity.model.Entity#getPackagePath()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_PackagePath();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.entity.model.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.entity.model.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

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
		 * The meta object literal for the '{@link de.dc.entity.model.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.entity.model.impl.EntityImpl
		 * @see de.dc.entity.model.impl.ModelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PACKAGE_PATH = eINSTANCE.getEntity_PackagePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

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
