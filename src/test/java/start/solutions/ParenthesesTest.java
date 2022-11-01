package start.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTest {
    @Test
    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertEquals(true,Parentheses.validParentheses( "()" ));
        assertEquals(false,Parentheses.validParentheses( "())" ));
        assertEquals(true,Parentheses.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,Parentheses.validParentheses( "(dsgdsg))2432" ));
        assertEquals(false,Parentheses.validParentheses( "())(()adasdasfa" ));
    }
}