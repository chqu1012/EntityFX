/**
 */
package de.dc.entity.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project FX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.ProjectFX#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getProjectFX()
 * @model
 * @generated
 */
public interface ProjectFX extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(AbstractModel)
	 * @see de.dc.entity.model.ModelPackage#getProjectFX_Elements()
	 * @model containment="true"
	 * @generated
	 */
	AbstractModel getElements();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.ProjectFX#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(AbstractModel value);

} // ProjectFX
