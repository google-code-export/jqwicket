package com.google.code.jqwicket;


import org.apache.wicket.markup.html.WebMarkupContainer;

import com.google.code.jqwicket.ui.datetimepicker.DateTimePickerBehavior;
import com.google.code.jqwicket.ui.datetimepicker.DateTimePickerOptions;
import com.google.code.jqwicket.ui.datetimepicker.DateTimePickerTextField;
import com.google.code.jqwicket.ui.datetimepicker.TimePickerTextField;

public class DateTimePickerPage extends BaseJQueryUIPage {

	public DateTimePickerPage() {

		add(new DateTimePickerTextField<String>("datetimepicker"));
		add(new TimePickerTextField<String>("timepicker",
				new DateTimePickerOptions().hourGrid(3)));

		add(new WebMarkupContainer("datetimepicker.inline")
				.add(new DateTimePickerBehavior()));

	}
}