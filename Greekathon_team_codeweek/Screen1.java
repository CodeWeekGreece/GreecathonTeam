package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.TinyDB;
class Screen1 extends Form implements HandlesEventDispatching {
  private VerticalArrangement VerticalArrangement1;
  private Image Image2;
  private Image Image1;
  private Clock Clock1;
  private TinyDB Tiny_DB1;
  protected void $define() {
    this.AppName("Greekathon_team_codeweek");
    this.Title("Screen1");
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.BackgroundColor(0x00FFFFFF);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Image2 = new Image(VerticalArrangement1);
    Image2.Height(LENGTH_FILL_PARENT);
    Image2.Width(LENGTH_FILL_PARENT);
    Image2.Picture("2.png");
    Image1 = new Image(VerticalArrangement1);
    Image1.Height(LENGTH_FILL_PARENT);
    Image1.Width(LENGTH_FILL_PARENT);
    Image1.Picture("loading_splash_screen.gif");
    Clock1 = new Clock(this);
    Tiny_DB1 = new TinyDB(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}