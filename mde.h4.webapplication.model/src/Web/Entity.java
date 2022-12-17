/**
 */
package Web;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Web.Entity#getIndividualPages <em>Individual Pages</em>}</li>
 *   <li>{@link Web.Entity#getIndexPages <em>Index Pages</em>}</li>
 *   <li>{@link Web.Entity#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueAttributeName'"
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see Web.WebPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Individual Pages</b></em>' reference list.
	 * The list contents are of type {@link Web.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Pages</em>' reference list.
	 * @see Web.WebPackage#getEntity_IndividualPages()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Individual> getIndividualPages();

	/**
	 * Returns the value of the '<em><b>Index Pages</b></em>' reference list.
	 * The list contents are of type {@link Web.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Pages</em>' reference list.
	 * @see Web.WebPackage#getEntity_IndexPages()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Index> getIndexPages();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' reference list.
	 * The list contents are of type {@link Web.DContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' reference list.
	 * @see Web.WebPackage#getEntity_Pages()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<DContent> getPages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Attribute.allInstances()-&gt;forAll(attr | attributes-&gt;select(a | attr.name = a.name)-&gt;size()&lt;=1)'"
	 * @generated
	 */
	boolean UniqueAttributeName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Entity
