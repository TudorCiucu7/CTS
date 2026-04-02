package Prototype.Implementare;

import java.util.HashMap;
import java.util.Map;

public class JucatorPrototype {
  public static Map<String, AbstractJucator> registry = new HashMap<>();
  static{
      Sablon1 s1 = new Sablon1();
      registry.put("s1",s1);
      Sablon2 s2 = new Sablon2();
      registry.put("s2",s2);
  }
  public static AbstractJucator getVersiune(String versiune){
      AbstractJucator jucator = null;
      AbstractJucator prototip = registry.get(versiune);
      try {
          if(prototip != null){
              jucator = prototip.clone();
          }

      } catch (CloneNotSupportedException e) {
          throw new RuntimeException(e);
      }
      return jucator;
  }

}
