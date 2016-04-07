package Driver;

import LexParse.Type;

public class Symbol {
	 protected Scope scope; // the owning scope
	 protected String name;
	 protected String type;
	 protected Type value;
	 protected String[] parameters;

	 public Symbol(String name, String type,Type value) {
		 this.name = name;
	     this.type = type;
	     this.value = value;
	     this.parameters = null;
	 }

	 public String getName() {
	     return name;
	 }

	 public String getType() {
	     return type;
	 }

	 public void setScope(Scope scope) {
	     this.scope = scope;
	 }

	 public Scope getScope() {
	     return scope;
	 }
	 
	 public Object getValue() {
		 return value;
	 }
	 
	 public void setValue(Type value) {
		 this.value = value;
	 }

	 public int genID() {
	     return scope.genID;
	 }

	 public String toString() {
	     if (type != null) return '<' + getName() + ":" + type + ":" + value + '>';
	        return getName();
	 }
}
