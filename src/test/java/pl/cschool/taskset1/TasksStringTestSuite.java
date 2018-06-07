package pl.cschool.taskset1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TasksStringTestSuite {

    @Test
    public void isEquals2Test1() {

        assertEquals(true,TasksString.isEquals2("asdfg","asdfg"));
        assertEquals(true,TasksString.isEquals2("",""));
        assertEquals(true,TasksString.isEquals2("qwer asdf","qwer asdf"));
        assertEquals(false,TasksString.isEquals2("asd","asdaqs deefg"));
        assertEquals(false,TasksString.isEquals2("asd3fg","asdfg"));
    }

    @Test
    public void strReverse2Test() {
        assertEquals("gfdsa",TasksString.strReverse2("asdfg"));
        assertEquals("",TasksString.strReverse2(""));
        assertEquals("fdsa rewq",TasksString.strReverse2("qwer asdf"));
        assertEquals("dsa",TasksString.strReverse2("asd"));
        assertEquals(" ",TasksString.strReverse2(" "));
    }

    @Test
    public void isStartedWith2() {
        assertEquals(true,TasksString.isStartedWith2("asdfg", "a"));
        assertEquals(true,TasksString.isStartedWith2("", ""));
        assertEquals(true,TasksString.isStartedWith2("qwer asdf","qwer"));
        assertEquals(false,TasksString.isStartedWith2("asd", "we"));
        assertEquals(false,TasksString.isStartedWith2(" dsas","d" ));
    }

}
