import static modules.testModule1.testModule1Runner as testModule1
import static modules.testModule1.testModule1mocksRunner as testModule1mocks
import static modules.testModule2.testModule2Runner as testModule2

class tools extends modules.dataGlobal {
	static calc() {
		testModule1();
		testModule2();
	}
}
