package com.webforj.issues;

import com.webforj.App;
import com.webforj.component.field.TextField;
import com.webforj.component.html.elements.Div;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;

public class RemoveAllWorkingApp extends App  {
    @Override
    public void run() throws WebforjException {
        Div container = new Div();
        var window = new Frame();
        for(int i = 0; i < 5; i++)
            container.add(new TextField());
        window.add(container);
        container.removeAll();
    }
}
