package act16;

import com.mrjaffesclass.apcs.messenger.*;

/**
 * 
 * The Controller is the master of the App you're writing. It instantiates the
 * view and the model, receives messages from the View in response to user
 * interface (UI) actions like clicking a button, changing an input field, 
 * etc.  It also sends and receives messages to the Model to communicate
 * changes required and changes made to the Model variables.  
 *
 * @author Roger Jaffe
 * @version 1.0
 */
public class Elevens implements MessageHandler {

  private final Messenger mvcMessaging;

  /**
   * Controller constructor The Controller is responsible for creating the View
   * and the Model that it will be controlling. The mvcMessaging object is
   * passed to the view and the model and is used as a local messenger
   * between the Controller, Model and View without have direct access to the
   * View and Model.  Remember, you want the three components separated so
   * that one class works independently of the others.
   *
   * Messages that can be received in the Controller:
   *  view:toggleButtonClick (sent by the View when the toggle button is clicked)
   *  view:buttonClick (sent by the View when the regular button is clicked)
   *  view:changeButton (sent by the View when the Up or Down buttons are clicked)
   * Message that are sent from the Controller:
   *  controller:changeButton (sent by the Controller to notify the Model to change 
   *    the value of a Model variable
   */
  public Elevens() {
    // Create the local messaging class
    mvcMessaging = new Messenger(true);

    // Create the view and set it visible
    View view = new View(mvcMessaging);    // This creates our view
    view.init();
    view.setVisible(true);

    // Create the model
    Model model = new Model(mvcMessaging);  // This creates our model
    model.init();
  }

  /**
   * Initialize the model here and subscribe
   * to any required messages
   * 
   * "this" refers to this controller object.
   */
  public void init() {
    // This is where you would subscribe to any messages the controller
    // would need to process
    // A sample subscriber call would be like...
    //mvcMessaging.subscribe("view:toggleButtonClick", this);
  }

  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    // This is where the controller would handle any messages
  }

  /**
   * Program entry -- main is called when the program starts
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Elevens app = new Elevens();  // Create our controller...
    app.init();                         // ...and init it too
  }
  
}
