package test.java.org.isen.bootstrap.core;

/**
 * Created by Romain on 09/01/2017.
 */
public class DameGameTest {

    Private DameBoard board;

    @Test
    public void can_instantiate_board() throws Exception {
        assertThat(board).isNull();
    }

    
}
