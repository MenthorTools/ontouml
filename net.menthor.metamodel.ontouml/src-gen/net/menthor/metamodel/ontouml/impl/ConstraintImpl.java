/**
 */
package net.menthor.metamodel.ontouml.impl;

import net.menthor.metamodel.ontouml.Constraint;
import net.menthor.metamodel.ontouml.ConstraintSteteotype;
import net.menthor.metamodel.ontouml.OntoumlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.menthor.metamodel.ontouml.impl.ConstraintImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link net.menthor.metamodel.ontouml.impl.ConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.menthor.metamodel.ontouml.impl.ConstraintImpl#getRuleAsString <em>Rule As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends ContainedElementImpl implements Constraint {
	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintSteteotype STEREOTYPE_EDEFAULT = ConstraintSteteotype.INVARIANT;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected ConstraintSteteotype stereotype = STEREOTYPE_EDEFAULT;

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
	 * The default value of the '{@link #getRuleAsString() <em>Rule As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleAsString() <em>Rule As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleAsString()
	 * @generated
	 * @ordered
	 */
	protected String ruleAsString = RULE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintSteteotype getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStereotype(ConstraintSteteotype newStereotype) {
		ConstraintSteteotype oldStereotype = stereotype;
		stereotype = newStereotype == null ? STEREOTYPE_EDEFAULT : newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONSTRAINT__STEREOTYPE, oldStereotype, stereotype));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuleAsString() {
		return ruleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleAsString(String newRuleAsString) {
		String oldRuleAsString = ruleAsString;
		ruleAsString = newRuleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONSTRAINT__RULE_AS_STRING, oldRuleAsString, ruleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				return getStereotype();
			case OntoumlPackage.CONSTRAINT__NAME:
				return getName();
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				return getRuleAsString();
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
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				setStereotype((ConstraintSteteotype)newValue);
				return;
			case OntoumlPackage.CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				setRuleAsString((String)newValue);
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
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case OntoumlPackage.CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				setRuleAsString(RULE_AS_STRING_EDEFAULT);
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
			case OntoumlPackage.CONSTRAINT__STEREOTYPE:
				return stereotype != STEREOTYPE_EDEFAULT;
			case OntoumlPackage.CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OntoumlPackage.CONSTRAINT__RULE_AS_STRING:
				return RULE_AS_STRING_EDEFAULT == null ? ruleAsString != null : !RULE_AS_STRING_EDEFAULT.equals(ruleAsString);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (stereotype: ");
		result.append(stereotype);
		result.append(", name: ");
		result.append(name);
		result.append(", ruleAsString: ");
		result.append(ruleAsString);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl