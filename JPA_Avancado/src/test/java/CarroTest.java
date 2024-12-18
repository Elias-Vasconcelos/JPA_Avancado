import com.atividade.DAO.GenericDao;
import com.atividade.DAO.IGenereicDao;
import com.atividade.entidades.Assessorio;
import com.atividade.entidades.Carro;
import com.atividade.entidades.Marca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarroTest {

    IGenereicDao<Carro> dao = new GenericDao<Carro>();
    IGenereicDao<Marca> daoM = new GenericDao<Marca>();
    IGenereicDao<Assessorio> daoA = new GenericDao<Assessorio>();

    Carro carro = new Carro();
    Marca marca = new Marca();
    Assessorio assessorio = new Assessorio();

    @Before
    public void inicio(){
        marca.setCodigo("123");
        marca.setNome("bmw");

        assessorio.setCodigo("123");
        assessorio.setNome("step");

        carro.setMarca(marca);
        carro.setCodigo("123");
        carro.setNome("AMG-GT");
        carro.assessorios.add(assessorio);
    }

    @Test
    public void testInicial(){

        daoM.cadastrar(marca);
        daoA.cadastrar(assessorio);

        Carro test1 = dao.cadastrar(carro);
        Assert.assertNotNull(test1);

    }



}
