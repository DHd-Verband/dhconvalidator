package org.adho.dhconvalidator.ui;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class CenterPanel extends VerticalLayout {
	
	private VerticalLayout center;

	public CenterPanel(boolean showHeader) {
		initComponents(showHeader);
	}

	private void initComponents(boolean showHeader) {
		center = new VerticalLayout();
		center.setSpacing(true);
		setSizeFull();
		addComponent(center);
		center.setSizeUndefined();
		setComponentAlignment(center, Alignment.MIDDLE_CENTER);
		if (showHeader) {
			HorizontalLayout headerPanel = new HorizontalLayout();
			headerPanel.setWidth("100%");
			Label title = new Label("DHConvalidator");
			title.addStyleName("title-caption");
			headerPanel.addComponent(title);
			headerPanel.setComponentAlignment(title, Alignment.TOP_LEFT);
			LogoutLink logoutLink = new LogoutLink();
			headerPanel.addComponent(logoutLink);
			headerPanel.setComponentAlignment(logoutLink, Alignment.TOP_RIGHT);
			center.addComponent(headerPanel);
		}
	}

	public void addCenteredComponent(Component c) {
		center.addComponent(c);
	}
	
	public void addCenteredComponent(Component c, Alignment alignment) {
		center.addComponent(c);
		center.setComponentAlignment(c, alignment);
	}

}
