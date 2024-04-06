import static tools.calc as calculate
import static prettyPrinter.mapprint as prettyPrinter

//input params
tools.inputParameters["DataSet1"]["InputA"] = { x -> 10 };
tools.inputParameters["DataSet1"]["InputB"] = { x -> 10 };

//configuration
tools.conf["X"] = { x -> 2 }

calculate();
println "==== Input Parameters:";
print prettyPrinter(0, tools.inputParameters)
println "==== Intermediate calculations:";
print prettyPrinter(0, tools.calculate)
println "==== Final results:";
print prettyPrinter(0, tools.results)
