/**
 */
package de.dc.entity.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.Entity#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#isUseSpring <em>Use Spring</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#isUseHistory <em>Use History</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#isUseFormular <em>Use Formular</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#isUseTableView <em>Use Table View</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#isShowDetailsPanel <em>Show Details Panel</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#isShowSearchPanel <em>Show Search Panel</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#isGenerateDemo <em>Generate Demo</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#getField <em>Field</em>}</li>
 *   <li>{@link de.dc.entity.model.Entity#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Path</em>' attribute.
	 * @see #setPackagePath(String)
	 * @see de.dc.entity.model.ModelPackage#getEntity_PackagePath()
	 * @model unique="false"
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.entity.model.ModelPackage#getEntity_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Use Spring</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Spring</em>' attribute.
	 * @see #setUseSpring(boolean)
	 * @see de.dc.entity.model.ModelPackage#getEntity_UseSpring()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseSpring();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#isUseSpring <em>Use Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Spring</em>' attribute.
	 * @see #isUseSpring()
	 * @generated
	 */
	void setUseSpring(boolean value);

	/**
	 * Returns the value of the '<em><b>Use History</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use History</em>' attribute.
	 * @see #setUseHistory(boolean)
	 * @see de.dc.entity.model.ModelPackage#getEntity_UseHistory()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseHistory();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#isUseHistory <em>Use History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use History</em>' attribute.
	 * @see #isUseHistory()
	 * @generated
	 */
	void setUseHistory(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Formular</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Formular</em>' attribute.
	 * @see #setUseFormular(boolean)
	 * @see de.dc.entity.model.ModelPackage#getEntity_UseFormular()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseFormular();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#isUseFormular <em>Use Formular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Formular</em>' attribute.
	 * @see #isUseFormular()
	 * @generated
	 */
	void setUseFormular(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Table View</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Table View</em>' attribute.
	 * @see #setUseTableView(boolean)
	 * @see de.dc.entity.model.ModelPackage#getEntity_UseTableView()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseTableView();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#isUseTableView <em>Use Table View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Table View</em>' attribute.
	 * @see #isUseTableView()
	 * @generated
	 */
	void setUseTableView(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Details Panel</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Details Panel</em>' attribute.
	 * @see #setShowDetailsPanel(boolean)
	 * @see de.dc.entity.model.ModelPackage#getEntity_ShowDetailsPanel()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowDetailsPanel();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#isShowDetailsPanel <em>Show Details Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Details Panel</em>' attribute.
	 * @see #isShowDetailsPanel()
	 * @generated
	 */
	void setShowDetailsPanel(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Search Panel</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Search Panel</em>' attribute.
	 * @see #setShowSearchPanel(boolean)
	 * @see de.dc.entity.model.ModelPackage#getEntity_ShowSearchPanel()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowSearchPanel();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#isShowSearchPanel <em>Show Search Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Search Panel</em>' attribute.
	 * @see #isShowSearchPanel()
	 * @generated
	 */
	void setShowSearchPanel(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Demo</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Demo</em>' attribute.
	 * @see #setGenerateDemo(boolean)
	 * @see de.dc.entity.model.ModelPackage#getEntity_GenerateDemo()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isGenerateDemo();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#isGenerateDemo <em>Generate Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Demo</em>' attribute.
	 * @see #isGenerateDemo()
	 * @generated
	 */
	void setGenerateDemo(boolean value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.entity.model.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see de.dc.entity.model.ModelPackage#getEntity_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(Repository)
	 * @see de.dc.entity.model.ModelPackage#getEntity_Repository()
	 * @model containment="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Entity#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // Entity
