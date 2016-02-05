package org.cmu.edu.map;
 
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;

import java.awt.*;
 
public class Map {
    public static void main(String[] args) {
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
        
        JFrame frame = new JFrame("Google Map Show Weather");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(1200, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        browser.loadURL(System.getProperty("user.dir") + "\\index.html");
    }
} 