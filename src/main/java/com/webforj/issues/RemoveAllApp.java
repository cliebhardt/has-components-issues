package com.webforj.issues;

import com.webforj.App;
import com.webforj.component.field.TextField;
import com.webforj.component.html.elements.Div;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;

public class RemoveAllApp extends App {
    @Override
    public void run() throws WebforjException {
        Div container = new Div();
        var window = new Frame();
        window.add(container);
        for(int i = 0; i < 5; i++)
            container.add(new TextField());
        container.removeAll();
    }
}
