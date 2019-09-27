/**
 */
package de.dc.entity.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.AbstractModel#getPackagePath <em>Package Path</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getAbstractModel()
 * @model abstract="true"
 * @generated
 */
public interface AbstractModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Path</em>' attribute.
	 * @see #setPackagePath(String)
	 * @see de.dc.entity.model.ModelPackage#getAbstractModel_PackagePath()
	 * @model unique="false"
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.AbstractModel#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

} // AbstractModel
