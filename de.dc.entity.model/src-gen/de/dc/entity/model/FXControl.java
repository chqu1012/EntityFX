/**
 */
package de.dc.entity.model;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.FXControl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.FXControl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link de.dc.entity.model.FXControl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dc.entity.model.FXControl#getBinding <em>Binding</em>}</li>
 *   <li>{@link de.dc.entity.model.FXControl#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link de.dc.entity.model.FXControl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see de.dc.entity.model.ModelPackage#getFXControl()
 * @model
 * @generated
 */
public interface FXControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.entity.model.ModelPackage#getFXControl_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.FXControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see de.dc.entity.model.ModelPackage#getFXControl_Tooltip()
	 * @model unique="false"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.FXControl#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dc.entity.model.ModelPackage#getFXControl_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.FXControl#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.entity.model.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' attribute.
	 * @see de.dc.entity.model.Binding
	 * @see #setBinding(Binding)
	 * @see de.dc.entity.model.ModelPackage#getFXControl_Binding()
	 * @model unique="false"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.FXControl#getBinding <em>Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' attribute.
	 * @see de.dc.entity.model.Binding
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Column Width</b></em>' attribute.
	 * The default value is <code>"100.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Width</em>' attribute.
	 * @see #setColumnWidth(double)
	 * @see de.dc.entity.model.ModelPackage#getFXControl_ColumnWidth()
	 * @model default="100.0" unique="false"
	 * @generated
	 */
	double getColumnWidth();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.FXControl#getColumnWidth <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Width</em>' attribute.
	 * @see #getColumnWidth()
	 * @generated
	 */
	void setColumnWidth(double value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(JvmTypeReference)
	 * @see de.dc.entity.model.ModelPackage#getFXControl_Control()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getControl();

	/**
	 * Sets the value of the '{@link de.dc.entity.model.FXControl#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(JvmTypeReference value);

} // FXControl
