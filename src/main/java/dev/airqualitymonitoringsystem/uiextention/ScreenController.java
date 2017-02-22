/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.airqualitymonitoringsystem.uiextention;

import com.airhacks.afterburner.views.FXMLView;

/**
 *
 * @author Administrator
 */
public abstract class ScreenController {

    public void navigateToView(FXMLView view, Object param)
    {
        ControlledScreen presenter = (ControlledScreen) view.getPresenter();
        presenter.setScreenController(this);
    }

}
