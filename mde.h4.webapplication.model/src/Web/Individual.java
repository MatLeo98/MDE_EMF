/**
 */
package Web;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Individual#getContents <em>Contents</em>}</li>
 *   <li>{@link Web.Individual#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends NamedElement, DContent {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link Web.ContentsHub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see Web.WebPackage#getIndividual_Contents()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContentsHub> getContents();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link Web.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see Web.WebPackage#getIndividual_Links()
	 * @model volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Link> getLinks();

} // Individual
