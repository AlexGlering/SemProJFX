package test;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectPackages({"src/test"})
@SelectClasses({ProductTest.class, ProductAttributeTest.class, JSONReaderTest.class, ProductManagerTest.class})
public class TestSuite {

}

