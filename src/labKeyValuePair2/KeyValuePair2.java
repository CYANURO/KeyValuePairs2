package labKeyValuePair2;

public class KeyValuePair2<K extends Comparable<K>, V> implements Comparable<KeyValuePair2<K, V>> {

	private K key;
	private V value;
	
	public KeyValuePair2(K key, V value) {
		
		setKey(key);
		setValue(value);

	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof KeyValuePair2)) {
			return false;
		}
		KeyValuePair2 other = (KeyValuePair2) obj;
		if (key == null) {
			if (other.key != null) {
				return false;
			}
		} else if (!key.equals(other.key)) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		
		return true;
	}
	
	public String toString() {
		
		return (getKey() + ": " + getValue());
	}

	@Override
	public int compareTo(KeyValuePair2<K, V> pair) {
		// TODO Auto-generated method stub
		
		return this.key.compareTo(pair.getKey());
	}
}
