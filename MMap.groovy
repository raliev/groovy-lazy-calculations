
class MMap extends LinkedHashMap {

    def name = "";

    MMap(nm) {
        this.name = nm
    }

    @Override
    Object get(Object key) {
        if (!containsKey(key)) {
            put(key, new MMap(name + "." + key))
        }
        return super.get(key);
    }
 }

