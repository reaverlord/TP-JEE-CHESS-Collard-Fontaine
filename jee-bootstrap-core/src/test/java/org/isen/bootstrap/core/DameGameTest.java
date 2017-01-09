package test.java.org.isen.bootstrap.core;

/**
 * Created by Romain on 09/01/2017.
 */
public class DameGameTest {

    Private DameBoard board;

    @Before
    public void testImplementation(){
        board = new boardImpl();
    }

    @Test
    public void can_instantiate_board() throws Exception {
        assertThat(board).isNull();
    }

    @test
    public void can_add_cell(){
        Cell celltest = board.addCell();
        assertThat(celltest).isNull();
    }

}
