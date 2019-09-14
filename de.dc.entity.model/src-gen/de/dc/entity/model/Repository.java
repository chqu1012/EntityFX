/**
 */
package de.dc.entity.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.Repository#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link de.dc.entity.model.Repository#isGenerateDummyInsert <em>Generate Dummy Insert</em>}</li>
 *   <li>{@link de.dc.entity.model.Repository#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Url</em>' attribute.
	 * @see #setJdbcUrl(String)
	 * @see de.dc.entity.model.ModelPackage#getRepository_JdbcUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getJdbcUrl();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Repository#getJdbcUrl <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Url</em>' attribute.
	 * @see #getJdbcUrl()
	 * @generated
	 */
	void setJdbcUrl(String value);

	/**
	 * Returns the value of the '<em><b>Generate Dummy Insert</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Dummy Insert</em>' attribute.
	 * @see #setGenerateDummyInsert(boolean)
	 * @see de.dc.entity.model.ModelPackage#getRepository_GenerateDummyInsert()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isGenerateDummyInsert();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Repository#isGenerateDummyInsert <em>Generate Dummy Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Dummy Insert</em>' attribute.
	 * @see #isGenerateDummyInsert()
	 * @generated
	 */
	void setGenerateDummyInsert(boolean value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.entity.model.SQLStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see de.dc.entity.model.ModelPackage#getRepository_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<SQLStatement> getStatement();

} // Repository
