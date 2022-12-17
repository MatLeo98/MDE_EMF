/**
 */
package Web;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.WebApplication#getEntities <em>Entities</em>}</li>
 *   <li>{@link Web.WebApplication#getPages <em>Pages</em>}</li>
 *   <li>{@link Web.WebApplication#getVersion <em>Version</em>}</li>
 *   <li>{@link Web.WebApplication#getSubversion <em>Subversion</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getWebApplication()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueEntityName'"
 * @generated
 */
public interface WebApplication extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see Web.WebPackage#getWebApplication_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link Web.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see Web.WebPackage#getWebApplication_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link Web._DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see Web._DataType
	 * @see #setVersion(_DataType)
	 * @see Web.WebPackage#getWebApplication_Version()
	 * @model
	 * @generated
	 */
	_DataType getVersion();

	/**
	 * Sets the value of the '{@link Web.WebApplication#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see Web._DataType
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(_DataType value);

	/**
	 * Returns the value of the '<em><b>Subversion</b></em>' attribute.
	 * The literals are from the enumeration {@link Web._DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subversion</em>' attribute.
	 * @see Web._DataType
	 * @see #setSubversion(_DataType)
	 * @see Web.WebPackage#getWebApplication_Subversion()
	 * @model
	 * @generated
	 */
	_DataType getSubversion();

	/**
	 * Sets the value of the '{@link Web.WebApplication#getSubversion <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subversion</em>' attribute.
	 * @see Web._DataType
	 * @see #getSubversion()
	 * @generated
	 */
	void setSubversion(_DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Index.allInstances()-&gt;select(i | i.entity.name = entity)-&gt;size() + Individual.allInstances()-&gt;select(i | i.entity.name = entity)-&gt;size()'"
	 * @generated
	 */
	BigInteger entityInstancesNumber(String entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='entities-&gt;forAll(e | entities-&gt;select(ent | e.name = ent.name)-&gt;size()&lt;=1)'"
	 * @generated
	 */
	boolean UniqueEntityName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // WebApplication
