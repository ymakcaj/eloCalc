package eloEngine.EloMaths;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.util.HashMap;
import java.util.Map;

public class EloMarginFactory {
    private static Map<String, Class<? extends EloMargin>> EloMarginMap = new HashMap<>();
    
    static {
        EloMarginMap.put("logistic", EloMarginLogistic.class);
        EloMarginMap.put("algebraic", EloMarginAlgebraic.class);
    }

    public static EloMargin createEloMargin(String squashingFunction, double margin) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, IllegalArgumentException {
        Class<? extends EloMargin> instructionClass = EloMarginMap.get(squashingFunction);
    
        if (instructionClass == null) {
            throw new IllegalArgumentException("squashingFunction: " + squashingFunction + " not regonised.");
        }
        Constructor<? extends EloMargin> eloMarginConstructor = getEloMarginConstructor(instructionClass);

        return eloMarginConstructor.newInstance(margin);

    }

    private static Constructor<? extends EloMargin> getEloMarginConstructor(Class<? extends EloMargin> eloMarginClass) throws NoSuchMethodException {
        
        for (Constructor<?> constructor : eloMarginClass.getConstructors()) {
            if (constructor.getParameterTypes().length == 1) {
                return (Constructor<? extends EloMargin>) constructor;
            }
        }
        throw new NoSuchMethodException("No suitable constructor found for class: " + eloMarginClass.getName());
    }

}
