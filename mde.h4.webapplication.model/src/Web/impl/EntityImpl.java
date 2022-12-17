/**
 */
package Web.impl;

import Web.Attribute;
import Web.DContent;
import Web.Entity;
import Web.Index;
import Web.Individual;
import Web.WebPackage;
import Web.WebTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Web.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link Web.impl.EntityImpl#getIndividualPages <em>Individual Pages</em>}</li>
 *   <li>{@link Web.impl.EntityImpl#getIndexPages <em>Index Pages</em>}</li>
 *   <li>{@link Web.impl.EntityImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, WebPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getIndividualPages() {
		/**
		 * Individual.allInstances()->select(entity = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Individual_0 = idResolver.getClass(WebTables.CLSSid_Individual, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Individual, TYP_Web_c_c_Individual_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_Individual);
		Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Individual _1 = (Individual)ITERATOR__1.next();
			/**
			 * entity = self
			 */
			final /*@NonInvalid*/ Entity entity_0 = _1.getEntity();
			final /*@NonInvalid*/ boolean eq = entity_0.equals(this);
			//
			if (eq) {
				accumulator.add(_1);
			}
		}
		final /*@NonInvalid*/ List<Individual> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(Individual.class, select);
		return (EList<Individual>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndexPages() {
		/**
		 * Index.allInstances()->select(entity = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Index_0 = idResolver.getClass(WebTables.CLSSid_Index, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Index, TYP_Web_c_c_Index_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_Index);
		Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Index _1 = (Index)ITERATOR__1.next();
			/**
			 * entity = self
			 */
			final /*@NonInvalid*/ Entity entity_0 = _1.getEntity();
			final /*@NonInvalid*/ boolean eq = entity_0.equals(this);
			//
			if (eq) {
				accumulator.add(_1);
			}
		}
		final /*@NonInvalid*/ List<Index> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(Index.class, select);
		return (EList<Index>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DContent> getPages() {
		/**
		 * DContent.allInstances()->select(entity = self)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_DContent_0 = idResolver.getClass(WebTables.CLSSid_DContent, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_DContent_0, TYP_Web_c_c_DContent_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(WebTables.SET_CLSSid_DContent_0);
		Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ DContent _1 = (DContent)ITERATOR__1.next();
			/**
			 * entity = self
			 */
			final /*@NonInvalid*/ Entity entity_0 = _1.getEntity();
			final /*@NonInvalid*/ boolean eq = entity_0.equals(this);
			//
			if (eq) {
				accumulator.add(_1);
			}
		}
		final /*@NonInvalid*/ List<DContent> ECORE_select = ((IdResolverExtension)idResolver).ecoreValueOfAll(DContent.class, select);
		return (EList<DContent>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueAttributeName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Entity::UniqueAttributeName";
		try {
			/**
			 *
			 * inv UniqueAttributeName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Attribute.allInstances()
			 *         ->forAll(attr |
			 *           attributes->select(a | (attr.name = a.name))
			 *           ->size() <= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WebPackage.Literals.ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WebTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_Web_c_c_Attribute = idResolver.getClass(WebTables.CLSSid_Attribute, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, WebTables.SET_CLSSid_Attribute, TYP_Web_c_c_Attribute);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_attr = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_attr.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Attribute attr = (Attribute)ITERATOR_attr.next();
					/**
					 *
					 * attributes->select(a | (attr.name = a.name))
					 * ->size() <= 1
					 */
					final /*@NonInvalid*/ List<Attribute> attributes = this.getAttributes();
					final /*@NonInvalid*/ OrderedSetValue BOXED_attributes = idResolver.createOrderedSetOfAll(WebTables.ORD_CLSSid_Attribute, attributes);
					/*@Thrown*/ org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(WebTables.ORD_CLSSid_Attribute);
					Iterator<Object> ITERATOR_a = BOXED_attributes.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Attribute a = (Attribute)ITERATOR_a.next();
						/**
						 * attr.name = a.name
						 */
						final /*@NonInvalid*/ String name = attr.getName();
						final /*@NonInvalid*/ String name_0 = a.getName();
						final /*@NonInvalid*/ boolean eq = (name != null) ? name.equals(name_0) : (name_0 == null);
						//
						if (eq) {
							accumulator_0.add(a);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, WebTables.INT_1).booleanValue();
					//
					if (!le_0) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (le_0) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WebTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case WebPackage.ENTITY__INDIVIDUAL_PAGES:
				return getIndividualPages();
			case WebPackage.ENTITY__INDEX_PAGES:
				return getIndexPages();
			case WebPackage.ENTITY__PAGES:
				return getPages();
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
			case WebPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case WebPackage.ENTITY__INDIVIDUAL_PAGES:
				getIndividualPages().clear();
				getIndividualPages().addAll((Collection<? extends Individual>)newValue);
				return;
			case WebPackage.ENTITY__INDEX_PAGES:
				getIndexPages().clear();
				getIndexPages().addAll((Collection<? extends Index>)newValue);
				return;
			case WebPackage.ENTITY__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends DContent>)newValue);
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
			case WebPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case WebPackage.ENTITY__INDIVIDUAL_PAGES:
				getIndividualPages().clear();
				return;
			case WebPackage.ENTITY__INDEX_PAGES:
				getIndexPages().clear();
				return;
			case WebPackage.ENTITY__PAGES:
				getPages().clear();
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
			case WebPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case WebPackage.ENTITY__INDIVIDUAL_PAGES:
				return !getIndividualPages().isEmpty();
			case WebPackage.ENTITY__INDEX_PAGES:
				return !getIndexPages().isEmpty();
			case WebPackage.ENTITY__PAGES:
				return !getPages().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WebPackage.ENTITY___UNIQUE_ATTRIBUTE_NAME__DIAGNOSTICCHAIN_MAP:
				return UniqueAttributeName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntityImpl
