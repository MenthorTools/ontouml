/**
 */
package net.menthor.onto2.ontouml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Class Stereotype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * * A Class Stereotype can be a Kind, Collective, Quantity,
 *  Relator Mode, Quality, Role, Phase, SubKind, Category, Mixin, RoleMixin,
 *  PhaseMixin, Event or HighOrder.
 * <!-- end-model-doc -->
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClassStereotype()
 * @model
 * @generated
 */
public enum ClassStereotype implements Enumerator {
	/**
	 * The '<em><b>Unset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_VALUE
	 * @generated
	 * @ordered
	 */
	UNSET(0, "Unset", "Unset"),

	/**
	 * The '<em><b>Kind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIND_VALUE
	 * @generated
	 * @ordered
	 */
	KIND(0, "Kind", "Kind"),

	/**
	 * The '<em><b>Collective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTIVE(0, "Collective", "Collective"),

	/**
	 * The '<em><b>Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTITY(0, "Quantity", "Quantity"),

	/**
	 * The '<em><b>Relator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATOR_VALUE
	 * @generated
	 * @ordered
	 */
	RELATOR(0, "Relator", "Relator"),

	/**
	 * The '<em><b>Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODE_VALUE
	 * @generated
	 * @ordered
	 */
	MODE(0, "Mode", "Mode"),

	/**
	 * The '<em><b>Quality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUALITY(0, "Quality", "Quality"),

	/**
	 * The '<em><b>Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE(0, "Role", "Role"),

	/**
	 * The '<em><b>Phase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASE_VALUE
	 * @generated
	 * @ordered
	 */
	PHASE(0, "Phase", "Phase"),

	/**
	 * The '<em><b>Sub Kind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUB_KIND_VALUE
	 * @generated
	 * @ordered
	 */
	SUB_KIND(0, "SubKind", "SubKind"),

	/**
	 * The '<em><b>Category</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORY_VALUE
	 * @generated
	 * @ordered
	 */
	CATEGORY(0, "Category", "Category"),

	/**
	 * The '<em><b>Mixin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIXIN(0, "Mixin", "Mixin"),

	/**
	 * The '<em><b>Role Mixin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_MIXIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE_MIXIN(0, "RoleMixin", "RoleMixin"),

	/**
	 * The '<em><b>Phase Mixin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHASE_MIXIN_VALUE
	 * @generated
	 * @ordered
	 */
	PHASE_MIXIN(0, "PhaseMixin", "PhaseMixin"),

	/**
	 * The '<em><b>Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(0, "Event", "Event"),

	/**
	 * The '<em><b>High Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_ORDER(0, "HighOrder", "HighOrder");

	/**
	 * The '<em><b>Unset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSET
	 * @model name="Unset"
	 * @generated
	 * @ordered
	 */
	public static final int UNSET_VALUE = 0;

	/**
	 * The '<em><b>Kind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KIND
	 * @model name="Kind"
	 * @generated
	 * @ordered
	 */
	public static final int KIND_VALUE = 0;

	/**
	 * The '<em><b>Collective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collective</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLECTIVE
	 * @model name="Collective"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTIVE_VALUE = 0;

	/**
	 * The '<em><b>Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quantity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTITY
	 * @model name="Quantity"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITY_VALUE = 0;

	/**
	 * The '<em><b>Relator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATOR
	 * @model name="Relator"
	 * @generated
	 * @ordered
	 */
	public static final int RELATOR_VALUE = 0;

	/**
	 * The '<em><b>Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODE
	 * @model name="Mode"
	 * @generated
	 * @ordered
	 */
	public static final int MODE_VALUE = 0;

	/**
	 * The '<em><b>Quality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Quality</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUALITY
	 * @model name="Quality"
	 * @generated
	 * @ordered
	 */
	public static final int QUALITY_VALUE = 0;

	/**
	 * The '<em><b>Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLE
	 * @model name="Role"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_VALUE = 0;

	/**
	 * The '<em><b>Phase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASE
	 * @model name="Phase"
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_VALUE = 0;

	/**
	 * The '<em><b>Sub Kind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sub Kind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUB_KIND
	 * @model name="SubKind"
	 * @generated
	 * @ordered
	 */
	public static final int SUB_KIND_VALUE = 0;

	/**
	 * The '<em><b>Category</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Category</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATEGORY
	 * @model name="Category"
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORY_VALUE = 0;

	/**
	 * The '<em><b>Mixin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mixin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXIN
	 * @model name="Mixin"
	 * @generated
	 * @ordered
	 */
	public static final int MIXIN_VALUE = 0;

	/**
	 * The '<em><b>Role Mixin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Role Mixin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLE_MIXIN
	 * @model name="RoleMixin"
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_MIXIN_VALUE = 0;

	/**
	 * The '<em><b>Phase Mixin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phase Mixin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHASE_MIXIN
	 * @model name="PhaseMixin"
	 * @generated
	 * @ordered
	 */
	public static final int PHASE_MIXIN_VALUE = 0;

	/**
	 * The '<em><b>Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @model name="Event"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 0;

	/**
	 * The '<em><b>High Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Order</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_ORDER
	 * @model name="HighOrder"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_ORDER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Class Stereotype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassStereotype[] VALUES_ARRAY =
		new ClassStereotype[] {
			UNSET,
			KIND,
			COLLECTIVE,
			QUANTITY,
			RELATOR,
			MODE,
			QUALITY,
			ROLE,
			PHASE,
			SUB_KIND,
			CATEGORY,
			MIXIN,
			ROLE_MIXIN,
			PHASE_MIXIN,
			EVENT,
			HIGH_ORDER,
		};

	/**
	 * A public read-only list of all the '<em><b>Class Stereotype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassStereotype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Stereotype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassStereotype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassStereotype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Stereotype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassStereotype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassStereotype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Stereotype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassStereotype get(int value) {
		switch (value) {
			case UNSET_VALUE: return UNSET;
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
	private ClassStereotype(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ClassStereotype
