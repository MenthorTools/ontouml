/**
 */
package net.menthor.onto2.ontouml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * A "Class" is an Endurant, Perdurant or a HighOrder class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.menthor.onto2.ontouml.Class#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#isIsExtensional <em>Is Extensional</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#getQualityNature <em>Quality Nature</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#getExistence <em>Existence</em>}</li>
 *   <li>{@link net.menthor.onto2.ontouml.Class#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Type {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.ClassStereotype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ClassStereotype
	 * @see #setStereotype(ClassStereotype)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_Stereotype()
	 * @model unique="false"
	 * @generated
	 */
	ClassStereotype getStereotype();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Class#getStereotype <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' attribute.
	 * @see net.menthor.onto2.ontouml.ClassStereotype
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(ClassStereotype value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_IsAbstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_IsDerived()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Class#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Extensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extensional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extensional</em>' attribute.
	 * @see #setIsExtensional(boolean)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_IsExtensional()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsExtensional();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Class#isIsExtensional <em>Is Extensional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Extensional</em>' attribute.
	 * @see #isIsExtensional()
	 * @generated
	 */
	void setIsExtensional(boolean value);

	/**
	 * Returns the value of the '<em><b>Quality Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.QualityNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality Nature</em>' attribute.
	 * @see net.menthor.onto2.ontouml.QualityNature
	 * @see #setQualityNature(QualityNature)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_QualityNature()
	 * @model unique="false"
	 * @generated
	 */
	QualityNature getQualityNature();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Class#getQualityNature <em>Quality Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality Nature</em>' attribute.
	 * @see net.menthor.onto2.ontouml.QualityNature
	 * @see #getQualityNature()
	 * @generated
	 */
	void setQualityNature(QualityNature value);

	/**
	 * Returns the value of the '<em><b>Existence</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.Existence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existence</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Existence
	 * @see #setExistence(Existence)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_Existence()
	 * @model unique="false"
	 * @generated
	 */
	Existence getExistence();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Class#getExistence <em>Existence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existence</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Existence
	 * @see #getExistence()
	 * @generated
	 */
	void setExistence(Existence value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link net.menthor.onto2.ontouml.Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Classification
	 * @see #setClassification(Classification)
	 * @see net.menthor.onto2.ontouml.OntoumlPackage#getClass_Classification()
	 * @model unique="false"
	 * @generated
	 */
	Classification getClassification();

	/**
	 * Sets the value of the '{@link net.menthor.onto2.ontouml.Class#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see net.menthor.onto2.ontouml.Classification
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Classification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.KIND);'"
	 * @generated
	 */
	boolean isKind();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.SUB_KIND);'"
	 * @generated
	 */
	boolean isSubKind();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.COLLECTIVE);'"
	 * @generated
	 */
	boolean isCollective();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.QUANTITY);'"
	 * @generated
	 */
	boolean isQuantity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.RELATOR);'"
	 * @generated
	 */
	boolean isRelator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.MODE);'"
	 * @generated
	 */
	boolean isMode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.QUALITY);'"
	 * @generated
	 */
	boolean isQuality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.ROLE);'"
	 * @generated
	 */
	boolean isRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.ROLE_MIXIN);'"
	 * @generated
	 */
	boolean isRoleMixin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.PHASE_MIXIN);'"
	 * @generated
	 */
	boolean isPhaseMixin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.PHASE);'"
	 * @generated
	 */
	boolean isPhase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.CATEGORY);'"
	 * @generated
	 */
	boolean isCategory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.MIXIN);'"
	 * @generated
	 */
	boolean isMixin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.EVENT);'"
	 * @generated
	 */
	boolean isEvent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%net.menthor.onto2.ontouml.ClassStereotype%> _stereotype = this.getStereotype();\nreturn <%com.google.common.base.Objects%>.equal(_stereotype, <%net.menthor.onto2.ontouml.ClassStereotype%>.HIGH_ORDER);'"
	 * @generated
	 */
	boolean isHighOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _or_2 = false;\nboolean _or_3 = false;\nboolean _or_4 = false;\nboolean _or_5 = false;\nboolean _or_6 = false;\nboolean _isKind = this.isKind();\nif (_isKind)\n{\n\t_or_6 = true;\n} else\n{\n\tboolean _isCollective = this.isCollective();\n\t_or_6 = _isCollective;\n}\nif (_or_6)\n{\n\t_or_5 = true;\n} else\n{\n\tboolean _isQuantity = this.isQuantity();\n\t_or_5 = _isQuantity;\n}\nif (_or_5)\n{\n\t_or_4 = true;\n} else\n{\n\tboolean _isRelator = this.isRelator();\n\t_or_4 = _isRelator;\n}\nif (_or_4)\n{\n\t_or_3 = true;\n} else\n{\n\tboolean _isMode = this.isMode();\n\t_or_3 = _isMode;\n}\nif (_or_3)\n{\n\t_or_2 = true;\n} else\n{\n\tboolean _isQuality = this.isQuality();\n\t_or_2 = _isQuality;\n}\nif (_or_2)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or_1 = _isSubKind;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isCategory = this.isCategory();\n\t_or = _isCategory;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _or_2 = false;\nboolean _or_3 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_3 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_3 = _isPhase;\n}\nif (_or_3)\n{\n\t_or_2 = true;\n} else\n{\n\tboolean _isRoleMixin = this.isRoleMixin();\n\t_or_2 = _isRoleMixin;\n}\nif (_or_2)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhaseMixin = this.isPhaseMixin();\n\t_or_1 = _isPhaseMixin;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isMixin = this.isMixin();\n\t_or = _isMixin;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isNonRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _or_2 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_2 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_2 = _isPhase;\n}\nif (_or_2)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isRoleMixin = this.isRoleMixin();\n\t_or_1 = _isRoleMixin;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isPhaseMixin = this.isPhaseMixin();\n\t_or = _isPhaseMixin;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isAntiRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isMixin();'"
	 * @generated
	 */
	boolean isSemiRigid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\nboolean _isQuality = this.isQuality();\nif (!_isQuality)\n{\n\t_and_1 = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.QualityNature%> _qualityNature = this.getQualityNature();\n\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_qualityNature, null));\n\t_and_1 = _notEquals;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.QualityNature%> _qualityNature_1 = this.getQualityNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_qualityNature_1, <%net.menthor.onto2.ontouml.QualityNature%>.PERCEIVABLE);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isPerceivableQuality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\nboolean _isQuality = this.isQuality();\nif (!_isQuality)\n{\n\t_and_1 = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.QualityNature%> _qualityNature = this.getQualityNature();\n\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_qualityNature, null));\n\t_and_1 = _notEquals;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.QualityNature%> _qualityNature_1 = this.getQualityNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_qualityNature_1, <%net.menthor.onto2.ontouml.QualityNature%>.NON_PERCEIVABLE);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isNonPerceivableQuality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _and = false;\nboolean _and_1 = false;\nboolean _isQuality = this.isQuality();\nif (!_isQuality)\n{\n\t_and_1 = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.QualityNature%> _qualityNature = this.getQualityNature();\n\tboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_qualityNature, null));\n\t_and_1 = _notEquals;\n}\nif (!_and_1)\n{\n\t_and = false;\n} else\n{\n\t<%net.menthor.onto2.ontouml.QualityNature%> _qualityNature_1 = this.getQualityNature();\n\tboolean _equals = <%com.google.common.base.Objects%>.equal(_qualityNature_1, <%net.menthor.onto2.ontouml.QualityNature%>.NOMINAL);\n\t_and = _equals;\n}\nreturn _and;'"
	 * @generated
	 */
	boolean isNominalQuality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _isEvent = this.isEvent();\nif (_isEvent)\n{\n\t_or = true;\n} else\n{\n\tboolean _isHighOrder = this.isHighOrder();\n\t_or = _isHighOrder;\n}\nreturn (!_or);'"
	 * @generated
	 */
	boolean isEndurantClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _isNonQualitativeIntrinsicMoment = this.isNonQualitativeIntrinsicMoment();\nif (_isNonQualitativeIntrinsicMoment)\n{\n\t_or = true;\n} else\n{\n\tboolean _isQualitativeIntrinsicMoment = this.isQualitativeIntrinsicMoment();\n\t_or = _isQualitativeIntrinsicMoment;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isIntrinsicMoment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _isKind = this.isKind();\nif (_isKind)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isCollective = this.isCollective();\n\t_or_1 = _isCollective;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isQuantity = this.isQuantity();\n\t_or = _isQuantity;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isSubstanceSortalClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _isRelator = this.isRelator();\nif (_isRelator)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isMode = this.isMode();\n\t_or_1 = _isMode;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isQuality = this.isQuality();\n\t_or = _isQuality;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isMomentClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _or_2 = false;\nboolean _or_3 = false;\nboolean _or_4 = false;\nboolean _isKind = this.isKind();\nif (_isKind)\n{\n\t_or_4 = true;\n} else\n{\n\tboolean _isQuantity = this.isQuantity();\n\t_or_4 = _isQuantity;\n}\nif (_or_4)\n{\n\t_or_3 = true;\n} else\n{\n\tboolean _isCollective = this.isCollective();\n\t_or_3 = _isCollective;\n}\nif (_or_3)\n{\n\t_or_2 = true;\n} else\n{\n\tboolean _isRelator = this.isRelator();\n\t_or_2 = _isRelator;\n}\nif (_or_2)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isMode = this.isMode();\n\t_or_1 = _isMode;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isQuality = this.isQuality();\n\t_or = _isQuality;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isIdentityProviderClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _or_1 = false;\nboolean _or_2 = false;\nboolean _isMixin = this.isMixin();\nif (_isMixin)\n{\n\t_or_2 = true;\n} else\n{\n\tboolean _isRoleMixin = this.isRoleMixin();\n\t_or_2 = _isRoleMixin;\n}\nif (_or_2)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhaseMixin = this.isPhaseMixin();\n\t_or_1 = _isPhaseMixin;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isCategory = this.isCategory();\n\t_or = _isCategory;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isMixinClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _or = false;\nboolean _isRoleMixin = this.isRoleMixin();\nif (_isRoleMixin)\n{\n\t_or = true;\n} else\n{\n\tboolean _isPhaseMixin = this.isPhaseMixin();\n\t_or = _isPhaseMixin;\n}\nreturn _or;'"
	 * @generated
	 */
	boolean isAntiRigidMixinClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checks if this element is an amount of matter i.e.
	 * 1) if it is a quantity element, or,
	 * 2) if it is a subKind or role/phase with exactly one identity provider of the type Quantity, or,
	 * 3) if it is a mixin class in which all their children are quantities.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isQuantity = this.isQuantity();\nif (_isQuantity)\n{\n\treturn true;\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> providers = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProviders = this.identityProviders();\n\tproviders.addAll(_identityProviders);\n\tfor (final <%net.menthor.onto2.ontouml.Class%> c : providers)\n\t{\n\t\tboolean _isQuantity_1 = c.isQuantity();\n\t\tif (_isQuantity_1)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t}\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = this.children();\n\tint _size = _children.size();\n\tboolean _equals = (_size == 0);\n\tif (_equals)\n\t{\n\t\treturn false;\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children_1 = this.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> child : _children_1)\n\t{\n\t\tif ((child instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tboolean _isQuantity_2 = ((<%net.menthor.onto2.ontouml.Class%>)child).isQuantity();\n\t\t\tboolean _not = (!_isQuantity_2);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t}\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isAmountOfMatter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checks if this element is a functional complex i.e.
	 * 1) If it is a kind, or
	 * 2) if it is a subKind or role/phase with exactly one identity provider of the type kind, or,
	 * 3) if it is a mixin class in which all their children are functional complexes.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isKind = this.isKind();\nif (_isKind)\n{\n\treturn true;\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> providers = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProviders = this.identityProviders();\n\tproviders.addAll(_identityProviders);\n\tfor (final <%net.menthor.onto2.ontouml.Class%> c : providers)\n\t{\n\t\tboolean _isKind_1 = c.isKind();\n\t\tif (_isKind_1)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t}\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = this.children();\n\tint _size = _children.size();\n\tboolean _equals = (_size == 0);\n\tif (_equals)\n\t{\n\t\treturn false;\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children_1 = this.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> child : _children_1)\n\t{\n\t\tif ((child instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tboolean _isKind_2 = ((<%net.menthor.onto2.ontouml.Class%>)child).isKind();\n\t\t\tboolean _not = (!_isKind_2);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t}\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isFunctionalComplex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checks if this element is a collective i.e.
	 * 1) if it is a collective element, or,
	 * 2) if it is a subKind or role/phase with exactly one identity provider of the type Collective, or,
	 * 3) if it is a mixin class in which all their children are collectives.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isCollective = this.isCollective();\nif (_isCollective)\n{\n\treturn true;\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> providers = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProviders = this.identityProviders();\n\tproviders.addAll(_identityProviders);\n\tfor (final <%net.menthor.onto2.ontouml.Class%> c : providers)\n\t{\n\t\tboolean _isCollective_1 = c.isCollective();\n\t\tif (_isCollective_1)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t}\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = this.children();\n\tint _size = _children.size();\n\tboolean _equals = (_size == 0);\n\tif (_equals)\n\t{\n\t\treturn false;\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children_1 = this.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> child : _children_1)\n\t{\n\t\tif ((child instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tboolean _isCollective_2 = ((<%net.menthor.onto2.ontouml.Class%>)child).isCollective();\n\t\t\tboolean _not = (!_isCollective_2);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t}\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isCollection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checks if this element is a moment  i.e.
	 * 1) if it is a relator, mode or quality element, or,
	 * 2) if it is a subKind or role/phase with exactly one identity provider being a relator, mode or quality, or,
	 * 3) if it is a mixin class in which all their children are relators, qualities or modes.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isMomentClass = this.isMomentClass();\nif (_isMomentClass)\n{\n\treturn true;\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> providers = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProviders = this.identityProviders();\n\tproviders.addAll(_identityProviders);\n\tfor (final <%net.menthor.onto2.ontouml.Class%> c : providers)\n\t{\n\t\tboolean _isMomentClass_1 = c.isMomentClass();\n\t\tif (_isMomentClass_1)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t}\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = this.children();\n\tint _size = _children.size();\n\tboolean _equals = (_size == 0);\n\tif (_equals)\n\t{\n\t\treturn false;\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children_1 = this.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> child : _children_1)\n\t{\n\t\tif ((child instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tboolean _isMomentClass_2 = ((<%net.menthor.onto2.ontouml.Class%>)child).isMomentClass();\n\t\t\tboolean _not = (!_isMomentClass_2);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t}\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isMoment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checks if this element is a truth maker (relator) i.e.
	 * 1) if it is a truth maker element, or,
	 * 2) if it is a subKind or role/phase with exactly one identity provider being a truth maker, or,
	 * 3) if it is a mixin class in which all their children are truth makers.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isRelator = this.isRelator();\nif (_isRelator)\n{\n\treturn true;\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> providers = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProviders = this.identityProviders();\n\tproviders.addAll(_identityProviders);\n\tfor (final <%net.menthor.onto2.ontouml.Class%> c : providers)\n\t{\n\t\tboolean _isRelator_1 = c.isRelator();\n\t\tif (_isRelator_1)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t}\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = this.children();\n\tint _size = _children.size();\n\tboolean _equals = (_size == 0);\n\tif (_equals)\n\t{\n\t\treturn false;\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children_1 = this.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> child : _children_1)\n\t{\n\t\tif ((child instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tboolean _isRelator_2 = ((<%net.menthor.onto2.ontouml.Class%>)child).isRelator();\n\t\t\tboolean _not = (!_isRelator_2);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t}\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isTruthMaker();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checks if this element is a non qualitative instrinsic moment (mode) i.e.
	 * 1) if it is a instrinsic moment which is a non qualitative element, or,
	 * 2) if it is a subKind or role/phase with exactly one identity provider being a non qualitative intrinsic moment, or,
	 * 3) if it is a mixin class in which all their children are non qualitative intrinsic moment.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isMode = this.isMode();\nif (_isMode)\n{\n\treturn true;\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> providers = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProviders = this.identityProviders();\n\tproviders.addAll(_identityProviders);\n\tfor (final <%net.menthor.onto2.ontouml.Class%> c : providers)\n\t{\n\t\tboolean _isMode_1 = c.isMode();\n\t\tif (_isMode_1)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t}\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = this.children();\n\tint _size = _children.size();\n\tboolean _equals = (_size == 0);\n\tif (_equals)\n\t{\n\t\treturn false;\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children_1 = this.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> child : _children_1)\n\t{\n\t\tif ((child instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tboolean _isMode_2 = ((<%net.menthor.onto2.ontouml.Class%>)child).isMode();\n\t\t\tboolean _not = (!_isMode_2);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t}\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isNonQualitativeIntrinsicMoment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Checks if this element is a qualitative instrinsic moment (quality) i.e.
	 * 1) if it is a instrinsic moment which is a qualitative element, or,
	 * 2) if it is a subKind or role/phase with exactly one identity provider being a qualitative intrinsic moment, or,
	 * 3) if it is a mixin class in which all their children are qualitative intrinsic moment.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='boolean _isQuality = this.isQuality();\nif (_isQuality)\n{\n\treturn true;\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> providers = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProviders = this.identityProviders();\n\tproviders.addAll(_identityProviders);\n\tfor (final <%net.menthor.onto2.ontouml.Class%> c : providers)\n\t{\n\t\tboolean _isQuality_1 = c.isQuality();\n\t\tif (_isQuality_1)\n\t\t{\n\t\t\treturn true;\n\t\t}\n\t}\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children = this.children();\n\tint _size = _children.size();\n\tboolean _equals = (_size == 0);\n\tif (_equals)\n\t{\n\t\treturn false;\n\t}\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _children_1 = this.children();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> child : _children_1)\n\t{\n\t\tif ((child instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\tboolean _isQuality_2 = ((<%net.menthor.onto2.ontouml.Class%>)child).isQuality();\n\t\t\tboolean _not = (!_isQuality_2);\n\t\t\tif (_not)\n\t\t\t{\n\t\t\t\treturn false;\n\t\t\t}\n\t\t}\n\t}\n\treturn true;\n}\nreturn false;'"
	 * @generated
	 */
	boolean isQualitativeIntrinsicMoment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the identity providers amongst all parents of a class (more than one may be found)
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = this.allParents();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _allParents)\n{\n\tif ((p instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t{\n\t\tboolean _isIdentityProviderClass = ((<%net.menthor.onto2.ontouml.Class%>)p).isIdentityProviderClass();\n\t\tif (_isIdentityProviderClass)\n\t\t{\n\t\t\tresult.add(((<%net.menthor.onto2.ontouml.Class%>)p));\n\t\t}\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Class%>>toEList(result);'"
	 * @generated
	 */
	EList<Class> identityProvidersAtAllParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the identity providers amongst all children of a class (more than one may be found)
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\n<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allChildren = this.allChildren();\nfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _allChildren)\n{\n\tif ((p instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t{\n\t\tboolean _isIdentityProviderClass = ((<%net.menthor.onto2.ontouml.Class%>)p).isIdentityProviderClass();\n\t\tif (_isIdentityProviderClass)\n\t\t{\n\t\t\tresult.add(((<%net.menthor.onto2.ontouml.Class%>)p));\n\t\t}\n\t\tboolean _or = false;\n\t\tboolean _or_1 = false;\n\t\tboolean _isRole = ((<%net.menthor.onto2.ontouml.Class%>)p).isRole();\n\t\tif (_isRole)\n\t\t{\n\t\t\t_or_1 = true;\n\t\t} else\n\t\t{\n\t\t\tboolean _isPhase = this.isPhase();\n\t\t\t_or_1 = _isPhase;\n\t\t}\n\t\tif (_or_1)\n\t\t{\n\t\t\t_or = true;\n\t\t} else\n\t\t{\n\t\t\tboolean _isSubKind = ((<%net.menthor.onto2.ontouml.Class%>)p).isSubKind();\n\t\t\t_or = _isSubKind;\n\t\t}\n\t\tif (_or)\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProvidersAtAllParents = ((<%net.menthor.onto2.ontouml.Class%>)p).identityProvidersAtAllParents();\n\t\t\tresult.addAll(_identityProvidersAtAllParents);\n\t\t}\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Class%>>toEList(result);'"
	 * @generated
	 */
	EList<Class> identityProvidersAtAllChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the identity providers of a class (more than one may be found)
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='<%java.util.ArrayList%><<%net.menthor.onto2.ontouml.Class%>> result = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%net.menthor.onto2.ontouml.Class%>>newArrayList();\nboolean _isIdentityProviderClass = this.isIdentityProviderClass();\nif (_isIdentityProviderClass)\n{\n\tresult.add(this);\n}\nboolean _or = false;\nboolean _or_1 = false;\nboolean _isRole = this.isRole();\nif (_isRole)\n{\n\t_or_1 = true;\n} else\n{\n\tboolean _isPhase = this.isPhase();\n\t_or_1 = _isPhase;\n}\nif (_or_1)\n{\n\t_or = true;\n} else\n{\n\tboolean _isSubKind = this.isSubKind();\n\t_or = _isSubKind;\n}\nif (_or)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProvidersAtAllParents = this.identityProvidersAtAllParents();\n\tresult.addAll(_identityProvidersAtAllParents);\n}\nboolean _isMixinClass = this.isMixinClass();\nif (_isMixinClass)\n{\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProvidersAtAllChildren = this.identityProvidersAtAllChildren();\n\tresult.addAll(_identityProvidersAtAllChildren);\n\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Classifier%>> _allParents = this.allParents();\n\tfor (final <%net.menthor.onto2.ontouml.Classifier%> p : _allParents)\n\t{\n\t\tif ((p instanceof <%net.menthor.onto2.ontouml.Class%>))\n\t\t{\n\t\t\t<%org.eclipse.emf.common.util.EList%><<%net.menthor.onto2.ontouml.Class%>> _identityProvidersAtAllChildren_1 = ((<%net.menthor.onto2.ontouml.Class%>)p).identityProvidersAtAllChildren();\n\t\t\tresult.addAll(_identityProvidersAtAllChildren_1);\n\t\t}\n\t}\n}\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%net.menthor.onto2.ontouml.Class%>>toEList(result);'"
	 * @generated
	 */
	EList<Class> identityProviders();

} // Class
