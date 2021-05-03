package com.revature.models;

public class Pokemon {
		public String name;
		public String type;
		
		
		public Pokemon(String name, String type) {
			super();
			this.name = name;
			this.type = type;
		}


		@Override
		public int hashCode() {//auto generated code: will give each instantiated object of this class with a hash value
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {// auto generated code: will let you compare objects by hash value
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pokemon other = (Pokemon) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Pokemon [name=" + name + ", type=" + type + "]";
		}
		
		
		
		

}
