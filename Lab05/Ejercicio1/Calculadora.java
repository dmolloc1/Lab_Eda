package Ejercicio1;
@SuppressWarnings("unchecked")

public class Calculadora <T extends Number>{
    public Calculadora(){

    }
    public T suma(T a, T b){
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue()+ b.floatValue());
        }
        return null;
    }

    public T resta(T  a, T b){
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        }
        return null;
    }

    public T multiplica(T a, T b){
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        }
        return null;
    }

    public T divide(T a, T b){
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() / b.floatValue());
        }
        return null;
    }


}

