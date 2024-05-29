package com.webforj.issues;

import com.webforj.App;
import com.webforj.component.field.TextField;
import com.webforj.component.html.elements.Div;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;

public class RemoveWorkingApp extends App {

    @Override
    public void run() throws WebforjException {
        var window = new Frame();
        Div container = new Div();
        TextField field1 = new TextField();
        TextField field2 = new TextField();
        container.add(field1, field2);
        window.add(container);
        container.remove(field1);
    }

}
