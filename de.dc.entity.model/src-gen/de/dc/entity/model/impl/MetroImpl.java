/**
 */
package de.dc.entity.model.impl;

import de.dc.entity.model.Metro;
import de.dc.entity.model.ModelPackage;
import de.dc.entity.model.NavigationItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.entity.model.impl.MetroImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.MetroImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.MetroImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.MetroImpl#getMainNavigationItem <em>Main Navigation Item</em>}</li>
 *   <li>{@link de.dc.entity.model.impl.MetroImpl#getNavigationItems <em>Navigation Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroImpl extends AbstractModelImpl implements Metro {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBTITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected String subtitle = SUBTITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMainNavigationItem() <em>Main Navigation Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainNavigationItem()
	 * @generated
	 * @ordered
	 */
	protected NavigationItem mainNavigationItem;

	/**
	 * The cached value of the '{@link #getNavigationItems() <em>Navigation Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationItem> navigationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.METRO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METRO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METRO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubtitle(String newSubtitle) {
		String oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METRO__SUBTITLE, oldSubtitle, subtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationItem getMainNavigationItem() {
		if (mainNavigationItem != null && mainNavigationItem.eIsProxy()) {
			InternalEObject oldMainNavigationItem = (InternalEObject) mainNavigationItem;
			mainNavigationItem = (NavigationItem) eResolveProxy(oldMainNavigationItem);
			if (mainNavigationItem != oldMainNavigationItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.METRO__MAIN_NAVIGATION_ITEM,
							oldMainNavigationItem, mainNavigationItem));
			}
		}
		return mainNavigationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationItem basicGetMainNavigationItem() {
		return mainNavigationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainNavigationItem(NavigationItem newMainNavigationItem) {
		NavigationItem oldMainNavigationItem = mainNavigationItem;
		mainNavigationItem = newMainNavigationItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METRO__MAIN_NAVIGATION_ITEM,
					oldMainNavigationItem, mainNavigationItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NavigationItem> getNavigationItems() {
		if (navigationItems == null) {
			navigationItems = new EObjectResolvingEList<NavigationItem>(NavigationItem.class, this,
					ModelPackage.METRO__NAVIGATION_ITEMS);
		}
		return navigationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModelPackage.METRO__NAME:
			return getName();
		case ModelPackage.METRO__TITLE:
			return getTitle();
		case ModelPackage.METRO__SUBTITLE:
			return getSubtitle();
		case ModelPackage.METRO__MAIN_NAVIGATION_ITEM:
			if (resolve)
				return getMainNavigationItem();
			return basicGetMainNavigationItem();
		case ModelPackage.METRO__NAVIGATION_ITEMS:
			return getNavigationItems();
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
		case ModelPackage.METRO__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.METRO__TITLE:
			setTitle((String) newValue);
			return;
		case ModelPackage.METRO__SUBTITLE:
			setSubtitle((String) newValue);
			return;
		case ModelPackage.METRO__MAIN_NAVIGATION_ITEM:
			setMainNavigationItem((NavigationItem) newValue);
			return;
		case ModelPackage.METRO__NAVIGATION_ITEMS:
			getNavigationItems().clear();
			getNavigationItems().addAll((Collection<? extends NavigationItem>) newValue);
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
		case ModelPackage.METRO__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.METRO__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ModelPackage.METRO__SUBTITLE:
			setSubtitle(SUBTITLE_EDEFAULT);
			return;
		case ModelPackage.METRO__MAIN_NAVIGATION_ITEM:
			setMainNavigationItem((NavigationItem) null);
			return;
		case ModelPackage.METRO__NAVIGATION_ITEMS:
			getNavigationItems().clear();
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
		case ModelPackage.METRO__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.METRO__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ModelPackage.METRO__SUBTITLE:
			return SUBTITLE_EDEFAULT == null ? subtitle != null : !SUBTITLE_EDEFAULT.equals(subtitle);
		case ModelPackage.METRO__MAIN_NAVIGATION_ITEM:
			return mainNavigationItem != null;
		case ModelPackage.METRO__NAVIGATION_ITEMS:
			return navigationItems != null && !navigationItems.isEmpty();
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
		result.append(", title: ");
		result.append(title);
		result.append(", subtitle: ");
		result.append(subtitle);
		result.append(')');
		return result.toString();
	}

} //MetroImpl
