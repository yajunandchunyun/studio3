package com.aptana.scripting.ui.views;

import org.eclipse.swt.graphics.Image;

import com.aptana.scripting.model.BundleElement;
import com.aptana.scripting.model.MenuElement;

class MenusNode extends BaseNode
{
	private MenuNode[] _menus;
	
	/**
	 * CommandsNode
	 * 
	 * @param bundle
	 */
	public MenusNode(BundleElement bundle)
	{
		MenuElement[] menus = bundle.getMenus();
		
		this._menus = new MenuNode[menus.length];
		
		for (int i = 0; i < menus.length; i++)
		{
			this._menus[i] = new MenuNode(menus[i]);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.aptana.scripting.ui.views.BaseNode#getChildren()
	 */
	public Object[] getChildren()
	{
		return this._menus;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.aptana.scripting.ui.views.BaseNode#getImage()
	 */
	public Image getImage()
	{
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.aptana.scripting.ui.views.CollectionNode#getLabel()
	 */
	public String getLabel()
	{
		return Messages.MenusNode_Menus_Node;
	}

	/**
	 * hasChildren
	 * 
	 * @return
	 */
	public boolean hasChildren()
	{
		return this._menus.length > 0;
	}
}
