/**
 */
package de.dc.entity.model;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.Page#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends AbstractModel, NavigationItem {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference.
	 * @see #setController(JvmTypeReference)
	 * @see de.dc.entity.model.ModelPackage#getPage_Controller()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getController();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Page#getController <em>Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' containment reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(JvmTypeReference value);

} // Page
