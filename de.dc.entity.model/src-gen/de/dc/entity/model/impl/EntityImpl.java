/**
 */
package de.dc.entity.model.impl;

import de.dc.entity.model.Entity;
import de.dc.entity.model.Field;
import de.dc.entity.model.ModelPackage;
import de.dc.entity.model.NavigationItem;
import de.dc.entity.model.Repository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#isUseSpring <em>Use Spring</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#isUseHistory <em>Use History</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#isUseFormular <em>Use Formular</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#isUseTableView <em>Use Table View</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#isShowDetailsPanel <em>Show Details Panel</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#isShowSearchPanel <em>Show Search Panel</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#isGenerateDemo <em>Generate Demo</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#getField <em>Field</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.EntityImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends AbstractModelImpl implements Entity {
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
	 * The default value of the '{@link #isUseSpring() <em>Use Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSpring()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_SPRING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseSpring() <em>Use Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseSpring()
	 * @generated
	 * @ordered
	 */
	protected boolean useSpring = USE_SPRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseHistory() <em>Use History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_HISTORY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseHistory() <em>Use History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean useHistory = USE_HISTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFormular() <em>Use Formular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFormular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FORMULAR_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseFormular() <em>Use Formular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFormular()
	 * @generated
	 * @ordered
	 */
	protected boolean useFormular = USE_FORMULAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseTableView() <em>Use Table View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseTableView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_TABLE_VIEW_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseTableView() <em>Use Table View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseTableView()
	 * @generated
	 * @ordered
	 */
	protected boolean useTableView = USE_TABLE_VIEW_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowDetailsPanel() <em>Show Details Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDetailsPanel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_DETAILS_PANEL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowDetailsPanel() <em>Show Details Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowDetailsPanel()
	 * @generated
	 * @ordered
	 */
	protected boolean showDetailsPanel = SHOW_DETAILS_PANEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowSearchPanel() <em>Show Search Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSearchPanel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_SEARCH_PANEL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowSearchPanel() <em>Show Search Panel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowSearchPanel()
	 * @generated
	 * @ordered
	 */
	protected boolean showSearchPanel = SHOW_SEARCH_PANEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateDemo() <em>Generate Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDemo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_DEMO_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGenerateDemo() <em>Generate Demo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateDemo()
	 * @generated
	 * @ordered
	 */
	protected boolean generateDemo = GENERATE_DEMO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseSpring() {
		return useSpring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseSpring(boolean newUseSpring) {
		boolean oldUseSpring = useSpring;
		useSpring = newUseSpring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__USE_SPRING, oldUseSpring,
					useSpring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseHistory() {
		return useHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseHistory(boolean newUseHistory) {
		boolean oldUseHistory = useHistory;
		useHistory = newUseHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__USE_HISTORY, oldUseHistory,
					useHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseFormular() {
		return useFormular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseFormular(boolean newUseFormular) {
		boolean oldUseFormular = useFormular;
		useFormular = newUseFormular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__USE_FORMULAR, oldUseFormular,
					useFormular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseTableView() {
		return useTableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTableView(boolean newUseTableView) {
		boolean oldUseTableView = useTableView;
		useTableView = newUseTableView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__USE_TABLE_VIEW, oldUseTableView,
					useTableView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowDetailsPanel() {
		return showDetailsPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowDetailsPanel(boolean newShowDetailsPanel) {
		boolean oldShowDetailsPanel = showDetailsPanel;
		showDetailsPanel = newShowDetailsPanel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__SHOW_DETAILS_PANEL,
					oldShowDetailsPanel, showDetailsPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowSearchPanel() {
		return showSearchPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowSearchPanel(boolean newShowSearchPanel) {
		boolean oldShowSearchPanel = showSearchPanel;
		showSearchPanel = newShowSearchPanel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__SHOW_SEARCH_PANEL,
					oldShowSearchPanel, showSearchPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateDemo() {
		return generateDemo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateDemo(boolean newGenerateDemo) {
		boolean oldGenerateDemo = generateDemo;
		generateDemo = newGenerateDemo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__GENERATE_DEMO, oldGenerateDemo,
					generateDemo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, ModelPackage.ENTITY__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModelPackage.ENTITY__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(Repository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject) repository).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.ENTITY__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject) newRepository).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.ENTITY__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ENTITY__REPOSITORY, newRepository,
					newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.ENTITY__FIELD:
			return ((InternalEList<?>) getField()).basicRemove(otherEnd, msgs);
		case ModelPackage.ENTITY__REPOSITORY:
			return basicSetRepository(null, msgs);
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
		case ModelPackage.ENTITY__NAME:
			return getName();
		case ModelPackage.ENTITY__USE_SPRING:
			return isUseSpring();
		case ModelPackage.ENTITY__USE_HISTORY:
			return isUseHistory();
		case ModelPackage.ENTITY__USE_FORMULAR:
			return isUseFormular();
		case ModelPackage.ENTITY__USE_TABLE_VIEW:
			return isUseTableView();
		case ModelPackage.ENTITY__SHOW_DETAILS_PANEL:
			return isShowDetailsPanel();
		case ModelPackage.ENTITY__SHOW_SEARCH_PANEL:
			return isShowSearchPanel();
		case ModelPackage.ENTITY__GENERATE_DEMO:
			return isGenerateDemo();
		case ModelPackage.ENTITY__FIELD:
			return getField();
		case ModelPackage.ENTITY__REPOSITORY:
			return getRepository();
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
		case ModelPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.ENTITY__USE_SPRING:
			setUseSpring((Boolean) newValue);
			return;
		case ModelPackage.ENTITY__USE_HISTORY:
			setUseHistory((Boolean) newValue);
			return;
		case ModelPackage.ENTITY__USE_FORMULAR:
			setUseFormular((Boolean) newValue);
			return;
		case ModelPackage.ENTITY__USE_TABLE_VIEW:
			setUseTableView((Boolean) newValue);
			return;
		case ModelPackage.ENTITY__SHOW_DETAILS_PANEL:
			setShowDetailsPanel((Boolean) newValue);
			return;
		case ModelPackage.ENTITY__SHOW_SEARCH_PANEL:
			setShowSearchPanel((Boolean) newValue);
			return;
		case ModelPackage.ENTITY__GENERATE_DEMO:
			setGenerateDemo((Boolean) newValue);
			return;
		case ModelPackage.ENTITY__FIELD:
			getField().clear();
			getField().addAll((Collection<? extends Field>) newValue);
			return;
		case ModelPackage.ENTITY__REPOSITORY:
			setRepository((Repository) newValue);
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
		case ModelPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.ENTITY__USE_SPRING:
			setUseSpring(USE_SPRING_EDEFAULT);
			return;
		case ModelPackage.ENTITY__USE_HISTORY:
			setUseHistory(USE_HISTORY_EDEFAULT);
			return;
		case ModelPackage.ENTITY__USE_FORMULAR:
			setUseFormular(USE_FORMULAR_EDEFAULT);
			return;
		case ModelPackage.ENTITY__USE_TABLE_VIEW:
			setUseTableView(USE_TABLE_VIEW_EDEFAULT);
			return;
		case ModelPackage.ENTITY__SHOW_DETAILS_PANEL:
			setShowDetailsPanel(SHOW_DETAILS_PANEL_EDEFAULT);
			return;
		case ModelPackage.ENTITY__SHOW_SEARCH_PANEL:
			setShowSearchPanel(SHOW_SEARCH_PANEL_EDEFAULT);
			return;
		case ModelPackage.ENTITY__GENERATE_DEMO:
			setGenerateDemo(GENERATE_DEMO_EDEFAULT);
			return;
		case ModelPackage.ENTITY__FIELD:
			getField().clear();
			return;
		case ModelPackage.ENTITY__REPOSITORY:
			setRepository((Repository) null);
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
		case ModelPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.ENTITY__USE_SPRING:
			return useSpring != USE_SPRING_EDEFAULT;
		case ModelPackage.ENTITY__USE_HISTORY:
			return useHistory != USE_HISTORY_EDEFAULT;
		case ModelPackage.ENTITY__USE_FORMULAR:
			return useFormular != USE_FORMULAR_EDEFAULT;
		case ModelPackage.ENTITY__USE_TABLE_VIEW:
			return useTableView != USE_TABLE_VIEW_EDEFAULT;
		case ModelPackage.ENTITY__SHOW_DETAILS_PANEL:
			return showDetailsPanel != SHOW_DETAILS_PANEL_EDEFAULT;
		case ModelPackage.ENTITY__SHOW_SEARCH_PANEL:
			return showSearchPanel != SHOW_SEARCH_PANEL_EDEFAULT;
		case ModelPackage.ENTITY__GENERATE_DEMO:
			return generateDemo != GENERATE_DEMO_EDEFAULT;
		case ModelPackage.ENTITY__FIELD:
			return field != null && !field.isEmpty();
		case ModelPackage.ENTITY__REPOSITORY:
			return repository != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NavigationItem.class) {
			switch (derivedFeatureID) {
			case ModelPackage.ENTITY__NAME:
				return ModelPackage.NAVIGATION_ITEM__NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NavigationItem.class) {
			switch (baseFeatureID) {
			case ModelPackage.NAVIGATION_ITEM__NAME:
				return ModelPackage.ENTITY__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", useSpring: ");
		result.append(useSpring);
		result.append(", useHistory: ");
		result.append(useHistory);
		result.append(", useFormular: ");
		result.append(useFormular);
		result.append(", useTableView: ");
		result.append(useTableView);
		result.append(", showDetailsPanel: ");
		result.append(showDetailsPanel);
		result.append(", showSearchPanel: ");
		result.append(showSearchPanel);
		result.append(", generateDemo: ");
		result.append(generateDemo);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
