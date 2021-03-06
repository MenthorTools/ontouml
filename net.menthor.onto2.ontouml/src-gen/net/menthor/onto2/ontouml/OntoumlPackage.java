/**
 */
package net.menthor.onto2.ontouml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.menthor.onto2.ontouml.OntoumlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel testsDirectory='/net.menthor.onto2.ontouml.tests/src-gen' editDirectory='/net.menthor.onto2.ontouml.edit/src-gen' editorDirectory='/net.menthor.onto2.ontouml.editor/src-gen' fileExtensions='mouml' basePackage='net.menthor.onto2'"
 * @generated
 */
public interface OntoumlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ontouml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://menthor.net/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "menthor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OntoumlPackage eINSTANCE = net.menthor.onto2.ontouml.impl.OntoumlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.ElementImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.NamedElementImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.ContainerImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___PACKAGES = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>All Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_PACKAGES__CONTAINER_ELIST = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>All Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_PACKAGES = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___RELATIONSHIPS = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_RELATIONSHIPS__CONTAINER_ELIST = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_RELATIONSHIPS = NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___GENERALIZATION_SETS = NAMED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>All Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_GENERALIZATION_SETS__CONTAINER_ELIST = NAMED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>All Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_GENERALIZATION_SETS = NAMED_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___CLASSES = NAMED_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>All Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_CLASSES__CONTAINER_ELIST = NAMED_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>All Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_CLASSES = NAMED_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___DATA_TYPES = NAMED_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>All Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_DATA_TYPES__CONTAINER_ELIST = NAMED_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>All Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_DATA_TYPES = NAMED_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___TYPES = NAMED_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_TYPES__CONTAINER_ELIST = NAMED_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER___ALL_TYPES = NAMED_ELEMENT_OPERATION_COUNT + 17;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 18;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.ContainedElementImpl <em>Contained Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.ContainedElementImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getContainedElement()
	 * @generated
	 */
	int CONTAINED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__HOLDER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT__COMMENTS = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT___GET_MODEL = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT___GET_MODEL__CONTAINER = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contained Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.CommentImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.ModelImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___PACKAGES = CONTAINER___PACKAGES;

	/**
	 * The operation id for the '<em>All Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_PACKAGES__CONTAINER_ELIST = CONTAINER___ALL_PACKAGES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_PACKAGES = CONTAINER___ALL_PACKAGES;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___RELATIONSHIPS = CONTAINER___RELATIONSHIPS;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_RELATIONSHIPS__CONTAINER_ELIST = CONTAINER___ALL_RELATIONSHIPS__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_RELATIONSHIPS = CONTAINER___ALL_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___GENERALIZATION_SETS = CONTAINER___GENERALIZATION_SETS;

	/**
	 * The operation id for the '<em>All Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_GENERALIZATION_SETS__CONTAINER_ELIST = CONTAINER___ALL_GENERALIZATION_SETS__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_GENERALIZATION_SETS = CONTAINER___ALL_GENERALIZATION_SETS;

	/**
	 * The operation id for the '<em>Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___CLASSES = CONTAINER___CLASSES;

	/**
	 * The operation id for the '<em>All Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_CLASSES__CONTAINER_ELIST = CONTAINER___ALL_CLASSES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_CLASSES = CONTAINER___ALL_CLASSES;

	/**
	 * The operation id for the '<em>Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___DATA_TYPES = CONTAINER___DATA_TYPES;

	/**
	 * The operation id for the '<em>All Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_DATA_TYPES__CONTAINER_ELIST = CONTAINER___ALL_DATA_TYPES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_DATA_TYPES = CONTAINER___ALL_DATA_TYPES;

	/**
	 * The operation id for the '<em>Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___TYPES = CONTAINER___TYPES;

	/**
	 * The operation id for the '<em>All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_TYPES__CONTAINER_ELIST = CONTAINER___ALL_TYPES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ALL_TYPES = CONTAINER___ALL_TYPES;

	/**
	 * The operation id for the '<em>Initialize Validator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___INITIALIZE_VALIDATOR__DIAGNOSTICCHAIN_MAP = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.PackageImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENTS = CONTAINER__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__HOLDER = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENTS = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___PACKAGES = CONTAINER___PACKAGES;

	/**
	 * The operation id for the '<em>All Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_PACKAGES__CONTAINER_ELIST = CONTAINER___ALL_PACKAGES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_PACKAGES = CONTAINER___ALL_PACKAGES;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___RELATIONSHIPS = CONTAINER___RELATIONSHIPS;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_RELATIONSHIPS__CONTAINER_ELIST = CONTAINER___ALL_RELATIONSHIPS__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_RELATIONSHIPS = CONTAINER___ALL_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GENERALIZATION_SETS = CONTAINER___GENERALIZATION_SETS;

	/**
	 * The operation id for the '<em>All Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_GENERALIZATION_SETS__CONTAINER_ELIST = CONTAINER___ALL_GENERALIZATION_SETS__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Generalization Sets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_GENERALIZATION_SETS = CONTAINER___ALL_GENERALIZATION_SETS;

	/**
	 * The operation id for the '<em>Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CLASSES = CONTAINER___CLASSES;

	/**
	 * The operation id for the '<em>All Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_CLASSES__CONTAINER_ELIST = CONTAINER___ALL_CLASSES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_CLASSES = CONTAINER___ALL_CLASSES;

	/**
	 * The operation id for the '<em>Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___DATA_TYPES = CONTAINER___DATA_TYPES;

	/**
	 * The operation id for the '<em>All Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_DATA_TYPES__CONTAINER_ELIST = CONTAINER___ALL_DATA_TYPES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Data Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_DATA_TYPES = CONTAINER___ALL_DATA_TYPES;

	/**
	 * The operation id for the '<em>Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___TYPES = CONTAINER___TYPES;

	/**
	 * The operation id for the '<em>All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_TYPES__CONTAINER_ELIST = CONTAINER___ALL_TYPES__CONTAINER_ELIST;

	/**
	 * The operation id for the '<em>All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___ALL_TYPES = CONTAINER___ALL_TYPES;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_MODEL = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_MODEL__CONTAINER = CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.ClassifierImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 7;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__HOLDER = CONTAINED_ELEMENT__HOLDER;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__COMMENTS = CONTAINED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = CONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__ALIAS = CONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__DEFINITIONS = CONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__SYNONYMS = CONTAINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__TEXT = CONTAINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is General In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_GENERAL_IN = CONTAINED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Specific In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__IS_SPECIFIC_IN = CONTAINED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = CONTAINED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_MODEL = CONTAINED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___GET_MODEL__CONTAINER = CONTAINED_ELEMENT___GET_MODEL__CONTAINER;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___CHILDREN = CONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___PARENTS = CONTAINED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_PARENTS__CLASSIFIER_ELIST = CONTAINED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_PARENTS = CONTAINED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_CHILDREN__CLASSIFIER_ELIST = CONTAINED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_CHILDREN = CONTAINED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Siblings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___SIBLINGS = CONTAINED_ELEMENT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ENDS = CONTAINED_ELEMENT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ENDS__RELATIONSHIPSTEREOTYPE = CONTAINED_ELEMENT_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_ENDS = CONTAINED_ELEMENT_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_ENDS__RELATIONSHIPSTEREOTYPE = CONTAINED_ELEMENT_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___RELATIONSHIPS = CONTAINED_ELEMENT_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___ALL_RELATIONSHIPS = CONTAINED_ELEMENT_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Disjoint Of Parents Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER = CONTAINED_ELEMENT_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Disjoint Of Children Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER = CONTAINED_ELEMENT_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Disjoint Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER___IS_DISJOINT_OF__CLASSIFIER = CONTAINED_ELEMENT_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = CONTAINED_ELEMENT_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.TypeImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 8;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__HOLDER = CLASSIFIER__HOLDER;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ALIAS = CLASSIFIER__ALIAS;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DEFINITIONS = CLASSIFIER__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SYNONYMS = CLASSIFIER__SYNONYMS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TEXT = CLASSIFIER__TEXT;

	/**
	 * The feature id for the '<em><b>Is General In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_GENERAL_IN = CLASSIFIER__IS_GENERAL_IN;

	/**
	 * The feature id for the '<em><b>Is Specific In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_SPECIFIC_IN = CLASSIFIER__IS_SPECIFIC_IN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ATTRIBUTES = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GET_MODEL = CLASSIFIER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GET_MODEL__CONTAINER = CLASSIFIER___GET_MODEL__CONTAINER;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___CHILDREN = CLASSIFIER___CHILDREN;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___PARENTS = CLASSIFIER___PARENTS;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_PARENTS__CLASSIFIER_ELIST = CLASSIFIER___ALL_PARENTS__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_PARENTS = CLASSIFIER___ALL_PARENTS;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_CHILDREN__CLASSIFIER_ELIST = CLASSIFIER___ALL_CHILDREN__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_CHILDREN = CLASSIFIER___ALL_CHILDREN;

	/**
	 * The operation id for the '<em>Siblings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___SIBLINGS = CLASSIFIER___SIBLINGS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ENDS = CLASSIFIER___ENDS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ENDS__RELATIONSHIPSTEREOTYPE = CLASSIFIER___ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_ENDS = CLASSIFIER___ALL_ENDS;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_ENDS__RELATIONSHIPSTEREOTYPE = CLASSIFIER___ALL_ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___RELATIONSHIPS = CLASSIFIER___RELATIONSHIPS;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_RELATIONSHIPS = CLASSIFIER___ALL_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Is Disjoint Of Parents Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER = CLASSIFIER___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of Children Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER = CLASSIFIER___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___IS_DISJOINT_OF__CLASSIFIER = CLASSIFIER___IS_DISJOINT_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Related Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___RELATED_TYPES = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>All Related Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___ALL_RELATED_TYPES = CLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.PropertyImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ORDERED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DERIVED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_DEPENDENCY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.AttributeImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ORDERED = PROPERTY__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_DERIVED = PROPERTY__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LOWER_BOUND = PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPPER_BOUND = PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_DEPENDENCY = PROPERTY__IS_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFINITIONS = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SYNONYMS = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TEXT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STEREOTYPE = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_INTEGER = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_BOOLEAN = PROPERTY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Real</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_REAL = PROPERTY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_DATE = PROPERTY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Date Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_DATE_TIME = PROPERTY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_STRING = PROPERTY_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.ConstraintImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__HOLDER = CONTAINED_ELEMENT__HOLDER;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMMENTS = CONTAINED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = CONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STEREOTYPE = CONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTEXT = CONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXPRESSION = CONTAINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = CONTAINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_MODEL = CONTAINED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT___GET_MODEL__CONTAINER = CONTAINED_ELEMENT___GET_MODEL__CONTAINER;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = CONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.LiteralImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__OWNER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Bound Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__UPPER_BOUND_REGION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LOWER_BOUND_REGION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.DataTypeImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__HOLDER = TYPE__HOLDER;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ALIAS = TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DEFINITIONS = TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SYNONYMS = TYPE__SYNONYMS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TEXT = TYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Is General In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_GENERAL_IN = TYPE__IS_GENERAL_IN;

	/**
	 * The feature id for the '<em><b>Is Specific In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__IS_SPECIFIC_IN = TYPE__IS_SPECIFIC_IN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ATTRIBUTES = TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__STEREOTYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DIMENSIONS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SCALE = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MEASUREMENT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UNIT_OF_MEASURE = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower Bound Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LOWER_BOUND_REGION = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Upper Bound Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UPPER_BOUND_REGION = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owner Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OWNER_DOMAIN = TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LITERALS = TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__STRUCTURE = TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_MODEL = TYPE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_MODEL__CONTAINER = TYPE___GET_MODEL__CONTAINER;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___CHILDREN = TYPE___CHILDREN;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___PARENTS = TYPE___PARENTS;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_PARENTS__CLASSIFIER_ELIST = TYPE___ALL_PARENTS__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_PARENTS = TYPE___ALL_PARENTS;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_CHILDREN__CLASSIFIER_ELIST = TYPE___ALL_CHILDREN__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_CHILDREN = TYPE___ALL_CHILDREN;

	/**
	 * The operation id for the '<em>Siblings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___SIBLINGS = TYPE___SIBLINGS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ENDS = TYPE___ENDS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ENDS__RELATIONSHIPSTEREOTYPE = TYPE___ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_ENDS = TYPE___ALL_ENDS;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_ENDS__RELATIONSHIPSTEREOTYPE = TYPE___ALL_ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___RELATIONSHIPS = TYPE___RELATIONSHIPS;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_RELATIONSHIPS = TYPE___ALL_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Is Disjoint Of Parents Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER = TYPE___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of Children Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER = TYPE___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_DISJOINT_OF__CLASSIFIER = TYPE___IS_DISJOINT_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Related Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___RELATED_TYPES = TYPE___RELATED_TYPES;

	/**
	 * The operation id for the '<em>All Related Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___ALL_RELATED_TYPES = TYPE___ALL_RELATED_TYPES;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_ENUMERATION = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_DOMAIN = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Dimension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_DIMENSION = TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_DATA_TYPE = TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Nominal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_NOMINAL = TYPE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Interval</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_INTERVAL = TYPE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Ordinal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_ORDINAL = TYPE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Rational</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_RATIONAL = TYPE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_STRING = TYPE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_INTEGER = TYPE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_DECIMAL = TYPE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Real</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_REAL = TYPE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Nominal String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_NOMINAL_STRING = TYPE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Interval Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_INTERVAL_INTEGER = TYPE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Interval Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_INTERVAL_DECIMAL = TYPE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Ordinal Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_ORDINAL_INTEGER = TYPE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Ordinal Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_ORDINAL_DECIMAL = TYPE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Rational Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_RATIONAL_INTEGER = TYPE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Rational Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_RATIONAL_DECIMAL = TYPE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Interval Real</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_INTERVAL_REAL = TYPE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Ordinal Real</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_ORDINAL_REAL = TYPE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Rational Real</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_RATIONAL_REAL = TYPE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___IS_STRUCTURE = TYPE_OPERATION_COUNT + 22;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 23;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.ClassImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 14;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__HOLDER = TYPE__HOLDER;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ALIAS = TYPE__ALIAS;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DEFINITIONS = TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SYNONYMS = TYPE__SYNONYMS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TEXT = TYPE__TEXT;

	/**
	 * The feature id for the '<em><b>Is General In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_GENERAL_IN = TYPE__IS_GENERAL_IN;

	/**
	 * The feature id for the '<em><b>Is Specific In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_SPECIFIC_IN = TYPE__IS_SPECIFIC_IN;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__STEREOTYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_DERIVED = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Extensional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_EXTENSIONAL = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quality Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__QUALITY_NATURE = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Existence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXISTENCE = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASSIFICATION = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_MODEL = TYPE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GET_MODEL__CONTAINER = TYPE___GET_MODEL__CONTAINER;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___CHILDREN = TYPE___CHILDREN;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___PARENTS = TYPE___PARENTS;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_PARENTS__CLASSIFIER_ELIST = TYPE___ALL_PARENTS__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_PARENTS = TYPE___ALL_PARENTS;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_CHILDREN__CLASSIFIER_ELIST = TYPE___ALL_CHILDREN__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_CHILDREN = TYPE___ALL_CHILDREN;

	/**
	 * The operation id for the '<em>Siblings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___SIBLINGS = TYPE___SIBLINGS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ENDS = TYPE___ENDS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ENDS__RELATIONSHIPSTEREOTYPE = TYPE___ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_ENDS = TYPE___ALL_ENDS;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_ENDS__RELATIONSHIPSTEREOTYPE = TYPE___ALL_ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___RELATIONSHIPS = TYPE___RELATIONSHIPS;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_RELATIONSHIPS = TYPE___ALL_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Is Disjoint Of Parents Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER = TYPE___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of Children Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER = TYPE___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_DISJOINT_OF__CLASSIFIER = TYPE___IS_DISJOINT_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Related Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___RELATED_TYPES = TYPE___RELATED_TYPES;

	/**
	 * The operation id for the '<em>All Related Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ALL_RELATED_TYPES = TYPE___ALL_RELATED_TYPES;

	/**
	 * The operation id for the '<em>Is Kind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_KIND = TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Sub Kind</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_SUB_KIND = TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Collective</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_COLLECTIVE = TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Quantity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_QUANTITY = TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Relator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_RELATOR = TYPE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_MODE = TYPE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Quality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_QUALITY = TYPE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_ROLE = TYPE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Role Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_ROLE_MIXIN = TYPE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Phase Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_PHASE_MIXIN = TYPE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Phase</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_PHASE = TYPE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_CATEGORY = TYPE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Mixin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_MIXIN = TYPE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_EVENT = TYPE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is High Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_HIGH_ORDER = TYPE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_RIGID = TYPE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Non Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_NON_RIGID = TYPE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Anti Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_ANTI_RIGID = TYPE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Semi Rigid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_SEMI_RIGID = TYPE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Perceivable Quality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_PERCEIVABLE_QUALITY = TYPE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Non Perceivable Quality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_NON_PERCEIVABLE_QUALITY = TYPE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Nominal Quality</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_NOMINAL_QUALITY = TYPE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Endurant Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_ENDURANT_CLASS = TYPE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Intrinsic Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_INTRINSIC_MOMENT = TYPE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Substance Sortal Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_SUBSTANCE_SORTAL_CLASS = TYPE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Moment Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_MOMENT_CLASS = TYPE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is Identity Provider Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_IDENTITY_PROVIDER_CLASS = TYPE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Mixin Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_MIXIN_CLASS = TYPE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Anti Rigid Mixin Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_ANTI_RIGID_MIXIN_CLASS = TYPE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Amount Of Matter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_AMOUNT_OF_MATTER = TYPE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Is Functional Complex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_FUNCTIONAL_COMPLEX = TYPE_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_COLLECTION = TYPE_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Is Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_MOMENT = TYPE_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Is Truth Maker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_TRUTH_MAKER = TYPE_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Is Non Qualitative Intrinsic Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_NON_QUALITATIVE_INTRINSIC_MOMENT = TYPE_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Is Qualitative Intrinsic Moment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IS_QUALITATIVE_INTRINSIC_MOMENT = TYPE_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Identity Providers At All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IDENTITY_PROVIDERS_AT_ALL_PARENTS = TYPE_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Identity Providers At All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IDENTITY_PROVIDERS_AT_ALL_CHILDREN = TYPE_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Identity Providers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___IDENTITY_PROVIDERS = TYPE_OPERATION_COUNT + 38;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 39;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.EndPointImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__IS_ORDERED = PROPERTY__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__IS_DERIVED = PROPERTY__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__LOWER_BOUND = PROPERTY__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__UPPER_BOUND = PROPERTY__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__IS_DEPENDENCY = PROPERTY__IS_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__OWNER = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__END_TYPE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subsets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__SUBSETS = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Redefines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__REDEFINES = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Subsetted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__IS_SUBSETTED_BY = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Redefined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__IS_REDEFINED_BY = PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.RelationshipImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 16;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__HOLDER = CLASSIFIER__HOLDER;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ALIAS = CLASSIFIER__ALIAS;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DEFINITIONS = CLASSIFIER__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Synonyms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SYNONYMS = CLASSIFIER__SYNONYMS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TEXT = CLASSIFIER__TEXT;

	/**
	 * The feature id for the '<em><b>Is General In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IS_GENERAL_IN = CLASSIFIER__IS_GENERAL_IN;

	/**
	 * The feature id for the '<em><b>Is Specific In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IS_SPECIFIC_IN = CLASSIFIER__IS_SPECIFIC_IN;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__STEREOTYPE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reflexivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__REFLEXIVITY = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symmetry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SYMMETRY = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TRANSITIVITY = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ciclicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CICLICITY = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__END_POINTS = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Temporal Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TEMPORAL_NATURE = CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participation Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PARTICIPATION_NATURE = CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___GET_MODEL = CLASSIFIER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___GET_MODEL__CONTAINER = CLASSIFIER___GET_MODEL__CONTAINER;

	/**
	 * The operation id for the '<em>Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___CHILDREN = CLASSIFIER___CHILDREN;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___PARENTS = CLASSIFIER___PARENTS;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_PARENTS__CLASSIFIER_ELIST = CLASSIFIER___ALL_PARENTS__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_PARENTS = CLASSIFIER___ALL_PARENTS;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_CHILDREN__CLASSIFIER_ELIST = CLASSIFIER___ALL_CHILDREN__CLASSIFIER_ELIST;

	/**
	 * The operation id for the '<em>All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_CHILDREN = CLASSIFIER___ALL_CHILDREN;

	/**
	 * The operation id for the '<em>Siblings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___SIBLINGS = CLASSIFIER___SIBLINGS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ENDS = CLASSIFIER___ENDS;

	/**
	 * The operation id for the '<em>Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ENDS__RELATIONSHIPSTEREOTYPE = CLASSIFIER___ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_ENDS = CLASSIFIER___ALL_ENDS;

	/**
	 * The operation id for the '<em>All Ends</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_ENDS__RELATIONSHIPSTEREOTYPE = CLASSIFIER___ALL_ENDS__RELATIONSHIPSTEREOTYPE;

	/**
	 * The operation id for the '<em>Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___RELATIONSHIPS = CLASSIFIER___RELATIONSHIPS;

	/**
	 * The operation id for the '<em>All Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_RELATIONSHIPS = CLASSIFIER___ALL_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Is Disjoint Of Parents Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER = CLASSIFIER___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of Children Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER = CLASSIFIER___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Disjoint Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_DISJOINT_OF__CLASSIFIER = CLASSIFIER___IS_DISJOINT_OF__CLASSIFIER;

	/**
	 * The operation id for the '<em>Is Component Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_COMPONENT_OF = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Member Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_MEMBER_OF = CLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Sub Collection Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_SUB_COLLECTION_OF = CLASSIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Sub Quantity Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_SUB_QUANTITY_OF = CLASSIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Qua Part Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_QUA_PART_OF = CLASSIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Constitution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_CONSTITUTION = CLASSIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Characterization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_CHARACTERIZATION = CLASSIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Mediation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_MEDIATION = CLASSIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Material</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_MATERIAL = CLASSIFIER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Formal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_FORMAL = CLASSIFIER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Structuration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_STRUCTURATION = CLASSIFIER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Participation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_PARTICIPATION = CLASSIFIER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Sub Event Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_SUB_EVENT_OF = CLASSIFIER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Causation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_CAUSATION = CLASSIFIER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Is Temporal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_TEMPORAL = CLASSIFIER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Is Instance Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_INSTANCE_OF = CLASSIFIER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_DERIVATION = CLASSIFIER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Meronymic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_MERONYMIC = CLASSIFIER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Is Binary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_BINARY = CLASSIFIER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Is Ternary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_TERNARY = CLASSIFIER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Starts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_STARTS = CLASSIFIER_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_PRECEDES = CLASSIFIER_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_EQUALS = CLASSIFIER_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Is Meets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_MEETS = CLASSIFIER_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Finishes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_FINISHES = CLASSIFIER_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_OVERLAPS = CLASSIFIER_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Is During</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_DURING = CLASSIFIER_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Is Creation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_CREATION = CLASSIFIER_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Is Destruction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_DESTRUCTION = CLASSIFIER_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Is Change</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_CHANGE = CLASSIFIER_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Source End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___SOURCE_END = CLASSIFIER_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Target End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___TARGET_END = CLASSIFIER_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Part End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___PART_END = CLASSIFIER_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Whole End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___WHOLE_END = CLASSIFIER_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Source</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___SOURCE = CLASSIFIER_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Target</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___TARGET = CLASSIFIER_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Source Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___SOURCE_CLASS = CLASSIFIER_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Target Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___TARGET_CLASS = CLASSIFIER_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Whole Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___WHOLE_CLASS = CLASSIFIER_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Part Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___PART_CLASS = CLASSIFIER_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Source Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___SOURCE_DATA_TYPE = CLASSIFIER_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Target Data Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___TARGET_DATA_TYPE = CLASSIFIER_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Source Relationship</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___SOURCE_RELATIONSHIP = CLASSIFIER_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Target Relationship</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___TARGET_RELATIONSHIP = CLASSIFIER_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Is Derived</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_DERIVED = CLASSIFIER_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Is End</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_END__CLASSIFIER = CLASSIFIER_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Is Part Essential</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_PART_ESSENTIAL = CLASSIFIER_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Is Part Inseparable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_PART_INSEPARABLE = CLASSIFIER_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Is Part Immutable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_PART_IMMUTABLE = CLASSIFIER_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Is Whole Immutable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_WHOLE_IMMUTABLE = CLASSIFIER_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Is Part Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_PART_MANDATORY = CLASSIFIER_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Is Whole Mandatory</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_WHOLE_MANDATORY = CLASSIFIER_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Is Part Shareable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___IS_PART_SHAREABLE = CLASSIFIER_OPERATION_COUNT + 52;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 53;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.GeneralizationSetImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getGeneralizationSet()
	 * @generated
	 */
	int GENERALIZATION_SET = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__HOLDER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__COMMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Covering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_COVERING = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Disjoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__IS_DISJOINT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generalizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__GENERALIZATIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>High Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET__HIGH_ORDER = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GET_MODEL = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GET_MODEL__CONTAINER = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>General</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___GENERAL = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Specifics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET___SPECIFICS = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Generalization Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_SET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.impl.GeneralizationImpl
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 18;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__HOLDER = CONTAINED_ELEMENT__HOLDER;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__COMMENTS = CONTAINED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = CONTAINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = CONTAINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalization Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERALIZATION_SET = CONTAINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = CONTAINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_MODEL = CONTAINED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION___GET_MODEL__CONTAINER = CONTAINED_ELEMENT___GET_MODEL__CONTAINER;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = CONTAINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.PrimitiveStereotype <em>Primitive Stereotype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.PrimitiveStereotype
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getPrimitiveStereotype()
	 * @generated
	 */
	int PRIMITIVE_STEREOTYPE = 19;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.ConstraintStereotype <em>Constraint Stereotype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.ConstraintStereotype
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getConstraintStereotype()
	 * @generated
	 */
	int CONSTRAINT_STEREOTYPE = 20;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.ClassStereotype <em>Class Stereotype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.ClassStereotype
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClassStereotype()
	 * @generated
	 */
	int CLASS_STEREOTYPE = 21;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.DataTypeStereotype <em>Data Type Stereotype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.DataTypeStereotype
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getDataTypeStereotype()
	 * @generated
	 */
	int DATA_TYPE_STEREOTYPE = 22;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Scale <em>Scale</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Scale
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 23;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Measurement <em>Measurement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Measurement
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 24;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.QualityNature <em>Quality Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.QualityNature
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getQualityNature()
	 * @generated
	 */
	int QUALITY_NATURE = 25;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Classification <em>Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Classification
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 26;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Existence <em>Existence</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Existence
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getExistence()
	 * @generated
	 */
	int EXISTENCE = 27;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.RelationshipStereotype <em>Relationship Stereotype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.RelationshipStereotype
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getRelationshipStereotype()
	 * @generated
	 */
	int RELATIONSHIP_STEREOTYPE = 28;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.TemporalNature <em>Temporal Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.TemporalNature
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getTemporalNature()
	 * @generated
	 */
	int TEMPORAL_NATURE = 29;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.ParticipationNature <em>Participation Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.ParticipationNature
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getParticipationNature()
	 * @generated
	 */
	int PARTICIPATION_NATURE = 30;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Reflexivity <em>Reflexivity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Reflexivity
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getReflexivity()
	 * @generated
	 */
	int REFLEXIVITY = 31;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Symmetry <em>Symmetry</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Symmetry
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getSymmetry()
	 * @generated
	 */
	int SYMMETRY = 32;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Transitivity <em>Transitivity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Transitivity
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getTransitivity()
	 * @generated
	 */
	int TRANSITIVITY = 33;

	/**
	 * The meta object id for the '{@link net.menthor.onto2.ontouml.Ciclicity <em>Ciclicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.menthor.onto2.ontouml.Ciclicity
	 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getCiclicity()
	 * @generated
	 */
	int CICLICITY = 34;


	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.menthor.onto2.ontouml.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see net.menthor.onto2.ontouml.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.menthor.onto2.ontouml.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see net.menthor.onto2.ontouml.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.menthor.onto2.ontouml.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see net.menthor.onto2.ontouml.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#packages() <em>Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Packages</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#packages()
	 * @generated
	 */
	EOperation getContainer__Packages();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allPackages(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList) <em>All Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Packages</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allPackages(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getContainer__AllPackages__Container_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allPackages() <em>All Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Packages</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allPackages()
	 * @generated
	 */
	EOperation getContainer__AllPackages();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#relationships() <em>Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relationships</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#relationships()
	 * @generated
	 */
	EOperation getContainer__Relationships();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allRelationships(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList) <em>All Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Relationships</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allRelationships(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getContainer__AllRelationships__Container_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allRelationships() <em>All Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Relationships</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allRelationships()
	 * @generated
	 */
	EOperation getContainer__AllRelationships();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#generalizationSets() <em>Generalization Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generalization Sets</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#generalizationSets()
	 * @generated
	 */
	EOperation getContainer__GeneralizationSets();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allGeneralizationSets(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList) <em>All Generalization Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Generalization Sets</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allGeneralizationSets(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getContainer__AllGeneralizationSets__Container_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allGeneralizationSets() <em>All Generalization Sets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Generalization Sets</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allGeneralizationSets()
	 * @generated
	 */
	EOperation getContainer__AllGeneralizationSets();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#classes() <em>Classes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Classes</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#classes()
	 * @generated
	 */
	EOperation getContainer__Classes();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allClasses(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList) <em>All Classes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Classes</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allClasses(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getContainer__AllClasses__Container_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allClasses() <em>All Classes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Classes</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allClasses()
	 * @generated
	 */
	EOperation getContainer__AllClasses();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#dataTypes() <em>Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#dataTypes()
	 * @generated
	 */
	EOperation getContainer__DataTypes();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allDataTypes(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList) <em>All Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Data Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allDataTypes(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getContainer__AllDataTypes__Container_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allDataTypes() <em>All Data Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Data Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allDataTypes()
	 * @generated
	 */
	EOperation getContainer__AllDataTypes();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#types() <em>Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#types()
	 * @generated
	 */
	EOperation getContainer__Types();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allTypes(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList) <em>All Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allTypes(net.menthor.onto2.ontouml.Container, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getContainer__AllTypes__Container_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Container#allTypes() <em>All Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Container#allTypes()
	 * @generated
	 */
	EOperation getContainer__AllTypes();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.ContainedElement <em>Contained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Element</em>'.
	 * @see net.menthor.onto2.ontouml.ContainedElement
	 * @generated
	 */
	EClass getContainedElement();

	/**
	 * Returns the meta object for the container reference '{@link net.menthor.onto2.ontouml.ContainedElement#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Holder</em>'.
	 * @see net.menthor.onto2.ontouml.ContainedElement#getHolder()
	 * @see #getContainedElement()
	 * @generated
	 */
	EReference getContainedElement_Holder();

	/**
	 * Returns the meta object for the containment reference list '{@link net.menthor.onto2.ontouml.ContainedElement#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see net.menthor.onto2.ontouml.ContainedElement#getComments()
	 * @see #getContainedElement()
	 * @generated
	 */
	EReference getContainedElement_Comments();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.ContainedElement#getModel() <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model</em>' operation.
	 * @see net.menthor.onto2.ontouml.ContainedElement#getModel()
	 * @generated
	 */
	EOperation getContainedElement__GetModel();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.ContainedElement#getModel(net.menthor.onto2.ontouml.Container) <em>Get Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Model</em>' operation.
	 * @see net.menthor.onto2.ontouml.ContainedElement#getModel(net.menthor.onto2.ontouml.Container)
	 * @generated
	 */
	EOperation getContainedElement__GetModel__Container();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see net.menthor.onto2.ontouml.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Comment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see net.menthor.onto2.ontouml.Comment#getContent()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Content();

	/**
	 * Returns the meta object for the container reference '{@link net.menthor.onto2.ontouml.Comment#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see net.menthor.onto2.ontouml.Comment#getOwner()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Owner();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see net.menthor.onto2.ontouml.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Model#initializeValidator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Initialize Validator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Validator</em>' operation.
	 * @see net.menthor.onto2.ontouml.Model#initializeValidator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getModel__InitializeValidator__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see net.menthor.onto2.ontouml.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see net.menthor.onto2.ontouml.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Classifier#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see net.menthor.onto2.ontouml.Classifier#getAlias()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Alias();

	/**
	 * Returns the meta object for the attribute list '{@link net.menthor.onto2.ontouml.Classifier#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Definitions</em>'.
	 * @see net.menthor.onto2.ontouml.Classifier#getDefinitions()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Definitions();

	/**
	 * Returns the meta object for the attribute list '{@link net.menthor.onto2.ontouml.Classifier#getSynonyms <em>Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonyms</em>'.
	 * @see net.menthor.onto2.ontouml.Classifier#getSynonyms()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Synonyms();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Classifier#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.menthor.onto2.ontouml.Classifier#getText()
	 * @see #getClassifier()
	 * @generated
	 */
	EAttribute getClassifier_Text();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.Classifier#getIsGeneralIn <em>Is General In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is General In</em>'.
	 * @see net.menthor.onto2.ontouml.Classifier#getIsGeneralIn()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_IsGeneralIn();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.Classifier#getIsSpecificIn <em>Is Specific In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Specific In</em>'.
	 * @see net.menthor.onto2.ontouml.Classifier#getIsSpecificIn()
	 * @see #getClassifier()
	 * @generated
	 */
	EReference getClassifier_IsSpecificIn();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#children() <em>Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Children</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#children()
	 * @generated
	 */
	EOperation getClassifier__Children();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#parents() <em>Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parents</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#parents()
	 * @generated
	 */
	EOperation getClassifier__Parents();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#allParents(net.menthor.onto2.ontouml.Classifier, org.eclipse.emf.common.util.EList) <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Parents</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#allParents(net.menthor.onto2.ontouml.Classifier, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getClassifier__AllParents__Classifier_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#allParents() <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Parents</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#allParents()
	 * @generated
	 */
	EOperation getClassifier__AllParents();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#allChildren(net.menthor.onto2.ontouml.Classifier, org.eclipse.emf.common.util.EList) <em>All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Children</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#allChildren(net.menthor.onto2.ontouml.Classifier, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getClassifier__AllChildren__Classifier_EList();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#allChildren() <em>All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Children</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#allChildren()
	 * @generated
	 */
	EOperation getClassifier__AllChildren();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#siblings() <em>Siblings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Siblings</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#siblings()
	 * @generated
	 */
	EOperation getClassifier__Siblings();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#ends() <em>Ends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ends</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#ends()
	 * @generated
	 */
	EOperation getClassifier__Ends();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#ends(net.menthor.onto2.ontouml.RelationshipStereotype) <em>Ends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ends</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#ends(net.menthor.onto2.ontouml.RelationshipStereotype)
	 * @generated
	 */
	EOperation getClassifier__Ends__RelationshipStereotype();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#allEnds() <em>All Ends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Ends</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#allEnds()
	 * @generated
	 */
	EOperation getClassifier__AllEnds();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#allEnds(net.menthor.onto2.ontouml.RelationshipStereotype) <em>All Ends</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Ends</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#allEnds(net.menthor.onto2.ontouml.RelationshipStereotype)
	 * @generated
	 */
	EOperation getClassifier__AllEnds__RelationshipStereotype();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#relationships() <em>Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relationships</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#relationships()
	 * @generated
	 */
	EOperation getClassifier__Relationships();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#allRelationships() <em>All Relationships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Relationships</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#allRelationships()
	 * @generated
	 */
	EOperation getClassifier__AllRelationships();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#isDisjointOfParentsOf(net.menthor.onto2.ontouml.Classifier) <em>Is Disjoint Of Parents Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Disjoint Of Parents Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#isDisjointOfParentsOf(net.menthor.onto2.ontouml.Classifier)
	 * @generated
	 */
	EOperation getClassifier__IsDisjointOfParentsOf__Classifier();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#isDisjointOfChildrenOf(net.menthor.onto2.ontouml.Classifier) <em>Is Disjoint Of Children Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Disjoint Of Children Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#isDisjointOfChildrenOf(net.menthor.onto2.ontouml.Classifier)
	 * @generated
	 */
	EOperation getClassifier__IsDisjointOfChildrenOf__Classifier();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Classifier#isDisjointOf(net.menthor.onto2.ontouml.Classifier) <em>Is Disjoint Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Disjoint Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Classifier#isDisjointOf(net.menthor.onto2.ontouml.Classifier)
	 * @generated
	 */
	EOperation getClassifier__IsDisjointOf__Classifier();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see net.menthor.onto2.ontouml.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.menthor.onto2.ontouml.Type#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see net.menthor.onto2.ontouml.Type#getAttributes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Attributes();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Type#relatedTypes() <em>Related Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Related Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Type#relatedTypes()
	 * @generated
	 */
	EOperation getType__RelatedTypes();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Type#allRelatedTypes() <em>All Related Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Related Types</em>' operation.
	 * @see net.menthor.onto2.ontouml.Type#allRelatedTypes()
	 * @generated
	 */
	EOperation getType__AllRelatedTypes();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see net.menthor.onto2.ontouml.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Property#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see net.menthor.onto2.ontouml.Property#isIsOrdered()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Property#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see net.menthor.onto2.ontouml.Property#isIsDerived()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Property#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see net.menthor.onto2.ontouml.Property#getLowerBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Property#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see net.menthor.onto2.ontouml.Property#getUpperBound()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Property#isIsDependency <em>Is Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dependency</em>'.
	 * @see net.menthor.onto2.ontouml.Property#isIsDependency()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsDependency();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see net.menthor.onto2.ontouml.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link net.menthor.onto2.ontouml.Attribute#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Definitions</em>'.
	 * @see net.menthor.onto2.ontouml.Attribute#getDefinitions()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Definitions();

	/**
	 * Returns the meta object for the attribute list '{@link net.menthor.onto2.ontouml.Attribute#getSynonyms <em>Synonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Synonyms</em>'.
	 * @see net.menthor.onto2.ontouml.Attribute#getSynonyms()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Synonyms();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Attribute#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.menthor.onto2.ontouml.Attribute#getText()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Attribute#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.Attribute#getStereotype()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Stereotype();

	/**
	 * Returns the meta object for the container reference '{@link net.menthor.onto2.ontouml.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see net.menthor.onto2.ontouml.Attribute#getOwner()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owner();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Attribute#isInteger() <em>Is Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integer</em>' operation.
	 * @see net.menthor.onto2.ontouml.Attribute#isInteger()
	 * @generated
	 */
	EOperation getAttribute__IsInteger();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Attribute#isBoolean() <em>Is Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Boolean</em>' operation.
	 * @see net.menthor.onto2.ontouml.Attribute#isBoolean()
	 * @generated
	 */
	EOperation getAttribute__IsBoolean();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Attribute#isReal() <em>Is Real</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Real</em>' operation.
	 * @see net.menthor.onto2.ontouml.Attribute#isReal()
	 * @generated
	 */
	EOperation getAttribute__IsReal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Attribute#isDate() <em>Is Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date</em>' operation.
	 * @see net.menthor.onto2.ontouml.Attribute#isDate()
	 * @generated
	 */
	EOperation getAttribute__IsDate();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Attribute#isDateTime() <em>Is Date Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date Time</em>' operation.
	 * @see net.menthor.onto2.ontouml.Attribute#isDateTime()
	 * @generated
	 */
	EOperation getAttribute__IsDateTime();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Attribute#isString() <em>Is String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is String</em>' operation.
	 * @see net.menthor.onto2.ontouml.Attribute#isString()
	 * @generated
	 */
	EOperation getAttribute__IsString();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see net.menthor.onto2.ontouml.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Constraint#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.Constraint#getStereotype()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see net.menthor.onto2.ontouml.Constraint#getContext()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Context();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Constraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see net.menthor.onto2.ontouml.Constraint#getExpression()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see net.menthor.onto2.ontouml.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.menthor.onto2.ontouml.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the container reference '{@link net.menthor.onto2.ontouml.Literal#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see net.menthor.onto2.ontouml.Literal#getOwner()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Owner();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Literal#getUpperBoundRegion <em>Upper Bound Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound Region</em>'.
	 * @see net.menthor.onto2.ontouml.Literal#getUpperBoundRegion()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_UpperBoundRegion();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Literal#getLowerBoundRegion <em>Lower Bound Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound Region</em>'.
	 * @see net.menthor.onto2.ontouml.Literal#getLowerBoundRegion()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_LowerBoundRegion();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see net.menthor.onto2.ontouml.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.DataType#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getStereotype()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Stereotype();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.DataType#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dimensions</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getDimensions()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Dimensions();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.DataType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getScale()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.DataType#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getMeasurement()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Measurement();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.DataType#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Measure</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getUnitOfMeasure()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.DataType#getLowerBoundRegion <em>Lower Bound Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound Region</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getLowerBoundRegion()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_LowerBoundRegion();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.DataType#getUpperBoundRegion <em>Upper Bound Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound Region</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getUpperBoundRegion()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_UpperBoundRegion();

	/**
	 * Returns the meta object for the reference '{@link net.menthor.onto2.ontouml.DataType#getOwnerDomain <em>Owner Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Domain</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getOwnerDomain()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_OwnerDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link net.menthor.onto2.ontouml.DataType#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getLiterals()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Literals();

	/**
	 * Returns the meta object for the reference '{@link net.menthor.onto2.ontouml.DataType#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure</em>'.
	 * @see net.menthor.onto2.ontouml.DataType#getStructure()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Structure();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isEnumeration() <em>Is Enumeration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enumeration</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isEnumeration()
	 * @generated
	 */
	EOperation getDataType__IsEnumeration();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isDomain() <em>Is Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Domain</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isDomain()
	 * @generated
	 */
	EOperation getDataType__IsDomain();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isDimension() <em>Is Dimension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Dimension</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isDimension()
	 * @generated
	 */
	EOperation getDataType__IsDimension();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isDataType() <em>Is Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Data Type</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isDataType()
	 * @generated
	 */
	EOperation getDataType__IsDataType();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isNominal() <em>Is Nominal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Nominal</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isNominal()
	 * @generated
	 */
	EOperation getDataType__IsNominal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isInterval() <em>Is Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Interval</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isInterval()
	 * @generated
	 */
	EOperation getDataType__IsInterval();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isOrdinal() <em>Is Ordinal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ordinal</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isOrdinal()
	 * @generated
	 */
	EOperation getDataType__IsOrdinal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isRational() <em>Is Rational</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Rational</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isRational()
	 * @generated
	 */
	EOperation getDataType__IsRational();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isString() <em>Is String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is String</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isString()
	 * @generated
	 */
	EOperation getDataType__IsString();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isInteger() <em>Is Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integer</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isInteger()
	 * @generated
	 */
	EOperation getDataType__IsInteger();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isDecimal() <em>Is Decimal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Decimal</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isDecimal()
	 * @generated
	 */
	EOperation getDataType__IsDecimal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isReal() <em>Is Real</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Real</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isReal()
	 * @generated
	 */
	EOperation getDataType__IsReal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isNominalString() <em>Is Nominal String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Nominal String</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isNominalString()
	 * @generated
	 */
	EOperation getDataType__IsNominalString();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isIntervalInteger() <em>Is Interval Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Interval Integer</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isIntervalInteger()
	 * @generated
	 */
	EOperation getDataType__IsIntervalInteger();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isIntervalDecimal() <em>Is Interval Decimal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Interval Decimal</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isIntervalDecimal()
	 * @generated
	 */
	EOperation getDataType__IsIntervalDecimal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isOrdinalInteger() <em>Is Ordinal Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ordinal Integer</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isOrdinalInteger()
	 * @generated
	 */
	EOperation getDataType__IsOrdinalInteger();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isOrdinalDecimal() <em>Is Ordinal Decimal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ordinal Decimal</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isOrdinalDecimal()
	 * @generated
	 */
	EOperation getDataType__IsOrdinalDecimal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isRationalInteger() <em>Is Rational Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Rational Integer</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isRationalInteger()
	 * @generated
	 */
	EOperation getDataType__IsRationalInteger();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isRationalDecimal() <em>Is Rational Decimal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Rational Decimal</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isRationalDecimal()
	 * @generated
	 */
	EOperation getDataType__IsRationalDecimal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isIntervalReal() <em>Is Interval Real</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Interval Real</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isIntervalReal()
	 * @generated
	 */
	EOperation getDataType__IsIntervalReal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isOrdinalReal() <em>Is Ordinal Real</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ordinal Real</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isOrdinalReal()
	 * @generated
	 */
	EOperation getDataType__IsOrdinalReal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isRationalReal() <em>Is Rational Real</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Rational Real</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isRationalReal()
	 * @generated
	 */
	EOperation getDataType__IsRationalReal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.DataType#isStructure() <em>Is Structure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Structure</em>' operation.
	 * @see net.menthor.onto2.ontouml.DataType#isStructure()
	 * @generated
	 */
	EOperation getDataType__IsStructure();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see net.menthor.onto2.ontouml.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Class#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.Class#getStereotype()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see net.menthor.onto2.ontouml.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Class#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see net.menthor.onto2.ontouml.Class#isIsDerived()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsDerived();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Class#isIsExtensional <em>Is Extensional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Extensional</em>'.
	 * @see net.menthor.onto2.ontouml.Class#isIsExtensional()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsExtensional();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Class#getQualityNature <em>Quality Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality Nature</em>'.
	 * @see net.menthor.onto2.ontouml.Class#getQualityNature()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_QualityNature();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Class#getExistence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existence</em>'.
	 * @see net.menthor.onto2.ontouml.Class#getExistence()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Existence();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Class#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification</em>'.
	 * @see net.menthor.onto2.ontouml.Class#getClassification()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Classification();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isKind() <em>Is Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Kind</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isKind()
	 * @generated
	 */
	EOperation getClass__IsKind();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isSubKind() <em>Is Sub Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Kind</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isSubKind()
	 * @generated
	 */
	EOperation getClass__IsSubKind();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isCollective() <em>Is Collective</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Collective</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isCollective()
	 * @generated
	 */
	EOperation getClass__IsCollective();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isQuantity() <em>Is Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Quantity</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isQuantity()
	 * @generated
	 */
	EOperation getClass__IsQuantity();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isRelator() <em>Is Relator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Relator</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isRelator()
	 * @generated
	 */
	EOperation getClass__IsRelator();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isMode() <em>Is Mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mode</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isMode()
	 * @generated
	 */
	EOperation getClass__IsMode();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isQuality() <em>Is Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Quality</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isQuality()
	 * @generated
	 */
	EOperation getClass__IsQuality();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isRole() <em>Is Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Role</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isRole()
	 * @generated
	 */
	EOperation getClass__IsRole();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isRoleMixin() <em>Is Role Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Role Mixin</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isRoleMixin()
	 * @generated
	 */
	EOperation getClass__IsRoleMixin();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isPhaseMixin() <em>Is Phase Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Phase Mixin</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isPhaseMixin()
	 * @generated
	 */
	EOperation getClass__IsPhaseMixin();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isPhase() <em>Is Phase</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Phase</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isPhase()
	 * @generated
	 */
	EOperation getClass__IsPhase();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isCategory() <em>Is Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Category</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isCategory()
	 * @generated
	 */
	EOperation getClass__IsCategory();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isMixin() <em>Is Mixin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mixin</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isMixin()
	 * @generated
	 */
	EOperation getClass__IsMixin();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isEvent() <em>Is Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Event</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isEvent()
	 * @generated
	 */
	EOperation getClass__IsEvent();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isHighOrder() <em>Is High Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is High Order</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isHighOrder()
	 * @generated
	 */
	EOperation getClass__IsHighOrder();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isRigid() <em>Is Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Rigid</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isRigid()
	 * @generated
	 */
	EOperation getClass__IsRigid();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isNonRigid() <em>Is Non Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Non Rigid</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isNonRigid()
	 * @generated
	 */
	EOperation getClass__IsNonRigid();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isAntiRigid() <em>Is Anti Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Anti Rigid</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isAntiRigid()
	 * @generated
	 */
	EOperation getClass__IsAntiRigid();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isSemiRigid() <em>Is Semi Rigid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Semi Rigid</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isSemiRigid()
	 * @generated
	 */
	EOperation getClass__IsSemiRigid();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isPerceivableQuality() <em>Is Perceivable Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Perceivable Quality</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isPerceivableQuality()
	 * @generated
	 */
	EOperation getClass__IsPerceivableQuality();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isNonPerceivableQuality() <em>Is Non Perceivable Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Non Perceivable Quality</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isNonPerceivableQuality()
	 * @generated
	 */
	EOperation getClass__IsNonPerceivableQuality();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isNominalQuality() <em>Is Nominal Quality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Nominal Quality</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isNominalQuality()
	 * @generated
	 */
	EOperation getClass__IsNominalQuality();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isEndurantClass() <em>Is Endurant Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Endurant Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isEndurantClass()
	 * @generated
	 */
	EOperation getClass__IsEndurantClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isIntrinsicMoment() <em>Is Intrinsic Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Intrinsic Moment</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isIntrinsicMoment()
	 * @generated
	 */
	EOperation getClass__IsIntrinsicMoment();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isSubstanceSortalClass() <em>Is Substance Sortal Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Substance Sortal Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isSubstanceSortalClass()
	 * @generated
	 */
	EOperation getClass__IsSubstanceSortalClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isMomentClass() <em>Is Moment Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Moment Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isMomentClass()
	 * @generated
	 */
	EOperation getClass__IsMomentClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isIdentityProviderClass() <em>Is Identity Provider Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Identity Provider Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isIdentityProviderClass()
	 * @generated
	 */
	EOperation getClass__IsIdentityProviderClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isMixinClass() <em>Is Mixin Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mixin Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isMixinClass()
	 * @generated
	 */
	EOperation getClass__IsMixinClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isAntiRigidMixinClass() <em>Is Anti Rigid Mixin Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Anti Rigid Mixin Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isAntiRigidMixinClass()
	 * @generated
	 */
	EOperation getClass__IsAntiRigidMixinClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isAmountOfMatter() <em>Is Amount Of Matter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Amount Of Matter</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isAmountOfMatter()
	 * @generated
	 */
	EOperation getClass__IsAmountOfMatter();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isFunctionalComplex() <em>Is Functional Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Functional Complex</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isFunctionalComplex()
	 * @generated
	 */
	EOperation getClass__IsFunctionalComplex();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isCollection() <em>Is Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Collection</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isCollection()
	 * @generated
	 */
	EOperation getClass__IsCollection();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isMoment() <em>Is Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Moment</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isMoment()
	 * @generated
	 */
	EOperation getClass__IsMoment();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isTruthMaker() <em>Is Truth Maker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Truth Maker</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isTruthMaker()
	 * @generated
	 */
	EOperation getClass__IsTruthMaker();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isNonQualitativeIntrinsicMoment() <em>Is Non Qualitative Intrinsic Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Non Qualitative Intrinsic Moment</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isNonQualitativeIntrinsicMoment()
	 * @generated
	 */
	EOperation getClass__IsNonQualitativeIntrinsicMoment();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#isQualitativeIntrinsicMoment() <em>Is Qualitative Intrinsic Moment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Qualitative Intrinsic Moment</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#isQualitativeIntrinsicMoment()
	 * @generated
	 */
	EOperation getClass__IsQualitativeIntrinsicMoment();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#identityProvidersAtAllParents() <em>Identity Providers At All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identity Providers At All Parents</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#identityProvidersAtAllParents()
	 * @generated
	 */
	EOperation getClass__IdentityProvidersAtAllParents();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#identityProvidersAtAllChildren() <em>Identity Providers At All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identity Providers At All Children</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#identityProvidersAtAllChildren()
	 * @generated
	 */
	EOperation getClass__IdentityProvidersAtAllChildren();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Class#identityProviders() <em>Identity Providers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identity Providers</em>' operation.
	 * @see net.menthor.onto2.ontouml.Class#identityProviders()
	 * @generated
	 */
	EOperation getClass__IdentityProviders();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see net.menthor.onto2.ontouml.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for the container reference '{@link net.menthor.onto2.ontouml.EndPoint#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see net.menthor.onto2.ontouml.EndPoint#getOwner()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Owner();

	/**
	 * Returns the meta object for the reference '{@link net.menthor.onto2.ontouml.EndPoint#getEndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Type</em>'.
	 * @see net.menthor.onto2.ontouml.EndPoint#getEndType()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_EndType();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.EndPoint#getSubsets <em>Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsets</em>'.
	 * @see net.menthor.onto2.ontouml.EndPoint#getSubsets()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Subsets();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.EndPoint#getRedefines <em>Redefines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefines</em>'.
	 * @see net.menthor.onto2.ontouml.EndPoint#getRedefines()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_Redefines();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.EndPoint#getIsSubsettedBy <em>Is Subsetted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Subsetted By</em>'.
	 * @see net.menthor.onto2.ontouml.EndPoint#getIsSubsettedBy()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_IsSubsettedBy();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.EndPoint#getIsRedefinedBy <em>Is Redefined By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Redefined By</em>'.
	 * @see net.menthor.onto2.ontouml.EndPoint#getIsRedefinedBy()
	 * @see #getEndPoint()
	 * @generated
	 */
	EReference getEndPoint_IsRedefinedBy();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Relationship#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getStereotype()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Relationship#getReflexivity <em>Reflexivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reflexivity</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getReflexivity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Reflexivity();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Relationship#getSymmetry <em>Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symmetry</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getSymmetry()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Symmetry();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Relationship#getTransitivity <em>Transitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transitivity</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getTransitivity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Transitivity();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Relationship#getCiclicity <em>Ciclicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ciclicity</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getCiclicity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Ciclicity();

	/**
	 * Returns the meta object for the containment reference list '{@link net.menthor.onto2.ontouml.Relationship#getEndPoints <em>End Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End Points</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getEndPoints()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_EndPoints();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Relationship#getTemporalNature <em>Temporal Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal Nature</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getTemporalNature()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_TemporalNature();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.Relationship#getParticipationNature <em>Participation Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Participation Nature</em>'.
	 * @see net.menthor.onto2.ontouml.Relationship#getParticipationNature()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_ParticipationNature();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isComponentOf() <em>Is Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Component Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isComponentOf()
	 * @generated
	 */
	EOperation getRelationship__IsComponentOf();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isMemberOf() <em>Is Member Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Member Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isMemberOf()
	 * @generated
	 */
	EOperation getRelationship__IsMemberOf();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isSubCollectionOf() <em>Is Sub Collection Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Collection Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isSubCollectionOf()
	 * @generated
	 */
	EOperation getRelationship__IsSubCollectionOf();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isSubQuantityOf() <em>Is Sub Quantity Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Quantity Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isSubQuantityOf()
	 * @generated
	 */
	EOperation getRelationship__IsSubQuantityOf();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isQuaPartOf() <em>Is Qua Part Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Qua Part Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isQuaPartOf()
	 * @generated
	 */
	EOperation getRelationship__IsQuaPartOf();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isConstitution() <em>Is Constitution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Constitution</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isConstitution()
	 * @generated
	 */
	EOperation getRelationship__IsConstitution();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isCharacterization() <em>Is Characterization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Characterization</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isCharacterization()
	 * @generated
	 */
	EOperation getRelationship__IsCharacterization();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isMediation() <em>Is Mediation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mediation</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isMediation()
	 * @generated
	 */
	EOperation getRelationship__IsMediation();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isMaterial() <em>Is Material</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Material</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isMaterial()
	 * @generated
	 */
	EOperation getRelationship__IsMaterial();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isFormal() <em>Is Formal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Formal</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isFormal()
	 * @generated
	 */
	EOperation getRelationship__IsFormal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isStructuration() <em>Is Structuration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Structuration</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isStructuration()
	 * @generated
	 */
	EOperation getRelationship__IsStructuration();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isParticipation() <em>Is Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Participation</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isParticipation()
	 * @generated
	 */
	EOperation getRelationship__IsParticipation();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isSubEventOf() <em>Is Sub Event Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Sub Event Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isSubEventOf()
	 * @generated
	 */
	EOperation getRelationship__IsSubEventOf();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isCausation() <em>Is Causation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Causation</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isCausation()
	 * @generated
	 */
	EOperation getRelationship__IsCausation();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isTemporal() <em>Is Temporal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Temporal</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isTemporal()
	 * @generated
	 */
	EOperation getRelationship__IsTemporal();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isInstanceOf() <em>Is Instance Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Instance Of</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isInstanceOf()
	 * @generated
	 */
	EOperation getRelationship__IsInstanceOf();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isDerivation() <em>Is Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Derivation</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isDerivation()
	 * @generated
	 */
	EOperation getRelationship__IsDerivation();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isMeronymic() <em>Is Meronymic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Meronymic</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isMeronymic()
	 * @generated
	 */
	EOperation getRelationship__IsMeronymic();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isBinary() <em>Is Binary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Binary</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isBinary()
	 * @generated
	 */
	EOperation getRelationship__IsBinary();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isTernary() <em>Is Ternary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Ternary</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isTernary()
	 * @generated
	 */
	EOperation getRelationship__IsTernary();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isStarts() <em>Is Starts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Starts</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isStarts()
	 * @generated
	 */
	EOperation getRelationship__IsStarts();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isPrecedes() <em>Is Precedes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Precedes</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isPrecedes()
	 * @generated
	 */
	EOperation getRelationship__IsPrecedes();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isEquals() <em>Is Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Equals</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isEquals()
	 * @generated
	 */
	EOperation getRelationship__IsEquals();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isMeets() <em>Is Meets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Meets</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isMeets()
	 * @generated
	 */
	EOperation getRelationship__IsMeets();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isFinishes() <em>Is Finishes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Finishes</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isFinishes()
	 * @generated
	 */
	EOperation getRelationship__IsFinishes();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isOverlaps() <em>Is Overlaps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Overlaps</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isOverlaps()
	 * @generated
	 */
	EOperation getRelationship__IsOverlaps();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isDuring() <em>Is During</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is During</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isDuring()
	 * @generated
	 */
	EOperation getRelationship__IsDuring();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isCreation() <em>Is Creation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Creation</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isCreation()
	 * @generated
	 */
	EOperation getRelationship__IsCreation();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isDestruction() <em>Is Destruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Destruction</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isDestruction()
	 * @generated
	 */
	EOperation getRelationship__IsDestruction();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isChange() <em>Is Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Change</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isChange()
	 * @generated
	 */
	EOperation getRelationship__IsChange();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#sourceEnd() <em>Source End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source End</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#sourceEnd()
	 * @generated
	 */
	EOperation getRelationship__SourceEnd();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#targetEnd() <em>Target End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target End</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#targetEnd()
	 * @generated
	 */
	EOperation getRelationship__TargetEnd();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#partEnd() <em>Part End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Part End</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#partEnd()
	 * @generated
	 */
	EOperation getRelationship__PartEnd();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#wholeEnd() <em>Whole End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Whole End</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#wholeEnd()
	 * @generated
	 */
	EOperation getRelationship__WholeEnd();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#source() <em>Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#source()
	 * @generated
	 */
	EOperation getRelationship__Source();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#target() <em>Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#target()
	 * @generated
	 */
	EOperation getRelationship__Target();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#sourceClass() <em>Source Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#sourceClass()
	 * @generated
	 */
	EOperation getRelationship__SourceClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#targetClass() <em>Target Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#targetClass()
	 * @generated
	 */
	EOperation getRelationship__TargetClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#wholeClass() <em>Whole Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Whole Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#wholeClass()
	 * @generated
	 */
	EOperation getRelationship__WholeClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#partClass() <em>Part Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Part Class</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#partClass()
	 * @generated
	 */
	EOperation getRelationship__PartClass();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#sourceDataType() <em>Source Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Data Type</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#sourceDataType()
	 * @generated
	 */
	EOperation getRelationship__SourceDataType();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#targetDataType() <em>Target Data Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Data Type</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#targetDataType()
	 * @generated
	 */
	EOperation getRelationship__TargetDataType();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#sourceRelationship() <em>Source Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Source Relationship</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#sourceRelationship()
	 * @generated
	 */
	EOperation getRelationship__SourceRelationship();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#targetRelationship() <em>Target Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Relationship</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#targetRelationship()
	 * @generated
	 */
	EOperation getRelationship__TargetRelationship();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isDerived() <em>Is Derived</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Derived</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isDerived()
	 * @generated
	 */
	EOperation getRelationship__IsDerived();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isEnd(net.menthor.onto2.ontouml.Classifier) <em>Is End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is End</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isEnd(net.menthor.onto2.ontouml.Classifier)
	 * @generated
	 */
	EOperation getRelationship__IsEnd__Classifier();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isPartEssential() <em>Is Part Essential</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Part Essential</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isPartEssential()
	 * @generated
	 */
	EOperation getRelationship__IsPartEssential();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isPartInseparable() <em>Is Part Inseparable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Part Inseparable</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isPartInseparable()
	 * @generated
	 */
	EOperation getRelationship__IsPartInseparable();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isPartImmutable() <em>Is Part Immutable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Part Immutable</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isPartImmutable()
	 * @generated
	 */
	EOperation getRelationship__IsPartImmutable();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isWholeImmutable() <em>Is Whole Immutable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Whole Immutable</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isWholeImmutable()
	 * @generated
	 */
	EOperation getRelationship__IsWholeImmutable();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isPartMandatory() <em>Is Part Mandatory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Part Mandatory</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isPartMandatory()
	 * @generated
	 */
	EOperation getRelationship__IsPartMandatory();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isWholeMandatory() <em>Is Whole Mandatory</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Whole Mandatory</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isWholeMandatory()
	 * @generated
	 */
	EOperation getRelationship__IsWholeMandatory();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.Relationship#isPartShareable() <em>Is Part Shareable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Part Shareable</em>' operation.
	 * @see net.menthor.onto2.ontouml.Relationship#isPartShareable()
	 * @generated
	 */
	EOperation getRelationship__IsPartShareable();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.GeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Set</em>'.
	 * @see net.menthor.onto2.ontouml.GeneralizationSet
	 * @generated
	 */
	EClass getGeneralizationSet();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.GeneralizationSet#isIsCovering <em>Is Covering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Covering</em>'.
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#isIsCovering()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsCovering();

	/**
	 * Returns the meta object for the attribute '{@link net.menthor.onto2.ontouml.GeneralizationSet#isIsDisjoint <em>Is Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Disjoint</em>'.
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#isIsDisjoint()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EAttribute getGeneralizationSet_IsDisjoint();

	/**
	 * Returns the meta object for the reference list '{@link net.menthor.onto2.ontouml.GeneralizationSet#getGeneralizations <em>Generalizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalizations</em>'.
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#getGeneralizations()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_Generalizations();

	/**
	 * Returns the meta object for the reference '{@link net.menthor.onto2.ontouml.GeneralizationSet#getHighOrder <em>High Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>High Order</em>'.
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#getHighOrder()
	 * @see #getGeneralizationSet()
	 * @generated
	 */
	EReference getGeneralizationSet_HighOrder();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.GeneralizationSet#general() <em>General</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>General</em>' operation.
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#general()
	 * @generated
	 */
	EOperation getGeneralizationSet__General();

	/**
	 * Returns the meta object for the '{@link net.menthor.onto2.ontouml.GeneralizationSet#specifics() <em>Specifics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Specifics</em>' operation.
	 * @see net.menthor.onto2.ontouml.GeneralizationSet#specifics()
	 * @generated
	 */
	EOperation getGeneralizationSet__Specifics();

	/**
	 * Returns the meta object for class '{@link net.menthor.onto2.ontouml.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see net.menthor.onto2.ontouml.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link net.menthor.onto2.ontouml.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see net.menthor.onto2.ontouml.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference '{@link net.menthor.onto2.ontouml.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specific</em>'.
	 * @see net.menthor.onto2.ontouml.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for the reference '{@link net.menthor.onto2.ontouml.Generalization#getGeneralizationSet <em>Generalization Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generalization Set</em>'.
	 * @see net.menthor.onto2.ontouml.Generalization#getGeneralizationSet()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_GeneralizationSet();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.PrimitiveStereotype <em>Primitive Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.PrimitiveStereotype
	 * @generated
	 */
	EEnum getPrimitiveStereotype();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.ConstraintStereotype <em>Constraint Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.ConstraintStereotype
	 * @generated
	 */
	EEnum getConstraintStereotype();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.ClassStereotype <em>Class Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.ClassStereotype
	 * @generated
	 */
	EEnum getClassStereotype();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.DataTypeStereotype <em>Data Type Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.DataTypeStereotype
	 * @generated
	 */
	EEnum getDataTypeStereotype();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scale</em>'.
	 * @see net.menthor.onto2.ontouml.Scale
	 * @generated
	 */
	EEnum getScale();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measurement</em>'.
	 * @see net.menthor.onto2.ontouml.Measurement
	 * @generated
	 */
	EEnum getMeasurement();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.QualityNature <em>Quality Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quality Nature</em>'.
	 * @see net.menthor.onto2.ontouml.QualityNature
	 * @generated
	 */
	EEnum getQualityNature();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Classification</em>'.
	 * @see net.menthor.onto2.ontouml.Classification
	 * @generated
	 */
	EEnum getClassification();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Existence</em>'.
	 * @see net.menthor.onto2.ontouml.Existence
	 * @generated
	 */
	EEnum getExistence();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.RelationshipStereotype <em>Relationship Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Stereotype</em>'.
	 * @see net.menthor.onto2.ontouml.RelationshipStereotype
	 * @generated
	 */
	EEnum getRelationshipStereotype();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.TemporalNature <em>Temporal Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Nature</em>'.
	 * @see net.menthor.onto2.ontouml.TemporalNature
	 * @generated
	 */
	EEnum getTemporalNature();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.ParticipationNature <em>Participation Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Participation Nature</em>'.
	 * @see net.menthor.onto2.ontouml.ParticipationNature
	 * @generated
	 */
	EEnum getParticipationNature();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Reflexivity <em>Reflexivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reflexivity</em>'.
	 * @see net.menthor.onto2.ontouml.Reflexivity
	 * @generated
	 */
	EEnum getReflexivity();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Symmetry <em>Symmetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symmetry</em>'.
	 * @see net.menthor.onto2.ontouml.Symmetry
	 * @generated
	 */
	EEnum getSymmetry();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Transitivity <em>Transitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transitivity</em>'.
	 * @see net.menthor.onto2.ontouml.Transitivity
	 * @generated
	 */
	EEnum getTransitivity();

	/**
	 * Returns the meta object for enum '{@link net.menthor.onto2.ontouml.Ciclicity <em>Ciclicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ciclicity</em>'.
	 * @see net.menthor.onto2.ontouml.Ciclicity
	 * @generated
	 */
	EEnum getCiclicity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OntoumlFactory getOntoumlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.ElementImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.NamedElementImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.ContainerImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___PACKAGES = eINSTANCE.getContainer__Packages();

		/**
		 * The meta object literal for the '<em><b>All Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_PACKAGES__CONTAINER_ELIST = eINSTANCE.getContainer__AllPackages__Container_EList();

		/**
		 * The meta object literal for the '<em><b>All Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_PACKAGES = eINSTANCE.getContainer__AllPackages();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___RELATIONSHIPS = eINSTANCE.getContainer__Relationships();

		/**
		 * The meta object literal for the '<em><b>All Relationships</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_RELATIONSHIPS__CONTAINER_ELIST = eINSTANCE.getContainer__AllRelationships__Container_EList();

		/**
		 * The meta object literal for the '<em><b>All Relationships</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_RELATIONSHIPS = eINSTANCE.getContainer__AllRelationships();

		/**
		 * The meta object literal for the '<em><b>Generalization Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___GENERALIZATION_SETS = eINSTANCE.getContainer__GeneralizationSets();

		/**
		 * The meta object literal for the '<em><b>All Generalization Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_GENERALIZATION_SETS__CONTAINER_ELIST = eINSTANCE.getContainer__AllGeneralizationSets__Container_EList();

		/**
		 * The meta object literal for the '<em><b>All Generalization Sets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_GENERALIZATION_SETS = eINSTANCE.getContainer__AllGeneralizationSets();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___CLASSES = eINSTANCE.getContainer__Classes();

		/**
		 * The meta object literal for the '<em><b>All Classes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_CLASSES__CONTAINER_ELIST = eINSTANCE.getContainer__AllClasses__Container_EList();

		/**
		 * The meta object literal for the '<em><b>All Classes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_CLASSES = eINSTANCE.getContainer__AllClasses();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___DATA_TYPES = eINSTANCE.getContainer__DataTypes();

		/**
		 * The meta object literal for the '<em><b>All Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_DATA_TYPES__CONTAINER_ELIST = eINSTANCE.getContainer__AllDataTypes__Container_EList();

		/**
		 * The meta object literal for the '<em><b>All Data Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_DATA_TYPES = eINSTANCE.getContainer__AllDataTypes();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___TYPES = eINSTANCE.getContainer__Types();

		/**
		 * The meta object literal for the '<em><b>All Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_TYPES__CONTAINER_ELIST = eINSTANCE.getContainer__AllTypes__Container_EList();

		/**
		 * The meta object literal for the '<em><b>All Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINER___ALL_TYPES = eINSTANCE.getContainer__AllTypes();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.ContainedElementImpl <em>Contained Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.ContainedElementImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getContainedElement()
		 * @generated
		 */
		EClass CONTAINED_ELEMENT = eINSTANCE.getContainedElement();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_ELEMENT__HOLDER = eINSTANCE.getContainedElement_Holder();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_ELEMENT__COMMENTS = eINSTANCE.getContainedElement_Comments();

		/**
		 * The meta object literal for the '<em><b>Get Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINED_ELEMENT___GET_MODEL = eINSTANCE.getContainedElement__GetModel();

		/**
		 * The meta object literal for the '<em><b>Get Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTAINED_ELEMENT___GET_MODEL__CONTAINER = eINSTANCE.getContainedElement__GetModel__Container();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.CommentImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CONTENT = eINSTANCE.getComment_Content();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__OWNER = eINSTANCE.getComment_Owner();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.ModelImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Initialize Validator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___INITIALIZE_VALIDATOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getModel__InitializeValidator__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.PackageImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.ClassifierImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__ALIAS = eINSTANCE.getClassifier_Alias();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__DEFINITIONS = eINSTANCE.getClassifier_Definitions();

		/**
		 * The meta object literal for the '<em><b>Synonyms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__SYNONYMS = eINSTANCE.getClassifier_Synonyms();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER__TEXT = eINSTANCE.getClassifier_Text();

		/**
		 * The meta object literal for the '<em><b>Is General In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__IS_GENERAL_IN = eINSTANCE.getClassifier_IsGeneralIn();

		/**
		 * The meta object literal for the '<em><b>Is Specific In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER__IS_SPECIFIC_IN = eINSTANCE.getClassifier_IsSpecificIn();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___CHILDREN = eINSTANCE.getClassifier__Children();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___PARENTS = eINSTANCE.getClassifier__Parents();

		/**
		 * The meta object literal for the '<em><b>All Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_PARENTS__CLASSIFIER_ELIST = eINSTANCE.getClassifier__AllParents__Classifier_EList();

		/**
		 * The meta object literal for the '<em><b>All Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_PARENTS = eINSTANCE.getClassifier__AllParents();

		/**
		 * The meta object literal for the '<em><b>All Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_CHILDREN__CLASSIFIER_ELIST = eINSTANCE.getClassifier__AllChildren__Classifier_EList();

		/**
		 * The meta object literal for the '<em><b>All Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_CHILDREN = eINSTANCE.getClassifier__AllChildren();

		/**
		 * The meta object literal for the '<em><b>Siblings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___SIBLINGS = eINSTANCE.getClassifier__Siblings();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ENDS = eINSTANCE.getClassifier__Ends();

		/**
		 * The meta object literal for the '<em><b>Ends</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ENDS__RELATIONSHIPSTEREOTYPE = eINSTANCE.getClassifier__Ends__RelationshipStereotype();

		/**
		 * The meta object literal for the '<em><b>All Ends</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_ENDS = eINSTANCE.getClassifier__AllEnds();

		/**
		 * The meta object literal for the '<em><b>All Ends</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_ENDS__RELATIONSHIPSTEREOTYPE = eINSTANCE.getClassifier__AllEnds__RelationshipStereotype();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___RELATIONSHIPS = eINSTANCE.getClassifier__Relationships();

		/**
		 * The meta object literal for the '<em><b>All Relationships</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___ALL_RELATIONSHIPS = eINSTANCE.getClassifier__AllRelationships();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint Of Parents Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___IS_DISJOINT_OF_PARENTS_OF__CLASSIFIER = eINSTANCE.getClassifier__IsDisjointOfParentsOf__Classifier();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint Of Children Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___IS_DISJOINT_OF_CHILDREN_OF__CLASSIFIER = eINSTANCE.getClassifier__IsDisjointOfChildrenOf__Classifier();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFIER___IS_DISJOINT_OF__CLASSIFIER = eINSTANCE.getClassifier__IsDisjointOf__Classifier();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.TypeImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ATTRIBUTES = eINSTANCE.getType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Related Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___RELATED_TYPES = eINSTANCE.getType__RelatedTypes();

		/**
		 * The meta object literal for the '<em><b>All Related Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TYPE___ALL_RELATED_TYPES = eINSTANCE.getType__AllRelatedTypes();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.PropertyImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_ORDERED = eINSTANCE.getProperty_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_DERIVED = eINSTANCE.getProperty_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__LOWER_BOUND = eINSTANCE.getProperty_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__UPPER_BOUND = eINSTANCE.getProperty_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_DEPENDENCY = eINSTANCE.getProperty_IsDependency();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.AttributeImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFINITIONS = eINSTANCE.getAttribute_Definitions();

		/**
		 * The meta object literal for the '<em><b>Synonyms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SYNONYMS = eINSTANCE.getAttribute_Synonyms();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TEXT = eINSTANCE.getAttribute_Text();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__STEREOTYPE = eINSTANCE.getAttribute_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNER = eINSTANCE.getAttribute_Owner();

		/**
		 * The meta object literal for the '<em><b>Is Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_INTEGER = eINSTANCE.getAttribute__IsInteger();

		/**
		 * The meta object literal for the '<em><b>Is Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_BOOLEAN = eINSTANCE.getAttribute__IsBoolean();

		/**
		 * The meta object literal for the '<em><b>Is Real</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_REAL = eINSTANCE.getAttribute__IsReal();

		/**
		 * The meta object literal for the '<em><b>Is Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_DATE = eINSTANCE.getAttribute__IsDate();

		/**
		 * The meta object literal for the '<em><b>Is Date Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_DATE_TIME = eINSTANCE.getAttribute__IsDateTime();

		/**
		 * The meta object literal for the '<em><b>Is String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_STRING = eINSTANCE.getAttribute__IsString();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.ConstraintImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__STEREOTYPE = eINSTANCE.getConstraint_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONTEXT = eINSTANCE.getConstraint_Context();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.LiteralImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__OWNER = eINSTANCE.getLiteral_Owner();

		/**
		 * The meta object literal for the '<em><b>Upper Bound Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__UPPER_BOUND_REGION = eINSTANCE.getLiteral_UpperBoundRegion();

		/**
		 * The meta object literal for the '<em><b>Lower Bound Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LOWER_BOUND_REGION = eINSTANCE.getLiteral_LowerBoundRegion();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.DataTypeImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__STEREOTYPE = eINSTANCE.getDataType_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__DIMENSIONS = eINSTANCE.getDataType_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SCALE = eINSTANCE.getDataType_Scale();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__MEASUREMENT = eINSTANCE.getDataType_Measurement();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__UNIT_OF_MEASURE = eINSTANCE.getDataType_UnitOfMeasure();

		/**
		 * The meta object literal for the '<em><b>Lower Bound Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__LOWER_BOUND_REGION = eINSTANCE.getDataType_LowerBoundRegion();

		/**
		 * The meta object literal for the '<em><b>Upper Bound Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__UPPER_BOUND_REGION = eINSTANCE.getDataType_UpperBoundRegion();

		/**
		 * The meta object literal for the '<em><b>Owner Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__OWNER_DOMAIN = eINSTANCE.getDataType_OwnerDomain();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__LITERALS = eINSTANCE.getDataType_Literals();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__STRUCTURE = eINSTANCE.getDataType_Structure();

		/**
		 * The meta object literal for the '<em><b>Is Enumeration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_ENUMERATION = eINSTANCE.getDataType__IsEnumeration();

		/**
		 * The meta object literal for the '<em><b>Is Domain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_DOMAIN = eINSTANCE.getDataType__IsDomain();

		/**
		 * The meta object literal for the '<em><b>Is Dimension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_DIMENSION = eINSTANCE.getDataType__IsDimension();

		/**
		 * The meta object literal for the '<em><b>Is Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_DATA_TYPE = eINSTANCE.getDataType__IsDataType();

		/**
		 * The meta object literal for the '<em><b>Is Nominal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_NOMINAL = eINSTANCE.getDataType__IsNominal();

		/**
		 * The meta object literal for the '<em><b>Is Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_INTERVAL = eINSTANCE.getDataType__IsInterval();

		/**
		 * The meta object literal for the '<em><b>Is Ordinal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_ORDINAL = eINSTANCE.getDataType__IsOrdinal();

		/**
		 * The meta object literal for the '<em><b>Is Rational</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_RATIONAL = eINSTANCE.getDataType__IsRational();

		/**
		 * The meta object literal for the '<em><b>Is String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_STRING = eINSTANCE.getDataType__IsString();

		/**
		 * The meta object literal for the '<em><b>Is Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_INTEGER = eINSTANCE.getDataType__IsInteger();

		/**
		 * The meta object literal for the '<em><b>Is Decimal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_DECIMAL = eINSTANCE.getDataType__IsDecimal();

		/**
		 * The meta object literal for the '<em><b>Is Real</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_REAL = eINSTANCE.getDataType__IsReal();

		/**
		 * The meta object literal for the '<em><b>Is Nominal String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_NOMINAL_STRING = eINSTANCE.getDataType__IsNominalString();

		/**
		 * The meta object literal for the '<em><b>Is Interval Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_INTERVAL_INTEGER = eINSTANCE.getDataType__IsIntervalInteger();

		/**
		 * The meta object literal for the '<em><b>Is Interval Decimal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_INTERVAL_DECIMAL = eINSTANCE.getDataType__IsIntervalDecimal();

		/**
		 * The meta object literal for the '<em><b>Is Ordinal Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_ORDINAL_INTEGER = eINSTANCE.getDataType__IsOrdinalInteger();

		/**
		 * The meta object literal for the '<em><b>Is Ordinal Decimal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_ORDINAL_DECIMAL = eINSTANCE.getDataType__IsOrdinalDecimal();

		/**
		 * The meta object literal for the '<em><b>Is Rational Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_RATIONAL_INTEGER = eINSTANCE.getDataType__IsRationalInteger();

		/**
		 * The meta object literal for the '<em><b>Is Rational Decimal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_RATIONAL_DECIMAL = eINSTANCE.getDataType__IsRationalDecimal();

		/**
		 * The meta object literal for the '<em><b>Is Interval Real</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_INTERVAL_REAL = eINSTANCE.getDataType__IsIntervalReal();

		/**
		 * The meta object literal for the '<em><b>Is Ordinal Real</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_ORDINAL_REAL = eINSTANCE.getDataType__IsOrdinalReal();

		/**
		 * The meta object literal for the '<em><b>Is Rational Real</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_RATIONAL_REAL = eINSTANCE.getDataType__IsRationalReal();

		/**
		 * The meta object literal for the '<em><b>Is Structure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_TYPE___IS_STRUCTURE = eINSTANCE.getDataType__IsStructure();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.ClassImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__STEREOTYPE = eINSTANCE.getClass_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_DERIVED = eINSTANCE.getClass_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is Extensional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_EXTENSIONAL = eINSTANCE.getClass_IsExtensional();

		/**
		 * The meta object literal for the '<em><b>Quality Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__QUALITY_NATURE = eINSTANCE.getClass_QualityNature();

		/**
		 * The meta object literal for the '<em><b>Existence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__EXISTENCE = eINSTANCE.getClass_Existence();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CLASSIFICATION = eINSTANCE.getClass_Classification();

		/**
		 * The meta object literal for the '<em><b>Is Kind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_KIND = eINSTANCE.getClass__IsKind();

		/**
		 * The meta object literal for the '<em><b>Is Sub Kind</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_SUB_KIND = eINSTANCE.getClass__IsSubKind();

		/**
		 * The meta object literal for the '<em><b>Is Collective</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_COLLECTIVE = eINSTANCE.getClass__IsCollective();

		/**
		 * The meta object literal for the '<em><b>Is Quantity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_QUANTITY = eINSTANCE.getClass__IsQuantity();

		/**
		 * The meta object literal for the '<em><b>Is Relator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_RELATOR = eINSTANCE.getClass__IsRelator();

		/**
		 * The meta object literal for the '<em><b>Is Mode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_MODE = eINSTANCE.getClass__IsMode();

		/**
		 * The meta object literal for the '<em><b>Is Quality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_QUALITY = eINSTANCE.getClass__IsQuality();

		/**
		 * The meta object literal for the '<em><b>Is Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_ROLE = eINSTANCE.getClass__IsRole();

		/**
		 * The meta object literal for the '<em><b>Is Role Mixin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_ROLE_MIXIN = eINSTANCE.getClass__IsRoleMixin();

		/**
		 * The meta object literal for the '<em><b>Is Phase Mixin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_PHASE_MIXIN = eINSTANCE.getClass__IsPhaseMixin();

		/**
		 * The meta object literal for the '<em><b>Is Phase</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_PHASE = eINSTANCE.getClass__IsPhase();

		/**
		 * The meta object literal for the '<em><b>Is Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_CATEGORY = eINSTANCE.getClass__IsCategory();

		/**
		 * The meta object literal for the '<em><b>Is Mixin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_MIXIN = eINSTANCE.getClass__IsMixin();

		/**
		 * The meta object literal for the '<em><b>Is Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_EVENT = eINSTANCE.getClass__IsEvent();

		/**
		 * The meta object literal for the '<em><b>Is High Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_HIGH_ORDER = eINSTANCE.getClass__IsHighOrder();

		/**
		 * The meta object literal for the '<em><b>Is Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_RIGID = eINSTANCE.getClass__IsRigid();

		/**
		 * The meta object literal for the '<em><b>Is Non Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_NON_RIGID = eINSTANCE.getClass__IsNonRigid();

		/**
		 * The meta object literal for the '<em><b>Is Anti Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_ANTI_RIGID = eINSTANCE.getClass__IsAntiRigid();

		/**
		 * The meta object literal for the '<em><b>Is Semi Rigid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_SEMI_RIGID = eINSTANCE.getClass__IsSemiRigid();

		/**
		 * The meta object literal for the '<em><b>Is Perceivable Quality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_PERCEIVABLE_QUALITY = eINSTANCE.getClass__IsPerceivableQuality();

		/**
		 * The meta object literal for the '<em><b>Is Non Perceivable Quality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_NON_PERCEIVABLE_QUALITY = eINSTANCE.getClass__IsNonPerceivableQuality();

		/**
		 * The meta object literal for the '<em><b>Is Nominal Quality</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_NOMINAL_QUALITY = eINSTANCE.getClass__IsNominalQuality();

		/**
		 * The meta object literal for the '<em><b>Is Endurant Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_ENDURANT_CLASS = eINSTANCE.getClass__IsEndurantClass();

		/**
		 * The meta object literal for the '<em><b>Is Intrinsic Moment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_INTRINSIC_MOMENT = eINSTANCE.getClass__IsIntrinsicMoment();

		/**
		 * The meta object literal for the '<em><b>Is Substance Sortal Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_SUBSTANCE_SORTAL_CLASS = eINSTANCE.getClass__IsSubstanceSortalClass();

		/**
		 * The meta object literal for the '<em><b>Is Moment Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_MOMENT_CLASS = eINSTANCE.getClass__IsMomentClass();

		/**
		 * The meta object literal for the '<em><b>Is Identity Provider Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_IDENTITY_PROVIDER_CLASS = eINSTANCE.getClass__IsIdentityProviderClass();

		/**
		 * The meta object literal for the '<em><b>Is Mixin Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_MIXIN_CLASS = eINSTANCE.getClass__IsMixinClass();

		/**
		 * The meta object literal for the '<em><b>Is Anti Rigid Mixin Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_ANTI_RIGID_MIXIN_CLASS = eINSTANCE.getClass__IsAntiRigidMixinClass();

		/**
		 * The meta object literal for the '<em><b>Is Amount Of Matter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_AMOUNT_OF_MATTER = eINSTANCE.getClass__IsAmountOfMatter();

		/**
		 * The meta object literal for the '<em><b>Is Functional Complex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_FUNCTIONAL_COMPLEX = eINSTANCE.getClass__IsFunctionalComplex();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_COLLECTION = eINSTANCE.getClass__IsCollection();

		/**
		 * The meta object literal for the '<em><b>Is Moment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_MOMENT = eINSTANCE.getClass__IsMoment();

		/**
		 * The meta object literal for the '<em><b>Is Truth Maker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_TRUTH_MAKER = eINSTANCE.getClass__IsTruthMaker();

		/**
		 * The meta object literal for the '<em><b>Is Non Qualitative Intrinsic Moment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_NON_QUALITATIVE_INTRINSIC_MOMENT = eINSTANCE.getClass__IsNonQualitativeIntrinsicMoment();

		/**
		 * The meta object literal for the '<em><b>Is Qualitative Intrinsic Moment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IS_QUALITATIVE_INTRINSIC_MOMENT = eINSTANCE.getClass__IsQualitativeIntrinsicMoment();

		/**
		 * The meta object literal for the '<em><b>Identity Providers At All Parents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IDENTITY_PROVIDERS_AT_ALL_PARENTS = eINSTANCE.getClass__IdentityProvidersAtAllParents();

		/**
		 * The meta object literal for the '<em><b>Identity Providers At All Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IDENTITY_PROVIDERS_AT_ALL_CHILDREN = eINSTANCE.getClass__IdentityProvidersAtAllChildren();

		/**
		 * The meta object literal for the '<em><b>Identity Providers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASS___IDENTITY_PROVIDERS = eINSTANCE.getClass__IdentityProviders();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.EndPointImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__OWNER = eINSTANCE.getEndPoint_Owner();

		/**
		 * The meta object literal for the '<em><b>End Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__END_TYPE = eINSTANCE.getEndPoint_EndType();

		/**
		 * The meta object literal for the '<em><b>Subsets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__SUBSETS = eINSTANCE.getEndPoint_Subsets();

		/**
		 * The meta object literal for the '<em><b>Redefines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__REDEFINES = eINSTANCE.getEndPoint_Redefines();

		/**
		 * The meta object literal for the '<em><b>Is Subsetted By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__IS_SUBSETTED_BY = eINSTANCE.getEndPoint_IsSubsettedBy();

		/**
		 * The meta object literal for the '<em><b>Is Redefined By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_POINT__IS_REDEFINED_BY = eINSTANCE.getEndPoint_IsRedefinedBy();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.RelationshipImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__STEREOTYPE = eINSTANCE.getRelationship_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Reflexivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__REFLEXIVITY = eINSTANCE.getRelationship_Reflexivity();

		/**
		 * The meta object literal for the '<em><b>Symmetry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__SYMMETRY = eINSTANCE.getRelationship_Symmetry();

		/**
		 * The meta object literal for the '<em><b>Transitivity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TRANSITIVITY = eINSTANCE.getRelationship_Transitivity();

		/**
		 * The meta object literal for the '<em><b>Ciclicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__CICLICITY = eINSTANCE.getRelationship_Ciclicity();

		/**
		 * The meta object literal for the '<em><b>End Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__END_POINTS = eINSTANCE.getRelationship_EndPoints();

		/**
		 * The meta object literal for the '<em><b>Temporal Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TEMPORAL_NATURE = eINSTANCE.getRelationship_TemporalNature();

		/**
		 * The meta object literal for the '<em><b>Participation Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__PARTICIPATION_NATURE = eINSTANCE.getRelationship_ParticipationNature();

		/**
		 * The meta object literal for the '<em><b>Is Component Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_COMPONENT_OF = eINSTANCE.getRelationship__IsComponentOf();

		/**
		 * The meta object literal for the '<em><b>Is Member Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_MEMBER_OF = eINSTANCE.getRelationship__IsMemberOf();

		/**
		 * The meta object literal for the '<em><b>Is Sub Collection Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_SUB_COLLECTION_OF = eINSTANCE.getRelationship__IsSubCollectionOf();

		/**
		 * The meta object literal for the '<em><b>Is Sub Quantity Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_SUB_QUANTITY_OF = eINSTANCE.getRelationship__IsSubQuantityOf();

		/**
		 * The meta object literal for the '<em><b>Is Qua Part Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_QUA_PART_OF = eINSTANCE.getRelationship__IsQuaPartOf();

		/**
		 * The meta object literal for the '<em><b>Is Constitution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_CONSTITUTION = eINSTANCE.getRelationship__IsConstitution();

		/**
		 * The meta object literal for the '<em><b>Is Characterization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_CHARACTERIZATION = eINSTANCE.getRelationship__IsCharacterization();

		/**
		 * The meta object literal for the '<em><b>Is Mediation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_MEDIATION = eINSTANCE.getRelationship__IsMediation();

		/**
		 * The meta object literal for the '<em><b>Is Material</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_MATERIAL = eINSTANCE.getRelationship__IsMaterial();

		/**
		 * The meta object literal for the '<em><b>Is Formal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_FORMAL = eINSTANCE.getRelationship__IsFormal();

		/**
		 * The meta object literal for the '<em><b>Is Structuration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_STRUCTURATION = eINSTANCE.getRelationship__IsStructuration();

		/**
		 * The meta object literal for the '<em><b>Is Participation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_PARTICIPATION = eINSTANCE.getRelationship__IsParticipation();

		/**
		 * The meta object literal for the '<em><b>Is Sub Event Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_SUB_EVENT_OF = eINSTANCE.getRelationship__IsSubEventOf();

		/**
		 * The meta object literal for the '<em><b>Is Causation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_CAUSATION = eINSTANCE.getRelationship__IsCausation();

		/**
		 * The meta object literal for the '<em><b>Is Temporal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_TEMPORAL = eINSTANCE.getRelationship__IsTemporal();

		/**
		 * The meta object literal for the '<em><b>Is Instance Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_INSTANCE_OF = eINSTANCE.getRelationship__IsInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Is Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_DERIVATION = eINSTANCE.getRelationship__IsDerivation();

		/**
		 * The meta object literal for the '<em><b>Is Meronymic</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_MERONYMIC = eINSTANCE.getRelationship__IsMeronymic();

		/**
		 * The meta object literal for the '<em><b>Is Binary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_BINARY = eINSTANCE.getRelationship__IsBinary();

		/**
		 * The meta object literal for the '<em><b>Is Ternary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_TERNARY = eINSTANCE.getRelationship__IsTernary();

		/**
		 * The meta object literal for the '<em><b>Is Starts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_STARTS = eINSTANCE.getRelationship__IsStarts();

		/**
		 * The meta object literal for the '<em><b>Is Precedes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_PRECEDES = eINSTANCE.getRelationship__IsPrecedes();

		/**
		 * The meta object literal for the '<em><b>Is Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_EQUALS = eINSTANCE.getRelationship__IsEquals();

		/**
		 * The meta object literal for the '<em><b>Is Meets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_MEETS = eINSTANCE.getRelationship__IsMeets();

		/**
		 * The meta object literal for the '<em><b>Is Finishes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_FINISHES = eINSTANCE.getRelationship__IsFinishes();

		/**
		 * The meta object literal for the '<em><b>Is Overlaps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_OVERLAPS = eINSTANCE.getRelationship__IsOverlaps();

		/**
		 * The meta object literal for the '<em><b>Is During</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_DURING = eINSTANCE.getRelationship__IsDuring();

		/**
		 * The meta object literal for the '<em><b>Is Creation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_CREATION = eINSTANCE.getRelationship__IsCreation();

		/**
		 * The meta object literal for the '<em><b>Is Destruction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_DESTRUCTION = eINSTANCE.getRelationship__IsDestruction();

		/**
		 * The meta object literal for the '<em><b>Is Change</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_CHANGE = eINSTANCE.getRelationship__IsChange();

		/**
		 * The meta object literal for the '<em><b>Source End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___SOURCE_END = eINSTANCE.getRelationship__SourceEnd();

		/**
		 * The meta object literal for the '<em><b>Target End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___TARGET_END = eINSTANCE.getRelationship__TargetEnd();

		/**
		 * The meta object literal for the '<em><b>Part End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___PART_END = eINSTANCE.getRelationship__PartEnd();

		/**
		 * The meta object literal for the '<em><b>Whole End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___WHOLE_END = eINSTANCE.getRelationship__WholeEnd();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___SOURCE = eINSTANCE.getRelationship__Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___TARGET = eINSTANCE.getRelationship__Target();

		/**
		 * The meta object literal for the '<em><b>Source Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___SOURCE_CLASS = eINSTANCE.getRelationship__SourceClass();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___TARGET_CLASS = eINSTANCE.getRelationship__TargetClass();

		/**
		 * The meta object literal for the '<em><b>Whole Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___WHOLE_CLASS = eINSTANCE.getRelationship__WholeClass();

		/**
		 * The meta object literal for the '<em><b>Part Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___PART_CLASS = eINSTANCE.getRelationship__PartClass();

		/**
		 * The meta object literal for the '<em><b>Source Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___SOURCE_DATA_TYPE = eINSTANCE.getRelationship__SourceDataType();

		/**
		 * The meta object literal for the '<em><b>Target Data Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___TARGET_DATA_TYPE = eINSTANCE.getRelationship__TargetDataType();

		/**
		 * The meta object literal for the '<em><b>Source Relationship</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___SOURCE_RELATIONSHIP = eINSTANCE.getRelationship__SourceRelationship();

		/**
		 * The meta object literal for the '<em><b>Target Relationship</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___TARGET_RELATIONSHIP = eINSTANCE.getRelationship__TargetRelationship();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_DERIVED = eINSTANCE.getRelationship__IsDerived();

		/**
		 * The meta object literal for the '<em><b>Is End</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_END__CLASSIFIER = eINSTANCE.getRelationship__IsEnd__Classifier();

		/**
		 * The meta object literal for the '<em><b>Is Part Essential</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_PART_ESSENTIAL = eINSTANCE.getRelationship__IsPartEssential();

		/**
		 * The meta object literal for the '<em><b>Is Part Inseparable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_PART_INSEPARABLE = eINSTANCE.getRelationship__IsPartInseparable();

		/**
		 * The meta object literal for the '<em><b>Is Part Immutable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_PART_IMMUTABLE = eINSTANCE.getRelationship__IsPartImmutable();

		/**
		 * The meta object literal for the '<em><b>Is Whole Immutable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_WHOLE_IMMUTABLE = eINSTANCE.getRelationship__IsWholeImmutable();

		/**
		 * The meta object literal for the '<em><b>Is Part Mandatory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_PART_MANDATORY = eINSTANCE.getRelationship__IsPartMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Whole Mandatory</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_WHOLE_MANDATORY = eINSTANCE.getRelationship__IsWholeMandatory();

		/**
		 * The meta object literal for the '<em><b>Is Part Shareable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIONSHIP___IS_PART_SHAREABLE = eINSTANCE.getRelationship__IsPartShareable();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.GeneralizationSetImpl <em>Generalization Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.GeneralizationSetImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getGeneralizationSet()
		 * @generated
		 */
		EClass GENERALIZATION_SET = eINSTANCE.getGeneralizationSet();

		/**
		 * The meta object literal for the '<em><b>Is Covering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_COVERING = eINSTANCE.getGeneralizationSet_IsCovering();

		/**
		 * The meta object literal for the '<em><b>Is Disjoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_SET__IS_DISJOINT = eINSTANCE.getGeneralizationSet_IsDisjoint();

		/**
		 * The meta object literal for the '<em><b>Generalizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__GENERALIZATIONS = eINSTANCE.getGeneralizationSet_Generalizations();

		/**
		 * The meta object literal for the '<em><b>High Order</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION_SET__HIGH_ORDER = eINSTANCE.getGeneralizationSet_HighOrder();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERALIZATION_SET___GENERAL = eINSTANCE.getGeneralizationSet__General();

		/**
		 * The meta object literal for the '<em><b>Specifics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERALIZATION_SET___SPECIFICS = eINSTANCE.getGeneralizationSet__Specifics();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.impl.GeneralizationImpl
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '<em><b>Generalization Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERALIZATION_SET = eINSTANCE.getGeneralization_GeneralizationSet();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.PrimitiveStereotype <em>Primitive Stereotype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.PrimitiveStereotype
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getPrimitiveStereotype()
		 * @generated
		 */
		EEnum PRIMITIVE_STEREOTYPE = eINSTANCE.getPrimitiveStereotype();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.ConstraintStereotype <em>Constraint Stereotype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.ConstraintStereotype
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getConstraintStereotype()
		 * @generated
		 */
		EEnum CONSTRAINT_STEREOTYPE = eINSTANCE.getConstraintStereotype();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.ClassStereotype <em>Class Stereotype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.ClassStereotype
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClassStereotype()
		 * @generated
		 */
		EEnum CLASS_STEREOTYPE = eINSTANCE.getClassStereotype();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.DataTypeStereotype <em>Data Type Stereotype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.DataTypeStereotype
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getDataTypeStereotype()
		 * @generated
		 */
		EEnum DATA_TYPE_STEREOTYPE = eINSTANCE.getDataTypeStereotype();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Scale <em>Scale</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Scale
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getScale()
		 * @generated
		 */
		EEnum SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Measurement <em>Measurement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Measurement
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getMeasurement()
		 * @generated
		 */
		EEnum MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.QualityNature <em>Quality Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.QualityNature
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getQualityNature()
		 * @generated
		 */
		EEnum QUALITY_NATURE = eINSTANCE.getQualityNature();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Classification <em>Classification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Classification
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getClassification()
		 * @generated
		 */
		EEnum CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Existence <em>Existence</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Existence
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getExistence()
		 * @generated
		 */
		EEnum EXISTENCE = eINSTANCE.getExistence();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.RelationshipStereotype <em>Relationship Stereotype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.RelationshipStereotype
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getRelationshipStereotype()
		 * @generated
		 */
		EEnum RELATIONSHIP_STEREOTYPE = eINSTANCE.getRelationshipStereotype();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.TemporalNature <em>Temporal Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.TemporalNature
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getTemporalNature()
		 * @generated
		 */
		EEnum TEMPORAL_NATURE = eINSTANCE.getTemporalNature();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.ParticipationNature <em>Participation Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.ParticipationNature
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getParticipationNature()
		 * @generated
		 */
		EEnum PARTICIPATION_NATURE = eINSTANCE.getParticipationNature();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Reflexivity <em>Reflexivity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Reflexivity
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getReflexivity()
		 * @generated
		 */
		EEnum REFLEXIVITY = eINSTANCE.getReflexivity();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Symmetry <em>Symmetry</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Symmetry
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getSymmetry()
		 * @generated
		 */
		EEnum SYMMETRY = eINSTANCE.getSymmetry();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Transitivity <em>Transitivity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Transitivity
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getTransitivity()
		 * @generated
		 */
		EEnum TRANSITIVITY = eINSTANCE.getTransitivity();

		/**
		 * The meta object literal for the '{@link net.menthor.onto2.ontouml.Ciclicity <em>Ciclicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.menthor.onto2.ontouml.Ciclicity
		 * @see net.menthor.onto2.ontouml.impl.OntoumlPackageImpl#getCiclicity()
		 * @generated
		 */
		EEnum CICLICITY = eINSTANCE.getCiclicity();

	}

} //OntoumlPackage
