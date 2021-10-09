package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TinyDB;
class accaunt_info extends Form implements HandlesEventDispatching {
  private VerticalArrangement Vertical_Arrangement1;
  private HorizontalArrangement Horizontal_Arrangement1;
  private Label usernameword;
  private Label username_label;
  private HorizontalArrangement Horizontal_Arrangement2;
  private Label ageword;
  private Label Age_label;
  private HorizontalArrangement Horizontal_Arrangement3;
  private Label storeownerword;
  private Label store_owner_label;
  private HorizontalArrangement Horizontal_Arrangement4;
  private Label storelocationword;
  private Label store_location_label;
  private HorizontalArrangement Horizontal_Arrangement5;
  private Label storecapacityword;
  private Label store_capacity_label;
  private HorizontalArrangement Horizontal_Arrangement6;
  private Label workinghoursword;
  private Label working_hours_label;
  private TinyDB Tiny_DB1;
  protected void $define() {
    this.AppName("Greekathon_team_codeweek");
    this.Title("accaunt_info");
    Vertical_Arrangement1 = new VerticalArrangement(this);
    Vertical_Arrangement1.BackgroundColor(0x00FFFFFF);
    Vertical_Arrangement1.Height(LENGTH_FILL_PARENT);
    Vertical_Arrangement1.Width(LENGTH_FILL_PARENT);
    Horizontal_Arrangement1 = new HorizontalArrangement(Vertical_Arrangement1);
    Horizontal_Arrangement1.BackgroundColor(0x00FFFFFF);
    Horizontal_Arrangement1.Height(LENGTH_FILL_PARENT);
    Horizontal_Arrangement1.Width(LENGTH_FILL_PARENT);
    usernameword = new Label(Horizontal_Arrangement1);
    usernameword.BackgroundColor(0xFFFFFFFF);
    usernameword.FontSize(18);
    usernameword.Height(LENGTH_FILL_PARENT);
    usernameword.Width(LENGTH_FILL_PARENT);
    usernameword.Text("Username :");
    username_label = new Label(Horizontal_Arrangement1);
    username_label.BackgroundColor(0xFFFFFFFF);
    username_label.FontSize(18);
    username_label.Height(LENGTH_FILL_PARENT);
    username_label.Width(LENGTH_FILL_PARENT);
    Horizontal_Arrangement2 = new HorizontalArrangement(Vertical_Arrangement1);
    Horizontal_Arrangement2.BackgroundColor(0xFFFFFFFF);
    Horizontal_Arrangement2.Height(LENGTH_FILL_PARENT);
    Horizontal_Arrangement2.Width(LENGTH_FILL_PARENT);
    ageword = new Label(Horizontal_Arrangement2);
    ageword.BackgroundColor(0xFFFFFFFF);
    ageword.FontSize(18);
    ageword.Height(LENGTH_FILL_PARENT);
    ageword.Width(LENGTH_FILL_PARENT);
    ageword.Text("Age :");
    Age_label = new Label(Horizontal_Arrangement2);
    Age_label.FontSize(18);
    Age_label.Height(LENGTH_FILL_PARENT);
    Age_label.Width(LENGTH_FILL_PARENT);
    Horizontal_Arrangement3 = new HorizontalArrangement(Vertical_Arrangement1);
    Horizontal_Arrangement3.BackgroundColor(0x00FFFFFF);
    Horizontal_Arrangement3.Height(LENGTH_FILL_PARENT);
    Horizontal_Arrangement3.Width(LENGTH_FILL_PARENT);
    storeownerword = new Label(Horizontal_Arrangement3);
    storeownerword.FontSize(18);
    storeownerword.Height(LENGTH_FILL_PARENT);
    storeownerword.Width(LENGTH_FILL_PARENT);
    storeownerword.Text("Store owner :");
    store_owner_label = new Label(Horizontal_Arrangement3);
    store_owner_label.FontSize(18);
    store_owner_label.Height(LENGTH_FILL_PARENT);
    store_owner_label.Width(LENGTH_FILL_PARENT);
    Horizontal_Arrangement4 = new HorizontalArrangement(Vertical_Arrangement1);
    Horizontal_Arrangement4.BackgroundColor(0x00FFFFFF);
    Horizontal_Arrangement4.Height(LENGTH_FILL_PARENT);
    Horizontal_Arrangement4.Width(LENGTH_FILL_PARENT);
    storelocationword = new Label(Horizontal_Arrangement4);
    storelocationword.BackgroundColor(0xFFFFFFFF);
    storelocationword.FontSize(18);
    storelocationword.Height(LENGTH_FILL_PARENT);
    storelocationword.Width(LENGTH_FILL_PARENT);
    storelocationword.Text("Store locatrion :");
    store_location_label = new Label(Horizontal_Arrangement4);
    store_location_label.BackgroundColor(0xFFFFFFFF);
    store_location_label.FontSize(18);
    store_location_label.Height(LENGTH_FILL_PARENT);
    store_location_label.Width(LENGTH_FILL_PARENT);
    Horizontal_Arrangement5 = new HorizontalArrangement(Vertical_Arrangement1);
    Horizontal_Arrangement5.BackgroundColor(0x00FFFFFF);
    Horizontal_Arrangement5.Height(LENGTH_FILL_PARENT);
    Horizontal_Arrangement5.Width(LENGTH_FILL_PARENT);
    storecapacityword = new Label(Horizontal_Arrangement5);
    storecapacityword.BackgroundColor(0xFFFFFFFF);
    storecapacityword.FontSize(18);
    storecapacityword.Height(LENGTH_FILL_PARENT);
    storecapacityword.Width(LENGTH_FILL_PARENT);
    storecapacityword.Text("Store capacity :");
    store_capacity_label = new Label(Horizontal_Arrangement5);
    store_capacity_label.BackgroundColor(0xFFFFFFFF);
    store_capacity_label.Height(LENGTH_FILL_PARENT);
    store_capacity_label.Width(LENGTH_FILL_PARENT);
    Horizontal_Arrangement6 = new HorizontalArrangement(Vertical_Arrangement1);
    Horizontal_Arrangement6.BackgroundColor(0x00FFFFFF);
    Horizontal_Arrangement6.Height(LENGTH_FILL_PARENT);
    Horizontal_Arrangement6.Width(LENGTH_FILL_PARENT);
    workinghoursword = new Label(Horizontal_Arrangement6);
    workinghoursword.FontSize(18);
    workinghoursword.Height(LENGTH_FILL_PARENT);
    workinghoursword.Width(LENGTH_FILL_PARENT);
    workinghoursword.Text("Working Hours :");
    working_hours_label = new Label(Horizontal_Arrangement6);
    working_hours_label.FontSize(18);
    working_hours_label.Height(LENGTH_FILL_PARENT);
    working_hours_label.Width(LENGTH_FILL_PARENT);
    Tiny_DB1 = new TinyDB(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}