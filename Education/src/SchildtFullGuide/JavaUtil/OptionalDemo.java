package SchildtFullGuide.JavaUtil;

import java.util.Optional;

/** Optional - это класс, объекты которого предполагается использовать в качестве возвращаемых значений в случаях,
 * когда есть вероятность, что метод вернёт null. В сущности, Optional мало чем отличается от обычного возвращаемого
 * значения, т.к. он не избавляет от необходимости перестраховываться от пустых значений. Он просто служит маркером для
 * другого программиста, сигнализирующим о том, что метод может вернуть null.*/

public class OptionalDemo {

    public static void main(String[] args) {
        if (cringeNullMethod() != null) System.out.println(cringeNullMethod());                                         // скучный Null Check
        if (chadOptionalMethod().isPresent()) System.out.println(chadOptionalMethod().get());                           // крутая проверка isPresent()
        System.out.println(chadOptionalMethod().orElse("Бомба"));                                                 // либо можно значение по умолчанию использовать 0_0
    }

    public static String cringeNullMethod(){return null;}

    public static Optional<String> chadOptionalMethod(){return  Optional.ofNullable(null);}                       // .ofNullable() следует использовать, когда есть
                                                                                                                        // вернуть null.
                                                                                                                        // .of() - когда 100% есть значение
                                                                                                                        // .ofEmpty() - когда 100% null
                                                                                                                        // Но разницы нет, кста

}
