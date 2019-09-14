/**
 */
package de.dc.entity.model.impl;

import de.dc.entity.model.ModelPackage;
import de.dc.entity.model.Repository;
import de.dc.entity.model.SQLStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.impl.RepositoryImpl#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.RepositoryImpl#isGenerateDummyInsert <em>Generate Dummy Insert</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.RepositoryImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The default value of the '{@link #getJdbcUrl() <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJdbcUrl() <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUrl()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUrl = JDBC_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateDummyInsert() <em>Generate Dummy Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDummyInsert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DUMMY_INSERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateDummyInsert() <em>Generate Dummy Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDummyInsert()
	 * @generated
	 * @ordered
	 */
	protected boolean generateDummyInsert = GENERATE_DUMMY_INSERT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<SQLStatement> statement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcUrl() {
		return jdbcUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcUrl(String newJdbcUrl) {
		String oldJdbcUrl = jdbcUrl;
		jdbcUrl = newJdbcUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REPOSITORY__JDBC_URL, oldJdbcUrl,
					jdbcUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateDummyInsert() {
		return generateDummyInsert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateDummyInsert(boolean newGenerateDummyInsert) {
		boolean oldGenerateDummyInsert = generateDummyInsert;
		generateDummyInsert = newGenerateDummyInsert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REPOSITORY__GENERATE_DUMMY_INSERT,
					oldGenerateDummyInsert, generateDummyInsert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SQLStatement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<SQLStatement>(SQLStatement.class, this,
					ModelPackage.REPOSITORY__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.REPOSITORY__STATEMENT:
			return ((InternalEList<?>) getStatement()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.REPOSITORY__JDBC_URL:
			return getJdbcUrl();
		case ModelPackage.REPOSITORY__GENERATE_DUMMY_INSERT:
			return isGenerateDummyInsert();
		case ModelPackage.REPOSITORY__STATEMENT:
			return getStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.REPOSITORY__JDBC_URL:
			setJdbcUrl((String) newValue);
			return;
		case ModelPackage.REPOSITORY__GENERATE_DUMMY_INSERT:
			setGenerateDummyInsert((Boolean) newValue);
			return;
		case ModelPackage.REPOSITORY__STATEMENT:
			getStatement().clear();
			getStatement().addAll((Collection<? extends SQLStatement>) newValue);
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
		case ModelPackage.REPOSITORY__JDBC_URL:
			setJdbcUrl(JDBC_URL_EDEFAULT);
			return;
		case ModelPackage.REPOSITORY__GENERATE_DUMMY_INSERT:
			setGenerateDummyInsert(GENERATE_DUMMY_INSERT_EDEFAULT);
			return;
		case ModelPackage.REPOSITORY__STATEMENT:
			getStatement().clear();
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
		case ModelPackage.REPOSITORY__JDBC_URL:
			return JDBC_URL_EDEFAULT == null ? jdbcUrl != null : !JDBC_URL_EDEFAULT.equals(jdbcUrl);
		case ModelPackage.REPOSITORY__GENERATE_DUMMY_INSERT:
			return generateDummyInsert != GENERATE_DUMMY_INSERT_EDEFAULT;
		case ModelPackage.REPOSITORY__STATEMENT:
			return statement != null && !statement.isEmpty();
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
		result.append(" (jdbcUrl: ");
		result.append(jdbcUrl);
		result.append(", generateDummyInsert: ");
		result.append(generateDummyInsert);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
