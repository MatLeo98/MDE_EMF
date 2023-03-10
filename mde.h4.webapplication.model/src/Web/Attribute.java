/**
 */
package Web;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Web.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link Web.Attribute#isIsPK <em>Is PK</em>}</li>
 * </ul>
 *
 * @see Web.WebPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Web._DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Web._DataType
	 * @see #setType(_DataType)
	 * @see Web.WebPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	_DataType getType();

	/**
	 * Sets the value of the '{@link Web.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Web._DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(_DataType value);

	/**
	 * Returns the value of the '<em><b>Is PK</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is PK</em>' attribute.
	 * @see #setIsPK(boolean)
	 * @see Web.WebPackage#getAttribute_IsPK()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPK();

	/**
	 * Sets the value of the '{@link Web.Attribute#isIsPK <em>Is PK</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is PK</em>' attribute.
	 * @see #isIsPK()
	 * @generated
	 */
	void setIsPK(boolean value);

} // Attribute
