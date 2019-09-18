/**
 */
package de.dc.entity.model.impl;

import de.dc.entity.model.FXControl;
import de.dc.entity.model.Field;
import de.dc.entity.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.FieldImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.FieldImpl#isUseByTableView <em>Use By Table View</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.FieldImpl#isUseByRepository <em>Use By Repository</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.FieldImpl#isIsClob <em>Is Clob</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.FieldImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.FieldImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseByTableView() <em>Use By Table View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseByTableView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_BY_TABLE_VIEW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseByTableView() <em>Use By Table View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseByTableView()
	 * @generated
	 * @ordered
	 */
	protected boolean useByTableView = USE_BY_TABLE_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseByRepository() <em>Use By Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseByRepository()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_BY_REPOSITORY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseByRepository() <em>Use By Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseByRepository()
	 * @generated
	 * @ordered
	 */
	protected boolean useByRepository = USE_BY_REPOSITORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsClob() <em>Is Clob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClob()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOB_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsClob() <em>Is Clob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsClob()
	 * @generated
	 * @ordered
	 */
	protected boolean isClob = IS_CLOB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference datatype;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected FXControl control;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseByTableView() {
		return useByTableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseByTableView(boolean newUseByTableView) {
		boolean oldUseByTableView = useByTableView;
		useByTableView = newUseByTableView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__USE_BY_TABLE_VIEW,
					oldUseByTableView, useByTableView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseByRepository() {
		return useByRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseByRepository(boolean newUseByRepository) {
		boolean oldUseByRepository = useByRepository;
		useByRepository = newUseByRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__USE_BY_REPOSITORY,
					oldUseByRepository, useByRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsClob() {
		return isClob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsClob(boolean newIsClob) {
		boolean oldIsClob = isClob;
		isClob = newIsClob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__IS_CLOB, oldIsClob, isClob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JvmTypeReference getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(JvmTypeReference newDatatype, NotificationChain msgs) {
		JvmTypeReference oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__DATATYPE,
					oldDatatype, newDatatype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatatype(JvmTypeReference newDatatype) {
		if (newDatatype != datatype) {
			NotificationChain msgs = null;
			if (datatype != null)
				msgs = ((InternalEObject) datatype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.FIELD__DATATYPE, null, msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject) newDatatype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.FIELD__DATATYPE, null, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__DATATYPE, newDatatype,
					newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FXControl getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(FXControl newControl, NotificationChain msgs) {
		FXControl oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__CONTROL,
					oldControl, newControl);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControl(FXControl newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject) control).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.FIELD__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject) newControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.FIELD__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FIELD__CONTROL, newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.FIELD__DATATYPE:
			return basicSetDatatype(null, msgs);
		case ModelPackage.FIELD__CONTROL:
			return basicSetControl(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.FIELD__NAME:
			return getName();
		case ModelPackage.FIELD__REQUIRED:
			return isRequired();
		case ModelPackage.FIELD__USE_BY_TABLE_VIEW:
			return isUseByTableView();
		case ModelPackage.FIELD__USE_BY_REPOSITORY:
			return isUseByRepository();
		case ModelPackage.FIELD__IS_CLOB:
			return isIsClob();
		case ModelPackage.FIELD__DATATYPE:
			return getDatatype();
		case ModelPackage.FIELD__CONTROL:
			return getControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.FIELD__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.FIELD__REQUIRED:
			setRequired((Boolean) newValue);
			return;
		case ModelPackage.FIELD__USE_BY_TABLE_VIEW:
			setUseByTableView((Boolean) newValue);
			return;
		case ModelPackage.FIELD__USE_BY_REPOSITORY:
			setUseByRepository((Boolean) newValue);
			return;
		case ModelPackage.FIELD__IS_CLOB:
			setIsClob((Boolean) newValue);
			return;
		case ModelPackage.FIELD__DATATYPE:
			setDatatype((JvmTypeReference) newValue);
			return;
		case ModelPackage.FIELD__CONTROL:
			setControl((FXControl) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModelPackage.FIELD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.FIELD__REQUIRED:
			setRequired(REQUIRED_EDEFAULT);
			return;
		case ModelPackage.FIELD__USE_BY_TABLE_VIEW:
			setUseByTableView(USE_BY_TABLE_VIEW_EDEFAULT);
			return;
		case ModelPackage.FIELD__USE_BY_REPOSITORY:
			setUseByRepository(USE_BY_REPOSITORY_EDEFAULT);
			return;
		case ModelPackage.FIELD__IS_CLOB:
			setIsClob(IS_CLOB_EDEFAULT);
			return;
		case ModelPackage.FIELD__DATATYPE:
			setDatatype((JvmTypeReference) null);
			return;
		case ModelPackage.FIELD__CONTROL:
			setControl((FXControl) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModelPackage.FIELD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.FIELD__REQUIRED:
			return required != REQUIRED_EDEFAULT;
		case ModelPackage.FIELD__USE_BY_TABLE_VIEW:
			return useByTableView != USE_BY_TABLE_VIEW_EDEFAULT;
		case ModelPackage.FIELD__USE_BY_REPOSITORY:
			return useByRepository != USE_BY_REPOSITORY_EDEFAULT;
		case ModelPackage.FIELD__IS_CLOB:
			return isClob != IS_CLOB_EDEFAULT;
		case ModelPackage.FIELD__DATATYPE:
			return datatype != null;
		case ModelPackage.FIELD__CONTROL:
			return control != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", required: ");
		result.append(required);
		result.append(", useByTableView: ");
		result.append(useByTableView);
		result.append(", useByRepository: ");
		result.append(useByRepository);
		result.append(", isClob: ");
		result.append(isClob);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
