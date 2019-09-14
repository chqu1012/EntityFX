/**
 */
package de.dc.entity.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.Field#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.Field#isRequired <em>Required</em>}</li>
 *   <li>{@link de.dc.entity.model.Field#isUseByTableView <em>Use By Table View</em>}</li>
 *   <li>{@link de.dc.entity.model.Field#isUseByRepository <em>Use By Repository</em>}</li>
 *   <li>{@link de.dc.entity.model.Field#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link de.dc.entity.model.Field#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.entity.model.ModelPackage#getField_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see de.dc.entity.model.ModelPackage#getField_Required()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Field#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Use By Table View</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use By Table View</em>' attribute.
	 * @see #setUseByTableView(boolean)
	 * @see de.dc.entity.model.ModelPackage#getField_UseByTableView()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseByTableView();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Field#isUseByTableView <em>Use By Table View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use By Table View</em>' attribute.
	 * @see #isUseByTableView()
	 * @generated
	 */
	void setUseByTableView(boolean value);

	/**
	 * Returns the value of the '<em><b>Use By Repository</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use By Repository</em>' attribute.
	 * @see #setUseByRepository(boolean)
	 * @see de.dc.entity.model.ModelPackage#getField_UseByRepository()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isUseByRepository();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Field#isUseByRepository <em>Use By Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use By Repository</em>' attribute.
	 * @see #isUseByRepository()
	 * @generated
	 */
	void setUseByRepository(boolean value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference.
	 * @see #setDatatype(JvmTypeReference)
	 * @see de.dc.entity.model.ModelPackage#getField_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getDatatype();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Field#getDatatype <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' containment reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(JvmTypeReference value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(FXControl)
	 * @see de.dc.entity.model.ModelPackage#getField_Control()
	 * @model containment="true"
	 * @generated
	 */
	FXControl getControl();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Field#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(FXControl value);

} // Field
