package LexParse;

public class Value {

    public static Value VOID = new Value(new Object());

    final Object value;

    public Value(Object value) {
        this.value = value;
    }
    
    public Integer asInteger() {
    	if(this.isInteger())
    		return (Integer)value;
    	return Integer.parseInt(this.toString());
    }

    public Boolean asBoolean() {
        if(this.isBoolean())
        	return (Boolean)value;
        return Boolean.parseBoolean(this.toString());
    }

    public Float asFloat() {
        if(this.isFloat())
        	return (Float)value;
        return Float.parseFloat(this.toString());
    }

    public String asString() {
    	return String.valueOf(value);
    }
    
    public Character asCharacter() {
    	return (Character)value;
    }

    public boolean isFloat() {
        return value instanceof Float;
    }
    
    public boolean isInteger() {
    	return value instanceof Integer;
    }
    
    public boolean isString() {
    	return value instanceof String;
    }
    
    public boolean isCharacter() {
    	return value instanceof Character;
    }
    
    public boolean isBoolean() {
    	return value instanceof Boolean;
    }
    
    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}