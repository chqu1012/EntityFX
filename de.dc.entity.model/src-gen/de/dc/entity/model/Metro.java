/**
 */
package de.dc.entity.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.Metro#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.Metro#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dc.entity.model.Metro#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link de.dc.entity.model.Metro#getMainNavigationItem <em>Main Navigation Item</em>}</li>
 *   <li>{@link de.dc.entity.model.Metro#getNavigationItems <em>Navigation Items</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getMetro()
 * @model
 * @generated
 */
public interface Metro extends AbstractModel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.entity.model.ModelPackage#getMetro_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Metro#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.dc.entity.model.ModelPackage#getMetro_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Metro#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' attribute.
	 * @see #setSubtitle(String)
	 * @see de.dc.entity.model.ModelPackage#getMetro_Subtitle()
	 * @model unique="false"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Metro#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Main Navigation Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Navigation Item</em>' reference.
	 * @see #setMainNavigationItem(NavigationItem)
	 * @see de.dc.entity.model.ModelPackage#getMetro_MainNavigationItem()
	 * @model
	 * @generated
	 */
	NavigationItem getMainNavigationItem();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.Metro#getMainNavigationItem <em>Main Navigation Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Navigation Item</em>' reference.
	 * @see #getMainNavigationItem()
	 * @generated
	 */
	void setMainNavigationItem(NavigationItem value);

	/**
	 * Returns the value of the '<em><b>Navigation Items</b></em>' reference list.
	 * The list contents are of type {@link de.dc.entity.model.NavigationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Items</em>' reference list.
	 * @see de.dc.entity.model.ModelPackage#getMetro_NavigationItems()
	 * @model
	 * @generated
	 */
	EList<NavigationItem> getNavigationItems();

} // Metro
