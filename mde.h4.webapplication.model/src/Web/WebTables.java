/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /mde.h4.webapplication.model/WebApplication.ecore
 * using:
 *   /mde.h4.webapplication.model/WebApplication.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Web;

// import Web.WebPackage;
// import Web.WebTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * WebTables provides the dispatch tables for the Web for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class WebTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(WebPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_mde_h4_s_webapplication = IdManager.getNsURIPackageId("https://mde.h4/webapplication", null, WebPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = WebTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ContentsHub = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("ContentsHub", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DContent = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("DContent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Index = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Individual = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("Individual", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Link = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("Link", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WebApplication = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getClassId("WebApplication", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid__DataType = WebTables.PACKid_https_c_s_s_mde_h4_s_webapplication.getEnumerationId("_DataType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ContentsHub = TypeId.BAG.getSpecializedId(WebTables.CLSSid_ContentsHub, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DContent = TypeId.BAG.getSpecializedId(WebTables.CLSSid_DContent, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Entity = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Entity, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Individual = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Individual, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Link = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Link, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Link_0 = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Attribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ContentsHub = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_ContentsHub, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Entity, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Index = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Index, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Page, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Attribute = TypeId.SET.getSpecializedId(WebTables.CLSSid_Attribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DContent = TypeId.SET.getSpecializedId(WebTables.CLSSid_DContent, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_DContent_0 = TypeId.SET.getSpecializedId(WebTables.CLSSid_DContent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Index = TypeId.SET.getSpecializedId(WebTables.CLSSid_Index, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Index_0 = TypeId.SET.getSpecializedId(WebTables.CLSSid_Index, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Individual = TypeId.SET.getSpecializedId(WebTables.CLSSid_Individual, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Individual_0 = TypeId.SET.getSpecializedId(WebTables.CLSSid_Individual, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Link = TypeId.SET.getSpecializedId(WebTables.CLSSid_Link, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Link_0 = TypeId.SET.getSpecializedId(WebTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Page = TypeId.SET.getSpecializedId(WebTables.CLSSid_Page, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			WebTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(WebPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _ContentsHub = new EcoreExecutorType(WebPackage.Literals.CONTENTS_HUB, PACKAGE, 0);
		public static final EcoreExecutorType _DContent = new EcoreExecutorType(WebPackage.Literals.DCONTENT, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(WebPackage.Literals.ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Index = new EcoreExecutorType(WebPackage.Literals.INDEX, PACKAGE, 0);
		public static final EcoreExecutorType _Individual = new EcoreExecutorType(WebPackage.Literals.INDIVIDUAL, PACKAGE, 0);
		public static final EcoreExecutorType _Link = new EcoreExecutorType(WebPackage.Literals.LINK, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(WebPackage.Literals.NAMED_ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(WebPackage.Literals.PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _WebApplication = new EcoreExecutorType(WebPackage.Literals.WEB_APPLICATION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration __DataType = new EcoreExecutorEnumeration(WebPackage.Literals._DATA_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Attribute,
			_ContentsHub,
			_DContent,
			_Entity,
			_Index,
			_Individual,
			_Link,
			_NamedElement,
			_Page,
			_WebApplication,
			__DataType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, WebTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__NamedElement = new ExecutorFragment(Types._Attribute, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ContentsHub__ContentsHub = new ExecutorFragment(Types._ContentsHub, WebTables.Types._ContentsHub);
		private static final ExecutorFragment _ContentsHub__NamedElement = new ExecutorFragment(Types._ContentsHub, WebTables.Types._NamedElement);
		private static final ExecutorFragment _ContentsHub__OclAny = new ExecutorFragment(Types._ContentsHub, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContentsHub__OclElement = new ExecutorFragment(Types._ContentsHub, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DContent__DContent = new ExecutorFragment(Types._DContent, WebTables.Types._DContent);
		private static final ExecutorFragment _DContent__NamedElement = new ExecutorFragment(Types._DContent, WebTables.Types._NamedElement);
		private static final ExecutorFragment _DContent__OclAny = new ExecutorFragment(Types._DContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DContent__OclElement = new ExecutorFragment(Types._DContent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, WebTables.Types._Entity);
		private static final ExecutorFragment _Entity__NamedElement = new ExecutorFragment(Types._Entity, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Index__DContent = new ExecutorFragment(Types._Index, WebTables.Types._DContent);
		private static final ExecutorFragment _Index__Index = new ExecutorFragment(Types._Index, WebTables.Types._Index);
		private static final ExecutorFragment _Index__NamedElement = new ExecutorFragment(Types._Index, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Index__OclAny = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Index__OclElement = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Individual__DContent = new ExecutorFragment(Types._Individual, WebTables.Types._DContent);
		private static final ExecutorFragment _Individual__Individual = new ExecutorFragment(Types._Individual, WebTables.Types._Individual);
		private static final ExecutorFragment _Individual__NamedElement = new ExecutorFragment(Types._Individual, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Individual__OclAny = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Individual__OclElement = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, WebTables.Types._Link);
		private static final ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, WebTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__NamedElement = new ExecutorFragment(Types._Page, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, WebTables.Types._Page);

		private static final ExecutorFragment _WebApplication__NamedElement = new ExecutorFragment(Types._WebApplication, WebTables.Types._NamedElement);
		private static final ExecutorFragment _WebApplication__OclAny = new ExecutorFragment(Types._WebApplication, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WebApplication__OclElement = new ExecutorFragment(Types._WebApplication, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WebApplication__WebApplication = new ExecutorFragment(Types._WebApplication, WebTables.Types._WebApplication);

		private static final ExecutorFragment __DataType__OclAny = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment __DataType__OclElement = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment __DataType__OclEnumeration = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment __DataType__OclType = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment __DataType___DataType = new ExecutorFragment(Types.__DataType, WebTables.Types.__DataType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Link__referencesNumber = new ExecutorOperation("referencesNumber", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Link,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _WebApplication__entityInstancesNumber = new ExecutorOperation("entityInstancesNumber", Parameters._String, Types._WebApplication,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Attribute__isPK = new EcoreExecutorProperty(WebPackage.Literals.ATTRIBUTE__IS_PK, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(WebPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__ContentsHub__attribute = new ExecutorPropertyWithImplementation("ContentsHub", Types._Attribute, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.CONTENTS_HUB__ATTRIBUTE));
		public static final ExecutorProperty _Attribute__Entity__attributes = new ExecutorPropertyWithImplementation("Entity", Types._Attribute, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.ENTITY__ATTRIBUTES));

		public static final ExecutorProperty _ContentsHub__attribute = new EcoreExecutorProperty(WebPackage.Literals.CONTENTS_HUB__ATTRIBUTE, Types._ContentsHub, 0);
		public static final ExecutorProperty _ContentsHub__Individual__contents = new ExecutorPropertyWithImplementation("Individual", Types._ContentsHub, 1, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDIVIDUAL__CONTENTS));

		public static final ExecutorProperty _DContent__entity = new EcoreExecutorProperty(WebPackage.Literals.DCONTENT__ENTITY, Types._DContent, 0);
		public static final ExecutorProperty _DContent__Entity__pages = new ExecutorPropertyWithImplementation("Entity", Types._DContent, 1, new EcoreLibraryOppositeProperty(WebPackage.Literals.ENTITY__PAGES));

		public static final ExecutorProperty _Entity__attributes = new EcoreExecutorProperty(WebPackage.Literals.ENTITY__ATTRIBUTES, Types._Entity, 0);
		public static final ExecutorProperty _Entity__indexPages = new EcoreExecutorProperty(WebPackage.Literals.ENTITY__INDEX_PAGES, Types._Entity, 1);
		public static final ExecutorProperty _Entity__individualPages = new EcoreExecutorProperty(WebPackage.Literals.ENTITY__INDIVIDUAL_PAGES, Types._Entity, 2);
		public static final ExecutorProperty _Entity__pages = new EcoreExecutorProperty(WebPackage.Literals.ENTITY__PAGES, Types._Entity, 3);
		public static final ExecutorProperty _Entity__DContent__entity = new ExecutorPropertyWithImplementation("DContent", Types._Entity, 4, new EcoreLibraryOppositeProperty(WebPackage.Literals.DCONTENT__ENTITY));
		public static final ExecutorProperty _Entity__WebApplication__entities = new ExecutorPropertyWithImplementation("WebApplication", Types._Entity, 5, new EcoreLibraryOppositeProperty(WebPackage.Literals.WEB_APPLICATION__ENTITIES));

		public static final ExecutorProperty _Index__individuals = new EcoreExecutorProperty(WebPackage.Literals.INDEX__INDIVIDUALS, Types._Index, 0);
		public static final ExecutorProperty _Index__links = new EcoreExecutorProperty(WebPackage.Literals.INDEX__LINKS, Types._Index, 1);
		public static final ExecutorProperty _Index__Entity__indexPages = new ExecutorPropertyWithImplementation("Entity", Types._Index, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.ENTITY__INDEX_PAGES));
		public static final ExecutorProperty _Index__Page__list = new ExecutorPropertyWithImplementation("Page", Types._Index, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.PAGE__LIST));

		public static final ExecutorProperty _Individual__contents = new EcoreExecutorProperty(WebPackage.Literals.INDIVIDUAL__CONTENTS, Types._Individual, 0);
		public static final ExecutorProperty _Individual__links = new EcoreExecutorProperty(WebPackage.Literals.INDIVIDUAL__LINKS, Types._Individual, 1);
		public static final ExecutorProperty _Individual__Entity__individualPages = new ExecutorPropertyWithImplementation("Entity", Types._Individual, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.ENTITY__INDIVIDUAL_PAGES));
		public static final ExecutorProperty _Individual__Index__individuals = new ExecutorPropertyWithImplementation("Index", Types._Individual, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDEX__INDIVIDUALS));
		public static final ExecutorProperty _Individual__Link__individual = new ExecutorPropertyWithImplementation("Link", Types._Individual, 4, new EcoreLibraryOppositeProperty(WebPackage.Literals.LINK__INDIVIDUAL));
		public static final ExecutorProperty _Individual__Page__individual = new ExecutorPropertyWithImplementation("Page", Types._Individual, 5, new EcoreLibraryOppositeProperty(WebPackage.Literals.PAGE__INDIVIDUAL));

		public static final ExecutorProperty _Link__individual = new EcoreExecutorProperty(WebPackage.Literals.LINK__INDIVIDUAL, Types._Link, 0);
		public static final ExecutorProperty _Link__name = new EcoreExecutorProperty(WebPackage.Literals.LINK__NAME, Types._Link, 1);
		public static final ExecutorProperty _Link__Index__links = new ExecutorPropertyWithImplementation("Index", Types._Link, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDEX__LINKS));
		public static final ExecutorProperty _Link__Individual__links = new ExecutorPropertyWithImplementation("Individual", Types._Link, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDIVIDUAL__LINKS));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(WebPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Page__individual = new EcoreExecutorProperty(WebPackage.Literals.PAGE__INDIVIDUAL, Types._Page, 0);
		public static final ExecutorProperty _Page__list = new EcoreExecutorProperty(WebPackage.Literals.PAGE__LIST, Types._Page, 1);
		public static final ExecutorProperty _Page__WebApplication__pages = new ExecutorPropertyWithImplementation("WebApplication", Types._Page, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.WEB_APPLICATION__PAGES));

		public static final ExecutorProperty _WebApplication__entities = new EcoreExecutorProperty(WebPackage.Literals.WEB_APPLICATION__ENTITIES, Types._WebApplication, 0);
		public static final ExecutorProperty _WebApplication__pages = new EcoreExecutorProperty(WebPackage.Literals.WEB_APPLICATION__PAGES, Types._WebApplication, 1);
		public static final ExecutorProperty _WebApplication__subversion = new EcoreExecutorProperty(WebPackage.Literals.WEB_APPLICATION__SUBVERSION, Types._WebApplication, 2);
		public static final ExecutorProperty _WebApplication__version = new EcoreExecutorProperty(WebPackage.Literals.WEB_APPLICATION__VERSION, Types._WebApplication, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__NamedElement /* 2 */,
				Fragments._Attribute__Attribute /* 3 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContentsHub =
			{
				Fragments._ContentsHub__OclAny /* 0 */,
				Fragments._ContentsHub__OclElement /* 1 */,
				Fragments._ContentsHub__NamedElement /* 2 */,
				Fragments._ContentsHub__ContentsHub /* 3 */
			};
		private static final int /*@NonNull*/ [] __ContentsHub = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DContent =
			{
				Fragments._DContent__OclAny /* 0 */,
				Fragments._DContent__OclElement /* 1 */,
				Fragments._DContent__NamedElement /* 2 */,
				Fragments._DContent__DContent /* 3 */
			};
		private static final int /*@NonNull*/ [] __DContent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__NamedElement /* 2 */,
				Fragments._Entity__Entity /* 3 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Index =
			{
				Fragments._Index__OclAny /* 0 */,
				Fragments._Index__OclElement /* 1 */,
				Fragments._Index__NamedElement /* 2 */,
				Fragments._Index__DContent /* 3 */,
				Fragments._Index__Index /* 4 */
			};
		private static final int /*@NonNull*/ [] __Index = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Individual =
			{
				Fragments._Individual__OclAny /* 0 */,
				Fragments._Individual__OclElement /* 1 */,
				Fragments._Individual__NamedElement /* 2 */,
				Fragments._Individual__DContent /* 3 */,
				Fragments._Individual__Individual /* 4 */
			};
		private static final int /*@NonNull*/ [] __Individual = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Link =
			{
				Fragments._Link__OclAny /* 0 */,
				Fragments._Link__OclElement /* 1 */,
				Fragments._Link__Link /* 2 */
			};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__NamedElement /* 2 */,
				Fragments._Page__Page /* 3 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WebApplication =
			{
				Fragments._WebApplication__OclAny /* 0 */,
				Fragments._WebApplication__OclElement /* 1 */,
				Fragments._WebApplication__NamedElement /* 2 */,
				Fragments._WebApplication__WebApplication /* 3 */
			};
		private static final int /*@NonNull*/ [] __WebApplication = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] __DataType =
			{
				Fragments.__DataType__OclAny /* 0 */,
				Fragments.__DataType__OclElement /* 1 */,
				Fragments.__DataType__OclType /* 2 */,
				Fragments.__DataType__OclEnumeration /* 3 */,
				Fragments.__DataType___DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] ___DataType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._ContentsHub.initFragments(_ContentsHub, __ContentsHub);
			Types._DContent.initFragments(_DContent, __DContent);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Index.initFragments(_Index, __Index);
			Types._Individual.initFragments(_Individual, __Individual);
			Types._Link.initFragments(_Link, __Link);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Page.initFragments(_Page, __Page);
			Types._WebApplication.initFragments(_WebApplication, __WebApplication);
			Types.__DataType.initFragments(__DataType, ___DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ContentsHub__ContentsHub = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContentsHub__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContentsHub__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContentsHub__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DContent__DContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DContent__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DContent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Index__Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__DContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Individual__Individual = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__DContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Link__Link = {
			WebTables.Operations._Link__referencesNumber /* referencesNumber() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WebApplication__WebApplication = {
			WebTables.Operations._WebApplication__entityInstancesNumber /* entityInstancesNumber(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WebApplication__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WebApplication__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WebApplication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] __DataType___DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__NamedElement.initOperations(_Attribute__NamedElement);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._ContentsHub__ContentsHub.initOperations(_ContentsHub__ContentsHub);
			Fragments._ContentsHub__NamedElement.initOperations(_ContentsHub__NamedElement);
			Fragments._ContentsHub__OclAny.initOperations(_ContentsHub__OclAny);
			Fragments._ContentsHub__OclElement.initOperations(_ContentsHub__OclElement);

			Fragments._DContent__DContent.initOperations(_DContent__DContent);
			Fragments._DContent__NamedElement.initOperations(_DContent__NamedElement);
			Fragments._DContent__OclAny.initOperations(_DContent__OclAny);
			Fragments._DContent__OclElement.initOperations(_DContent__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__NamedElement.initOperations(_Entity__NamedElement);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Index__DContent.initOperations(_Index__DContent);
			Fragments._Index__Index.initOperations(_Index__Index);
			Fragments._Index__NamedElement.initOperations(_Index__NamedElement);
			Fragments._Index__OclAny.initOperations(_Index__OclAny);
			Fragments._Index__OclElement.initOperations(_Index__OclElement);

			Fragments._Individual__DContent.initOperations(_Individual__DContent);
			Fragments._Individual__Individual.initOperations(_Individual__Individual);
			Fragments._Individual__NamedElement.initOperations(_Individual__NamedElement);
			Fragments._Individual__OclAny.initOperations(_Individual__OclAny);
			Fragments._Individual__OclElement.initOperations(_Individual__OclElement);

			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Page__NamedElement.initOperations(_Page__NamedElement);
			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._WebApplication__NamedElement.initOperations(_WebApplication__NamedElement);
			Fragments._WebApplication__OclAny.initOperations(_WebApplication__OclAny);
			Fragments._WebApplication__OclElement.initOperations(_WebApplication__OclElement);
			Fragments._WebApplication__WebApplication.initOperations(_WebApplication__WebApplication);

			Fragments.__DataType__OclAny.initOperations(__DataType__OclAny);
			Fragments.__DataType__OclElement.initOperations(__DataType__OclElement);
			Fragments.__DataType__OclEnumeration.initOperations(__DataType__OclEnumeration);
			Fragments.__DataType__OclType.initOperations(__DataType__OclType);
			Fragments.__DataType___DataType.initOperations(__DataType___DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			WebTables.Properties._Attribute__isPK,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContentsHub = {
			WebTables.Properties._ContentsHub__attribute,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DContent = {
			WebTables.Properties._DContent__entity,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			WebTables.Properties._Entity__attributes,
			WebTables.Properties._Entity__indexPages,
			WebTables.Properties._Entity__individualPages,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._Entity__pages
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Index = {
			WebTables.Properties._DContent__entity,
			WebTables.Properties._Index__individuals,
			WebTables.Properties._Index__links,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Individual = {
			WebTables.Properties._Individual__contents,
			WebTables.Properties._DContent__entity,
			WebTables.Properties._Individual__links,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Link = {
			WebTables.Properties._Link__individual,
			WebTables.Properties._Link__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			WebTables.Properties._Page__individual,
			WebTables.Properties._Page__list,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WebApplication = {
			WebTables.Properties._WebApplication__entities,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._WebApplication__pages,
			WebTables.Properties._WebApplication__subversion,
			WebTables.Properties._WebApplication__version
		};

		private static final ExecutorProperty /*@NonNull*/ [] __DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._ContentsHub__ContentsHub.initProperties(_ContentsHub);
			Fragments._DContent__DContent.initProperties(_DContent);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Index__Index.initProperties(_Index);
			Fragments._Individual__Individual.initProperties(_Individual);
			Fragments._Link__Link.initProperties(_Link);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._WebApplication__WebApplication.initProperties(_WebApplication);
			Fragments.__DataType___DataType.initProperties(__DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral __DataType__string = new EcoreExecutorEnumerationLiteral(WebPackage.Literals._DATA_TYPE.getEEnumLiteral("string"), Types.__DataType, 0);
		public static final EcoreExecutorEnumerationLiteral __DataType__int = new EcoreExecutorEnumerationLiteral(WebPackage.Literals._DATA_TYPE.getEEnumLiteral("int"), Types.__DataType, 1);
		public static final EcoreExecutorEnumerationLiteral __DataType__date = new EcoreExecutorEnumerationLiteral(WebPackage.Literals._DATA_TYPE.getEEnumLiteral("date"), Types.__DataType, 2);
		public static final EcoreExecutorEnumerationLiteral __DataType__text = new EcoreExecutorEnumerationLiteral(WebPackage.Literals._DATA_TYPE.getEEnumLiteral("text"), Types.__DataType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] __DataType = {
			__DataType__string,
			__DataType__int,
			__DataType__date,
			__DataType__text
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types.__DataType.initLiterals(__DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new WebTables();
	}

	private WebTables() {
		super(WebPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		WebPackage.Literals.ATTRIBUTE,
		WebPackage.Literals.DCONTENT,
		WebPackage.Literals.INDEX,
		WebPackage.Literals.INDIVIDUAL,
		WebPackage.Literals.LINK,
		WebPackage.Literals.PAGE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
