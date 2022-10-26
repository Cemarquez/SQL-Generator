
/*
 * 
 */
package concrete.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import concrete.diagram.providers.ConcreteElementTypes;

/**
 * @generated
 */
public class ConcretePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createMAttribute1CreationTool());
		paletteContainer.add(createMClass2CreationTool());
		paletteContainer.add(createMFunction3CreationTool());
		paletteContainer.add(createMPackage4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createMAssociation1CreationTool());
		paletteContainer.add(createMContainment2CreationTool());
		paletteContainer.add(createMInheritance3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createMAttribute1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MAttribute1CreationTool_title,
				Messages.MAttribute1CreationTool_desc, Collections.singletonList(ConcreteElementTypes.MAttribute_3001));
		entry.setId("createMAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MAttribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMClass2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MClass2CreationTool_title,
				Messages.MClass2CreationTool_desc, Collections.singletonList(ConcreteElementTypes.MClass_2002));
		entry.setId("createMClass2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MClass_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMFunction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MFunction3CreationTool_title,
				Messages.MFunction3CreationTool_desc, Collections.singletonList(ConcreteElementTypes.MFunction_3002));
		entry.setId("createMFunction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MFunction_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMPackage4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MPackage4CreationTool_title,
				Messages.MPackage4CreationTool_desc, Collections.singletonList(ConcreteElementTypes.MPackage_2001));
		entry.setId("createMPackage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MPackage_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMAssociation1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MAssociation1CreationTool_title,
				Messages.MAssociation1CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.MAssociation_4001));
		entry.setId("createMAssociation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MAssociation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMContainment2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MContainment2CreationTool_title,
				Messages.MContainment2CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.MContainment_4003));
		entry.setId("createMContainment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MContainment_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMInheritance3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.MInheritance3CreationTool_title,
				Messages.MInheritance3CreationTool_desc,
				Collections.singletonList(ConcreteElementTypes.MInheritance_4002));
		entry.setId("createMInheritance3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ConcreteElementTypes.getImageDescriptor(ConcreteElementTypes.MInheritance_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
