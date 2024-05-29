package com.webforj.issues;

import com.webforj.App;
import com.webforj.component.field.TextField;
import com.webforj.component.html.elements.Div;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;


public class RemoveApp extends App {

    @Override
    public void run() throws WebforjException {
        var window = new Frame();
        Div container = new Div();
        window.add(container);
        TextField field1 = new TextField();
        TextField field2 = new TextField();
        container.add(field1, field2);
        container.remove(field1);
        App.consoleLog(container.getComponents().toString());
    }

}
