/**
 */
package de.dc.entity.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.SQLStatement#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.SQLStatement#getQuery <em>Query</em>}</li>
 *   <li>{@link de.dc.entity.model.SQLStatement#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getSQLStatement()
 * @model
 * @generated
 */
public interface SQLStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.entity.model.ModelPackage#getSQLStatement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.SQLStatement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see de.dc.entity.model.ModelPackage#getSQLStatement_Query()
	 * @model unique="false"
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.SQLStatement#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value</em>' containment reference.
	 * @see #setReturnValue(JvmTypeReference)
	 * @see de.dc.entity.model.ModelPackage#getSQLStatement_ReturnValue()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getReturnValue();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.SQLStatement#getReturnValue <em>Return Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Value</em>' containment reference.
	 * @see #getReturnValue()
	 * @generated
	 */
	void setReturnValue(JvmTypeReference value);

} // SQLStatement
