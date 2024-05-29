package com.webforj.issues;

import com.webforj.App;
import com.webforj.component.field.TextField;
import com.webforj.component.html.elements.Div;
import com.webforj.component.window.Frame;
import com.webforj.concern.HasComponents;
import com.webforj.exceptions.WebforjException;

public class GetComponentsApp extends App {
    @Override
    public void run() throws WebforjException {
        var frame = new Frame();
        Div container = new Div();
        frame.add(container);
        for(int i = 0; i < 5; i++)
            container.add(new TextField());
        App.consoleLog(container.getComponents().toString());
        container.removeAll();
        App.consoleLog(container.getComponents().toString());
    }
}
