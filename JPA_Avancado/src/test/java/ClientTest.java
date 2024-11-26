import com.atividade.DAO.IProdutoDAO;
import com.atividade.DAO.ProdutoDAO;
import com.atividade.entidades.Produto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {


    IProdutoDAO dao = new ProdutoDAO();
    Produto produto = new Produto();

    @Before
    public void inicio(){
        produto.setCodigo("123");
        produto.setNome("elias");
    }

    @Test
    public void testInicial(){

        Produto produto1 = dao.cadastrar(produto);
        Assert.assertNotNull(produto1);

    }



}
