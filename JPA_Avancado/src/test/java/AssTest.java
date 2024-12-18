import com.atividade.DAO.GenericDao;
import com.atividade.DAO.IGenereicDao;
import com.atividade.entidades.Assessorio;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AssTest {


    IGenereicDao<Assessorio> dao = new GenericDao<Assessorio>();
    Assessorio assessorio = new Assessorio();

    @Before
    public void inicio(){
        assessorio.setCodigo("123");
        assessorio.setNome("step");
    }

    @Test
    public void testInicial(){

        Assessorio test1 = dao.cadastrar(assessorio);
        Assert.assertNotNull(test1);

    }

}
