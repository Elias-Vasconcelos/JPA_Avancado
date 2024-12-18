import com.atividade.DAO.GenericDao;
import com.atividade.DAO.IGenereicDao;
import com.atividade.entidades.Assessorio;
import com.atividade.entidades.Marca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MarcaTest {


    IGenereicDao<Marca> dao = new GenericDao<Marca>();
    Marca marca = new Marca();

    @Before
    public void inicio(){
        marca.setCodigo("123");
        marca.setNome("mercedes");
    }

    @Test
    public void testInicial(){

        Marca test1 = dao.cadastrar(marca);
        Assert.assertNotNull(test1);

    }


}
