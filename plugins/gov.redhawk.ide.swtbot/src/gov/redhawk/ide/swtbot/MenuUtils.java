/*******************************************************************************
 * This file is protected by Copyright.
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gov.redhawk.ide.swtbot;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class MenuUtils {

	private MenuUtils() {
	}

	/**
	 * Close all open editors and delete the specified project from the file system
	 * @param bot
	 * @param waveformName
	 */
	public static void closeAndDelete(SWTWorkbenchBot bot, String waveformName) {
		closeAllWithoutSave(bot);
		deleteNodeInProjectExplorer(bot, waveformName);
	}

	/**
	 * Close all open editors without saving changes
	 * @param bot - SWTBot
	 */
	public static void closeAllWithoutSave(SWTWorkbenchBot bot) {
		closeAll(bot, false);
	}

	/**
	 * Close all open editors
	 * @param bot - SWTBot
	 * @param save - True if you want to save editor contents before closing
	 */
	public static void closeAll(SWTWorkbenchBot bot, boolean save) {
		if (save) {
			bot.saveAllEditors();
		}
		bot.closeAllEditors();
	}

	/**
	 * Delete specified project from the file system
	 * @param bot
	 * @param projectName
	 */
	public static void deleteNodeInProjectExplorer(SWTBot bot, String projectName) {
		try {
			ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).delete(true, null);
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	/**
	 * Save all editors
	 * @param bot
	 */
	public static void save(final SWTBotEditor editor) {
		editor.bot().waitUntil(new DefaultCondition() {

			@Override
			public boolean test() throws Exception {
				return editor.isDirty();
			}

			@Override
			public String getFailureMessage() {
				return "Editor never dirty";
			}
		}, 10000, 1000);
		editor.save();
		editor.bot().waitUntil(new DefaultCondition() {

			@Override
			public boolean test() throws Exception {
				return !editor.isDirty();
			}

			@Override
			public String getFailureMessage() {
				return "Editor still dirty";
			}
		}, 10000, 1000);
	}

	/**
	 * Is the undo menu option disabled?
	 * @return
	 */
	public static boolean isUndoDisabled(SWTBot bot) {
		Matcher<MenuItem> undoMatcher = new BaseMatcher<MenuItem>() {

			@Override
			public boolean matches(Object item) {
				if (!(item instanceof MenuItem)) {
					return false;
				}
				return ((MenuItem) item).getText().startsWith("&Undo");
			}

			@Override
			public void describeTo(Description description) {
				description.appendText("disabled, and no text for an non-undoable item");
			}

		};
		try {
			SWTBotMenu undoMenu = bot.menu().menu("Edit").menu(undoMatcher, false, 0);
			boolean isEnabled = undoMenu.isEnabled();
			undoMenu.hide();
			return isEnabled;
		} catch (WidgetNotFoundException ex) {
			return false;
		}
	}
}
