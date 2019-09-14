/**
 */
package de.dc.entity.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binding</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.entity.model.ModelPackage#getBinding()
 * @model
 * @generated
 */
public enum Binding implements Enumerator {
	/**
	 * The '<em><b>Text Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT_PROPERTY(0, "textProperty", "textProperty"),

	/**
	 * The '<em><b>Value Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_PROPERTY(0, "valueProperty", "valueProperty"),

	/**
	 * The '<em><b>Local Date Time Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_DATE_TIME_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_DATE_TIME_PROPERTY(0, "localDateTimeProperty", "localDateTimeProperty"),

	/**
	 * The '<em><b>Local Date Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_DATE_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_DATE_PROPERTY(0, "localDateProperty", "localDateProperty");

	/**
	 * The '<em><b>Text Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_PROPERTY
	 * @model name="textProperty"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_PROPERTY_VALUE = 0;

	/**
	 * The '<em><b>Value Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_PROPERTY
	 * @model name="valueProperty"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_PROPERTY_VALUE = 0;

	/**
	 * The '<em><b>Local Date Time Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_DATE_TIME_PROPERTY
	 * @model name="localDateTimeProperty"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_DATE_TIME_PROPERTY_VALUE = 0;

	/**
	 * The '<em><b>Local Date Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_DATE_PROPERTY
	 * @model name="localDateProperty"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_DATE_PROPERTY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Binding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Binding[] VALUES_ARRAY = new Binding[] { TEXT_PROPERTY, VALUE_PROPERTY,
			LOCAL_DATE_TIME_PROPERTY, LOCAL_DATE_PROPERTY, };

	/**
	 * A public read-only list of all the '<em><b>Binding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Binding> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binding</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Binding get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Binding result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Binding getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Binding result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binding</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Binding get(int value) {
		switch (value) {
		case TEXT_PROPERTY_VALUE:
			return TEXT_PROPERTY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Binding(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Binding
