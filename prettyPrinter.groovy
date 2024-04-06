
class prettyPrinter {
    def static mapprint(shift, x, res = "") {
        for (e in x) {

            if (e.value instanceof MMap && e.key != null && e.value != null) {
                res = res + " " * shift * 2;
                res = res + e.key + "\n";
                def result = mapprint(shift + 1, e.value, "");
                if (result != null) res = res + result;
            } else {
                res = res + " " * shift * 2 + e.key + ": ";
                if (e.value) {
                    res = res + e.value.call() + "\n";
                }
            }
        }
        return res;
    }
}