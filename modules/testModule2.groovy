package modules

class testModule2 extends dataGlobal {
    static testModule2Runner() {

        results["total2"] = { x -> calculate["qty"]() * calculate["Total"]["Result"]() }

        calculate["Total"]["Result"] = { x -> calculate["Calc"]["B"]() + calculate["Calc"]["C"]() }
        calculate["qty"] = { x -> calculate["Calc"]["C"]() > 22 ? 12 : 10 }

    }
}