/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.nextreports.server.web.core;

import org.apache.wicket.AttributeModifier;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.image.ContextImage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import ro.nextreports.server.web.themes.ThemesManager;

public class MaintenancePage extends BasePage {

	private static final long serialVersionUID = 1L;

	public MaintenancePage(PageParameters parameters) {
		
		cssContainer.add(AttributeModifier.replace("href", ThemesManager.getInstance().get3rdThemeRelativePathCss()));

		add(new Label("maintenance", getString("Maintenance.message")));
		add(new BookmarkablePageLink<HomePage>("home", getApplication().getHomePage()));

	}

}
