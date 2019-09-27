/**
 */
package de.dc.entity.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spring Metro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.SpringMetro#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.SpringMetro#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dc.entity.model.SpringMetro#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link de.dc.entity.model.SpringMetro#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getSpringMetro()
 * @model
 * @generated
 */
public interface SpringMetro extends AbstractModel {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.entity.model.ModelPackage#getSpringMetro_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.SpringMetro#getName <em>Name</em>}' attribute.
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
	 * @see de.dc.entity.model.ModelPackage#getSpringMetro_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.SpringMetro#getTitle <em>Title</em>}' attribute.
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
	 * @see de.dc.entity.model.ModelPackage#getSpringMetro_Subtitle()
	 * @model unique="false"
	 * @generated
	 */
	String getSubtitle();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.SpringMetro#getSubtitle <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' attribute.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link de.dc.entity.model.NavigationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see de.dc.entity.model.ModelPackage#getSpringMetro_Elements()
	 * @model
	 * @generated
	 */
	EList<NavigationItem> getElements();

} // SpringMetro
