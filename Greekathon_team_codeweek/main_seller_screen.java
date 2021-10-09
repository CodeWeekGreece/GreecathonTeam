package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TinyDB;
class main_seller_screen extends Form implements HandlesEventDispatching {
  private VerticalArrangement Vertical_Arrangement1;
  private Button Button4;
  private Button ACCAUNT_INFO;
  private Button Button5;
  private Button APP_INFO;
  private Button Button7;
  private TinyDB Tiny_DB1;
  protected void $define() {
    this.AppName("Greekathon_team_codeweek");
    this.Title("main_seller_screen");
    Vertical_Arrangement1 = new VerticalArrangement(this);
    Vertical_Arrangement1.BackgroundColor(0x00FFFFFF);
    Vertical_Arrangement1.Height(LENGTH_FILL_PARENT);
    Vertical_Arrangement1.Width(LENGTH_FILL_PARENT);
    Button4 = new Button(Vertical_Arrangement1);
    Button4.BackgroundColor(0x00FFFFFF);
    Button4.Enabled(false);
    Button4.Height(LENGTH_FILL_PARENT);
    Button4.Width(LENGTH_FILL_PARENT);
    ACCAUNT_INFO = new Button(Vertical_Arrangement1);
    ACCAUNT_INFO.BackgroundColor(0xFF009688);
    ACCAUNT_INFO.Height(LENGTH_FILL_PARENT);
    ACCAUNT_INFO.Width(LENGTH_FILL_PARENT);
    ACCAUNT_INFO.Text("Λογαριασμός");
    ACCAUNT_INFO.TextColor(0xFF000000);
    Button5 = new Button(Vertical_Arrangement1);
    Button5.BackgroundColor(0x00FFFFFF);
    Button5.Enabled(false);
    Button5.Height(LENGTH_FILL_PARENT);
    Button5.Width(LENGTH_FILL_PARENT);
    APP_INFO = new Button(Vertical_Arrangement1);
    APP_INFO.BackgroundColor(0xFF009688);
    APP_INFO.Height(LENGTH_FILL_PARENT);
    APP_INFO.Width(LENGTH_FILL_PARENT);
    APP_INFO.Text("Γενικές πληροφορίες εφαρμογής.");
    APP_INFO.TextColor(0xFF000000);
    Button7 = new Button(Vertical_Arrangement1);
    Button7.BackgroundColor(0x00FFFFFF);
    Button7.Enabled(false);
    Button7.Height(LENGTH_FILL_PARENT);
    Button7.Width(LENGTH_FILL_PARENT);
    Tiny_DB1 = new TinyDB(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}