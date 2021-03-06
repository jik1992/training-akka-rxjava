package zuoyun.me.Hello;


import akka.actor.UntypedActor;

/**
 * Created by ZuoYun on 1/7/16. Time: 5:36 PM Information:
 */

public class Greeter extends UntypedActor {

  public static enum Msg {
    GREET, DONE
  }

  @Override
  public void onReceive(Object msg) {
    if (msg == Msg.GREET) {
      System.out.println("Hello World!");
      getSender().tell(Msg.DONE, getSelf());
    } else {
      unhandled(msg);
    }
  }
}
