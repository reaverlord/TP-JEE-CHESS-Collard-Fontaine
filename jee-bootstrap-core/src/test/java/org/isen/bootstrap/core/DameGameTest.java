package test.java.org.isen.bootstrap.core;


/**
 * Created by Romain on 09/01/2017.
 */

public class DameGameTest {

    private DameBoard board;

    @Before
    public void testImplementation(){
        board = new boardImpl();
    }

    @Test
    public void can_instantiate_board() throws Exception {
        assertThat(board).isNull();
    }

    @Test
    public void can_add_cell() throws Exception {
        Cell celltest = board.addCell();
        assertThat(celltest).isNull();
    }

    @Test
    public void cell_has color() throws Exception {
        assertThat(celltest.color).isNull();
    }
}
