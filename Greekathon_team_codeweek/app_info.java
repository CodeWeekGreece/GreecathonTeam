package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TinyDB;
class app_info extends Form implements HandlesEventDispatching {
  private Label Label1;
  private TinyDB Tiny_DB1;
  protected void $define() {
    this.AppName("Greekathon_team_codeweek");
    this.Title("app_info");
    Label1 = new Label(this);
    Label1.FontSize(18);
    Label1.Width(LENGTH_FILL_PARENT);
    Label1.Text("Created by Greekathon team and this app is not maintained by anyone. The source code can be found in the github repo with the team's name, just search it. ");
    Tiny_DB1 = new TinyDB(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}