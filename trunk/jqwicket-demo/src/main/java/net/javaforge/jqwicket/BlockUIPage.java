package net.javaforge.jqwicket;

import net.javaforge.jqwicket.ui.blockui.BlockUIBehavior;
import net.javaforge.jqwicket.ui.blockui.BlockUIOptions;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;

import static net.javaforge.jqwicket.JQuery.$f;
import static net.javaforge.jqwicket.JQuery.js;

public class BlockUIPage extends WebPage {

	public BlockUIPage() {

		BlockUIBehavior b = new BlockUIBehavior();
		add(b);

		add(new Button("blockScreenButton").add(JQBehaviors.mouseClick($f(b
				.block().renderBodyOnlyAsJQStatement(),
				js("setTimeout($.unblockUI, 2000);")))));
		add(new Button("blockScreenButton2").add(JQBehaviors.mouseClick(b
				.block(new BlockUIOptions()
						.message("Custom loading message...")))));
		add(new Button("unblockScreenButton").add(JQBehaviors.mouseClick(b
				.unblock())));

		final WebMarkupContainer blockMe = new WebMarkupContainer("blockMe");
		blockMe.setOutputMarkupId(true);
		add(blockMe);

		add(new Button("blockElementButton").add(JQBehaviors.mouseClick(b
				.block(blockMe))));
		add(new Button("blockElementButton2").add(JQBehaviors.mouseClick(b
				.block(blockMe, new BlockUIOptions()
						.message("Custom loading message...")))));
		add(new Button("unblockElementButton").add(JQBehaviors.mouseClick(b
				.unblock(blockMe))));

	}
}
