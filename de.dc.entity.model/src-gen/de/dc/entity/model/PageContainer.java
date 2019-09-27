/**
 */
package de.dc.entity.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.PageContainer#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getPageContainer()
 * @model
 * @generated
 */
public interface PageContainer extends AbstractModel, NavigationItem {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.entity.model.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see de.dc.entity.model.ModelPackage#getPageContainer_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // PageContainer
