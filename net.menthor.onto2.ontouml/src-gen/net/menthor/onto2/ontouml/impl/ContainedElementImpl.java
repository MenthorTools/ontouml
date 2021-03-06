/**
 */
package net.menthor.onto2.ontouml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import net.menthor.onto2.ontouml.Comment;
import net.menthor.onto2.ontouml.ContainedElement;
import net.menthor.onto2.ontouml.Model;
import net.menthor.onto2.ontouml.OntoumlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ContainedElementImpl#getHolder <em>Holder</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.impl.ContainedElementImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainedElementImpl extends ElementImpl implements ContainedElement {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OntoumlPackage.Literals.CONTAINED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.menthor.onto2.ontouml.Container getHolder() {
		if (eContainerFeatureID() != OntoumlPackage.CONTAINED_ELEMENT__HOLDER) return null;
		return (net.menthor.onto2.ontouml.Container)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public net.menthor.onto2.ontouml.Container basicGetHolder() {
		if (eContainerFeatureID() != OntoumlPackage.CONTAINED_ELEMENT__HOLDER) return null;
		return (net.menthor.onto2.ontouml.Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolder(net.menthor.onto2.ontouml.Container newHolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHolder, OntoumlPackage.CONTAINED_ELEMENT__HOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolder(net.menthor.onto2.ontouml.Container newHolder) {
		if (newHolder != eInternalContainer() || (eContainerFeatureID() != OntoumlPackage.CONTAINED_ELEMENT__HOLDER && newHolder != null)) {
			if (EcoreUtil.isAncestor(this, newHolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHolder != null)
				msgs = ((InternalEObject)newHolder).eInverseAdd(this, OntoumlPackage.CONTAINER__ELEMENTS, net.menthor.onto2.ontouml.Container.class, msgs);
			msgs = basicSetHolder(newHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntoumlPackage.CONTAINED_ELEMENT__HOLDER, newHolder, newHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentWithInverseEList<Comment>(Comment.class, this, OntoumlPackage.CONTAINED_ELEMENT__COMMENTS, OntoumlPackage.COMMENT__OWNER);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		net.menthor.onto2.ontouml.Container _holder = this.getHolder();
		return this.getModel(_holder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel(final net.menthor.onto2.ontouml.Container c) {
		if ((c instanceof Model)) {
			return ((Model)c);
		}
		else {
			if ((c instanceof ContainedElement)) {
				net.menthor.onto2.ontouml.Container _holder = ((ContainedElement)c).getHolder();
				return this.getModel(_holder);
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoumlPackage.CONTAINED_ELEMENT__HOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHolder((net.menthor.onto2.ontouml.Container)otherEnd, msgs);
			case OntoumlPackage.CONTAINED_ELEMENT__COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OntoumlPackage.CONTAINED_ELEMENT__HOLDER:
				return basicSetHolder(null, msgs);
			case OntoumlPackage.CONTAINED_ELEMENT__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OntoumlPackage.CONTAINED_ELEMENT__HOLDER:
				return eInternalContainer().eInverseRemove(this, OntoumlPackage.CONTAINER__ELEMENTS, net.menthor.onto2.ontouml.Container.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OntoumlPackage.CONTAINED_ELEMENT__HOLDER:
				if (resolve) return getHolder();
				return basicGetHolder();
			case OntoumlPackage.CONTAINED_ELEMENT__COMMENTS:
				return getComments();
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
			case OntoumlPackage.CONTAINED_ELEMENT__HOLDER:
				setHolder((net.menthor.onto2.ontouml.Container)newValue);
				return;
			case OntoumlPackage.CONTAINED_ELEMENT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends Comment>)newValue);
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
			case OntoumlPackage.CONTAINED_ELEMENT__HOLDER:
				setHolder((net.menthor.onto2.ontouml.Container)null);
				return;
			case OntoumlPackage.CONTAINED_ELEMENT__COMMENTS:
				getComments().clear();
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
			case OntoumlPackage.CONTAINED_ELEMENT__HOLDER:
				return basicGetHolder() != null;
			case OntoumlPackage.CONTAINED_ELEMENT__COMMENTS:
				return comments != null && !comments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OntoumlPackage.CONTAINED_ELEMENT___GET_MODEL:
				return getModel();
			case OntoumlPackage.CONTAINED_ELEMENT___GET_MODEL__CONTAINER:
				return getModel((net.menthor.onto2.ontouml.Container)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainedElementImpl
