package modules

class testModule1 extends dataGlobal {

    static testModule1mocksRunner() {
        calculate["Calc"]["B"] = { x -> 12 }
        calculate["Calc"]["C"] = { x -> 24 }
    }

    static testModule1Runner() {

        calculate["Calc"]["B"] = { x ->
                tools.inputParameters["DataSet1"]["InputA"]() + 2
        }

        calculate["Calc"]["C"] = { x ->
                calculate["Calc"]["B"]() * conf["X"]()
        }
   }
}